import ST.*;
import TypeArray.*;
import Error.*;
import antGen.HplsqlBaseVisitor;
import antGen.HplsqlParser;

import java.io.IOException;
import java.util.ArrayList;

public class myvisitor extends HplsqlBaseVisitor<Object> {
    SymbolTable symbolTable;
    FunctionRecord currentFunc;
    Select currentSelect;
    ForRecord currentFor;
    Table selectTable = new Table("","");

    boolean debug = true;

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
        symbolTable.setCurrentScopeNameAndType("Global", myvisitor.ScopeTypes.Global.toString());
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

            ArrayList<VarRecord> colom = (ArrayList<VarRecord>) visit(ctx.create_table_definition());
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
                    symbolTable.setCurrentScopeNameAndType(id_type, myvisitor.ScopeTypes.TABLE.toString());

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


            VarRecord col = new VarRecord(id, type,"","colom");
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

            ArrayList<SelectCol> sel_col = new ArrayList<>();
            for(int i =0 ; i<ctx.new_select_col().size();i++){
                SelectCol coloms = (SelectCol)visit(ctx.new_select_col(i));
                sel_col.add(coloms);
               // System.out.println(coloms.func_name);
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
        Object aslis =  visitChildren(ctx);

        SelectCol temp = new SelectCol(col_name,null, (String) aslis);
        return  temp;
        //return super.visitColom_name(ctx);
    }

    @Override
    public Object visitSelect_list_alias(HplsqlParser.Select_list_aliasContext ctx) {

        return ctx.ident().getText();
    }

    @Override
    public Object visitTabledotcol(HplsqlParser.TabledotcolContext ctx) {

        String table_name = ctx.ident().getText();
        String col_name = ctx.colom_name().ident().getText();
        Object aslis =  visitChildren(ctx.colom_name());
        SelectCol temp = new SelectCol(col_name,table_name, (String) aslis);
        return  temp;
        //return super.visitTabledotcol(ctx);
    }

    @Override
    public Object visitCol_func(HplsqlParser.Col_funcContext ctx) {

        SelectCol temp = (SelectCol) visit(ctx.expr_agg_window_func());
        Object aslis =  visitChildren(ctx);
        temp.aslis = (String)aslis;


        return temp;
    }

    @Override
    public Object visitExpr_agg_window_func(HplsqlParser.Expr_agg_window_funcContext ctx) {

        String func_name = ctx.getChild(0).getText();
        String paramiter = ctx.expr().get(0).getText();
        SelectCol temp = new SelectCol("",func_name, paramiter,"");
        return  temp;


        //return super.visitExpr_agg_window_func(ctx);
    }


    /* end select */



}
