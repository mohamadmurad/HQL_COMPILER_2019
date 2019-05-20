package main;

import ST.*;
import TypeArray.*;
import antGen.HplsqlBaseVisitor;
import antGen.HplsqlParser;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class codeGen extends HplsqlBaseVisitor<Object> {

    TypeArray types;
    //SymbolTable symbolTable;
    int mapNum = 0,shuffNum=0,reduNum=0;
    boolean isReduce = false;
    boolean isShuffle = false;

    {
        try {
            types = new TypeArray();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    String output = "";
    String mapers = "";
    String shuffles ="";
    String reducers ="";
    String diroutput = "src//CG";
    String fileName = "cg.java";


    ArrayList<SelectCol> values = new ArrayList<>();

    //SelectCol val = null;



    public codeGen(SymbolTable st) {

      //  this.symbolTable = st;
        File f= new File(diroutput+File.separator+fileName);
        f.delete();


        output += "package CG;\n" +
                "import java.io.*;\n" +
                "import java.util.ArrayList;\n" +
                "import java.util.HashMap;\n" +
                "import java.util.Map;\n"+
                  "import java.util.Collections;\n";


        output+="public class cg {\n\n";

        output+="public interface MyFunction {\n" +
                "        String operation(ArrayList<Integer> c);\n" +
                "    }\n\n";

        // variable
        output+="static String tempdirectory = \"temp\";\n"+
                "static String lineSeparator = System.getProperty(\"line.separator\");\n\n";


        // delete function
        output+=getDeleteFunc();


        output+= getInitFile();

        output+=getConcat();

        try(BufferedWriter fileOutputStream = new BufferedWriter(new FileWriter(diroutput+ File.separator+fileName,true))){

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
        String table_name = ctx.new_from_table().from_table_name_clause().table_name().ident().getText();

        try {
            data d = types.get(table_name);

            if(d!=null){

                String location = d.getTableLocation().replace("\\","\\\\");
                String dilimiter = d.getTsbleDELIMITER();



                output+="static String tableLocation = \""+location+"\";\n"+
                        "static String tableSpilt  = \""+dilimiter+"\";\n";
                try(BufferedWriter fileOutputStream = new BufferedWriter(new FileWriter(diroutput+ File.separator+fileName,true))){

                    fileOutputStream.write(output);

                    fileOutputStream.close();

                } catch (IOException e) {
                    e.printStackTrace();
                }

                output = "";

                ArrayList<SelectCol> sel_col_keys = new ArrayList<>();

                Map<String,Integer> vales = new HashMap<>();

                // data tab = types.get(table_name);


                for(int i =0 ; i<ctx.new_select_col().size();i++){
                    SelectCol coloms = (SelectCol)visit(ctx.new_select_col(i));

                    if(types.find_col_in_table(coloms.colname,table_name)){
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

                }

                for (Map.Entry<String, Integer> entry : vales.entrySet()) {

                    if(entry.getValue() ==1){

                        mapers+=getMapPart1();

                        for(SelectCol b:sel_col_keys){
                            int i = d.getIndexCol(b.colname);
                            mapers+= "country["+i+"] + \",\" +";
                        }
                        mapers+= "\"/\" + country["+ d.getIndexCol(entry.getKey()) +"];\n\n";

                        mapers+=getMapPart2();
                        if(ctx.group_by_clause()!=null) {
                            isReduce = true;
                            shuffles += getShuff();

                            reducers += getReduce();
                        }

                    }else{

                        mapers+=getMapPart1();

                        for(SelectCol b:sel_col_keys){
                            int i = d.getIndexCol(b.colname);
                            mapers+= "country["+i+"] + \",\" +";
                        }
                        mapers+= "\"/\" + country["+ d.getIndexCol(entry.getKey()) +"];\n\n";

                        mapers+=getMapPart2();
                        if(ctx.group_by_clause()!=null) {
                            isReduce = true;
                            shuffles += getShuff();
                            for(int i=1;i<=entry.getValue();i++){

                                reducers += getReduce();
                            }


                        }

                    }

                }



                try(BufferedWriter fileOutputStream = new BufferedWriter(new FileWriter(diroutput+ File.separator+fileName,true))){

                    fileOutputStream.write(mapers + shuffles + reducers);

                    fileOutputStream.close();

                } catch (IOException e) {
                    e.printStackTrace();
                }

                mapers = "";
                shuffles = "";
                reducers = "";

            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }



        output+= "public static void map_reduce( ";
       // for(int i=1;i<=mapNum;i++){
            output+= "String[] FilesName";
            //if(i!=mapNum){output+=",";}

        //}




        output+= ") throws IOException {\n";

        output+= "File stockDir1 = new File(tempdirectory+File.separator+\""+table_name+"\");\n" +
                "        if(!stockDir1.exists()){stockDir1.mkdir();}\n\n";

        output+="for(String name : FilesName){\n";

        for(int i=1;i<=mapNum;i++){
            output+="mapper"+i+"(name);";
        }

        output+="}\n";

        if(isReduce){

            for(int i=1;i<=shuffNum;i++){
                output+="shuffle"+i+"();";
            }


            output+="\n";


            int i=1;
            for(SelectCol fun:values){

                if(i>=2){

                    output+="String red"+i+" = reducer"+i+"(new MyFunction() {\n" +
                            "            @Override\n" +
                            "            public String operation(ArrayList<Integer> c) {\n" ;

                    output+=getFuncBody(fun.func_name);

                    if(i==2){
                        output+= "red"+(i)+" = concatReducer(red"+(i-1)+",red"+i+",tempdirectory+File.separator+\""+table_name+"\"+File.separator+\"red"+(i-1)+"\",tempdirectory+File.separator+\""+table_name+"\"+File.separator+\"red"+i+"\");\n";

                    }else {
                        output+= "red"+(i)+" = concatReducer(red"+(i-1)+",red"+i+",tempdirectory,tempdirectory+File.separator+\""+table_name+"\"+File.separator+\"red"+i+"\");\n";

                    }

                }else{

                    output+="String red"+i+" = reducer"+i+"(new MyFunction() {\n" +
                            "            @Override\n" +
                            "            public String operation(ArrayList<Integer> c) {\n" ;

                    output+=getFuncBody(fun.func_name);

                }



            i++;
            }

            output+="printResult(red"+(i-1)+");";
            output+="}";

        }




        try(BufferedWriter fileOutputStream = new BufferedWriter(new FileWriter(diroutput+ File.separator+fileName,true))){

            fileOutputStream.write(output);

            fileOutputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        output = "";

        // main
        output+= getMain();


        output+=getPrintFunc(ctx,table_name);


        output+="}";



        try(BufferedWriter fileOutputStream = new BufferedWriter(new FileWriter(diroutput+ File.separator+fileName,true))){

            fileOutputStream.write(output);

            fileOutputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
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
        SelectCol temp = new SelectCol("",func_name, paramiter,null,false);
        return  temp;


        //return super.visitExpr_agg_window_func(ctx);
    }

    public String getMapPart1(){
        return "    public static void mapper"+ (++mapNum) +"(String filename){\n" +
                "\nString maperPath = tempdirectory+File.separator+\"temperature\"+File.separator+\"map"+mapNum+"\";\n" +
                "\n" +
                "        File stockDir1 = new File(maperPath);\n" +
                "        if(!stockDir1.exists()){stockDir1.mkdir();}\n" +
                "        try (BufferedReader br = new BufferedReader(new FileReader(tableLocation+File.separator+filename))) {\n" +
                "            String line =  br.readLine();\n" +
                "            while ((line ) != null) {\n" +
                "                \n" +
                "                String[] country = line.split(tableSpilt);\n" +
                "                \n" +
                "                String FileName = filename + \""+mapNum+".txt\";\n" +
                "                String absolutePath = maperPath + File.separator + FileName;\n" +
                "\n" +
                "                try(FileOutputStream fileOutputStream = new FileOutputStream(absolutePath,true)) {\nString fileContent = ";

    }

    public  String getMapPart2(){
        return "\nfileContent = fileContent.replace(\",/\",\"/\");" +
                "                    fileOutputStream.write(fileContent.getBytes());\n" +
                "\n" +
                "                    line =  br.readLine();\n" +
                "                    if(line != null){\n" +
                "                        fileOutputStream.write(lineSeparator.getBytes());\n" +
                "                    }\n" +
                "\n" +
                "\n" +
                "\n" +
                "                    fileOutputStream.flush();\n" +
                "\n" +
                "                    fileOutputStream.close();\n" +
                "\n" +
                "                } catch (FileNotFoundException e) {\n" +
                "                   \n" +
                "                } catch (IOException e) {\n" +
                "                   \n" +
                "                }\n" +
                "\n" +
                "\n" +
                "            }\n" +
                "\n" +
                "        } catch (IOException e) {\n" +
                "            e.printStackTrace();\n" +
                "        }\n" +
                "\n" +
                "    }\n";
    }


    public String getShuff(){

        return "public static  void shuffle"+(++shuffNum)+"() throws IOException {\n" +
                "        String maperPath = tempdirectory+File.separator+\"temperature\"+File.separator+\"map"+mapNum+"\";\n" +
                "        String shuffPath = tempdirectory+File.separator+\"temperature\"+File.separator+\"shuff"+shuffNum+"\";\n" +
                "\n" +
                "        File stockDir1 = new File(shuffPath);\n" +
                "        if(!stockDir1.exists()){stockDir1.mkdir();}\n" +
                "\n" +
                "        Map<ArrayList<Integer>,ArrayList<Integer>> mmm = new HashMap<>();\n" +
                "\n" +
                "        File stockDir = new File(maperPath);\n" +
                "        String[] list = stockDir.list();\n" +
                "        for(String name : list){\n" +
                "            String absolutePath = maperPath + File.separator + name;\n" +
                "            try(BufferedReader br = new BufferedReader(new FileReader(absolutePath))) {\n" +
                "\n" +
                "                String line;\n" +
                "\n" +
                "                while ((line = br.readLine()) != null){\n" +
                "                    String[] KeyAndVal = line.split(\"/\");\n" +
                "                    String[] Keys = KeyAndVal[0].split(\",\");\n" +
                "                    ArrayList<Integer> ALKeys = new ArrayList<>();\n" +
                "                    for(String k :Keys){\n" +
                "                        ALKeys.add(Integer.parseInt(k));\n" +
                "                    }\n" +
                "\n" +
                "\n" +
                "                    if(mmm.containsKey(ALKeys)){\n" +
                "                        mmm.get(ALKeys).add(Integer.parseInt(KeyAndVal[1]));\n" +
                "\n" +
                "                    }else {\n" +
                "\n" +
                "                        ArrayList<Integer> dd = new ArrayList<>();\n" +
                "                        dd.add(Integer.parseInt(KeyAndVal[1]));\n" +
                "                        mmm.put(ALKeys,dd);\n" +
                "                    }\n" +
                "                }\n" +
                "\n" +
                "                br.close();\n" +
                "\n" +
                "            } catch (FileNotFoundException e) {\n" +
                "                // exception handling\n" +
                "            } catch (IOException e) {\n" +
                "                // exception handling\n" +
                "            }\n" +
                "\n" +
                "\n" +
                "\n" +
                "        }\n" +
                "\n" +
                "        String shuffl = shuffPath + File.separator +\"shufflResult"+shuffNum+".txt\";\n" +
                "\n" +
                "        try(BufferedWriter fileOutputStream = new BufferedWriter(new FileWriter(shuffl,true))) {\n" +
                "\n" +
                "\n" +
                "            for (Map.Entry<ArrayList<Integer>, ArrayList<Integer>> entry : mmm.entrySet()) {\n" +

                "                String output = \"\";\n" +
                "\n" +
                "                for(int key : entry.getKey()){\n" +
                "                    output += key + \",\";\n" +
                "                }\n" +
                "                output +=\"/\";\n" +
                "                output = output.replaceFirst(\",/\",\"/\");\n" +
                "\n" +
                "                for(int val :entry.getValue()){\n" +
                "                    output+=\",\"+val;\n" +
                "                }\n" +
                "                output += System.lineSeparator();\n" +
                "                output = output.replaceFirst(\"/,\",\"/\");\n" +
                "                fileOutputStream.write(output);\n" +
                "\n" +
                "            }\n" +
                "\n" +
                "            fileOutputStream.close();\n" +
                "\n" +
                "        } catch (FileNotFoundException e) {\n" +
                "            // exception handling\n" +
                "        } catch (IOException e) {\n" +
                "            // exception handling\n" +
                "        }\n" +
                "\n" +
                "    }\n";
    }

    public String getReduce(){

        return "public static String reducer"+(++reduNum)+"(MyFunction obj1){\n" +
                "        String shuffPath = tempdirectory+File.separator+\"temperature\"+File.separator+\"shuff"+shuffNum+"\";\n" +
                "        String redusPath = tempdirectory+File.separator+\"temperature\"+File.separator+\"red"+reduNum+"\";\n" +
                "        String FileName = \"redu"+reduNum+".txt\";\n" +
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
                "                    String[] KeyAndVal = line.split(\"/\");\n" +
                "\n" +
                "                    String[] vlas = KeyAndVal[1].split(\",\");\n" +
                "                    ArrayList<Integer> values = new ArrayList<>();\n" +
                "\n" +
                "                    for(String s : vlas){\n" +
                "                        values.add(Integer.parseInt(s));\n" +
                "                    }\n" +
                "\n" +
                "                    String opResult1 = obj1.operation(values);\n" +
                "\n" +
                "                    String reduce = redusPath + File.separator +FileName;\n" +
                "                    try(BufferedWriter fileOutputStream = new BufferedWriter(new FileWriter(reduce,true))) {\n" +
                "                        fileOutputStream.write(KeyAndVal[0] + \"/\" + opResult1+ System.lineSeparator());\n" +
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
                "        return FileName;\n" +
                "\n" +
                "\n" +
                "    }\n" +
                "\n";
    }


    public String getConcat(){
        return "\n" +
                "    public static String concatReducer(String redu1, String redu2,String path1,String path2){\n" +
                "\n" +
                "        String reduce = tempdirectory + File.separator +redu1+redu2+\".txt\";\n" +
                "   \n" +
                "           String shuffl = path1 + File.separator +redu1;\n" +
                "            try (BufferedReader br = new BufferedReader(new FileReader(shuffl))) {\n" +
                "\n" +
                "                String line;\n" +
                "\n" +
                "                while ((line = br.readLine()) != null){\n" +
                "\n" +
                "                    String[] KeyAndVal = line.split(\"/\");\n" +
                "\n" +
                "                        String shuff2 = path2 + File.separator +redu2;\n" +
                "                        try (BufferedReader br2 = new BufferedReader(new FileReader(shuff2))) {\n" +
                "                            String line2;\n" +
                "                            while ((line2 = br2.readLine()) != null) {\n" +
                "\n" +
                "                                String[] KeyAndVal2 = line2.split(\"/\");\n" +
                "                                if(KeyAndVal[0].equals(KeyAndVal2[0])){\n" +
                "                                    String output = KeyAndVal[0] + \"/\" + KeyAndVal[1] + \",\" +KeyAndVal2[1]+lineSeparator;\n" +
                "                                    try(BufferedWriter fileOutputStream = new BufferedWriter(new FileWriter(reduce,true))) {\n" +
                "                                        fileOutputStream.write(output);\n" +
                "                                        fileOutputStream.close();\n" +
                "                                    }\n" +
                "                                }\n" +
                "\n" +
                "                            }\n" +
                "                        }\n" +
                "\n" +
                "                }\n" +
                "            } catch (FileNotFoundException e) {\n" +
                "                e.printStackTrace();\n" +
                "            } catch (IOException e) {\n" +
                "                e.printStackTrace();\n" +
                "            }\n" +
                "\n" +
                "        return redu1+redu2+\".txt\";\n" +
                "    }\n";
    }

    public  String getMain(){
        return "    public static void main(String[] args) {\n" +
                "        \n" +
                "        initFIleDir();\n" +
                "        File tableDir = new File(tableLocation);\n" +
                "        if(tableDir.exists() && tableDir.isDirectory()){\n" +
                "\n" +
                "            try {\n" +
                "                map_reduce(tableDir.list());\n" +
                "            } catch (IOException e) {\n" +
                "                e.printStackTrace();\n" +
                "            }\n" +
                "\n" +
                "\n" +
                "        }\n" +
                "    }";
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

    private String getPrintFunc(HplsqlParser.New_select_stmtContext ctx,String tablename){

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
                "        String absolutePath = tempdirectory + File.separator +ResultFile;\n" +
                "File v = new File(absolutePath);\n" +
                "        if(!v.exists()){\n" +
                "            absolutePath = tempdirectory+File.separator +\""+tablename+"\"+ File.separator+ \"red"+reduNum+"\"+File.separator + ResultFile;\n" +
                "        }"+
                "        try(BufferedReader br = new BufferedReader(new FileReader(absolutePath))) {\n" +
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


}
