import AST.*;
import ST.SymbolTable;
import ST.symboltableVisitor;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.*;
import java.io.IOException;



import antGen.*;
import Error.*;
import org.antlr.v4.runtime.tree.ParseTreeWalker;


import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {

    public static void main(String[] args) {
        //System.out.println("Hello World!");

        String FileNmae = "h.txt";
        try {

            CharStream cs = fromFileName(FileNmae);
            HplsqlLexer lex = new HplsqlLexer(cs);
            //lex.removeErrorListeners();

            //lex.addErrorListener(ThrowingErrorListener.INSTANCE);

            CommonTokenStream token = new CommonTokenStream(lex);
            HplsqlParser myparser = new HplsqlParser(token);
           // myparser.removeParseListeners();
           // myparser.addErrorListener(ThrowingErrorListener.INSTANCE);

            ParseTree myTree = myparser.program();


            SymbolTable symbol = new SymbolTable();
            //SymbolListener sl = new SymbolListener(symbol);
            //ParseTreeWalker walker = new ParseTreeWalker();
           // walker.walk(sl, myTree);

            //symbol.printTable();


            myvisitor visitor = new myvisitor(symbol);
            visitor.visit(myTree);
            if(symbol.getRoot().getChildren().size() > 0  ){
                System.out.println("\n\n<<< Symbol Table >>>\n\n");
                symbol.printTable();
            }else{
                System.out.print("No Symbol Table An Error!");
            }

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
}
