package Error;

import main.Main;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;

public final class ErrorPrinter {
    private static boolean hasError = false;
    private static int errorCount=0;
    public static boolean noErrors(){
        return !hasError;
    }

    public static void reportError(){
        hasError=true;
        errorCount++;
    }
    public static int getErrorCount(){return errorCount;}


    public static void checkErrors(){
        if(!ErrorPrinter.noErrors()){

            System.err.println(ErrorPrinter.getErrorCount() + " errors.");
            System.exit(1);
        }
    }


    public static void varAlreadyDef( Token offendingToken, String symbolType, String symbol, String className){
        ErrorPrinter.printFileNameAndLineNumber(offendingToken);
        System.err.println("error: " + symbolType + " " + symbol + " already defined in Scoop " + className);

    }
    public static void printFileNameAndLineNumber(Token offendingToken){
        reportError();
        System.err.print(Main.getFileName()+":"+offendingToken.getLine()+": ");

    }

    public static void PrintError( Token offendingToken, String message, String location){
        ErrorPrinter.printFileNameAndLineNumber(offendingToken);
        System.err.println(message);

       System.err.println("  " + location);
    }

}
