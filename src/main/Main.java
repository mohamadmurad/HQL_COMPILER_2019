package main;

import ST.Record;
import ST.SymbolTable;
import org.antlr.v4.runtime.atn.PredictionMode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.*;

import antGen.*;
import Error.*;


import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {

    static String FileNmae = "test.txt";

    public static void main(String[] args) {


        try {

            CharStream cs = fromFileName(FileNmae);
            HplsqlLexer lex = new HplsqlLexer(cs);
            CommonTokenStream token = new CommonTokenStream(lex);
            HplsqlParser myparser = new HplsqlParser(token);

            myparser.removeParseListeners();

            myparser.addErrorListener(new ThrowingErrorListener());
            myparser.getInterpreter()
                    .setPredictionMode(PredictionMode.LL_EXACT_AMBIG_DETECTION);

            myparser.addErrorListener(new UnderlineListener());

            ParseTree myTree = myparser.program();

            lex.removeErrorListeners();

            lex.addErrorListener(ThrowingErrorListener.INSTANCE);


            myparser.addErrorListener(ThrowingErrorListener.INSTANCE);


            SymbolTable symbol = new SymbolTable();


            myvisitor visitor = new myvisitor(symbol);
            visitor.visit(myTree);


            ErrorPrinter.checkErrors();


            System.out.println("\n\n<<< Symbol Table >>>\n\n");
            symbol.printTable();


            CodeG code_g = new CodeG();
            code_g.visit(myTree);


        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static String getFileName() {

        return FileNmae;
    }

}
