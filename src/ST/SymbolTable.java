package ST;

public class SymbolTable {

    private Scope root ; // the root scope
    private Scope current; // current scope
    boolean debug = true;

    public SymbolTable() {
        this.root = new Scope(null);
        this.current = root;
    }

    public Scope getRoot() {
        return root;
    }

    public String getCurrentScopeName(){
        return this.current.getScopeName();
    }

    public String getCurrentScopeType(){
        return this.current.getScopeType();
    }

    public void setCurrentScopeNameAndType(String scopeName, String scopeType){
        this.current.setScopeNameAndType(scopeName, scopeType);
    }

    // create a new scope if necessary
    public void enterScope() {
        current = current.nextChild();
    }

    public void exitScope() {
        current = current.getParent();
    }

    public void put(String key, Record item) {
        current.put(key, item);
    }

    public Record lookup(String key) {
        //if(debug)System.out.println("\t Current SCOPE: "+current.getScopeName()+" | "+current.getScopeType());
        return current.lookup(key);
    }


    public Record lookuplocaly(String key) {
        //if(debug)System.out.println("\t Current SCOPE: "+current.getScopeName()+" | "+current.getScopeType());
        return current.lookuplocaly(key);
    }

    public void printTable() {
        System.out.println("\n\t\tPrinting the Symbol Table:\n");
        System.out.printf("%s %n", "+-------------------------------------------------------------------------------------------+");
        System.out.printf("%" + 18 + "s %" + 32 + "s %" + 32 + "s %n", "RECORD", "TYPE", "SCOPE");
        System.out.printf("%s %n", "+-------------------------------------------------------------------------------------------+");
        root.printScope();
        System.out.printf("%s %n", "+-------------------------------------------------------------------------------------------+");
    }

    public void resetTable() {
        root.resetScope();
    }

    public void printScopeTree(){
        System.out.println("\n\n");
        root.printScopeDebug();
    }

}
