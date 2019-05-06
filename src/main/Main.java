package main;

import ST.Record;
import ST.SymbolTable;
import org.antlr.v4.runtime.atn.PredictionMode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.*;
//import CG.cg;

import antGen.*;
import Error.*;


import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {

    static String FileNmae = "test.txt";

    public static void main(String[] args) {
        //System.out.println("Hello World!");


        try {

            CharStream cs = fromFileName(FileNmae);
            HplsqlLexer lex = new HplsqlLexer(cs);
            CommonTokenStream token = new CommonTokenStream(lex);
            HplsqlParser myparser = new HplsqlParser(token);
            myparser.removeParseListeners();
            //Reports ambiguities or errors in the grammar that have passed Antlr's static analysis of the grammar phase.
            //http://www.antlr.org/api/Java/org/antlr/v4/runtime/DiagnosticErrorListener.html
            myparser.addErrorListener(new ThrowingErrorListener());
            myparser.getInterpreter()
                    .setPredictionMode(PredictionMode.LL_EXACT_AMBIG_DETECTION);

            //Reports syntax errors upon construction of the parse tree.
            //Underlines the offending token and prints the follows set of
            //(The set of all tokens that can legally follow) the previous token.
            myparser.addErrorListener(new UnderlineListener());

            ParseTree myTree = myparser.program();

            //ErrorPrinter.exitOnErrors();
            //lex.removeErrorListeners();

            //lex.addErrorListener(ThrowingErrorListener.INSTANCE);



           //
           // myparser.addErrorListener(ThrowingErrorListener.INSTANCE);




            SymbolTable symbol = new SymbolTable();
            //main.SymbolListener sl = new main.SymbolListener(symbol);
            //ParseTreeWalker walker = new ParseTreeWalker();
           // walker.walk(sl, myTree);

            //symbol.printTable();


            myvisitor visitor = new myvisitor(symbol);
            visitor.visit(myTree);


            ErrorPrinter.exitOnErrors();




            System.out.println("\n\n<<< Symbol Table >>>\n\n");
            symbol.printTable();




            CodeGenerator code_g = new CodeGenerator(symbol);
            code_g.visit(myTree);

            //cg.main(args);
            //System.out.println("\n\n<<< AST TREE >>>");
           // Node global = new Node();
           // global.setNodeName("Root");
           // AST.PrintAST(AST.root,global,0);

            //ast2.AST ast = new ast2.AST(myTree);
            //System.out.println(ast);


        } catch (Exception e) {
            //System.out.println(e);
        }

    }

    public static String getFileName() {

        return FileNmae;
    }

}
