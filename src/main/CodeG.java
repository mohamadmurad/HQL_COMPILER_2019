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
    String reducers ="";
    String diroutput = "src//CG";
    String fileName = "cg.java";

    String  filePath = diroutput+ File.separator+fileName;


    public CodeG() {

        File f= new File(filePath);
        if(f.exists()){f.delete();}

        output += "package CG;\n" +
                "import java.io.*;\n" +
                "import java.util.ArrayList;\n" +
                "import java.util.HashMap;\n" +
                "import java.util.List;\n" +
                "import java.util.Map;\n";
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


        try {
            String table_name = ctx.new_from_table().from_table_name_clause().table_name().ident().getText();
            Tabels_name.add(types.get(table_name));

            for(int i=0;i<ctx.new_from_join_clause().size();i++){
                table_name = ctx.new_from_join_clause(i).new_from_table().from_table_name_clause().table_name().ident().getText();
                Tabels_name.add(types.get(table_name));
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

        if(ctx.new_from_join_clause().size() ==0){
            // no join

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


            selectWitoutJoin(Tabels_name,sel_col_keys,vales);
            output+="public static void map_reduce() throws IOException {\n" +
                    "\n" +
                    "        read_files();\n";

            int map=0;
            int sum_all_red =0;
            for(Map.Entry<String, Integer> entry : vales.entrySet()){
                map++;

                sum_all_red+= entry.getValue();

               for(SelectCol s :values){
                   if(s.colname.equals(entry.getKey())){

                       output+="shuffle11("+map+","+s.is_distnict+");\n";

                       for(int red=0;red<entry.getValue();red++){
                           output+=" reducer("+map+","+(red+1)+",new MyFunction() {\n" +
                                   "            @Override\n" +
                                   "            public String operation(ArrayList<Integer> c) {\n" +
                                   "                int sum = 0;\n" +
                                   "                for(int i=0;i<c.size();i++){\n" +
                                   "\n" +
                                   "                    sum+=c.get(i);\n" +
                                   "                }\n" +
                                   "                return String.valueOf(sum/c.size());\n" +
                                   "            }\n" +
                                   "        });\n";


                       }
                   }

               }


            }

            for(int sum_a_red=0;sum_a_red<sum_all_red;sum_a_red++){
                output+="sum_all_red("+(sum_a_red+1)+");\n";
            }

            output+="String all_path = tempdirectory+File.separator+\"All_red\";\n" +
                    "        File n = new File(all_path);\n" +
                    "        String[] list = n.list();\n\n";


            if(sum_all_red == 2){
                output+="String all =concatReducer(list[0],list[1],tempdirectory+File.separator+\"All_red\",tempdirectory+File.separator+\"All_red\");\n";
            }else if(sum_all_red > 2){
                output+="String all =concatReducer(list[0],list[1],tempdirectory+File.separator+\"All_red\",tempdirectory+File.separator+\"All_red\");\n";
                output+="for(int i=1;i<list.length;i++){\n" +
                        "            if(i+1 <list.length){\n" +
                        "                all = concatReducer(all,list[i+1],tempdirectory,tempdirectory+File.separator+\"All_red\");\n" +
                        "            }\n" +
                        "\n" +
                        "        }\n\n";


                // if order /////



                output+="if(list.length==1){\n" +
                        "            printResult(tempdirectory+File.separator+\"All_red/1.txt\");\n" +
                        "        }else {\n" +
                        "            printResult(tempdirectory+File.separator+all);\n" +
                        "        }\n\n";


            }


            output+="}";
            try(BufferedWriter fileOutputStream = new BufferedWriter(new FileWriter(filePath,true))){

                fileOutputStream.write(output);

                fileOutputStream.close();
                output = "";
            } catch (IOException e) {
                e.printStackTrace();
            }

        }else{



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
        boolean isDistnict = ctx.expr_func_all_distinct() != null ? true :false;

        SelectCol temp = new SelectCol("",func_name, paramiter,null,isDistnict);
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
                "                list =  index;\n" +
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
                "        int numOfLine = 0;\n" +
                "        int MAXLINES = 5;\n" +
                "        List<String> temp = new ArrayList<>();\n" +
                "        int i=0;\n" +
                "        String Line = \"\";\n" +
                "        String ou_file = null;\n" +
                "        for(String name :list){\n" +
                "            String absolutePath = shuffPath + File.separator + name;\n" +
                "            try(BufferedReader br = new BufferedReader(new FileReader(absolutePath))) {\n" +
                "\n" +
                "\n" +
                "                ou_file = shuffPath + File.separator +(++i) +\".txt\" ;\n" +
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
                "\n" +
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
                "                  // String[] KeyAndVal = line.split(\"/\");\n" +
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
        return "public static void sum_all_red(int red){\n" +
                "\n" +
                "        String redusPath = tempdirectory+File.separator+\"red\"+red;\n" +
                "        String ALl_red_path = tempdirectory+File.separator+\"All_red\";\n" +
                "        String all_file = ALl_red_path + File.separator+red+\".txt\";\n" +
                "        // String FileName = \"redu\"+numReduce+\".txt\";\n" +
                "\n" +
                "        File stockDir1 = new File(ALl_red_path);\n" +
                "        if(!stockDir1.exists()){stockDir1.mkdir();}\n" +
                "\n" +
                "\n" +
                "        File stockDir = new File(redusPath);\n" +
                "        String[] list = stockDir.list();\n" +
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
                "        LeftJoin();\n" +
                "        RightJoin_WithoutInnerJoin();\n" +
                "\n" +
                "    }\n";
    }

    private String getReducer(){
        return "public static String reducer(int shuff,MyFunction obj1){\n" +
                "\n" +
                "        String shuffPath = tempdirectory+File.separator+\"shuff\"+shuff;;\n" +
                "        String redusPath = tempdirectory+File.separator+\"red\"+shuff;\n" +
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
                "                    //String[] KeyAndVal = line.split(\"/\");\n" +
                "                    String[] vlas ;\n" +
                "\n" +
                "                    byte slash1 = 0;\n" +
                "\n" +
                "                    slash1 =FindSlash(line);\n" +
                "\n" +
                "                    // String[] KeyAndVal = line.split(\"/\");\n" +
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

    private void selectWitoutJoin( ArrayList<data> Tabels_name,ArrayList<SelectCol> sel_col_keys,Map<String,Integer> vales){

        output+=getReadfilePart1();



       /* for (Map.Entry<String, Integer> entry : vales.entrySet()) {

            if(entry.getValue() ==1){




            }
        }*/

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





    }