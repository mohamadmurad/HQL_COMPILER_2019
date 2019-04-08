package main;

import ST.*;
import TypeArray.*;
import Error.*;
import antGen.HplsqlBaseVisitor;
import antGen.HplsqlParser;

import javax.management.AttributeList;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class myvisitor extends HplsqlBaseVisitor<Object> {

    String numberREG = "^[-+]?\\d+(\\.\\d+)?$";

    int isReturn = 0, numbOfIfElseFor = 0;


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
        SELECT("select"),
        IF_STATMENT("if")
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
            ErrorPrinter.printSymbolAlreadyDefinedError(myparser, ctx.getStart(), "Table", id_type, symbolTable.getCurrentScopeName());



        }else{

            ArrayList<Record> colom = (ArrayList<Record>) visit(ctx.create_table_definition());
            ArrayList<name_type> nameType = new ArrayList<>();

            for(int i=0;i<colom.size();i++){

                if(types.find_typ(colom.get(i).getType())){
                    name_type colname = new name_type(colom.get(i).getId(),colom.get(i).getType());
                    nameType.add(colname);

                }else{

                    ErrorPrinter.printFullError(myparser, ctx.start,
                            "error: cannot find Type. \n symbol:   Type "+colom.get(i).getType(),
                            "symbol:   Type " + colom.get(i).getType(),
                            "location: Function " + symbolTable.getCurrentScopeName()
                    );

                   // System.out.println("Error Type :" + colom.get(i).getType() + " Not found!");


                }

            }


            String delimeter = (String) visit(ctx.create_table_definition().new_delimiter());
            delimeter = delimeter.substring(1, delimeter.length()-1);
            String location = (String) visit(ctx.create_table_definition().new_location());
            location = location.substring(1, location.length()-1);
            String store = (String) visit(ctx.create_table_definition().new_store());
            store = store.substring(1, store.length()-1);


            ///System.out.println(delimeter + "  " + location + " " + store);

                try{
                    types.set(id_type,nameType,location,delimeter,store);

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

        return null;
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

    @Override
    public Object visitNew_delimiter(HplsqlParser.New_delimiterContext ctx) {
        return ctx.expr().getText();
    }

    @Override
    public Object visitNew_location(HplsqlParser.New_locationContext ctx) {
        return ctx.expr().getText();
    }

    @Override
    public Object visitNew_store(HplsqlParser.New_storeContext ctx) {
        return ctx.ident().getText();
    }


    /* end create table */

    /* start select  */

    @Override
    public Object visitNew_select_stmt(HplsqlParser.New_select_stmtContext ctx) {
        String table_name = ctx.new_from_table().from_table_name_clause().table_name().ident().getText();
        Select currentSelect = null;

        if(types.find_typ(table_name)){

            ArrayList<SelectCol> sel_col = new ArrayList<>();
            for(int i =0 ; i<ctx.new_select_col().size();i++){


                SelectCol coloms = (SelectCol)visit(ctx.new_select_col(i));

                if(!coloms.colname.equals("*")){
                    if(types.find_col_in_table(coloms.colname,table_name)){

                        sel_col.add(coloms);
                    }else {
                        ErrorPrinter.printFullError(myparser, ctx.start,
                                "error: Column :" + coloms.colname + " Not found! In Table " + table_name,
                                "symbol:   Type " + table_name,
                                "location: Function " + symbolTable.getCurrentScopeName()
                        );


                    }
                }else{
                    sel_col.add(coloms);
                }


            }



                currentSelect = new Select("SELECT","SELECT STATMENT",table_name);
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
                    //System.out.println("ccc "  + sel_col.get(i).aslis);

                    String as = sel_col.get(i).aslis;

                    if(sel_col.get(i).aslis!=null){
                       // System.out.println("eeeeeeee");
                        Record newColName = new Record(sel_col.get(i).aslis,sel_col.get(i).colname+ " In [ "+ table_name +" ]","ColOtherName");
                        symbolTable.put(sel_col.get(i).aslis,newColName);
                    }

                }

                if(ctx.group_by_clause()!=null){
                    int count =0;
                    ArrayList<String> colom = (ArrayList<String>) visit(ctx.group_by_clause());
                    for(int i=0;i<colom.size();i++){
                        for(int j=0;j<currentSelect.columns.size();j++){
                            if(colom.get(i).equals(currentSelect.columns.get(j).colname)){
                                count++;
                            }
                        }
                    }
                    if(count!=colom.size()){

                        ErrorPrinter.printFullError(myparser, ctx.start,
                                "error: In Group By Statment ",
                                "symbol:   Type Table",
                                "location: Function " + symbolTable.getCurrentScopeName()
                        );
                    }
                }

                if(ctx.group_by_clause()!=null && ctx.having_clause() != null ){

                    ArrayList<SelectCol> c = (ArrayList<SelectCol>) visit(ctx.having_clause());

                    for(int i=0;i<c.size();i++){


                        if(!c.get(i).colname.equals("*")){
                            if(!types.find_col_in_table(c.get(i).colname,table_name)){

                                ErrorPrinter.printFullError(myparser, ctx.start,
                                        "error: Column :" + c.get(i).colname + " Not found! In Table " + table_name,
                                        "symbol:   Type " + table_name,
                                        "location: Select "
                                );
                            }
                        }
                    }
                }




                symbolTable.exitScope();


        }else{
            //System.out.println("Error Table :" + table_name + " Not found!");
            ErrorPrinter.printFullError(myparser, ctx.start,
                    "error: Table :" + table_name + " Not found! ",
                    "symbol:   Type Table",
                    "location: Function " + symbolTable.getCurrentScopeName()
            );
        }

        return ctx;
    }

    @Override
    public Object visitNew_select_col(HplsqlParser.New_select_colContext ctx) {
        Object x = visitChildren(ctx);
        //SelectCol b = (SelectCol)x;
        ///System.out.println(b.aslis);
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

    @Override
    public Object visitGroup_by_clause(HplsqlParser.Group_by_clauseContext ctx) {

        ArrayList<Object> colom = new ArrayList<>();
        if(ctx.expr_agg_window_func().size() != 0){
            for(int i =0 ;i<ctx.expr_agg_window_func().size();i++){
                ErrorPrinter.printFullError(myparser, ctx.start,
                        "error: function :" + ctx.expr_agg_window_func().get(i).getText() + " should not contian in Group by ",
                        "",
                        "location: select"
                );
            }
        }
        for(int i=0;i<ctx.ident().size();i++){
            String col = ctx.ident(i).getText();
            colom.add(col);

        }
        return colom;

    }

    @Override
    public Object visitHaving_clause(HplsqlParser.Having_clauseContext ctx) {
        ArrayList<Object> c = new ArrayList<>();

        for(int i=0;i<ctx.having_conditions().size();i++){

            if(ctx.having_conditions(i).ident() != null){

                ErrorPrinter.printFullError(myparser, ctx.start,
                        "error: Having clause contains only grouping functions ",
                        "",
                        "location: select"
                );
            }else if(ctx.having_conditions(i).expr_agg_window_func()!= null){

                // condidtion
                String func_name = ctx.getChild(0).getText();

                String paramiter = ctx.having_conditions(i).expr_agg_window_func().expr().get(0).getText();
                c.add(new SelectCol("",func_name, paramiter,null));

            }
        }

        return c;
    }


    /* end select */

    /* Start Function */
    @Override
    public Object visitFunction_stmt(HplsqlParser.Function_stmtContext ctx) {
        isReturn = 0;
        numbOfIfElseFor = 0;
        String type = ctx.dtype().getText(); // get type
        String funcName = ctx.ident().getText(); // get ID

        if(!types.find_typ(type))
        {
            ErrorPrinter.printFullError(myparser, ctx.start,
                    "error: cannot find Type. \n symbol:   Type "+type,
                    "symbol:   Type " + type,
                    "location: Function " + symbolTable.getCurrentScopeName());
        }

        if(symbolTable.lookuplocaly(funcName)!=null){
            ErrorPrinter.printSymbolAlreadyDefinedError(myparser, ctx.ident().start, "method", funcName, symbolTable.getCurrentScopeName());
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
             // System.out.println(paramiters.get(i).getId());
                currentFunc.addParameter(paramiters.get(i));
                symbolTable.put(paramiters.get(i).getId(), paramiters.get(i));
            }

        }


        visit(ctx.cpp_smt());
        if(ctx.return_stmt()!=null){
            visit(ctx.return_stmt());
        }
       /* if (ctx.cpp_smt().return_stmt() != null){
            String returnValue = null;
            boolean isInt = false;
            boolean isFloat = false;
            boolean isString = false;
            boolean isVar = false;
            if(ctx.cpp_smt().return_stmt().ident()!=null){
                returnValue = ctx.cpp_smt().return_stmt().ident().getText();
                if( !((returnValue.startsWith("\"") && returnValue.endsWith("\""))
                        || (returnValue.startsWith("'") && returnValue.endsWith("'"))) ){
                    if(symbolTable.lookup(returnValue)==null){
                        ErrorPrinter.printFullError(myparser, ctx.start,
                                "error: Variable :" + returnValue + " Not found! In Scope ",
                                "",
                                "" + symbolTable.getCurrentScope().getParent().getScopeName()
                        );
                    }else{
                        Record ReturnVariable = symbolTable.lookup(returnValue);
                        String ReturnVariableType = ReturnVariable.getType();
                        if(ReturnVariable.getValue()==null){
                            System.err.println("Warring for using unassigned variable " + ReturnVariable.getId());
                        }
                        isVar = true;

                    }

                }else { isString = true;}
            }else if(ctx.cpp_smt().return_stmt().L_INT()!=null){
                returnValue = ctx.cpp_smt().return_stmt().L_INT().getText();
                isInt = true;
            }else if(ctx.cpp_smt().return_stmt().L_DEC()!=null){
                returnValue = ctx.cpp_smt().return_stmt().L_DEC().getText();
                isFloat = true;
            }


                if (type.equals("void")) {

                    ErrorPrinter.printFullError(myparser, ctx.start,
                            "error: Cannot return a value from a method with void result type",
                            "symbol:   Type " + type,
                            "location: Function " + symbolTable.getCurrentScopeName());

            }else if(type.equals("int")){
                    if(isString){

                        ErrorPrinter.printFullError(myparser, ctx.start,
                                "error: " + returnValue+  " Type must be ( int ) Not ( string )" ,
                                "" ,
                                "location: in Scope " + symbolTable.getCurrentScopeName()
                        );
                    }else if(isVar){
                        Record Var = symbolTable.lookup(returnValue);
                        String typeVar = Var.getType();
                        if(!typeVar.equals("int")){
                            ErrorPrinter.printFullError(myparser, ctx.start,
                                    "error: Variable " + returnValue+  " Type must be ( int ) Not (" +  typeVar +" )" ,
                                    "" ,
                                    "location: in Scope " + symbolTable.getCurrentScopeName()
                            );
                        }
                    }else if(isFloat){
                        ErrorPrinter.printFullError(myparser, ctx.start,
                                "error: " + returnValue+  " Type must be ( int ) Not ( float )" ,
                                "" ,
                                "location: in Scope " + symbolTable.getCurrentScopeName()
                        );
                    }


            }else if(type.equals("string")){
                    if(isInt){

                        ErrorPrinter.printFullError(myparser, ctx.start,
                                "error: " + returnValue+  " Type must be ( string ) Not ( int )" ,
                                "" ,
                                "location: in Scope " + symbolTable.getCurrentScopeName()
                        );
                    }else if(isVar){
                        Record Var = symbolTable.lookup(returnValue);
                        String typeVar = Var.getType();
                        if(!typeVar.equals("string")){
                            ErrorPrinter.printFullError(myparser, ctx.start,
                                    "error: Variable " + returnValue+  " Type must be ( string ) Not (" +  typeVar +" )" ,
                                    "" ,
                                    "location: in Scope " + symbolTable.getCurrentScopeName()
                            );
                        }
                    }else if(isFloat){
                        ErrorPrinter.printFullError(myparser, ctx.start,
                                "error: " + returnValue+  " Type must be ( string ) Not ( float )" ,
                                "" ,
                                "location: in Scope " + symbolTable.getCurrentScopeName()
                        );
                    }

            }else if(type.equals("float")){

                    if(isInt){

                        ErrorPrinter.printFullError(myparser, ctx.start,
                                "error: " + returnValue+  " Type must be ( float ) Not ( int )" ,
                                "" ,
                                "location: in Scope " + symbolTable.getCurrentScopeName()
                        );
                    }else if(isVar){
                        Record Var = symbolTable.lookup(returnValue);
                        String typeVar = Var.getType();
                        if(!typeVar.equals("float")){
                            ErrorPrinter.printFullError(myparser, ctx.start,
                                    "error: Variable " + returnValue+  " Type must be ( float ) Not (" +  typeVar +" )" ,
                                    "" ,
                                    "location: in Scope " + symbolTable.getCurrentScopeName()
                            );
                        }
                    }else if(isString){
                        ErrorPrinter.printFullError(myparser, ctx.start,
                                "error: " + returnValue+  " Type must be ( float ) Not ( string )" ,
                                "" ,
                                "location: in Scope " + symbolTable.getCurrentScopeName()
                        );
                    }

            }

        }else */
       if (ctx.return_stmt() == null){
            if(isReturn == numbOfIfElseFor){

            }else {
                if(!type.equals("void")){
                    ErrorPrinter.printFullError(myparser, ctx.start,
                            "error: Missing return statement",
                            "symbol:   Type " + type,
                            "location: Function " + symbolTable.getCurrentScopeName());
                }

            }
        }






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
    public Object visitCall_stmt(HplsqlParser.Call_stmtContext ctx) {

        String funName = ctx.ident().getText();

        if(symbolTable.lookup(funName)==null){
            ErrorPrinter.printFullError(myparser, ctx.start,
                    "error: Method :" + funName + " Not found! In Scope ",
                    "",
                    "" + symbolTable.getCurrentScopeName()
            );
        }
        FunctionRecord func = (FunctionRecord) symbolTable.lookup(funName);


        if(ctx.call_param() != null){
            if(func.numberOfParameters() != ctx.call_param().call_param_item().size()){
                ErrorPrinter.printFullError(myparser, ctx.start,
                        "error: Number of Parmeters ",
                        "" ,
                        "location: in Call Function " + funName
                );
            }else{

                for(int i=0;i<ctx.call_param().call_param_item().size();i++){
                    String p =null;
                    String typeParam = "";
                    if(ctx.call_param().call_param_item().get(i).ident() != null){

                        p = ctx.call_param().call_param_item().get(i).ident().getText();
                        if( (p.startsWith("\"") && p.endsWith("\"")) || (p.startsWith("'") && p.endsWith("'")) ){
                            typeParam = "string";
                        }else{
                            typeParam = "var";
                        }


                    }else if(ctx.call_param().call_param_item().get(i).number() != null){

                        p = ctx.call_param().call_param_item().get(i).number().getText();

                        if(p.matches(numberREG)){
                            typeParam = "numb";
                        }

                    }else{
                        ErrorPrinter.printFullError(myparser, ctx.start,
                                "error:",
                                "" ,
                                "location: in Call Function " + funName
                        );
                    }

                    switch (typeParam){
                        case "numb":{

                            //System.out.println("number");
                            if(func.getParamType(i).equals("int")){

                                //System.out.println("yes");

                            }else{
                                ErrorPrinter.printFullError(myparser, ctx.start,
                                        "error: Parameter "+ (i+1) +" Type must be ("+func.getParamType(i) + ") Not (int)" ,
                                        "" ,
                                        "location: in Call Function " + funName
                                );
                            }

                        }break;
                        case "var":{
                           // System.out.println("var");
                            if(symbolTable.lookup(p) != null){ // var

                                Record pp = symbolTable.lookup(p);
                                System.out.println(pp.getType());
                                if(func.getParamType(i).equals(pp.getType())){

                                   // System.out.println("yes");

                                }else{
                                    ErrorPrinter.printFullError(myparser, ctx.start,
                                            "error: Parameter "+ (i+1) +" Type must be ("+func.getParamType(i) + ") Not ("+ pp.getType() + ")" ,
                                            "" ,
                                            "location: in Call Function " + funName
                                    );
                                }

                            }else{

                                ErrorPrinter.printFullError(myparser, ctx.start,
                                        "error: Variable :" + p + " Not found! In Scope ",
                                        "",
                                        "" + symbolTable.getCurrentScopeName()
                                );

                            }


                        }break;
                        case "string":{
                            System.out.println("string");
                            if(func.getParamType(i).equals("string")){

                                //System.out.println("yes");

                            }else{
                                ErrorPrinter.printFullError(myparser, ctx.start,
                                        "error: Parameter "+ (i+1) +" Type must be ("+func.getParamType(i) + ") Not (string)" ,
                                        "" ,
                                        "location: in Call Function " + funName
                                );
                            }

                        }break;
                        default: break;
                    }


                }

            }

        }



        return null;
    }

    @Override
    public Object visitCpp_var_decleration(HplsqlParser.Cpp_var_declerationContext ctx) {
        String typeName = ctx.dtype().getText();
        String varName = ctx.ident().getText();
        if(!types.find_typ(typeName))
        {
            ErrorPrinter.printFullError(myparser, ctx.start,
                    "error: cannot find Type. \n symbol:   Type "+typeName,
                    "symbol:   Type " + typeName,
                    "location: Function " + symbolTable.getCurrentScopeName());
        }
        if(symbolTable.lookuplocaly(varName)!=null){
            ErrorPrinter.printSymbolAlreadyDefinedError(myparser, ctx.ident().start, "variable", varName, ""+symbolTable.getCurrentScopeName());
        }


        symbolTable.put(varName,new Record(varName,typeName,"variable",null));

        return null;
    }


    //@Override
    public Object visitCpp_assignment_stmt(HplsqlParser.Cpp_assignment_stmtContext ctx) {


        String varName =  ctx.ident().get(0).getText();
        //System.out.println(ctx.L_INT().getText());
        if(symbolTable.lookup(varName)!=null){
            Record var = symbolTable.lookup(varName);
            String varType = var.getType();
            String varEqual = null;
            boolean isString = false;

            String typeParam = "";
            if(ctx.ident(1) != null){

                varEqual = ctx.ident(1).getText();
                if( (varEqual.startsWith("\"") && varEqual.endsWith("\"")) || (varEqual.startsWith("'") && varEqual.endsWith("'")) ){
                    typeParam = "string";
                }else{
                    typeParam = "var";
                }


            }else if(ctx.number() != null){

                varEqual = ctx.number().getText();

                if(varEqual.matches(numberREG)){
                    if(ctx.number().L_INT() != null){
                        typeParam = "int";
                    }else{
                        typeParam = "float";
                    }

                }

            }else if(ctx.call_stmt() != null ){

                typeParam = "call";
            }else if(ctx.new_select_stmt() != null){
                typeParam = "select";
            }else {
                ErrorPrinter.printFullError(myparser, ctx.start,
                        "error:",
                        "" ,
                        "location: in ass"
                );
            }

            switch (typeParam){
                case "int":{

                    if(varType.equals("int")){

                            var.setValue(varEqual);

                    }else if(varType.equals("string")){
                            // up cast
                            var.setValue("\"" + varEqual + "\"");


                    }else if(varType.equals("float")){
                        var.setValue(varEqual + ".0");
                        System.out.println(var.getValue());
                    }else if(varType.equals("bool")){
                        ErrorPrinter.printFullError(myparser, ctx.start,
                                "error: Variable " + varName+  " must be ( integer ) Not ( boolean )" ,
                                "" ,
                                "location: in Scope " + symbolTable.getCurrentScopeName()
                        );
                    }



                }break;
                case "float":{

                    if(varType.equals("int")){

                        int i = varEqual.indexOf('.');
                        varEqual = varEqual.substring(0,i);

                        var.setValue(varEqual);

                        System.out.println(var.getValue());


                    }else if(varType.equals("string")){
                        // up cast
                        var.setValue("\"" + varEqual + "\"");


                    }else if(varType.equals("float")){

                        var.setValue(varEqual);

                    }else if(varType.equals("bool")){

                        ErrorPrinter.printFullError(myparser, ctx.start,
                                "error: Variable " + varName+  " must be ( float ) Not ( boolean )" ,
                                "" ,
                                "location: in Scope " + symbolTable.getCurrentScopeName()
                        );
                    }




                }break;
                case "var":{
                    // System.out.println("var");
                    if(symbolTable.lookup(varEqual) != null){
                        // varible
                        Record ASVar = symbolTable.lookup(varEqual);

                        if(ASVar.getValue() != null){
                            if(ASVar.getType().equals(var.getType())){
                                var.setValue(ASVar.getValue());
                            }else{
                                ErrorPrinter.printFullError(myparser, ctx.start,
                                        "error: Variable " + varName+  " Type must be ("+ASVar.getType() + ") Not ("+ var.getType() + ")" ,
                                        "" ,
                                        "location: in Scope " + symbolTable.getCurrentScopeName()
                                );
                            }

                            //           System.out.println("varrrrr " + var.getValue());
                        }else{
                            System.err.println("Warring for using unassigned variable " + varEqual);
                        }

                    }


                }break;
                case "string":{
/*

                    if(varType.equals("int")){



                        int i = varEqual.indexOf('.');
                        i = Integer.valueOf(varEqual);

                        var.setValue(Integer.valueOf(varEqual));

                        System.out.println(var.getValue());


                    }else if(varType.equals("string")){
                        // up cast
                        var.setValue(varEqual);


                    }else if(varType.equals("float")){

                        var.setValue(varEqual);

                    }else if(varType.equals("boolean")){

                        ErrorPrinter.printFullError(myparser, ctx.start,
                                "error: Variable " + varName+  " must be ( float ) Not ( boolean )" ,
                                "" ,
                                "location: in Scope " + symbolTable.getCurrentScopeName()
                        );
                    }
*/

                }break;
                case "select":{}break;
                case "call" :{}break;
                default: break;
            }


           /* else{


                //regular for number or string



                if(varType.equals("int")){

                    if(!isString){
                        var.setValue(varEqual);
                    }else{
                        // up cast

                    }

                }else if(varType.equals("string")){
                    if(isString){
                        var.setValue(varEqual);
                    }else{
                        // up cast
                        var.setValue("\"" + varEqual + "\"");

                    }


                }


            }*/

           // System.out.println(varName + " = " + var.getValue());

        }else {
            ErrorPrinter.printFullError(myparser, ctx.start,
                    "error: Variable :" + varName + " Not found! In Scope ",
                    "",
                    "" + symbolTable.getCurrentScopeName()
            );
        }

        return null;
    }

    @Override
    public Object visitNumber(HplsqlParser.NumberContext ctx) {
        return ctx.L_INT().getText();
    }

    /* End Function */

    /* Start If */

    @Override
    public Object visitCpp_if_stmt(HplsqlParser.Cpp_if_stmtContext ctx) {
        numbOfIfElseFor++ ;
        symbolTable.enterScope();
        // set scope name
        symbolTable.setCurrentScopeNameAndType("IF STATMENT", ScopeTypes.IF_STATMENT.toString());
        for(int i=0;i<ctx.ifex().size();i++){

                String op = ctx.ifex(i).op().getText();
                String exp1 = ctx.ifex(i).ident(0).getText();
                String exp2 = null;
                boolean isExp = false;
                if(ctx.ifex(i).L_INT()!=null){
                    exp2 = ctx.ifex(i).L_INT().getText();
                }else if(ctx.ifex(i).ident(1)!=null){

                    exp2 = ctx.ifex(i).ident(1).getText();
                    isExp = true;
                }
                if(!isExp &&( (exp1.startsWith("\"") && exp1.endsWith("\"")) || (exp1.startsWith("'") && exp1.endsWith("'")) )){
                    ErrorPrinter.printFullError(myparser, ctx.start,
                            "error: Operator "+op+" Cannot Be Applied To Int , String",
                            "",
                            "" + symbolTable.getCurrentScope().getParent().getScopeName()
                    );

                }
                if( ((exp1.startsWith("\"") && exp1.endsWith("\"")) || (exp1.startsWith("'") && exp1.endsWith("'")))
                        && (!op.equals("=="))) {

                    ErrorPrinter.printFullError(myparser, ctx.start,
                            "error: Operator "+op+" Cannot Be Applied To Int , String",
                            "",
                            "" + symbolTable.getCurrentScope().getParent().getScopeName()
                    );

                }

                if(!((exp1.startsWith("\"") && exp1.endsWith("\"")) || (exp1.startsWith("'") && exp1.endsWith("'")))) {

                    if(symbolTable.lookup(exp1)==null){
                        ErrorPrinter.printFullError(myparser, ctx.start,
                                "error: Variable :" + exp1 + " Not found! In Scope ",
                                "",
                                "" + symbolTable.getCurrentScope().getParent().getScopeName()
                        );
                    }
                }

            Record exper1 = symbolTable.lookup(exp1);
            if(exper1 != null && exper1.getValue()==null){
                System.err.println("Warring for using unassigned variable " + exper1.getId());
            }

                if(isExp){
                    if( ((exp2.startsWith("\"") && exp2.endsWith("\"")) || (exp2.startsWith("'") && exp2.endsWith("'")))
                            && (!op.equals("=="))) {

                        ErrorPrinter.printFullError(myparser, ctx.start,
                                "error: Operator "+op+" Cannot Be Applied To Int , String",
                                "",
                                "" + symbolTable.getCurrentScope().getParent().getScopeName()
                        );

                    }
                    if(!((exp2.startsWith("\"") && exp2.endsWith("\"")) || (exp2.startsWith("'") && exp2.endsWith("'")))) {
                        if(symbolTable.lookup(exp2)==null){
                            ErrorPrinter.printFullError(myparser, ctx.start,
                                    "error: Variable :" + exp2 + " Not found! In Scope ",
                                    "",
                                    "" + symbolTable.getCurrentScope().getParent().getScopeName()
                            );
                        }
                    }

                        Record exper2 = symbolTable.lookup(exp2);
                        if(exper2 != null && exper2.getValue()==null){
                            System.err.println("Warring for using unassigned variable " + exper2.getId());
                        }
                        if(exper1 != null && exper2 != null) {
                            if (!exper1.getType().equals(exper2.getType())) {
                                ErrorPrinter.printFullError(myparser, ctx.start,
                                        "error: Operator " + op + " Cannot Be Applied To " + exper1.getType() + "," + exper2.getType(),
                                        "",
                                        "location: in Scope " + symbolTable.getCurrentScopeName()
                                );
                            }
                        }



                }


        }

        visit(ctx.cpp_smt());

        for(int i=0;i<ctx.def_else_if().size();i++){
            visit(ctx.def_else_if(i).cpp_if_stmt());

        }
        if(ctx.def_else()!=null){
            visit(ctx.def_else());
        }
       if(ctx.return_stmt()!=null){
            visit(ctx.return_stmt());
            isReturn++;
        }
        symbolTable.exitScope();


        return null;
    }

    @Override
    public Object visitDef_else(HplsqlParser.Def_elseContext ctx) {
        numbOfIfElseFor++ ;
        visit(ctx.cpp_smt());
        if(ctx.return_stmt()!=null){
            visit(ctx.return_stmt());
            isReturn++;
        }
        return null;
    }

    @Override
    public Object visitReturn_stmt(HplsqlParser.Return_stmtContext ctx) {
        Scope parentScope = symbolTable.getCurrentScope();
        while(!parentScope.getScopeType().equals("method")){

            if(parentScope.getParent() != null){
                parentScope = parentScope.getParent();
            }else
                break;

        }

        if(parentScope.getScopeType().equals("method")){

            String methodName = parentScope.getScopeName();
            Record methodRecord = symbolTable.lookup(methodName);
            String type = methodRecord.getType();

            String returnValue = null;
            boolean isInt = false;
            boolean isFloat = false;
            boolean isString = false;
            boolean isVar = false;
            if(ctx.ident()!=null){
                returnValue = ctx.ident().getText();
                if( !((returnValue.startsWith("\"") && returnValue.endsWith("\""))
                        || (returnValue.startsWith("'") && returnValue.endsWith("'"))) ){
                    if(symbolTable.lookup(returnValue)==null){
                        ErrorPrinter.printFullError(myparser, ctx.start,
                                "error: Variable :" + returnValue + " Not found! In Scope ",
                                "",
                                "" + symbolTable.getCurrentScope().getParent().getScopeName()
                        );
                    }else{
                        Record ReturnVariable = symbolTable.lookup(returnValue);
                        String ReturnVariableType = ReturnVariable.getType();
                        if(ReturnVariable.getValue()==null){
                            System.err.println("Warring for using unassigned variable " + ReturnVariable.getId());
                        }
                        isVar = true;

                    }

                }else { isString = true;}
            }else if(ctx.L_INT()!=null){
                returnValue = ctx.L_INT().getText();
                isInt = true;
            }else if(ctx.L_DEC()!=null){
                returnValue = ctx.L_DEC().getText();
                isFloat = true;
            }


            if (type.equals("void")) {

                ErrorPrinter.printFullError(myparser, ctx.start,
                        "error: Cannot return a value from a method with void result type",
                        "symbol:   Type " + type,
                        "location: Function " + symbolTable.getCurrentScopeName());

            }else if(type.equals("int")){
                if(isString){

                    ErrorPrinter.printFullError(myparser, ctx.start,
                            "error: " + returnValue+  " Type must be ( int ) Not ( string )" ,
                            "" ,
                            "location: in Scope " + symbolTable.getCurrentScopeName()
                    );
                }else if(isVar){
                    Record Var = symbolTable.lookup(returnValue);
                    String typeVar = Var.getType();
                    if(!typeVar.equals("int")){
                        ErrorPrinter.printFullError(myparser, ctx.start,
                                "error: Variable " + returnValue+  " Type must be ( int ) Not (" +  typeVar +" )" ,
                                "" ,
                                "location: in Scope " + symbolTable.getCurrentScopeName()
                        );
                    }
                }else if(isFloat){
                    ErrorPrinter.printFullError(myparser, ctx.start,
                            "error: " + returnValue+  " Type must be ( int ) Not ( float )" ,
                            "" ,
                            "location: in Scope " + symbolTable.getCurrentScopeName()
                    );
                }


            }else if(type.equals("string")){
                if(isInt){

                    ErrorPrinter.printFullError(myparser, ctx.start,
                            "error: " + returnValue+  " Type must be ( string ) Not ( int )" ,
                            "" ,
                            "location: in Scope " + symbolTable.getCurrentScopeName()
                    );
                }else if(isVar){
                    Record Var = symbolTable.lookup(returnValue);
                    String typeVar = Var.getType();
                    if(!typeVar.equals("string")){
                        ErrorPrinter.printFullError(myparser, ctx.start,
                                "error: Variable " + returnValue+  " Type must be ( string ) Not (" +  typeVar +" )" ,
                                "" ,
                                "location: in Scope " + symbolTable.getCurrentScopeName()
                        );
                    }
                }else if(isFloat){
                    ErrorPrinter.printFullError(myparser, ctx.start,
                            "error: " + returnValue+  " Type must be ( string ) Not ( float )" ,
                            "" ,
                            "location: in Scope " + symbolTable.getCurrentScopeName()
                    );
                }

            }else if(type.equals("float")){

                if(isInt){

                    ErrorPrinter.printFullError(myparser, ctx.start,
                            "error: " + returnValue+  " Type must be ( float ) Not ( int )" ,
                            "" ,
                            "location: in Scope " + symbolTable.getCurrentScopeName()
                    );
                }else if(isVar){
                    Record Var = symbolTable.lookup(returnValue);
                    String typeVar = Var.getType();
                    if(!typeVar.equals("float")){
                        ErrorPrinter.printFullError(myparser, ctx.start,
                                "error: Variable " + returnValue+  " Type must be ( float ) Not (" +  typeVar +" )" ,
                                "" ,
                                "location: in Scope " + symbolTable.getCurrentScopeName()
                        );
                    }
                }else if(isString){
                    ErrorPrinter.printFullError(myparser, ctx.start,
                            "error: " + returnValue+  " Type must be ( float ) Not ( string )" ,
                            "" ,
                            "location: in Scope " + symbolTable.getCurrentScopeName()
                    );
                }

            }



        }
        return null;
    }

    /* End If */

    /* Start For */

    @Override
    public Object visitCpp_for_stmt(HplsqlParser.Cpp_for_stmtContext ctx) {
        numbOfIfElseFor++ ;
        symbolTable.enterScope();
        // set scope name
        symbolTable.setCurrentScopeNameAndType("FOR LOOP", ScopeTypes.Loop.toString());
        visit(ctx.forhead1());
        visit(ctx.forcond());
        visit(ctx.for_inc_dec());
        visit(ctx.cpp_smt());
        if(ctx.return_stmt()!=null){
            visit(ctx.return_stmt());
            isReturn++;
        }
        symbolTable.exitScope();
        return null;
    }

    @Override
    public Object visitForhead1(HplsqlParser.Forhead1Context ctx) {

        String varname = ctx.ident(0).getText();
        String varEqual = null;
        boolean isString = false;
        if(ctx.ident(1) != null){
            //String
            varEqual = ctx.ident().get(1).getText();
            isString = true;
        }else if(ctx.L_INT() != null ){
            //Number
            varEqual = (String) ctx.L_INT().getText();
        }

        if(ctx.dtype()==null){
            if(symbolTable.lookup(varname)==null){
                ErrorPrinter.printFullError(myparser, ctx.start,
                        "error: Variable :" + varname + " Not found! In Scope ",
                        "",
                        "" + symbolTable.getCurrentScopeName()
                );

            }

        }else{
            String type = ctx.dtype().getText();

            if(!types.find_typ(type))
            {
                ErrorPrinter.printFullError(myparser, ctx.start,
                        "error: cannot find Type. \n symbol:   Type "+type,
                        "symbol:   Type " + type,
                        "location: Function " + symbolTable.getCurrentScopeName());
            }
            if(symbolTable.getCurrentScope().getParent().lookuplocaly(varname)!=null){
                ErrorPrinter.printSymbolAlreadyDefinedError(myparser, ctx.ident(0).start, "variable", varname, ""+symbolTable.getCurrentScope().getParent().getScopeName());
            }

            symbolTable.put(varname,new Record(varname,type,"variable",null));


        }
        Record var = symbolTable.lookup(varname);

        if(isString && !((varEqual.startsWith("\"") && varEqual.endsWith("\""))
                || (varEqual.startsWith("'") && varEqual.endsWith("'")))){
//var
            if(symbolTable.lookup(varEqual) != null){
                // varible
                Record ASVar = symbolTable.lookup(varEqual);

                if(ASVar.getValue() != null){
                    if(ASVar.getType().equals(var.getType())){
                        var.setValue(ASVar.getValue());
                    }else{
                        ErrorPrinter.printFullError(myparser, ctx.start,
                                "error: Variable " + varname+  " Type must be ("+ASVar.getType() + ") Not ("+ var.getType() + ")" ,
                                "" ,
                                "location: in Scope " + symbolTable.getCurrentScopeName()
                        );
                    }

                    //           System.out.println("varrrrr " + var.getValue());
                }else{
                    System.err.println("Warring for using unassigned variable " + varEqual);
                }

            }else{


                //regular for number or string

                String varType = var.getType();


                if(varType.equals("int")){

                    if(!isString){
                        var.setValue(varEqual);

                    }else{
                        // up cast
                    }

                }else if(varType.equals("string")){
                    if(isString){
                        var.setValue(varEqual);
                    }else{
                        // up cast
                        //var.setValue("\"" + varEqual + "\"");

                    }


                }


            }


        }else if(isString && ((varEqual.startsWith("\"") && varEqual.endsWith("\""))
                || (varEqual.startsWith("'") && varEqual.endsWith("'")))){
            if(var.getType().equals("string")){
                var.setValue(varEqual);
            }else {

                ErrorPrinter.printFullError(myparser, ctx.start,
                        "error: Variable " + varname+  " Type must be (String) Not ("+ var.getType() + ")" ,
                        "" ,
                        "location: in Scope " + symbolTable.getCurrentScopeName()
                );

            }
        }else if(!isString){
            // number
            if(var.getType().equals("int")){
                var.setValue(varEqual);
            }else {

                ErrorPrinter.printFullError(myparser, ctx.start,
                        "error: Variable " + varname+  " Type must be (Int) Not ("+ var.getType() + ")" ,
                        "" ,
                        "location: in Scope " + symbolTable.getCurrentScopeName()
                );

            }

        }



       System.out.println(var.getValue() + " = " + var.getValue());
        return null;
    }

    @Override
    public Object visitForcond(HplsqlParser.ForcondContext ctx) {

        String op = ctx.op().getText();
        String exp1 = ctx.ident(0).getText();
        String exp2 = null;
        boolean isExp = false;
        if(ctx.L_INT()!=null){
            exp2 = ctx.L_INT().getText();
        }else if(ctx.ident(1)!=null){

            exp2 = ctx.ident(1).getText();
            isExp = true;
        }
        if(!isExp &&( (exp1.startsWith("\"") && exp1.endsWith("\"")) || (exp1.startsWith("'") && exp1.endsWith("'")) )){
            ErrorPrinter.printFullError(myparser, ctx.start,
                    "error: Operator "+op+" Cannot Be Applied To Int , String",
                    "",
                    "" + symbolTable.getCurrentScope().getParent().getScopeName()
            );

        }
        if( ((exp1.startsWith("\"") && exp1.endsWith("\"")) || (exp1.startsWith("'") && exp1.endsWith("'")))
                && (!op.equals("=="))) {

            ErrorPrinter.printFullError(myparser, ctx.start,
                    "error: Operator "+op+" Cannot Be Applied To Int , String",
                    "",
                    "" + symbolTable.getCurrentScope().getParent().getScopeName()
            );

        }

        if(!((exp1.startsWith("\"") && exp1.endsWith("\"")) || (exp1.startsWith("'") && exp1.endsWith("'")))) {

            if(symbolTable.lookup(exp1)==null){
                ErrorPrinter.printFullError(myparser, ctx.start,
                        "error: Variable :" + exp1 + " Not found! In Scope ",
                        "",
                        "" + symbolTable.getCurrentScope().getParent().getScopeName()
                );
            }
        }

        Record exper1 = symbolTable.lookup(exp1);
        if(exper1 != null && exper1.getValue()==null){
            System.err.println("Warring for using unassigned variable " + exper1.getId());
        }

        if(isExp){
            if( ((exp2.startsWith("\"") && exp2.endsWith("\"")) || (exp2.startsWith("'") && exp2.endsWith("'")))
                    && (!op.equals("=="))) {

                ErrorPrinter.printFullError(myparser, ctx.start,
                        "error: Operator "+op+" Cannot Be Applied To Int , String",
                        "",
                        "" + symbolTable.getCurrentScope().getParent().getScopeName()
                );

            }
            if(!((exp2.startsWith("\"") && exp2.endsWith("\"")) || (exp2.startsWith("'") && exp2.endsWith("'")))) {
                if(symbolTable.lookup(exp2)==null){
                    ErrorPrinter.printFullError(myparser, ctx.start,
                            "error: Variable :" + exp2 + " Not found! In Scope ",
                            "",
                            "" + symbolTable.getCurrentScope().getParent().getScopeName()
                    );
                }
            }

            Record exper2 = symbolTable.lookup(exp2);
            if(exper2 != null && exper2.getValue()==null){
                System.err.println("Warring for using unassigned variable " + exper2.getId());
            }
            if(exper1 != null && exper2 != null) {
                if (!exper1.getType().equals(exper2.getType())) {
                    ErrorPrinter.printFullError(myparser, ctx.start,
                            "error: Operator " + op + " Cannot Be Applied To " + exper1.getType() + "," + exper2.getType(),
                            "",
                            "location: in Scope " + symbolTable.getCurrentScopeName()
                    );
                }
            }



        }

        return null;
    }

    @Override
    public Object visitFor_inc_dec(HplsqlParser.For_inc_decContext ctx) {

        String exp = ctx.ident().getText();
        if(!((exp.startsWith("\"") && exp.endsWith("\"")) || (exp.startsWith("'") && exp.endsWith("'")))){

            if(symbolTable.lookup(exp)==null){
                ErrorPrinter.printFullError(myparser, ctx.start,
                        "error: Variable :" + exp + " Not found! In Scope ",
                        "",
                        "" + symbolTable.getCurrentScope().getParent().getScopeName()
                );
            }
            Record exper = symbolTable.lookup(exp);
            if(!exper.getType().equals("int")){
                ErrorPrinter.printFullError(myparser, ctx.start,
                        "error: Variable " + exper.getId()+  " Type must be (int) Not ("+ exper.getType() + ")" ,
                        "" ,
                        "location: in Scope " + symbolTable.getCurrentScopeName()
                );
            }

        }

        return null;
    }

    /* End For */

}

