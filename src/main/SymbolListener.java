package main;

import ST.*;
import antGen.*;

public class SymbolListener extends HplsqlBaseListener {

    SymbolTable symbolTable;
    FunctionRecord currentFunc;
    Table currentTable;
    Select currentSelect;

    Table selectTable = new Table("", "");

    boolean debug = true;

    private enum ScopeTypes {
        Global("program"),
        Loop("Loop"),
        METHOD("method"),
        TABLE("table"),
        SELECT("select");

        private final String text;

        private ScopeTypes(final String text) {
            this.text = text;
        }

        @Override
        public String toString() {
            return text;
        }
    }

    public SymbolListener(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }

    @Override
    public void enterProgram(HplsqlParser.ProgramContext ctx) {

        symbolTable.setCurrentScopeNameAndType("Global", ScopeTypes.Global.toString());
    }

    @Override
    public void enterFunction_stmt(HplsqlParser.Function_stmtContext ctx) {

        // if(debug)System.out.println("Method declaration entered: " + ctx.getChild(1).getChild(0).toString());
        String type, id;
        type = ctx.dtype().getText(); // get type
        id = ctx.ident().getText(); // get ID

        currentFunc = new FunctionRecord(id, type);

        symbolTable.put(id, currentFunc);

        symbolTable.enterScope();
        // set scope name
        symbolTable.setCurrentScopeNameAndType(id, ScopeTypes.METHOD.toString());

        //   if(debug)System.out.println("\tEntered the SCOPE: " + symbolTable.getCurrentScopeName() + " || "+symbolTable.getCurrentScopeType()+" \n");

    }

    @Override
    public void exitFunction_stmt(HplsqlParser.Function_stmtContext ctx) {
        //  if(debug)System.out.println("Exit METHOD declaration: "+ ctx.getChild(1).getChild(0).toString());
        //if(debug)System.out.println("\tLeaving the scope: "+symbolTable.getCurrentScopeName()+ " || "+symbolTable.getCurrentScopeType());
        symbolTable.exitScope();
        //if(debug)System.out.println("\tNew scope: "+symbolTable.getCurrentScopeName()+ " || "+symbolTable.getCurrentScopeType()+" \n");


    }

    @Override
    public void enterReturn_param_item(HplsqlParser.Return_param_itemContext ctx) {
        //if(debug)System.out.println("Parameter declaration entered: " + ctx.getChild(1).getChild(0).toString());

        String type, id;
        type = ctx.dtype().getText(); // get type
        id = ctx.ident().getText(); // get ID

        Record parameter = new Record(id, type, "colom");

        currentFunc.addParameter(parameter);
        symbolTable.put(id, parameter);


    }

    @Override
    public void enterCpp_var_decleration(HplsqlParser.Cpp_var_declerationContext ctx) {

        String type, id;
        type = ctx.dtype().getText(); // get type
        id = ctx.ident().getText(); // get ID

        if (symbolTable.lookuplocaly(id) != null) {
            System.out.println("Duplicated identifier [" + id + "]");
            return;
        }


        // create record
        Record newField = new Record(id, type, "dd");

        symbolTable.put(id, newField);


    }


    @Override
    public void enterCpp_for_stmt(HplsqlParser.Cpp_for_stmtContext ctx) {
/*
        System.out.println("kkkkkkk");
        currentFor = new ForRecord("For","Loop Statment");
        String name_init = ctx.forhead1.ident().toString();
        String value_init = ctx.getChild(2).getChild(2).toString();

        String xp1=ctx.getChild(4).getChild(0).getChild(0).getChild(0).getChild(0).getChild(0).getChild(0).toString();
        String xp2=ctx.getChild(4).getChild(0).getChild(0).getChild(2).getChild(0).getChild(0).getChild(0).toString();
        String op=ctx.getChild(4).getChild(0).getChild(0).getChild(1).getChild(0).toString();
        String inc_dec=ctx.getChild(6).getChild(0).getChild(0).toString()
                + ctx.getChild(6).getChild(1).toString()
                + ctx.getChild(6).getChild(2).toString();


        if(symbolTable.lookup(name_init) == null) {

            System.out.println("No var ["+name_init+"]");
            return;
        }if(symbolTable.lookup(xp1) == null){
            System.out.println("No var ["+xp1+"]");
return;

        }if(symbolTable.lookup(xp2) == null){

            System.out.println("No var ["+xp2+"]");
            return;
        }


        symbolTable.put("For", currentFor);
       currentFor.addInit_cond_exper(name_init,value_init,xp1,xp2,op,inc_dec);


        symbolTable.enterScope();
        // set scope name
        symbolTable.setCurrentScopeNameAndType("For", ScopeTypes.Loop.toString());

*/
    }

    @Override
    public void exitCpp_for_stmt(HplsqlParser.Cpp_for_stmtContext ctx) {

        symbolTable.exitScope();
    }

    @Override
    public void enterCreate_table_stmt(HplsqlParser.Create_table_stmtContext ctx) {

        String id_type;


        id_type = ctx.table_name.ident().getText();

        currentTable = new Table(id_type, id_type);

        symbolTable.put(id_type, currentTable);

        symbolTable.enterScope();
        // set scope name
        symbolTable.setCurrentScopeNameAndType(id_type, ScopeTypes.TABLE.toString());


    }

    @Override
    public void exitCreate_table_stmt(HplsqlParser.Create_table_stmtContext ctx) {
        symbolTable.exitScope();


    }

    @Override
    public void enterCreate_table_columns_item(HplsqlParser.Create_table_columns_itemContext ctx) {

        String type, id;
        type = ctx.dtype().getText(); // get type
        id = ctx.column_name.ident().getText(); // get ID


        if (currentTable.containColumn(id)) {
            System.out.println("dublicates column " + id + " in table " + currentTable.getId().toString());
            return;
        }
        Record col = new Record(id, type, "col");
        currentTable.addColumn(col);
        symbolTable.put(id, col);
    }

    @Override
    public void enterSubselect_stmt(HplsqlParser.Subselect_stmtContext ctx) {
        System.out.println("hhhhhh");
        //   currentSelect = new Select("Select","Select Statment");

        // symbolTable.put("Select", currentSelect);

        symbolTable.enterScope();
        // set scope name
        symbolTable.setCurrentScopeNameAndType("Select", ScopeTypes.SELECT.toString());
        String tablename;
        tablename = ctx.from_clause.from_table_clause.from_table_name_clause().table_name().ident().getText();
    }

    @Override
    public void exitSubselect_stmt(HplsqlParser.Subselect_stmtContext ctx) {

        symbolTable.exitScope();
    }

   /* @Override public void enterFrom_clause(HplsqlParser.From_clauseContext ctx) {
        String tablename;
        tablename = ctx.from_table_clause.from_table_name_clause().table_name().ident().getText();
        //selectTable = (Table) symbolTable.lookup(tablename);

    }*/


    /*@Override public void enterSelect_list(HplsqlParser.Select_listContext ctx) {
        String col;
        col = ctx.c1.ident().getText(); // get col
        currentSelect.addColumn(col);

    }*/


}
