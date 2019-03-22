package main;

import ST.*;
import TypeArray.*;
import Error.*;
import antGen.HplsqlBaseVisitor;
import antGen.HplsqlParser;

import java.io.IOException;
import java.util.ArrayList;

public class myvisitor extends HplsqlBaseVisitor<Object> {
    SymbolTable symbolTable;

    HplsqlParser myparser;


    TypeArray types;

    {
        try {
            types = new TypeArray();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public myvisitor(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }

    private enum ScopeTypes {
        Global("program"),
        Loop("Loop"),
        METHOD("method"),
        TABLE("table"),
        SELECT("select")
        ;

        private final String text;

        private ScopeTypes(final String text) {
            this.text = text;
        }

        @Override
        public String toString() {
            return text;
        }
    }

    @Override
    public Object visitProgram(HplsqlParser.ProgramContext ctx) {
        symbolTable.setCurrentScopeNameAndType("Global", ScopeTypes.Global.toString());
        return super.visitProgram(ctx);
    }

    @Override
    public Object visitStmt(HplsqlParser.StmtContext ctx) {
        return super.visitStmt(ctx);
    }

    /* start create table */
    @Override
    public Object visitCreate_table_stmt(HplsqlParser.Create_table_stmtContext ctx) {

        String id_type;


        id_type  = ctx.table_name.ident().getText();
        if(types.find_typ(id_type)){
            System.out.print("Error Table :" + id_type + "  found!");

        }else{

            ArrayList<Record> colom = (ArrayList<Record>) visit(ctx.create_table_definition());
            ArrayList<name_type> nameType = new ArrayList<>();
            boolean coltype = true;
            for(int i=0;i<colom.size();i++){

                if(types.find_typ(colom.get(i).getType())){
                    name_type colname = new name_type(colom.get(i).getId(),colom.get(i).getType());
                    nameType.add(colname);

                }else{

                    System.out.println("Error Type :" + colom.get(i).getType() + " Not found!");
                    coltype = false;

                }

            }

            if(coltype){

                try{
                    types.set(id_type,nameType);

                    Table currentTable = new Table(id_type,id_type);

                    symbolTable.put(id_type, currentTable);

                    symbolTable.enterScope();
                    // set scope name
                    symbolTable.setCurrentScopeNameAndType(id_type, ScopeTypes.TABLE.toString());

                    for(int i =0 ; i<colom.size();i++){
                        currentTable.addColumn(colom.get(i));
                        symbolTable.put(colom.get(i).getId(),colom.get(i));
                    }

                    symbolTable.exitScope();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }

        }

        return super.visitCreate_table_stmt(ctx);
    }

    @Override
    public Object visitCreate_table_definition(HplsqlParser.Create_table_definitionContext ctx) {
        return visit(ctx.create_table_columns());
    }

    @Override
    public Object visitCreate_table_columns(HplsqlParser.Create_table_columnsContext ctx) {

        ArrayList<Object> colom = new ArrayList<>();
        for(int i=0;i<ctx.create_table_columns_item().size();i++){
            String type = ctx.create_table_columns_item(i).dtype().getText(); // get type
            String id = ctx.create_table_columns_item(i).column_name.ident().getText(); // get ID


            Record col = new Record(id, type,"colom");
            colom.add(col);

        }
        return colom;
    }

    /* end create table */

    /* start select  */

    @Override
    public Object visitNew_select_stmt(HplsqlParser.New_select_stmtContext ctx) {
        String table_name = ctx.new_from_table().from_table_name_clause().table_name().ident().getText();


        if(types.find_typ(table_name)){
            boolean isColTrue = true;
            ArrayList<SelectCol> sel_col = new ArrayList<>();
            for(int i =0 ; i<ctx.new_select_col().size();i++){
                if(!isColTrue) break;

                SelectCol coloms = (SelectCol)visit(ctx.new_select_col(i));
                //System.out.println("gggggggggggggggg");
                if(!coloms.colname.equals("*")){
                    if(types.find_col_in_table(coloms.colname,table_name)){
                        //System.out.println(coloms.colname);
                        sel_col.add(coloms);
                    }else {
                        System.out.println("Error Column :" + coloms.colname + " Not found! In Table " + table_name);
                        isColTrue = false;
                    }
                }else{
                    sel_col.add(coloms);
                }

               // System.out.println(coloms.func_name);
            }

            if(isColTrue){

                Select currentSelect = new Select("SELECT","SELECT STATMENT",table_name);
                currentSelect.setColumn(sel_col);
                symbolTable.put("SELECT", currentSelect);

                symbolTable.enterScope();
                // set scope name
                symbolTable.setCurrentScopeNameAndType("SELECT", ScopeTypes.SELECT.toString());

                String alias = "";
                if(ctx.new_from_table().from_table_name_clause().from_alias_clause() != null){
                    alias = (String) visit(ctx.new_from_table().from_table_name_clause().from_alias_clause());
                    Record newTableName = new Record(alias,table_name,"tableOtherName");
                    symbolTable.put(alias,newTableName);
                }

                for(int i=0;i<sel_col.size();i++){
                    System.out.println("ccc "  + sel_col.get(i).aslis);
                    if(!sel_col.get(i).aslis.equals(null)){
                        Record newColName = new Record(sel_col.get(i).aslis,sel_col.get(i).colname+ " In [ "+ table_name +" ]","ColOtherName");
                        symbolTable.put(sel_col.get(i).aslis,newColName);
                    }
                }


                symbolTable.exitScope();
            }

        }else{
            System.out.println("Error Table :" + table_name + " Not found!");
        }

        return ctx;
    }

    @Override
    public Object visitNew_select_col(HplsqlParser.New_select_colContext ctx) {
        Object x = visitChildren(ctx);
       // SelectCol b = (SelectCol)x;
        //System.out.println(b.aslis);
        return x;
        //return super.visitNew_select_col(ctx);
    }

    @Override
    public Object visitSelect_list_asterisk(HplsqlParser.Select_list_asteriskContext ctx) {
        return new SelectCol("*",null,null);
        //return super.visitSelect_list_asterisk(ctx);
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


        //return super.visitColom_name(ctx);
    }

    @Override
    public Object visitSelect_list_alias(HplsqlParser.Select_list_aliasContext ctx) {
        return ctx.ident().getText();
    }

    @Override
    public Object visitFrom_alias_clause(HplsqlParser.From_alias_clauseContext ctx) {
        return ctx.ident().getText();
    }

    @Override
    public Object visitTabledotcol(HplsqlParser.TabledotcolContext ctx) {

        String table_name = ctx.ident().getText();
        String col_name = ctx.colom_name().ident().getText();
        Object aslis = null;
        if(ctx.colom_name().select_list_alias() != null){
             aslis =  visit(ctx.colom_name().select_list_alias());
            //temp = new SelectCol(col_name,null, (String) aslis);
        }else {
            //temp = new SelectCol(col_name,null, null);
        }


        SelectCol temp = new SelectCol(col_name,table_name, (String) aslis);
        return  temp;
        //return super.visitTabledotcol(ctx);
    }

    @Override
    public Object visitCol_func(HplsqlParser.Col_funcContext ctx) {

        SelectCol temp = (SelectCol) visit(ctx.expr_agg_window_func());
       // Object aslis =  visit(ctx.select_list_alias());
        //temp.aslis = (String)aslis;

        return temp;
    }

    @Override
    public Object visitExpr_agg_window_func(HplsqlParser.Expr_agg_window_funcContext ctx) {

        String func_name = ctx.getChild(0).getText();
        //System.out.println(func_name);
        String paramiter = ctx.expr().get(0).getText();
        SelectCol temp = new SelectCol("",func_name, paramiter,null);
        return  temp;


        //return super.visitExpr_agg_window_func(ctx);
    }


    /* end select */

    /* Start Function */
    @Override
    public Object visitFunction_stmt(HplsqlParser.Function_stmtContext ctx) {
        String type = ctx.dtype().getText(); // get type
        String funcName = ctx.ident().getText(); // get ID

        if(symbolTable.lookuplocaly(funcName)!=null){
            ErrorPrinter.printSymbolAlreadyDefinedError(myparser, ctx.ident.start, "method", funcName, symbolTable.getCurrentScopeName());
        }

        FunctionRecord currentFunc = new FunctionRecord(funcName,type);

        symbolTable.put(funcName, currentFunc);

        symbolTable.enterScope();
        // set scope name
        symbolTable.setCurrentScopeNameAndType(funcName, myvisitor.ScopeTypes.METHOD.toString());

        // get paramiters
        if(ctx.return_param() != null){

            ArrayList<Record>  paramiters = (ArrayList<Record>) visit(ctx.return_param());

            for(int i =0 ;i<paramiters.size();i++){
                //System.out.println(paramiters.get(i).getId());
                currentFunc.addParameter(paramiters.get(i));
                symbolTable.put(paramiters.get(i).getId(), paramiters.get(i));
            }

        }


        visit(ctx.cpp_smt());





        symbolTable.exitScope();
        return null;
        //return super.visitFunction_stmt(ctx);
    }

    @Override
    public Object visitReturn_param(HplsqlParser.Return_paramContext ctx) {

        ArrayList<Record> paramiters = new ArrayList<>();

        for(int i=0;i<ctx.return_param_item().size();i++){
            String type = ctx.return_param_item(i).dtype().getText(); // get type
            if(!types.find_typ(type)){
                //Print undefined type error
                ErrorPrinter.printFullError(myparser, ctx.return_param_item(i).dtype().start,
                        "error: cannot find Type. \n symbol:   Type "+type,
                        "symbol:   Type " + type,
                        "location: Function " + symbolTable.getCurrentScopeName()
                );
            }
            String name = ctx.return_param_item(i).ident().getText(); // get ID


            Record col = new Record(name, type,"Paramiter");
            paramiters.add(col);

        }
        return paramiters;

        //return super.visitReturn_param(ctx);
    }


    @Override
    public Object visitCpp_var_decleration(HplsqlParser.Cpp_var_declerationContext ctx) {
        String typeName = ctx.dtype().getText();
        String varName = ctx.ident().getText();
        if(symbolTable.lookuplocaly(varName)!=null){
            ErrorPrinter.printSymbolAlreadyDefinedError(myparser, ctx.ident().start, "variable", varName, "Function "+symbolTable.getCurrentScopeName());
        }

        symbolTable.put(varName,new Record(varName,typeName,"variable"));

        return null;
    }
    /* End Function */

}
