package ST;

import antGen.*;

public class symboltableVisitor extends HplsqlBaseVisitor<Record> {

        SymbolTable symbol;

    public void setSymbolTable(SymbolTable symbolTable) {

        this.symbol = symbolTable;
    }
    @Override public Record visitCreate_database_stmt(HplsqlParser.Create_database_stmtContext ctx) {
        //System.out.println("fdfd");
        return visitChildren(ctx);

    }


    @Override public Record visitFunction_stmt(HplsqlParser.Function_stmtContext ctx)
    {

       symbol.enterScope();

        Record rec = super.visitFunction_stmt(ctx);
        //System.out.println("yyy");
           // System.out.println(rec);
        // exit scope
        symbol.exitScope();
        return rec;

    }

    @Override public Record visitSelect_stmt(HplsqlParser.Select_stmtContext ctx) {
        //System.out.println("selectsss");
        return visitChildren(ctx);

    }






}
