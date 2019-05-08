package main;

import ST.Record;
import ST.SelectCol;
import ST.SymbolTable;
import ST.Table;
import TypeArray.*;
import antGen.HplsqlBaseVisitor;
import antGen.HplsqlParser;

import java.io.*;
import java.util.ArrayList;
import java.util.Map;

public class CodeGenerator extends HplsqlBaseVisitor<Object> {

    TypeArray types;
    SymbolTable symbolTable;
    int mapNum = 0;
    boolean isReduce = false;

    {
        try {
            types = new TypeArray();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    String output = "";
    String diroutput = "src//CG";
    String fileName = "cg.java";

    SelectCol val = null;



    public CodeGenerator(SymbolTable st) {

        this.symbolTable = st;
        File f= new File(diroutput+File.separator+fileName);
        f.delete();


        output += "package CG;\n" +
                "import java.io.*;\n" +
                "import java.util.ArrayList;\n" +
                "import java.util.HashMap;\n" +
                "import java.util.Map;\n";


        output+="public class cg {\n\n";

        output+="public interface MyFunction {\n" +
                "        int operation(ArrayList<Integer> c);\n" +
                "    }\n\n";

        // variable
        output+="static String tempdirectory = \"temp\";\n"+
                "static String lineSeparator = System.getProperty(\"line.separator\");\n\n";


        // delete function
        output+="public static void delete(File file)\n" +
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


        output+= "public static void initFIleDir(){\n" +
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

        //output+="}";

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
        symbolTable.setCurrentScopeNameAndType("Global", "program");
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

                output+="    public static void mapper"+ (++mapNum) +"(String filename){\n" +
                        "\n" +
                        "        try (BufferedReader br = new BufferedReader(new FileReader(tableLocation+File.separator+filename))) {\n" +
                        "            String line =  br.readLine();\n" +
                        "            while ((line ) != null) {\n" +
                        "                \n" +
                        "                String[] country = line.split(tableSpilt);\n" +
                        "                \n" +
                        "                String FileName = filename + \".txt\";\n" +
                        "                String absolutePath = tempdirectory + File.separator + FileName;\n" +
                        "\n" +
                        "                try(FileOutputStream fileOutputStream = new FileOutputStream(absolutePath,true)) {\n";


                try(BufferedWriter fileOutputStream = new BufferedWriter(new FileWriter(diroutput+ File.separator+fileName,true))){

                    fileOutputStream.write(output);

                    fileOutputStream.close();

                } catch (IOException e) {
                    e.printStackTrace();
                }

                output = "";

                ArrayList<SelectCol> sel_col_keys = new ArrayList<>();


                data tab = types.get(table_name);


               for(int i =0 ; i<ctx.new_select_col().size();i++){
                    SelectCol coloms = (SelectCol)visit(ctx.new_select_col(i));

                    if(types.find_col_in_table(coloms.colname,table_name)){
                        if(coloms.is_colom){
                            sel_col_keys.add(coloms);

                        }else{
                            val = coloms;
                        }

                    }

                }


                output+="String fileContent = ";

                for(SelectCol b:sel_col_keys){
                    int i = tab.getIndexCol(b.colname);

                   output+= "country["+i+"] + \",\" +";


                }
                if(val != null){
                    output+= "\"/\" + country["+ tab.getIndexCol(val.colname) +"];\n\n";

                }else{
                    output+= "\"/\" + 1;\n\n";

                }


                output+="\nfileContent = fileContent.replace(\",/\",\"/\");" +
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



                //output+="}";



                try(BufferedWriter fileOutputStream = new BufferedWriter(new FileWriter(diroutput+ File.separator+fileName,true))){

                    fileOutputStream.write(output);

                    fileOutputStream.close();

                } catch (IOException e) {
                    e.printStackTrace();
                }

                output = "";



            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        if(ctx.group_by_clause()!=null){
            isReduce = true;
            output+="public static  void shuffle() throws IOException {\n" +
                    "\n" +
                    "        Map<ArrayList<Integer>,ArrayList<Integer>> mmm = new HashMap<>();\n" +
                    "\n" +
                    "        File stockDir = new File(tempdirectory);\n" +
                    "        String[] list = stockDir.list();\n" +
                    "        for(String name : list){\n" +
                    "            String absolutePath = tempdirectory + File.separator + name;\n" +
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
                    "        String shuffl = tempdirectory + File.separator +\"shufflResult.txt\";\n" +
                    "\n" +
                    "        try(BufferedWriter fileOutputStream = new BufferedWriter(new FileWriter(shuffl,true))) {\n" +
                    "\n" +
                    "\n" +
                    "            for (Map.Entry<ArrayList<Integer>, ArrayList<Integer>> entry : mmm.entrySet()) {\n" +
                    "                System.out.println(entry.getKey()+\" : \"+entry.getValue());\n" +
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
                    "    }\n\n";





            output+="   public static void reducer(MyFunction obj){\n" +
                    "        \n" +
                    "        String shuffl = tempdirectory + File.separator +\"shufflResult.txt\";\n" +
                    "        try (BufferedReader br = new BufferedReader(new FileReader(shuffl))) {\n" +
                    "\n" +
                    "            String line;\n" +
                    "\n" +
                    "            while ((line = br.readLine()) != null){\n" +
                    "\n" +
                    "                String[] KeyAndVal = line.split(\"/\");\n" +
                    "\n" +
                    "                String[] vlas = KeyAndVal[1].split(\",\");\n" +
                    "                ArrayList<Integer> values = new ArrayList<>();\n" +
                    "\n" +
                    "                for(String s : vlas){\n" +
                    "                    values.add(Integer.parseInt(s));\n" +
                    "                }\n" +
                    "\n" +
                    "                int opResult = obj.operation(values);\n" +
                    "                String reduce = tempdirectory + File.separator +\"redu.txt\";\n" +
                    "                try(BufferedWriter fileOutputStream = new BufferedWriter(new FileWriter(reduce,true))) {\n" +
                    "                    fileOutputStream.write(KeyAndVal[0] + \"/\" + opResult+System.lineSeparator());\n" +
                    "                    fileOutputStream.close();\n" +
                    "                }\n" +
                    "\n" +
                    "            }\n" +
                    "            \n" +
                    "\n" +
                    "        } catch (FileNotFoundException e) {\n" +
                    "            e.printStackTrace();\n" +
                    "        } catch (IOException e) {\n" +
                    "            e.printStackTrace();\n" +
                    "        }\n" +
                    "        \n" +
                    "    }\n\n";


            try(BufferedWriter fileOutputStream = new BufferedWriter(new FileWriter(diroutput+ File.separator+fileName,true))){

                fileOutputStream.write(output);

                fileOutputStream.close();

            } catch (IOException e) {
                e.printStackTrace();
            }

            output = "";


        }

        output+= "public static void map_reduce( ";
        for(int i=1;i<=mapNum;i++){
            output+= "String[] FilesName"+i;
            if(i!=mapNum){output+=",";}

        }




        output+= ") throws IOException {\n";

        for(int i=1;i<=mapNum;i++){
            output+= "for(String name"+i+" : FilesName"+i+"){\n" +
                    "            mapper"+i+"(name"+i+");\n" +
                    "        }\n\n";

        }

        if(isReduce){
            output+="\n" +
                    "        shuffle();\n" +
                    "        reducer(new MyFunction() {\n" +
                    "            @Override\n" +
                    "            public int operation(ArrayList<Integer> c) {";
            System.out.println(val.func_name);
            switch (val.func_name){
                case "sum":{
                    output+="int sum = 0;\n" +
                            "                for(int i=0;i<c.size();i++){\n" +
                            "\n" +
                            "                    sum+=c.get(i);\n" +
                            "                }\n" +
                            "                return sum;\n" +
                            "            }\n" +
                            "        });";
                }break;
                case "avg":{}break;
            }


            output+="        String absolutePath = tempdirectory + File.separator + \"redu.txt\";\n" +
                    "        try(BufferedReader br = new BufferedReader(new FileReader(absolutePath))) {\n" +
                    "\n" +
                    "            String line;\n" +
                    "\n" +
                    "            while ((line = br.readLine()) != null) {\n" +
                    "                String[] r = line.split(\"/\");\n" +
                    "                String[] k = r[0].split(\",\");\n" +
                    "\n" +
                    "                for(String kk:k){\n" +
                    "                    System.out.print(kk + \"  \");\n" +
                    "                }\n" +
                    "\n" +
                    "                System.out.println( r[1]);\n" +
                    "\n" +
                    "            }\n" +
                    "        }\n" +
                    "\n" +
                    "\n" +
                    "    }";



        }






        try(BufferedWriter fileOutputStream = new BufferedWriter(new FileWriter(diroutput+ File.separator+fileName,true))){

            fileOutputStream.write(output);

            fileOutputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        output = "";

        // main
        output+= "    public static void main(String[] args) {\n" +
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
        SelectCol temp = new SelectCol("",func_name, paramiter,null);
        return  temp;


        //return super.visitExpr_agg_window_func(ctx);
    }




}
