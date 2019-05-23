package main;

import ST.SelectCol;
import ST.SymbolTable;
import TypeArray.TypeArray;
import TypeArray.*;
import antGen.HplsqlBaseVisitor;
import antGen.HplsqlParser;
import org.stringtemplate.v4.ST;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CodeG extends HplsqlBaseVisitor<Object> {

    static String numberREG = "^[-+]?\\d+(\\.\\d+)?$";

    TypeArray types;
    {
        try {
            types = new TypeArray();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    ArrayList<SelectCol> values = new ArrayList<>();
    String output = "";
    String mapers = "";
    String shuffles ="";
    String temp ="";
    String diroutput = "src//CG";
    String fileName = "cg.java";

    int shuffNum=0;

    Map<Integer,Integer> shufRed = new HashMap<>();

    String  filePath = diroutput+ File.separator+fileName;


    public CodeG() {

        File f= new File(filePath);
        if(f.exists()){f.delete();}

        output += "package CG;\n" +
                "import java.io.*;\n" +
                "import java.util.ArrayList;\n" +
                "import java.util.HashMap;\n" +
                "import java.util.List;\n" +
                "import java.util.*;\n";
        output+="public class cg {\n\n";
        output+="public interface MyFunction {\n" +
                "        String operation(ArrayList<Integer> c);\n" +
                "    }\n\n";

        // variable
        output+="static String tempdirectory = \"temp\";\n"+
                "static String lineSeparator = System.getProperty(\"line.separator\");\n" +
                "static String numberREG = \"^[-+]?\\\\d+(\\\\.\\\\d+)?$\";\n\n";

        // function
        output+=getDeleteFunc();
        output+= getInitFile();
        output+=getFindCommasInLine();
        output+=getgetCol();
        output+=getFindSlash();
        output+=getconcatReducer();
        output+=getMaper();
        output+=getSortShuff();
        output+=getShuffle();
        output+=getSumAllRed();
        output+=getReducer();

        try(BufferedWriter fileOutputStream = new BufferedWriter(new FileWriter(filePath,true))){

            fileOutputStream.write(output);

            fileOutputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        output = "";

    }

    @Override
    public Object visitProgram(HplsqlParser.ProgramContext ctx) {
        //symbolTable.setCurrentScopeNameAndType("Global", "program");
        return super.visitProgram(ctx);
    }

    @Override
    public Object visitNew_select_stmt(HplsqlParser.New_select_stmtContext ctx){
        ArrayList<data> Tabels_name = new ArrayList<>();
       // Map<String,data> tables_alise_name = new HashMap<>();

      //  ArrayList<joinStruct> joines = new ArrayList<>();

        try {
            String table_name = ctx.new_from_table().from_table_name_clause().table_name().ident().getText();
            //String table_alis = ctx.new_from_table().from_table_name_clause().from_alias_clause().ident().getText();
            data d = types.get(table_name);
            Tabels_name.add(d);

            for(int i=0;i<ctx.new_from_join_clause().size();i++){
                String table_name1 = ctx.new_from_join_clause(i).new_from_table().from_table_name_clause().table_name().ident().getText();
               // String table_1_alis = ctx.new_from_join_clause(i).new_from_table().from_table_name_clause().from_alias_clause().ident().getText();

                data x = types.get(table_name1);
                Tabels_name.add(x);
               // tables_alise_name.put(table_1_alis,x);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        for(int i=0;i<Tabels_name.size();i++){

            String location = Tabels_name.get(i).getTableLocation().replace("\\","\\\\");
            String dilimiter = Tabels_name.get(i).getTsbleDELIMITER();
            output+="static String tableLocation"+(i+1)+" = \""+location+"\";\n"+
                    "static char tableSpilt"+(i+1)+"  = \'"+dilimiter+"\';\n";

        }


        try(BufferedWriter fileOutputStream = new BufferedWriter(new FileWriter(filePath,true))){

            fileOutputStream.write(output);

            fileOutputStream.close();
            output = "";
        } catch (IOException e) {
            e.printStackTrace();
        }


        ArrayList<SelectCol> sel_col_keys = new ArrayList<>();
        Map<String,Integer> vales = new HashMap<>();

        for(int i =0 ; i<ctx.new_select_col().size();i++){
            SelectCol coloms = (SelectCol)visit(ctx.new_select_col(i));

            //if(types.find_col_in_table(coloms.colname,table_name)){
            if(coloms.is_colom){
                sel_col_keys.add(coloms);

            }else{
                // val = coloms;
                values.add(coloms);
                if(vales.containsKey(coloms.colname)){
                    int v =  vales.get(coloms.colname) + 1;
                    vales.put(coloms.colname,v);
                }else{
                    vales.put(coloms.colname,1);
                }
            }
        }
        if(ctx.new_from_join_clause().size() ==0){
            // no join




            selectWitoutJoin(Tabels_name,sel_col_keys,vales);
            output+="public static void map_reduce() throws IOException {\n" +
                    "\n" +
                    "        read_files();\n";

            int map=0;
            int sum_all_red =0;
            for(Map.Entry<String, Integer> entry : vales.entrySet()){
                map++;
                System.out.print("col : "+entry.getKey());
                sum_all_red+= entry.getValue();

               for(SelectCol s :values){
                   if(s.colname.equals(entry.getKey())){
                       System.out.println("   func : "+s.func_name);
                       output+="shuffle11("+map+","+s.is_distnict+");\n";
                       if(shufRed.containsKey(map)){
                           int r = shufRed.get(map)+1;
                           shufRed.put(map,r);
                       }else{
                           shufRed.put(map,1);
                       }
                   }

               }

            }

            int redNum=1;
            for(Map.Entry<Integer, Integer> entry : shufRed.entrySet()){

                for(int red=0;red<entry.getValue();red++){

                    output+=" reducer("+entry.getKey()+","+(redNum)+",new MyFunction() {\n" +
                            "            @Override\n" +
                            "            public String operation(ArrayList<Integer> c) {\n";

                   output+=getFuncBody(values.get(redNum-1).func_name);
                    redNum++;

                            /*"                int sum = 0;\n" +
                            "                for(int i=0;i<c.size();i++){\n" +
                            "\n" +
                            "                    sum+=c.get(i);\n" +
                            "                }\n" +
                            "                return String.valueOf(sum/c.size());\n" +
                            "            }\n" +
                            "        });\n";*/

                }

            }


            for(int sum_a_red=0;sum_a_red<sum_all_red;sum_a_red++){
                output+="sum_all_red("+(sum_a_red+1)+");\n";
            }

            output+="String all_path = tempdirectory+File.separator+\"All_red\";\n" +
                    "        File n = new File(all_path);\n" +
                    "        String[] list = n.list();\n\n";

            output+="String all=\"\";";
            if(sum_all_red == 2){
                output+="all =concatReducer(list[0],list[1],tempdirectory+File.separator+\"All_red\",tempdirectory+File.separator+\"All_red\");\n";
            }else if(sum_all_red > 2){
                output+="all =concatReducer(list[0],list[1],tempdirectory+File.separator+\"All_red\",tempdirectory+File.separator+\"All_red\");\n";
                output+="for(int i=1;i<list.length;i++){\n" +
                        "            if(i+1 <list.length){\n" +
                        "                all = concatReducer(all,list[i+1],tempdirectory,tempdirectory+File.separator+\"All_red\");\n" +
                        "            }\n" +
                        "\n" +
                        "        }\n\n";


            }

            // if order /////



            output+="if(list.length==1){\n" +
                    "            printResult(tempdirectory+File.separator+\"All_red/1.txt\");\n" +
                    "        }else {\n" +
                    "            printResult(tempdirectory+File.separator+all);\n" +
                    "        }\n\n";


            output+="}\n\n";


            output+=getPrintFunc(ctx);

            output+=getMain(0);

            output+="}\n\n";
            try(BufferedWriter fileOutputStream = new BufferedWriter(new FileWriter(filePath,true))){

                fileOutputStream.write(output);

                fileOutputStream.close();
                output = "";
            } catch (IOException e) {
                e.printStackTrace();
            }

        }else{

            ArrayList<joinStruct> joines = new ArrayList<>();
            try {
                String table_name = ctx.new_from_table().from_table_name_clause().table_name().ident().getText();
                String table_alis = ctx.new_from_table().from_table_name_clause().from_alias_clause().ident().getText();
                data d = types.get(table_name);
                //Tabels_name.add(d);

                //tables_alise_name.put(table_alis,d);

                for(int i=0;i<ctx.new_from_join_clause().size();i++){
                    String table_name1 = ctx.new_from_join_clause(i).new_from_table().from_table_name_clause().table_name().ident().getText();
                    String table_1_alis = ctx.new_from_join_clause(i).new_from_table().from_table_name_clause().from_alias_clause().ident().getText();

                    data x = types.get(table_name1);
                   // Tabels_name.add(x);
                 //   tables_alise_name.put(table_1_alis,x);

                    String join = ctx.new_from_join_clause(i).from_join_type_clause().getText();

                    System.out.println(join);
                    String op = ctx.new_from_join_clause(i).new_join_condition().op().getText();

                    String tbl1 = ctx.new_from_join_clause(i).new_join_condition().table_name(0).getText();
                    String col1,col2;
                    if(tbl1.equals(table_name) || tbl1.equals(table_alis)){

                        col1 = ctx.new_from_join_clause(i).new_join_condition().ident(0).getText();
                        col2 = ctx.new_from_join_clause(i).new_join_condition().ident(1).getText();

                    }else{
                        col1 = ctx.new_from_join_clause(i).new_join_condition().ident(1).getText();
                        col2 = ctx.new_from_join_clause(i).new_join_condition().ident(0).getText();
                    }

                    joinStruct js = new joinStruct(table_name,table_name1,join,col1,col2,op,table_alis,table_1_alis);


                    joines.add(js);

                    table_name = table_name1;
                    table_alis = table_1_alis;

                }

            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }





            if(joines.get(0).getJoin().equals("RIGHTJOIN") || joines.get(0).getJoin().equals("rightjoin")){
                selectRightJoin1(Tabels_name,joines,sel_col_keys,vales);
            }else if(joines.get(0).getJoin().equals("fullouterjoin") || joines.get(0).getJoin().equals("FULLOUTERJOIN")){
                selectJoin(Tabels_name,joines,sel_col_keys,vales);
                selectRightJoin1(Tabels_name,joines,sel_col_keys,vales);
            }else{
                selectJoin(Tabels_name,joines,sel_col_keys,vales);
            }


            for(int i=0;i<ctx.order_by_clause().order_by_col().size();i++){
                String tableName="";
                if(ctx.order_by_clause().order_by_col(i).ident()!=null){
                    tableName = ctx.order_by_clause().order_by_col(i).ident().getText();
                }
                String colName = ctx.order_by_clause().order_by_col(i).expr().getText();
                if(colName.matches(numberREG)){

                    int colIndex=Integer.parseInt(colName) -1;
                    SelectCol coloms = null;

                    //for(colIndex=0;colIndex<ctx.new_select_col().size();colIndex++){
                        coloms = (SelectCol)visit(ctx.new_select_col(colIndex));
                       // if(coloms.colname.equals(colName))
                       //     break;
                   // }

                    output+="static Comparator<String> comparator = new Comparator<String>() {\n" +
                            "        public int compare(String r1, String r2){\n";

                    output+="byte[] comaList1 = new byte[";

                    output+=ctx.new_select_col().size();

                    output+="];\n";

                    output+="comaList1 =FindCommasInLine(r1,comaList1,',');";

                    output+="int index1 = " + colIndex +";\n";


                    output+=" String col1=null;\n" +
                            "            String col2 = null;\n" +
                            "            if(index1==0){\n" +
                            "\n" +
                            "                col1= getCol(index1,comaList1[index1],r1);\n" +
                            "                col2= getCol(index1,comaList1[index1],r2);\n" +
                            "\n" +
                            "            }else if(comaList1.length+1 == index1){\n" +
                            "\n" +
                            "                col1= getCol(comaList1[comaList1.length-1]+1,r1.length(),r1);\n" +
                            "                col2= getCol(comaList1[comaList1.length-1]+1,r1.length(),r2);\n" +
                            "            }else{\n" +
                            "                col1=getCol(comaList1[index1-1]+1,comaList1[index1],r1);\n" +
                            "                col2=getCol(comaList1[index1-1]+1,comaList1[index1],r2);\n" +
                            "            }\n";

                    if(types.find_type_col_in_table(coloms.colname,coloms.tablename).equals("string")){
                        output+="return (col1.compareTo(col2)) ";
                    }else {
                        output+=" return (Integer.parseInt(col1) - Integer.parseInt(col2)) ";
                    }

                    if(ctx.order_by_clause().order_by_col(i).T_DESC()!=null){
                        output+=" * -1;\n" +
                                "        }};";
                    }else{
                        output+=";\n" +
                                "        }};";

                    }

                    try(BufferedWriter fileOutputStream = new BufferedWriter(new FileWriter(filePath,true))){

                        fileOutputStream.write(output);

                        fileOutputStream.close();
                        output = "";
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                }else {
                        int colIndex=0;
                    SelectCol coloms = null;

                        for(colIndex=0;colIndex<ctx.new_select_col().size();colIndex++){
                             coloms = (SelectCol)visit(ctx.new_select_col(colIndex));
                             System.out.println("collll  "+ coloms.colname + " ttt  "+ coloms.tablename);
                            if(coloms.colname.equals(colName))
                                break;
                        }

                        output+="static Comparator<String> comparator = new Comparator<String>() {\n" +
                                "        public int compare(String r1, String r2){\n";

                        output+="byte[] comaList1 = new byte[";

                        output+=ctx.new_select_col().size();

                        output+="];\n";

                        output+="comaList1 =FindCommasInLine(r1,comaList1,',');";

                        output+="int index1 = " + colIndex +";\n";


                        output+=" String col1=null;\n" +
                                "            String col2 = null;\n" +
                                "            if(index1==0){\n" +
                                "\n" +
                                "                col1= getCol(index1,comaList1[index1],r1);\n" +
                                "                col2= getCol(index1,comaList1[index1],r2);\n" +
                                "\n" +
                                "            }else if(comaList1.length+1 == index1){\n" +
                                "\n" +
                                "                col1= getCol(comaList1[comaList1.length-1]+1,r1.length(),r1);\n" +
                                "                col2= getCol(comaList1[comaList1.length-1]+1,r1.length(),r2);\n" +
                                "            }else{\n" +
                                "                col1=getCol(comaList1[index1-1]+1,comaList1[index1],r1);\n" +
                                "                col2=getCol(comaList1[index1-1]+1,comaList1[index1],r2);\n" +
                                "            }\n";
                        System.out.println(coloms.tablename);
                        System.out.println(types.find_type_col_in_table(colName,coloms.tablename));
                        if(types.find_type_col_in_table(colName,coloms.tablename).equals("string")){
                                output+="return (col1.compareTo(col2)) ";
                        }else {
                            output+=" return (Integer.parseInt(col1) - Integer.parseInt(col2)) ";
                        }
                    System.out.println("kgjgggku");
                        if(ctx.order_by_clause().order_by_col(i).T_DESC()!=null){
                            output+=" * -1;\n" +
                                    "        }};";
                        }else{
                            output+=";\n" +
                                    "        }};";

                        }

                    try(BufferedWriter fileOutputStream = new BufferedWriter(new FileWriter(filePath,true))){

                        fileOutputStream.write(output);

                        fileOutputStream.close();
                        output = "";
                    } catch (IOException e) {
                        e.printStackTrace();
                    }



                }



            }














        }





        return null;
    }

    @Override
    public Object visitNew_select_col(HplsqlParser.New_select_colContext ctx) {
        Object x = visitChildren(ctx);
        return x;

    }

    @Override
    public Object visitSelect_list_asterisk(HplsqlParser.Select_list_asteriskContext ctx) {
        return new SelectCol("*",null,null);
    }

    @Override
    public Object visitColom_name(HplsqlParser.Colom_nameContext ctx) {
        String col_name = ctx.ident().getText();
        SelectCol temp = null;
        if(ctx.select_list_alias() != null){

            Object aslis =  visitChildren(ctx);
            temp = new SelectCol(col_name,null, (String) aslis);
        }else {

            temp = new SelectCol(col_name,null, null);
        }

        return  temp;

    }

    @Override
    public Object visitSelect_list_alias(HplsqlParser.Select_list_aliasContext ctx) {
        return ctx.ident().getText();
    }

    @Override
    public Object visitTabledotcol(HplsqlParser.TabledotcolContext ctx) {

        String table_name = ctx.ident().getText();

        String col_name = ctx.colom_name().ident().getText();

        Object aslis = null;
        if(ctx.colom_name().select_list_alias() != null){
            aslis =  visit(ctx.colom_name().select_list_alias());

        }else {

        }


        SelectCol temp = new SelectCol(col_name,table_name, (String) aslis);
        return  temp;
        //return super.visitTabledotcol(ctx);
    }


    @Override
    public Object visitCol_func(HplsqlParser.Col_funcContext ctx) {

        SelectCol temp = (SelectCol) visit(ctx.expr_agg_window_func());

        return temp;
    }

    @Override
    public Object visitExpr_agg_window_func(HplsqlParser.Expr_agg_window_funcContext ctx) {

        String func_name = ctx.getChild(0).getText();

        String paramiter = ctx.expr().get(0).getText();

        String tableName = ctx.ident().getText();

        System.out.println(paramiter + "  t  "+tableName);
        boolean isDistnict = ctx.expr_func_all_distinct() != null ? true :false;

        SelectCol temp = new SelectCol(tableName,func_name, paramiter,null,isDistnict);
        return  temp;


        //return super.visitExpr_agg_window_func(ctx);
    }

    private String getDeleteFunc() {

        return "public static void delete(File file)\n" +
                "            throws IOException{\n" +
                "\n" +
                "        if(file.isDirectory()){\n" +
                "\n" +
                "            //directory is empty, then delete it\n" +
                "            if(file.list().length==0){\n" +
                "\n" +
                "                file.delete();\n" +
                "                \n" +
                "\n" +
                "            }else{\n" +
                "\n" +
                "                //list all the directory contents\n" +
                "                String files[] = file.list();\n" +
                "\n" +
                "                for (String temp : files) {\n" +
                "                    //construct the file structure\n" +
                "                    File fileDelete = new File(file, temp);\n" +
                "\n" +
                "                    //recursive delete\n" +
                "                    delete(fileDelete);\n" +
                "                }\n" +
                "\n" +
                "                //check the directory again, if empty then delete it\n" +
                "                if(file.list().length==0){\n" +
                "                    file.delete();\n" +
                "                    \n" +
                "                }\n" +
                "            }\n" +
                "\n" +
                "        }else{\n" +
                "            //if file, then delete it\n" +
                "            file.delete();\n" +
                "        }\n" +
                "    }\n\n";
    }

    private String getInitFile() {

        return "public static void initFIleDir(){\n" +
                "        File stockDir = new File(tempdirectory);\n" +
                "\n" +
                "        try {\n" +
                "\n" +
                "            delete(stockDir);\n" +
                "\n" +
                "            stockDir.mkdir();\n" +
                "        } catch (SecurityException Se) {\n" +
                "\n" +
                "            System.out.println(\"Error while creating directory in Java:\" + Se);\n" +
                "        }catch (IOException e) {\n" +
                "\n" +
                "            e.printStackTrace();\n" +
                "        }\n" +
                "\n" +
                "    }\n\n";
    }

    private String getFindCommasInLine(){
        return "private static byte[] FindCommasInLine(String line,byte[] list,char split){\n" +
                "\n" +
                "        int counter = 0;\n" +
                "\n" +
                "        for (byte index = 0; index < line.length(); index++)\n" +
                "        {\n" +
                "            if (line.charAt(index) == split)\n" +
                "            {\n" +
                "                list[counter++] = index;\n" +
                "\n" +
                "            }\n" +
                "        }\n" +
                "\n" +
                "        return list;\n" +
                "    }\n\n";
    }

    private String getgetCol(){
        return "private static String getCol(int start, int end, String line){\n" +
                "        String sb = \"\";\n" +
                "        int c=0;\n" +
                "        for (int index = start; index < end; index++)\n" +
                "        {\n" +
                "            sb+= line.charAt(index);\n" +
                "        }\n" +
                "\n" +
                "        return sb;\n" +
                "    }\n\n";
    }

    private String getFindSlash(){
        return "private static byte FindSlash(String line){\n" +
                "\n" +
                "        int counter = 0;\n" +
                "byte list = 0;\n" +
                "        for (byte index = 0; index < line.length(); index++)\n" +
                "        {\n" +
                "            if (line.charAt(index) == '/')\n" +
                "            {\n" +
                "                list =  index;\n break;" +
                "\n" +
                "            }\n" +
                "        }\n" +
                "\n" +
                "        return list;\n" +
                "    }\n\n";
    }

    private String getconcatReducer(){
        return "public static String concatReducer(String redu1, String redu2,String path1,String path2){\n" +
                "\n" +
                "        String reduce = tempdirectory + File.separator +redu1+redu2+\"res.txt\";\n" +
                "        String shuffl = path1 + File.separator +redu1;\n" +
                "        try (BufferedReader br = new BufferedReader(new FileReader(shuffl))) {\n" +
                "\n" +
                "            String line;\n" +
                "            while ((line = br.readLine()) != null){\n" +
                "\n" +
                "                byte slashIndex1 ;\n" +
                "\n" +
                "                slashIndex1 = FindSlash(line);\n" +
                "\n" +
                "                String Key1 = getCol(0,slashIndex1,line);\n" +
                "\n" +
                "                String val1 = getCol(slashIndex1+1,line.length(),line);\n" +
                "\n" +
                "\n" +
                "                String shuff2 = path2 + File.separator +redu2;\n" +
                "                try (BufferedReader br2 = new BufferedReader(new FileReader(shuff2))) {\n" +
                "                    String line2;\n" +
                "                    while ((line2 = br2.readLine()) != null) {\n" +
                "\n" +
                "                        //String[] KeyAndVal2 = line2.split(\"/\");\n" +
                "\n" +
                "                        byte slashIndex2 ;\n" +
                "\n" +
                "                        slashIndex2 = FindSlash(line);\n" +
                "                        String Key2 = getCol(0,slashIndex2,line2);\n" +
                "                        String val2 = getCol(slashIndex2+1,line2.length(),line2);\n" +
                "\n" +
                "\n" +
                "                        if(Key1.equals(Key2)){\n" +
                "                            String output = Key2 + \"/\" + val1 + \",\" +val2+lineSeparator;\n" +
                "                            try(BufferedWriter fileOutputStream = new BufferedWriter(new FileWriter(reduce,true))) {\n" +
                "                                fileOutputStream.write(output);\n" +
                "                                fileOutputStream.close();\n" +
                "                            }\n" +
                "                        }\n" +
                "\n" +
                "                    }\n" +
                "                }\n" +
                "\n" +
                "            }\n" +
                "        } catch (FileNotFoundException e) {\n" +
                "            e.printStackTrace();\n" +
                "        } catch (IOException e) {\n" +
                "            e.printStackTrace();\n" +
                "        }\n" +
                "\n" +
                "        return redu1+redu2+\"res.txt\";\n" +
                "    }\n\n";
    }

    private String getMaper(){

        String x = "public static void map(int mapNum,String line,String fileName,byte[] comalist , byte[] KeyIndex,byte valIndex){\n" +
                "        String maperPath = tempdirectory+File.separator+\"map\"+mapNum;\n" +
                "        File stockDir1 = new File(maperPath);\n" +
                "        if(!stockDir1.exists()){stockDir1.mkdir();}\n" +
                "        String FileName = fileName + \".txt\";\n" +
                "        String outPath = maperPath + File.separator + FileName;\n" +
                "        try(FileOutputStream fileOutputStream = new FileOutputStream(outPath,true)) {\n" +
                "/*\n" +
                "            for(int i=0;i<line.length;i++) {\n" +
                "                line[i] = line[i].replace(\"\\\"\", \"\");\n" +
                "            }*/\n" +
                "\n" +
                "           // String fileContent = line[0]+\",\"+line[1] +\"/\"+line[2];\n" +
                "            String fileContent=\"\";\n" +
                "            for(byte b:KeyIndex){\n" +
                "\n" +
                "                if(b==0){\n" +
                "                    fileContent+= getCol(b,comalist[b],line)+\",\";\n" +
                "\n" +
                "                }else if(comalist.length+1 == b){\n" +
                "\n" +
                "                    fileContent+= getCol(comalist[comalist.length-1]+1,line.length(),line)+\",\";\n" +
                "                }else{\n" +
                "\n" +
                "                    fileContent+=getCol(comalist[b-1]+1,comalist[b],line)+\",\";\n" +
                "\n" +
                "                }\n" +
                "\n" +
                "            }\n" +
                "            fileContent+=\"/\";\n" +
                "\n" +
                "            fileContent = fileContent.replace(\",/\",\"/\");\n" +
                "\n" +
                "            if(valIndex==0){\n" +
                "               \n" +
                "                fileContent+= getCol(valIndex,comalist[valIndex],line);\n" +
                "\n" +
                "            }else if(comalist.length == valIndex){\n" +
                "\n" +
                "                fileContent+= getCol(comalist[comalist.length-1]+1,line.length(),line);\n" +
                "            }else{\n" +
                "\n" +
                "\n" +
                "\n" +
                "                fileContent+=getCol(comalist[valIndex-1]+1,comalist[valIndex],line);\n" +
                "\n" +
                "            }\n" +
                "\n" +
                "            //fileContent = getCol(0,comalist[0],line)+\",\"+getCol(comalist[0]+1,comalist[1],line) +\"/\"+getCol(comalist[1]+1,line.length(),line);\n" +
                "           // String col1 = getCol(0,comalist[0],line);\n" +
                "            fileOutputStream.write(fileContent.getBytes());\n" +
                "            fileOutputStream.write(lineSeparator.getBytes());\n" +
                "\n" +
                "\n" +
                "            fileOutputStream.flush();\n" +
                "\n" +
                "            fileOutputStream.close();\n" +
                "\n" +
                "        } catch (FileNotFoundException e) {\n" +
                "\n" +
                "        } catch (IOException e) {\n" +
                "\n" +
                "        }\n" +
                "\n" +
                "\n" +
                "    }\n";


        return x;
    }

    private String getSortShuff(){
        return "private static void shufSort(String shuffPath) {\n" +
                "        File stockDir = new File(shuffPath);\n" +
                "        String[] list = stockDir.list();\n" +
                "\n" +
                "        Arrays.sort(list, new Comparator<String>() {\n" +
                "            @Override\n" +
                "            public int compare(String o1, String o2) {\n" +
                "\n" +
                "                int e1 = o1.indexOf('_');\n" +
                "                int e2= o2.indexOf('_');\n" +
                "                int number1 = Integer.parseInt(o1.substring(0, e1));\n" +
                "\n" +
                "                int number2 = Integer.parseInt(o2.substring(0, e2));\n" +
                "\n" +
                "                return number1 - number2;\n" +
                "\n" +
                "            }\n" +
                "        });\n" +
                "\n" +
                "        int numOfLine = 0;\n" +
                "        int MAXLINES = 100;\n" +
                "        List<String> temp = new ArrayList<>();\n" +
                "        int i=0;\n" +
                "        String Line = \"\";\n" +
                "        String ou_file = null;\n" +
                "        for(String name :list){\n" +
                "\n" +
                "            String absolutePath = shuffPath + File.separator + name;\n" +
                "            try(BufferedReader br = new BufferedReader(new FileReader(absolutePath))) {\n" +
                "\n" +
                "\n" +
                "              //  ou_file = shuffPath + File.separator +(++i) +\".txt\" ;\n" +
                "                while ((numOfLine<MAXLINES) && (Line = br.readLine()) !=null){\n" +
                "\n" +
                "                    //while ((Line = br.readLine()) != null){\n" +
                "\n" +
                "                    temp.add(Line);\n" +
                "\n" +
                "                    numOfLine++;\n" +
                "\n" +
                "                    //  }\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "                }\n" +
                "\n" +
                "                if((numOfLine>=MAXLINES)){\n" +
                "\n" +
                "                    numOfLine =0;\n" +
                "                    ou_file = shuffPath + File.separator +(++i) +\".txt\" ;\n" +
                "                    try(BufferedWriter fileOutputStream = new BufferedWriter(new FileWriter(ou_file,true))) {\n" +
                "                        for(String r : temp) {\n" +
                "\n" +
                "                            fileOutputStream.write(r);\n" +
                "                            fileOutputStream.newLine();\n" +
                "                        }\n" +
                "                    }\n" +
                "\n" +
                "                    temp.clear();\n" +
                "\n" +
                "                }\n" +
                "\n" +
                "\n" +
                "\n" +
                "            } catch (FileNotFoundException e) {\n" +
                "                e.printStackTrace();\n" +
                "            } catch (IOException e) {\n" +
                "                e.printStackTrace();\n" +
                "            }\n" +
                "            new File(absolutePath).delete();\n" +
                "        }\n" +
                "\n" +
                "        if((temp.size()!=0)){\n" +
                "\n" +
                "            numOfLine =0;\n" +
                "            ou_file = shuffPath + File.separator +(++i) +\".txt\" ;\n" +
                "            try(BufferedWriter fileOutputStream = new BufferedWriter(new FileWriter(ou_file,true))) {\n" +
                "                for(String r : temp) {\n" +
                "\n" +
                "                    fileOutputStream.write(r);\n" +
                "                    fileOutputStream.newLine();\n" +
                "                }\n" +
                "            } catch (FileNotFoundException e) {\n" +
                "                e.printStackTrace();\n" +
                "            } catch (IOException e) {\n" +
                "                e.printStackTrace();\n" +
                "            }\n" +
                "\n" +
                "            temp.clear();\n" +
                "\n" +
                "        }\n" +
                "\n" +
                "    }\n";
    }

    private String getShuffle(){

        return "public static  void shuffle11(int map,boolean isDistnict) throws IOException {\n" +
                "\n" +
                "       String maperPath = tempdirectory+File.separator+\"map\"+map;\n" +
                "       String shuffPath = tempdirectory+File.separator+\"shuff\"+map;\n" +
                "\n" +
                "       File stockDir1 = new File(shuffPath);\n" +
                "       if(!stockDir1.exists()){stockDir1.mkdir();}\n" +
                "\n" +
                "       Map<String,String> mmm = new HashMap<>();\n" +
                "\n" +
                "       File stockDir = new File(maperPath);\n" +
                "       String[] list = stockDir.list();\n" +
                "       int fNum=0;\n" +
                "       for(String name : list){\n" +
                "           String absolutePath = maperPath + File.separator + name;\n" +
                "           try(BufferedReader br = new BufferedReader(new FileReader(absolutePath))) {\n" +
                "\n" +
                "               String line;\n" +
                "\n" +
                "               while ((line = br.readLine()) != null){\n" +
                "\n" +
                "                   byte slash1 = 0;\n" +
                "\n" +
                "                   slash1 =FindSlash(line);\n" +
                "\n" +

                "\n" +
                "                   String Key = getCol(0,slash1,line);\n" +
                "\n" +
                "                   String value = getCol(slash1+1,line.length(),line);\n" +
                "\n" +
                "                   String shuffname = mmm.get(Key);\n" +
                "                   if(shuffname == null){\n" +
                "                       shuffname = ++fNum+\"_\"+Key;\n" +
                "                       mmm.put(Key,shuffname);\n" +
                "                   }\n" +
                "                   String ou_file = shuffPath+File.separator+shuffname+\".txt\";\n" +
                "                   File n = new File(ou_file);\n" +
                "                   if(n.exists()){\n" +
                "                       try(RandomAccessFile fileOutputStream = new RandomAccessFile(ou_file,\"rw\")){\n" +
                "\n" +
                "\n" +
                "                           String l = fileOutputStream.readLine();\n" +
                "                           byte slash2 = 0;\n" +
                "\n" +
                "                           slash2 =FindSlash(l);\n" +
                "\n" +
                "\n" +
                "                           String[] KVal = l.split(\"/\");\n" +
                "\n" +
                "\n" +
                "\n" +
                "                           if(KVal.length == 2) {\n" +
                "                               String[] val = KVal[1].split(\",\");\n" +
                "\n" +
                "                               boolean dis = false;\n" +
                "                               // Distnict function\n" +
                "                               if(isDistnict){\n" +
                "                                   for (String d : val) {\n" +
                "                                       if (d.equals(value)) {\n" +
                "                                           dis = true;\n" +
                "                                           break;\n" +
                "                                       }\n" +
                "\n" +
                "                                   }\n" +
                "                               }\n" +
                "\n" +
                "                               if(!dis){\n" +
                "                                   fileOutputStream.write((\",\"+value).getBytes());\n" +
                "                               }\n" +
                "\n" +
                "\n" +
                "                           }else{\n" +
                "                               fileOutputStream.write((\",\"+value).getBytes());\n" +
                "                           }\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "                       }\n" +
                "\n" +
                "\n" +
                "                   }else{\n" +
                "                       try(BufferedWriter fileOutputStream = new BufferedWriter(new FileWriter(ou_file,true))) {\n" +
                "                           if(value.length() !=0 ){\n" +
                "                               fileOutputStream.write(Key + \"/\" + value);\n" +
                "                           }else{\n" +
                "                               fileOutputStream.write(Key + \"/\" );\n" +
                "                           }\n" +
                "\n" +
                "                       }\n" +
                "                   }\n" +
                "\n" +
                "               }\n" +
                "\n" +
                "               br.close();\n" +
                "\n" +
                "           } catch (FileNotFoundException e) {\n" +
                "               // exception handling\n" +
                "           } catch (IOException e) {\n" +
                "               // exception handling\n" +
                "           }\n" +
                "\n" +
                "       }\n" +
                "\n" +
                "\n" +
                "       shufSort(shuffPath);\n" +
                "\n" +
                "   }\n";
    }

    private String getSumAllRed(){
        return "    public static void sum_all_red(int red){\n" +
                "\n" +
                "        String redusPath = tempdirectory+File.separator+\"red\"+red;\n" +
                "        String ALl_red_path = tempdirectory+File.separator+\"All_red\";\n" +
                "        String all_file = ALl_red_path + File.separator+red+\".txt\";\n" +
                "        \n" +
                "\n" +
                "        File stockDir1 = new File(ALl_red_path);\n" +
                "        if(!stockDir1.exists()){stockDir1.mkdir();}\n" +
                "\n" +
                "\n" +
                "        File stockDir = new File(redusPath);\n" +
                "        String[] list = stockDir.list();\n" +
                "\n" +
                "        Arrays.sort(list, new Comparator<String>() {\n" +
                "            @Override\n" +
                "            public int compare(String o1, String o2) {\n" +
                "\n" +
                "                int e1 = o1.indexOf('.');\n" +
                "                int e2= o2.indexOf('.');\n" +
                "                int number1 = Integer.parseInt(o1.substring(0, e1));\n" +
                "\n" +
                "                int number2 = Integer.parseInt(o2.substring(0, e2));\n" +
                "\n" +
                "                return number1 - number2;\n" +
                "\n" +
                "            }\n" +
                "        });\n" +
                "\n" +
                "\n" +
                "        for(String name : list){\n" +
                "\n" +
                "            String all = redusPath + File.separator +name;\n" +
                "            try (BufferedReader br = new BufferedReader(new FileReader(all))) {\n" +
                "\n" +
                "                String line;\n" +
                "\n" +
                "                while ((line = br.readLine()) != null){\n" +
                "\n" +
                "                    try(BufferedWriter fileOutputStream = new BufferedWriter(new FileWriter(all_file,true))) {\n" +
                "                        fileOutputStream.write(line+ System.lineSeparator());\n" +
                "                        fileOutputStream.close();\n" +
                "                    }\n" +
                "\n" +
                "                }\n" +
                "\n" +
                "\n" +
                "            } catch (FileNotFoundException e) {\n" +
                "                e.printStackTrace();\n" +
                "            } catch (IOException e) {\n" +
                "                e.printStackTrace();\n" +
                "            }\n" +
                "\n" +
                "\n" +
                "        }\n" +
                "\n" +
                "    }\n";
    }

    private String getOutterJoin(){
        return "public static void fullOuterJoin() {\n" +
                "\n" +
                "        join();\n" +
                "        Rightjoin();\n" +
                "\n" +
                "    }\n";
    }

    private String getReducer(){
        return "public static String reducer(int shuff,int red,MyFunction obj1){\n" +
                "\n" +
                "        String shuffPath = tempdirectory+File.separator+\"shuff\"+shuff;;\n" +
                "        String redusPath = tempdirectory+File.separator+\"red\"+red;\n" +
                "\n" +
                "\n" +
                "        File stockDir1 = new File(redusPath);\n" +
                "        if(!stockDir1.exists()){stockDir1.mkdir();}\n" +
                "\n" +
                "        File stockDir = new File(shuffPath);\n" +
                "        String[] list = stockDir.list();\n" +
                "        for(String name : list){\n" +
                "\n" +
                "            String shuffl = shuffPath + File.separator +name;\n" +
                "            try (BufferedReader br = new BufferedReader(new FileReader(shuffl))) {\n" +
                "\n" +
                "                String line;\n" +
                "\n" +
                "                while ((line = br.readLine()) != null){\n" +
                "\n" +
                "                    String[] vlas ;\n" +
                "\n" +
                "                    byte slash1 = 0;\n" +
                "\n" +
                "                    slash1 =FindSlash(line);\n" +
                "\n" +

                "\n" +
                "                    String Key = getCol(0,slash1,line);\n" +
                "\n" +
                "                    String value = getCol(slash1+1,line.length(),line);\n" +
                "\n" +
                "\n" +
                "\n" +
                "                    if(value.length() != 2){\n" +
                "                        vlas = value.split(\",\");\n" +
                "                    }else{\n" +
                "                        vlas= new String[1];\n" +
                "                        vlas[0]  = \"\";\n" +
                "                    }\n" +
                "\n" +
                "\n" +
                "                    ArrayList<Integer> values = new ArrayList<>();\n" +
                "\n" +
                "                    boolean isNum = false;\n" +
                "                    for(String s : vlas){\n" +
                "                        if(s.matches(numberREG)){\n" +
                "                            isNum = true;\n" +
                "                            values.add(Integer.parseInt(s));\n" +
                "                        }else{\n" +
                "\n" +
                "                        }\n" +
                "\n" +
                "                    }\n" +
                "                    if(isNum) {\n" +
                "\n" +
                "                        String opResult1 = obj1.operation(values);\n" +
                "\n" +
                "                        String reduce = redusPath + File.separator + name;\n" +
                "                        try (BufferedWriter fileOutputStream = new BufferedWriter(new FileWriter(reduce, true))) {\n" +
                "                            fileOutputStream.write(Key + \"/\" + opResult1 + System.lineSeparator());\n" +
                "                            fileOutputStream.close();\n" +
                "                        }\n" +
                "                    }\n" +
                "                    else {\n" +
                "                        String reduce = redusPath + File.separator + name;\n" +
                "                        try (BufferedWriter fileOutputStream = new BufferedWriter(new FileWriter(reduce, true))) {\n" +
                "                            fileOutputStream.write(line+ System.lineSeparator());\n" +
                "                            fileOutputStream.close();\n" +
                "                        }\n" +
                "                    }\n" +
                "\n" +
                "                }\n" +
                "\n" +
                "\n" +
                "            } catch (FileNotFoundException e) {\n" +
                "                e.printStackTrace();\n" +
                "            } catch (IOException e) {\n" +
                "                e.printStackTrace();\n" +
                "            }\n" +
                "\n" +
                "\n" +
                "        }\n" +
                "        return \"\";\n" +
                "\n" +
                "\n" +
                "    }\n";
    }


    public  String getMain(int i){
        if(i==0){

            return "public static void main(String[] args) {\n" +
                    "        initFIleDir();\n" +
                    "        File tableDir1 = new File(tableLocation1);\n" +
                    "        if(tableDir1.exists() && tableDir1.isDirectory()){\n" +
                    "\n" +
                    "            try {\n" +
                    "\n" +
                    "                map_reduce();\n" +
                    "            } catch (IOException e) {\n" +
                    "                e.printStackTrace();\n" +
                    "            }\n" +
                    "\n" +
                    "        }\n" +
                    "\n" +
                    "    }\n\n";

        }else{
            String x = "    public static void main(String[] args) {\n" +
                    "        initFIleDir();\n" +
                    "        ";
            for(int j =1;j<=i;j++){
                x+="File tableDir"+j+" = new File(tableLocation"+j+");\n";
            }
            x+="if(";
            for(int j =1;j<=i;j++){
                x+="tableDir"+j+".exists() && tableDir"+j+".isDirectory() &&";
            }

            x+="){\n";
            x = x.replace("&&)",")");

            x+= "try {\n" +
                    "\n" +
                    "map_reduce();";

           // x= x.replace(",);",");");

            x+="} catch (IOException e) {\n" +
                    "                e.printStackTrace();\n" +
                    "            }\n" +
                    "\n" +
                    "\n" +
                    "        }\n" +
                    "\n" +
                    "    }";
            return x;
        }

    }



    private void selectRightJoin1(ArrayList<data> Tabels_name,ArrayList<joinStruct> joines,ArrayList<SelectCol> sel_col_keys,Map<String,Integer> vales){

        output+= "public static void Rightjoin() {\n\n";
        for(int i=1;i<=Tabels_name.size();i++){
            output+="File table"+(i)+" = new File(tableLocation"+i+");\n";
            output+="String[] Table_"+i+"_list = table"+i+".list();\n";
        }


        output+="int length_country1 =0;\n" +
                "for(String name2 : Table_2_list) {\n" +
                "            String absolutePath2 = tableLocation2 + File.separator + name2;\n" +
                "            try (BufferedReader br = new BufferedReader(new FileReader(absolutePath2))) {\n" +
                "                String line1;\n" +

                "\n" +
                "                while ((line1 = br.readLine()) != null) {\n\n"+
                "                    int null_value =0;\n" +
                "                    int i=0;\n\n";

        output+="byte[] comaList1 = new byte[";
        output+=Tabels_name.get(1).getTyp().size()-1;
        output+="];\n\n";

        output+="comaList1 = FindCommasInLine(line1,comaList1,tableSpilt2);\n";

        output+=" int index1 = "+Tabels_name.get(1).getIndexCol(joines.get(0).getCol2())+";\n\n";

        output+="String col1;\n" +
                "                    if(index1==0){\n" +
                "\n" +
                "                        col1= getCol(index1,comaList1[index1],line1);\n" +
                "\n" +
                "                    }else if(comaList1.length+1 == index1){\n" +
                "\n" +
                "                        col1= getCol(comaList1[comaList1.length-1]+1,line1.length(),line1);\n" +
                "                    }else{\n" +
                "                        col1=getCol(comaList1[index1-1]+1,comaList1[index1],line1);\n" +
                "                    }\n\nlength_country1 = comaList1.length+1;\n" +
                "\n" ;



        int tbl=1;
        output+="for (String name"+tbl+" : Table_"+tbl+"_list) {\n" +
                "                            String absolutePath"+tbl+" = tableLocation"+tbl+" + File.separator + name"+tbl+";\n" +
                "                            try (BufferedReader br"+(tbl+1)+" = new BufferedReader(new FileReader(absolutePath"+tbl+"))) {\n" +
                "                                String line"+(tbl+1)+";\n" +
                "\n" +
                "                                while ((line"+(tbl+1)+" = br"+(tbl+1)+".readLine()) != null) {\n i++;\n" +
                "                                 \n";



        output+="byte[] comaList"+(tbl+1)+" = new byte[";
        output+=Tabels_name.get(0).getTyp().size()-1;
        output+="];\n\n";

        output+="comaList"+(tbl+1)+" = FindCommasInLine(line"+(tbl+1)+",comaList"+(tbl+1)+",tableSpilt"+tbl+");";


        output+=" int index"+(tbl+1)+" = "+Tabels_name.get(0).getIndexCol(joines.get(0).getCol1())+";\n\n";
        output+="String col2;\n" +
                "                    if(index2==0){\n" +
                "\n" +
                "                        col2= getCol(index2,comaList2[index2],line2);\n" +
                "\n" +
                "                    }else if(comaList2.length+1 == index2){\n" +
                "\n" +
                "                        col2= getCol(comaList2[comaList2.length-1]+1,line2.length(),line2);\n" +
                "                    }else{\n" +
                "                        col2=getCol(comaList2[index2-1]+1,comaList2[index2],line2);\n" +
                "                    }\n\n";


        String op = joines.get(0).getOnOP();
        switch (op){
            case "=":{
                output+="if ((col"+(tbl)+".equals(col"+(tbl+1)+"))){\n";
            }break;
            default:{
                output+="if ((Integer.parseInt(col"+(tbl)+") "+op+" Integer.parseInt(col"+(tbl+1)+"))){\n";
            }break;
        }

        if(joines.get(0).getJoin().equals("rightjoin") || joines.get(0).getJoin().equals("RIGHTJOIN")){

            output+="                                    line1 = line1.replace(tableSpilt1,',');\n" +
                    "                                    line2 = line2.replace(tableSpilt2,',');\n" +
                    "                                    String concat_line1 = line2+','+line1;\n" +
                    "\n" +
                    "                                    byte[] comaConcat1 = new byte[comaList1.length+comaList2.length+1];\n" +
                    "\n" +
                    "                                    comaConcat1 = FindCommasInLine(concat_line1,comaConcat1,',');\n";


            try(BufferedWriter fileOutputStream = new BufferedWriter(new FileWriter(filePath,true))){

                fileOutputStream.write(output);

                fileOutputStream.close();
                output = "";
            } catch (IOException e) {
                e.printStackTrace();
            }


            output+=" byte[] Keys"+(1)+" = new byte[";

            output+=sel_col_keys.size();

            output+="];\n";
            for(int j=0;j<sel_col_keys.size();j++) {

                int TableInde = 0;
                for(TableInde=0;TableInde<Tabels_name.size();TableInde++){
                    if(Tabels_name.get(TableInde).getName_typ().equals(sel_col_keys.get(j).tablename)){
                        break;
                    }
                }


                int colInde = Tabels_name.get(TableInde).getIndexCol(sel_col_keys.get(j).colname);

                output += "Keys1[" + j + "] =(byte) ( ";

                for (int keys = 0; keys < TableInde; keys++) {

                    output += "comaList" + (keys + 1) + ".length +";
                    if (keys + 1 == TableInde)
                        output += "1+";

                }

                output += colInde + ");\n";


                temp = output;

                try(BufferedWriter fileOutputStream = new BufferedWriter(new FileWriter(filePath,true))){

                    fileOutputStream.write(output);

                    fileOutputStream.close();
                    output = "";
                } catch (IOException e) {
                    e.printStackTrace();
                }





                int map=0;

                for(int ii =0;ii<values.size();ii++){
                    map++;
                    output+="map("+map+",concat_line"+(1)+",name"+(1)+"+\"_\",comaConcat"+(1)+",Keys1,(byte) (";

                    for(TableInde=0;TableInde<Tabels_name.size();TableInde++){

                        if(Tabels_name.get(TableInde).getName_typ().equals(values.get(ii).tablename)){
                            break;
                        }

                    }

                    int valIndex = Tabels_name.get(TableInde).getIndexCol(values.get(ii).colname);

                    for(int valus=0;valus<TableInde;valus++){

                        output+="comaList2.length +";
                        if(valus+1 == TableInde)
                            output+="1+";

                    }

                    output+=valIndex+"));\n";


                }
                output+=  "                                }else{\n" +
                        "                                    null_value++;\n" +
                        "                                }\n";



            }

        }else{

            output+="\n" +
                    "\n" +
                    "\n" +
                    "                                }else{\n" +
                    "                                    null_value++;\n" +
                    "                                }\n";

        }




        output+="}\n" +
                "\n" +
                "                        }\n" +
                "                    }\n";

// ifffff

        output+=" if(null_value==i){\n" +
                "                        String c_null = \"\";\n" +
                "                        for(int k=1;k<length_country1;k++){\n" +
                "                           c_null+=\",\";\n" +
                "                        }\n" +
                "                        line1 = line1.replace(tableSpilt1,',');\n" +
                "                        String concat_line1 = c_null+','+line1;\n" +
                "                        byte[] comaConcat1 = new byte[comaList1.length+c_null.length()+1];\n" +
                "\n" +
                "                        comaConcat1 = FindCommasInLine(concat_line1,comaConcat1,',');\n";

        output+=temp;

        int map=0;
        int TableInde =0;
        for(int ii =0;ii<values.size();ii++){
            map++;
            output+="map("+map+",concat_line1,name2+\"_\",comaConcat"+(1)+",Keys1,(byte) (";

            for(TableInde=0;TableInde<Tabels_name.size();TableInde++){

                if(Tabels_name.get(TableInde).getName_typ().equals(values.get(ii).tablename)){
                    break;
                }

            }


            int valIndex = Tabels_name.get(TableInde).getIndexCol(values.get(ii).colname);

            for(int valus=0;valus<TableInde;valus++){

                output+="comaList"+(valus+1)+".length +";
                if(valus+1 == 1)
                    output+="1+";

            }

            output+=valIndex+"));\n";

        }

        output+="}\n\n";

        output+=" }\n" +
                "            } catch (FileNotFoundException e) {\n" +
                "                e.printStackTrace();\n" +
                "            } catch (IOException e) {\n" +
                "                e.printStackTrace();\n" +
                "            }\n" +
                "        }\n";
        output+="}\n";

        try(BufferedWriter fileOutputStream = new BufferedWriter(new FileWriter(filePath,true))){

            fileOutputStream.write(output);

            fileOutputStream.close();
            output = "";
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private void selectRightJoin(ArrayList<data> Tabels_name,ArrayList<joinStruct> joines,ArrayList<SelectCol> sel_col_keys,Map<String,Integer> vales){
        output+= "public static void join() {\n\n";
        for(int i=1;i<=Tabels_name.size();i++){
            output+="File table"+(i)+" = new File(tableLocation"+i+");\n";
            output+="String[] Table_"+i+"_list = table"+i+".list();\n";
        }

        output+="int length_country1 =0;\n" +
                "for(String name2 : Table_2_list) {\n" +
                "            String absolutePath2 = tableLocation2 + File.separator + name2;\n" +
                "            try (BufferedReader br = new BufferedReader(new FileReader(absolutePath2))) {\n" +
                "                String line1;\n" +
                "                    int null_value =0;\n" +
                "                    int i=0;\n\n"+
                "\n" +
                "                while ((line1 = br.readLine()) != null) {\n\n";


        output+="byte[] comaList1 = new byte[";
        output+=Tabels_name.get(1).getTyp().size()-1;
        output+="];\n\n";

        output+="comaList1 = FindCommasInLine(line1,comaList1,tableSpilt2);\n";

        output+=" int index1 = "+Tabels_name.get(1).getIndexCol(joines.get(0).getCol2())+";\n\n";

        output+="String col1;\n" +
                "                    if(index1==0){\n" +
                "\n" +
                "                        col1= getCol(index1,comaList1[index1],line1);\n" +
                "\n" +
                "                    }else if(comaList1.length+1 == index1){\n" +
                "\n" +
                "                        col1= getCol(comaList1[comaList1.length-1]+1,line1.length(),line1);\n" +
                "                    }else{\n" +
                "                        col1=getCol(comaList1[index1-1]+1,comaList1[index1],line1);\n" +
                "                    }\n\nlength_country1 = comaList1.length+1;\n" +
                "\n" ;



        try(BufferedWriter fileOutputStream = new BufferedWriter(new FileWriter(filePath,true))){

            fileOutputStream.write(output);

            fileOutputStream.close();
            output = "";
        } catch (IOException e) {
            e.printStackTrace();
        }

        int tbl=1;
        output+="for (String name"+tbl+" : Table_"+tbl+"_list) {\n" +
                "                            String absolutePath"+tbl+" = tableLocation"+tbl+" + File.separator + name"+tbl+";\n" +
                "                            try (BufferedReader br"+(tbl+1)+" = new BufferedReader(new FileReader(absolutePath"+tbl+"))) {\n" +
                "                                String line"+(tbl+1)+";\n" +
                "\n" +
                "                                while ((line"+(tbl+1)+" = br"+(tbl+1)+".readLine()) != null) {\n i++;\n" +
                "                                 \n";



        output+="byte[] comaList"+(tbl+1)+" = new byte[";
        output+=Tabels_name.get(0).getTyp().size()-1;
        output+="];\n\n";

        output+="comaList"+(tbl+1)+" = FindCommasInLine(line"+(tbl+1)+",comaList"+(tbl+1)+",tableSpilt"+tbl+");";


        output+=" int index"+(tbl+1)+" = "+Tabels_name.get(1).getIndexCol(joines.get(0).getCol1())+";\n\n";
        output+="String col2;\n" +
                "                    if(index2==0){\n" +
                "\n" +
                "                        col2= getCol(index2,comaList2[index2],line2);\n" +
                "\n" +
                "                    }else if(comaList2.length+1 == index2){\n" +
                "\n" +
                "                        col2= getCol(comaList2[comaList2.length-1]+1,line2.length(),line2);\n" +
                "                    }else{\n" +
                "                        col2=getCol(comaList2[index2-1]+1,comaList2[index2],line2);\n" +
                "                    }\n\n";


        try(BufferedWriter fileOutputStream = new BufferedWriter(new FileWriter(filePath,true))){

            fileOutputStream.write(output);

            fileOutputStream.close();
            output = "";
        } catch (IOException e) {
            e.printStackTrace();
        }



        String op = joines.get(0).getOnOP();
        switch (op){
            case "=":{
                output+="if ((col"+(tbl)+".equals(col"+(tbl+1)+"))){\n";
            }break;
            default:{
                output+="if ((Integer.parseInt(col"+(tbl)+") "+op+" Integer.parseInt(col"+(tbl+1)+"))){\n";
            }break;
        }

        if(joines.get(0).getJoin().equals("rightjoin") || joines.get(0).getJoin().equals("RIGHTJOIN")){

            output+="                                    line1 = line1.replace(tableSpilt1,',');\n" +
                    "                                    line2 = line2.replace(tableSpilt2,',');\n" +
                    "                                    String concat_line1 = line2+','+line1;\n" +
                    "\n" +
                    "                                    byte[] comaConcat1 = new byte[comaList1.length+comaList2.length+1];\n" +
                    "\n" +
                    "                                    comaConcat1 = FindCommasInLine(concat_line1,comaConcat1,',');\n";

            output+=" byte[] Keys"+(1)+" = new byte[";

            output+=sel_col_keys.size();

            output+="];\n";
            for(int j=0;j<sel_col_keys.size();j++){

                int TableInde =0;


                int colInde = Tabels_name.get(TableInde).getIndexCol(sel_col_keys.get(j).colname);

                output+="Keys1["+j+"] =(byte) ( ";

                for(int keys=0;keys<TableInde;keys++){

                    output+="comaList"+(keys+1)+".length +";
                    if(keys+1 == TableInde)
                        output+="1+";

                }

                output+=colInde+");\n";


                temp = output;


                try(BufferedWriter fileOutputStream = new BufferedWriter(new FileWriter(filePath,true))){

                    fileOutputStream.write(output);

                    fileOutputStream.close();
                    output = "";
                } catch (IOException e) {
                    e.printStackTrace();
                }



            }


            int TableInde=0;
            int map=0;

            for(int ii =0;ii<values.size();ii++){
                map++;
                output+="map("+map+",concat_line"+(1)+",name"+(1)+"+\"_\",comaConcat"+(1)+",Keys1,(byte) (";



                int valIndex = Tabels_name.get(TableInde).getIndexCol(values.get(ii).colname);

                for(int valus=0;valus<TableInde;valus++){

                    output+="comaList"+(valus+1)+".length +";
                    if(valus+1 == TableInde)
                        output+="1+";

                }

                output+=valIndex+"));\n";
                output+=  "                                }else{\n" +
                        "                                    null_value++;\n" +
                        "                                }\n";

            }

        }else{

            output+="\n" +
                    "\n" +
                    "\n" +
                    "                                }else{\n" +
                    "                                    null_value++;\n" +
                    "                                }\n";

        }

        try(BufferedWriter fileOutputStream = new BufferedWriter(new FileWriter(filePath,true))){

            fileOutputStream.write(output);

            fileOutputStream.close();
            output = "";
        } catch (IOException e) {
            e.printStackTrace();
        }


        output+="      }\n" +
                "                            }\n" +
                "                        }\n\n\n";



            output+=" if(null_value==i){\n" +
                    "                        String c_null = \"\";\n" +
                    "                        for(int k=1;k<length_country1;k++){\n" +
                    "                           c_null+=\",\";\n" +
                    "                        }\n" +
                    "                        line1 = line1.replace(tableSpilt1,',');\n" +
                    "                        String concat_line1 = c_null+','+line1;\n" +
                    "                        byte[] comaConcat1 = new byte[comaList1.length+c_null.length()+1];\n" +
                    "\n" +
                    "                        comaConcat1 = FindCommasInLine(concat_line1,comaConcat1,',');\n";

            output+=temp;

            int map=0;
        for(int ii =0;ii<values.size();ii++){
            map++;
            output+="map("+map+",concat_line1,name2+\"_\",comaConcat"+(1)+",Keys1,(byte) (";



            int valIndex = Tabels_name.get(1).getIndexCol(values.get(ii).colname);

            for(int valus=0;valus<1;valus++){

                output+="comaList"+(valus+1)+".length +";
                if(valus+1 == 1)
                    output+="1+";

            }

            output+=valIndex+"));\n";

        }

        output+="   }\n" +
                "\n" +
                "                }\n" +
                "            } catch (FileNotFoundException e) {\n" +
                "                e.printStackTrace();\n" +
                "            } catch (IOException e) {\n" +
                "                e.printStackTrace();\n" +
                "            }\n" +
                "        }}\n";



        try(BufferedWriter fileOutputStream = new BufferedWriter(new FileWriter(filePath,true))){

            fileOutputStream.write(output);

            fileOutputStream.close();
            output = "";
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void selectJoin(ArrayList<data> Tabels_name,ArrayList<joinStruct> joines,ArrayList<SelectCol> sel_col_keys,Map<String,Integer> vales){


        output+= "public static void join() {\n\n";

        for(int i=1;i<=Tabels_name.size();i++){
            output+="File table"+(i)+" = new File(tableLocation"+i+");\n";
            output+="String[] Table_"+i+"_list = table"+i+".list();\n";
        }

        output+="int length_country2 =0;\n" +
                "for(String name1 : Table_1_list) {\n" +
                "            String absolutePath1 = tableLocation1 + File.separator + name1;\n" +
                "            try (BufferedReader br = new BufferedReader(new FileReader(absolutePath1))) {\n" +
                "                String line1;\n" +
                "\n" +
                "                while ((line1 = br.readLine()) != null) {\nint null_value =0;\nint i=0;\n";

        output+="byte[] comaList1 = new byte[";
        output+=Tabels_name.get(0).getTyp().size()-1;
        output+="];\n\n";

        output+="comaList1 = FindCommasInLine(line1,comaList1,tableSpilt1);\n";

        output+=" int index1 = "+Tabels_name.get(0).getIndexCol(joines.get(0).getCol1())+";\n\n";


        output+="String col1;\n" +
                "                    if(index1==0){\n" +
                "\n" +
                "                        col1= getCol(index1,comaList1[index1],line1);\n" +
                "\n" +
                "                    }else if(comaList1.length+1 == index1){\n" +
                "\n" +
                "                        col1= getCol(comaList1[comaList1.length-1]+1,line1.length(),line1);\n" +
                "                    }else{\n" +
                "                        col1=getCol(comaList1[index1-1]+1,comaList1[index1],line1);\n" +
                "                    }\n\n";


        try(BufferedWriter fileOutputStream = new BufferedWriter(new FileWriter(filePath,true))){

            fileOutputStream.write(output);

            fileOutputStream.close();
            output = "";
        } catch (IOException e) {
            e.printStackTrace();
        }

        int tbl = 2;
        for(int i=0;i<joines.size();i++){

            output+="for (String name"+tbl+" : Table_"+tbl+"_list) {\n" +
                    "                            String absolutePath"+tbl+" = tableLocation"+tbl+" + File.separator + name"+tbl+";\n" +
                    "                            try (BufferedReader br"+tbl+" = new BufferedReader(new FileReader(absolutePath"+tbl+"))) {\n" +
                    "                                String line"+tbl+";\n" +
                    "\n" +
                    "                                while ((line"+tbl+" = br"+tbl+".readLine()) != null) {\n i++;\n" +
                    "                                 \n";


            output+="byte[] comaList"+tbl+" = new byte[";
            output+=Tabels_name.get(i+1).getTyp().size()-1;
            output+="];\n\n";

            output+="comaList"+tbl+" = FindCommasInLine(line"+tbl+",comaList"+tbl+",tableSpilt"+tbl+");";


            output+="length_country2 = comaList"+tbl+".length+1;";

            output+=" int index"+tbl+" = "+Tabels_name.get(i+1).getIndexCol(joines.get(i).getCol2())+";\n\n";

            output+="String col"+tbl+";\n" +
                    "                                    if(index"+tbl+"==0){\n" +
                    "\n" +
                    "                                        col"+tbl+"= getCol(index"+tbl+",comaList"+tbl+"[index"+tbl+"],line"+tbl+");\n" +
                    "\n" +
                    "                                    }else if(comaList"+tbl+".length+1 == index"+tbl+"){\n" +
                    "\n" +
                    "                                        col"+tbl+"= getCol(comaList"+tbl+"[comaList"+tbl+".length-1]+1,line"+tbl+".length(),line"+tbl+");\n" +
                    "                                    }else{\n" +
                    "                                        col"+tbl+"=getCol(comaList"+tbl+"[index"+tbl+"-1]+1,comaList"+tbl+"[index"+tbl+"],line"+tbl+");\n" +
                    "                                    }\n\n\n";


            String op = joines.get(i).getOnOP();
            switch (op){
                case "=":{
                    output+="if ((col"+(tbl-1)+".equals(col"+tbl+"))){\n";
                }break;
                default:{
                    output+="if ((Integer.parseInt(col"+(tbl-1)+") "+op+" Integer.parseInt(col"+tbl+"))){\n";
                }break;
            }



            output+="line"+(tbl-1)+" = line"+(tbl-1)+".replace(tableSpilt"+(tbl-1)+",',');\n" +
                    "                                        line"+tbl+" = line"+tbl+".replace(tableSpilt"+tbl+",',');\n" +
                    "                                        String concat_line"+(i+1)+" = line"+(tbl-1)+"+','+line"+tbl+";";


            output+=" byte[] comaConcat"+(i+1)+" = new byte[comaList"+(tbl-1)+".length+comaList"+tbl+".length+1];\n" +
                    "\n" +
                    "                                        comaConcat"+(i+1)+" = FindCommasInLine(concat_line"+(i+1)+",comaConcat"+(i+1)+",',');\n";


            try(BufferedWriter fileOutputStream = new BufferedWriter(new FileWriter(filePath,true))){

                fileOutputStream.write(output);

                fileOutputStream.close();
                output = "";
            } catch (IOException e) {
                e.printStackTrace();
            }

            output+=" byte[] Keys"+(i+1)+" = new byte[";

            output+=sel_col_keys.size();

            output+="];\n";




            for(int j=0;j<sel_col_keys.size();j++){

                    int TableInde =0;
                    int TI=-1;
                    for(TableInde=0;TableInde<Tabels_name.size();TableInde++){

                        if(Tabels_name.get(TableInde).getName_typ().equals(sel_col_keys.get(j).tablename)){
                            TI = TableInde;
                            break;
                        }

                    }



                    int colInde = Tabels_name.get(TI).getIndexCol(sel_col_keys.get(j).colname);

                    output+="Keys1["+j+"] =(byte) ( ";
                    for(int keys=0;keys<TableInde;keys++){

                        output+="comaList"+(keys+1)+".length +";
                        if(keys+1 == TableInde)
                            output+="1+";

                    }

                    output+=colInde+");\n";


                    temp = output;


                try(BufferedWriter fileOutputStream = new BufferedWriter(new FileWriter(filePath,true))){

                    fileOutputStream.write(output);

                    fileOutputStream.close();
                    output = "";
                } catch (IOException e) {
                    e.printStackTrace();
                }



            }

            int TableInde =0;
            int map=0;

            for(int ii =0;ii<values.size();ii++){
                map++;
                output+="map("+map+",concat_line"+(i+1)+",name"+(tbl-1)+"+\"_\"+name"+(tbl)+",comaConcat"+(i+1)+",Keys1,(byte) (";

                for(TableInde=0;TableInde<Tabels_name.size();TableInde++){

                    if(Tabels_name.get(TableInde).getName_typ().equals(values.get(ii).tablename)){
                        break;
                    }

                }


                int valIndex = Tabels_name.get(TableInde).getIndexCol(values.get(ii).colname);




                for(int valus=0;valus<TableInde;valus++){

                    output+="comaList"+(valus+1)+".length +";
                    if(valus+1 == TableInde)
                        output+="1+";

                }

                output+=valIndex+"));\n";


            }

            output+="}else {\n" +
                    "                                    null_value++;\n" +
                    "                                }";


            output+="      }\n" +
                    "                            }\n" +
                    "                        }\n\n\n";

            if(joines.get(i).getJoin().equals("leftjoin") || joines.get(i).getJoin().equals("LEFTJOIN")
                    || joines.get(i).getJoin().equals("fullouterjoin") || joines.get(i).getJoin().equals("FULLOUTERJOIN")){
                output+=" if(null_value==i){\n" +
                        "                        String c_null = \"\";\n" +
                        "                        for(int k=1;k<length_country2;k++){\n" +
                        "                           c_null+=\",\";\n" +
                        "                        }\n" +
                        "                        line1 = line1.replace(tableSpilt1,',');\n" +
                        "                        String concat_line1 = line1+','+c_null;\n" +
                        "                        byte[] comaConcat1 = new byte[comaList1.length+c_null.length()+1];\n" +
                        "\n" +
                        "                        comaConcat1 = FindCommasInLine(concat_line1,comaConcat1,',');\n";

                output+=temp;

                TableInde=0;map=0;
                for(int ii =0;ii<values.size();ii++){
                    map++;
                    output+="map("+map+",concat_line"+(i+1)+",name"+(tbl-1)+"+\"_\",comaConcat"+(i+1)+",Keys1,(byte) (";

                    for(TableInde=0;TableInde<Tabels_name.size();TableInde++){

                        if(Tabels_name.get(TableInde).getName_typ().equals(values.get(ii).tablename)){
                            break;
                        }

                    }


                    int valIndex = Tabels_name.get(TableInde).getIndexCol(values.get(ii).colname);




                    for(int valus=0;valus<TableInde;valus++){

                        output+="comaList"+(valus+1)+".length +";
                        if(valus+1 == TableInde)
                            output+="1+";

                    }

                    output+=valIndex+"));\n";


                }

                output+="}\n";


            }



        }


        output+="     }\n" +
                "            } catch (FileNotFoundException e) {\n" +
                "                e.printStackTrace();\n" +
                "            } catch (IOException e) {\n" +
                "                e.printStackTrace();\n" +
                "            }\n" +
                "        }\n" +
                "\n" +
                "\n" +
                "\n" +
                "    }\n\n";



        try(BufferedWriter fileOutputStream = new BufferedWriter(new FileWriter(filePath,true))){

            fileOutputStream.write(output);

            fileOutputStream.close();
            output = "";
        } catch (IOException e) {
            e.printStackTrace();
        }






    }



    private void selectWitoutJoin( ArrayList<data> Tabels_name,ArrayList<SelectCol> sel_col_keys,Map<String,Integer> vales){

        output+=getReadfilePart1();


        output+="byte[] comaList = new byte[";
        output+=Tabels_name.get(0).getTyp().size()-1;
        output+="];" ;

        output+="comaList = FindCommasInLine(line,comaList,tableSpilt1);";


        // where

        output+="if ((";

        output+="true";

        output+=")){";
        int map=0;
        for(Map.Entry<String, Integer> entry : vales.entrySet()){
            map++;
            output+=" byte[] Keys"+(map)+" = new byte[";

            output+=sel_col_keys.size();

            output+="];\n";

            for(int i=0;i<sel_col_keys.size();i++){
                output+="Keys"+(map)+"["+i+"] = "+Tabels_name.get(0).getIndexCol(sel_col_keys.get(i).colname)+";\n";
            }

           output+="map("+map+",line,name1,comaList,Keys"+(map)+",(byte)"+Tabels_name.get(0).getIndexCol(entry.getKey())+");\n";
        }


        output+=" }\n" +
                "\n" +
                "                }\n" +
                "            } catch (FileNotFoundException e) {\n" +
                "                e.printStackTrace();\n" +
                "            } catch (IOException e) {\n" +
                "                e.printStackTrace();\n" +
                "            }\n" +
                "        }\n" +
                "    }\n";

        try(BufferedWriter fileOutputStream = new BufferedWriter(new FileWriter(filePath,true))){

            fileOutputStream.write(output);

            fileOutputStream.close();
            output = "";
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private String getReadfilePart1(){
        return "public static void read_files() {\n" +
                "\n" +
                "        String Table_1_path = tableLocation1;\n" +
                "        File table1 = new File(Table_1_path);\n" +
                "        String[] Table_1_list = table1.list();\n" +
                "\n" +
                "        for(String name1 : Table_1_list) {\n" +
                "            String absolutePath1 = Table_1_path + File.separator + name1;\n" +
                "            try (BufferedReader br = new BufferedReader(new FileReader(absolutePath1))) {\n" +
                "                String line;\n" +
                "\n" +
                "                while ((line = br.readLine()) != null) {\n\n";
    }


    private String getPrintFunc(HplsqlParser.New_select_stmtContext ctx){

        String out ="private static void printResult(String ResultFile) {\nString colName = \"\";";

        for(int i =0 ; i<ctx.new_select_col().size();i++){
            SelectCol coloms = (SelectCol)visit(ctx.new_select_col(i));
            if(coloms.is_colom)
                out+="colName += \""+coloms.colname+" \\t\\t\";\n";
            else{
                if(coloms.func_name.equals("summarize")){

                    out+="colName += \"Count\"+\"\\t\\t\"+\"Mean\"+\"\\t\\t\"+\"Median\"+\"\\t\\t\"+\"Mode\"+\"\\t\\t\"+\"Max\"+\"\\t\\t\"+\"Min\"+\"\\t\\t\"+\"STD\";\n";
                }else {
                    out+=" colName += \""+coloms.func_name+"("+coloms.colname+")"+" \\t\\t\";\n";

                }

            }


        }

        out+="System.out.println(colName);\n" +
                "       \n" +
                "        try(BufferedReader br = new BufferedReader(new FileReader(ResultFile))) {\n" +
                "\n" +
                "            String line;\n" +
                "\n" +
                "            while ((line = br.readLine()) != null) {\n" +
                "\n" +
                "                String[] r = line.split(\"/\");\n" +
                "                String[] k = r[0].split(\",\");\n" +
                "\n" +
                "                for(String kk:k){\n" +
                "                    System.out.print(kk + \" \\t\\t \");\n" +
                "                }\n" +
                "\n" +
                "                String[] values = r[1].split(\",\");\n" +
                "\n" +
                "                for(String kk:values){\n" +
                "                    System.out.print(kk + \" \\t\\t \");\n" +
                "                }\n" +
                "                System.out.println(\"\\n\");\n" +
                "            }\n" +
                "        } catch (FileNotFoundException e) {\n" +
                "            e.printStackTrace();\n" +
                "        } catch (IOException e) {\n" +
                "            e.printStackTrace();\n" +
                "        }\n" +
                "    }\n";
        return out;
    }


    private String getFuncBody(String func_name){
        switch (func_name){
            case "sum":{
                return  "int sum = 0;\n" +
                        "                for(int i=0;i<c.size();i++){\n" +
                        "\n" +
                        "                    sum+=c.get(i);\n" +
                        "                }\n" +
                        "                return String.valueOf(sum);\n" +
                        "            }\n" +
                        "        });\n\n";
            }
            case "avg":{
                return "int sum = 0;\n" +
                        "                for(int i=0;i<c.size();i++){\n" +
                        "\n" +
                        "                    sum+=c.get(i);\n" +
                        "                }\n" +
                        "                return String.valueOf(sum/c.size());\n" +
                        "            }\n" +
                        "        });\n\n";
            }
            case "count":{
                return
                        "                return String.valueOf(c.size());\n" +

                                "        }});\n\n";
            }
            case "summarize":{
                return "String output=\"\";\n" +
                        "                //calculate count\n" +
                        "                output+=c.size() + \" \\t\\t \";\n" +
                        "                //calculate mean(avg)\n" +
                        "                double sum = 0.0;\n" +
                        "                for(double num : c){\n" +
                        "                    sum+=num;\n" +
                        "                }\n" +
                        "                double avg = sum/c.size();\n" +
                        "                avg = Math.floor(avg);\n" +
                        "                output+=avg + \" \\t\\t \";\n" +
                        "                //calculate median\n" +
                        "                Collections.sort(c);\n" +
                        "                double median;\n" +
                        "                if (c.size() % 2 == 0)\n" +
                        "                { median = (double)(c.get(c.size()/2) + c.get(c.size()/2 - 1))/2;}\n" +
                        "                else\n" +
                        "                { median = (double)c.get(c.size()/2);}\n" +
                        "                output+=median + \" \\t\\t \";\n" +
                        "                //calculate mode\n" +
                        "                final Map<Integer, Integer> countMap = new HashMap<Integer, Integer>();\n" +
                        "\n" +
                        "                int max = -1;\n" +
                        "\n" +
                        "                for (final int n : c) {\n" +
                        "                    int count = 0;\n" +
                        "\n" +
                        "                    if (countMap.containsKey(n)) {\n" +
                        "                        count = countMap.get(n) + 1;\n" +
                        "                    } else {\n" +
                        "                        count = 1;\n" +
                        "                    }\n" +
                        "\n" +
                        "                    countMap.put(n, count);\n" +
                        "\n" +
                        "                    if (count > max) {\n" +
                        "                        max = count;\n" +
                        "                    }\n" +
                        "                }\n" +
                        "                output+=\"[\";\n" +
                        "                for (final Map.Entry<Integer, Integer> tuple : countMap.entrySet()) {\n" +
                        "                    if (tuple.getValue() == max) {\n" +
                        "                        output+=tuple.getKey()+ \" - \";\n" +
                        "                    }\n" +
                        "                }\n" +
                        "                output+=\"]\"+ \" \\t\\t \";\n" +
                        "                \n" +
                        "                //max value\n" +
                        "                int maxVal = c.get(0);\n" +
                        "                for(int i=1;i < c.size();i++){\n" +
                        "                    if(c.get(i) > maxVal){\n" +
                        "                        maxVal = c.get(i);\n" +
                        "                    }\n" +
                        "                }\n" +
                        "                \n" +
                        "                output+=maxVal+ \" \\t\\t \";\n" +
                        "                //min value\n" +
                        "                int minValue = c.get(0);\n" +
                        "                for(int i=1;i<c.size();i++){\n" +
                        "                    if(c.get(i) < minValue){\n" +
                        "                        minValue = c.get(i);\n" +
                        "                    }\n" +
                        "                }\n" +
                        "                output+=minValue+ \" \\t\\t \";\n" +
                        "                //calculate std\n" +
                        "                double summ = 0.0, standardDeviation = 0.0;\n" +
                        "                int length = c.size();\n" +
                        "\n" +
                        "                for(double num : c) {\n" +
                        "                    summ += num;\n" +
                        "                }\n" +
                        "\n" +
                        "                double mean = summ/length;\n" +
                        "\n" +
                        "                for(double num: c) {\n" +
                        "                    standardDeviation += Math.pow(num - mean, 2);\n" +
                        "                }\n" +
                        "                output+=Math.sqrt(standardDeviation/length)+ \" \\t\\t \";\n" +
                        "\n" +
                        "\n" +
                        "                return output;\n\n}});";
            }
        }

        return "";
    }





}
