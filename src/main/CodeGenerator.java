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

    {
        try {
            types = new TypeArray();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    String output = "";
    String diroutput = "src";
    String fileName = "cg.java";



    public CodeGenerator(SymbolTable st) {

        this.symbolTable = st;
        File f= new File(diroutput+File.separator+fileName);
        f.delete();


        output += "import java.io.*;\n" +
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
                ArrayList<name_type> s = new ArrayList<>();

                data tab = types.get(table_name);

                SelectCol val = null;
               for(int i =0 ; i<ctx.new_select_col().size();i++){
                    SelectCol coloms = (SelectCol)visit(ctx.new_select_col(i));

                    if(types.find_col_in_table(coloms.colname,table_name) || coloms.tablename.equals(table_name)){
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

                   System.out.println(i);

                   output+= "country["+i+"] + \",\" +";


                }
                output+= "\"/\" + country["+ tab.getIndexCol(val.colname) +"];\n\n";


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



                output+="}";



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
