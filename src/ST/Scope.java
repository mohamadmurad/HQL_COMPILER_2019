package ST;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Scope {
    private int next = 0; // next child to visit
    Scope parent;
    private ArrayList<Scope> children = new ArrayList<Scope>();
    private Map<String, Record> records = new HashMap<String, Record>();

    //int type; // Function=0,block=1
    private String scopeName= "";
    private String scopeType= "";

    public Scope(Scope parent) {
        this.parent = parent;
    }

    public void setScopeNameAndType(String scopeName, String scopeType) {
        this.scopeName = scopeName;
        this.scopeType = scopeType;
    }

    public ArrayList<Scope> getChildren() {
        return children;
    }

    public Map<String, Record> getRecords() {
        return records;
    }

    public String getScopeName(){
        return this.scopeName;
    }

    public String getScopeType(){
        return scopeType;
    }

    private void printLine(String id, String record, String scope) {
        System.out.printf("%" + 20 + "s %" + 32 + "s %" + 35 + "s %n", id, record, scope);
    }

    public void printScope() {
        // print all the containing records
        Iterator it = records.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();
            Record temp = (Record) pair.getValue();
            if(temp instanceof FunctionRecord)
            printLine(pair.getKey().toString() + " : Method" ,  temp.getType(), scopeName+" [ "+scopeType+" ]");
            else if(temp instanceof Record)
                printLine(pair.getKey().toString() + " : " + ((Record) pair.getValue()).getKind() ,  temp.getType(), scopeName+" [ "+scopeType+" ]");
            //else if(temp instanceof ForRecord)
               // printLine(pair.getKey().toString() + " : Loop" ,  temp.getType(), scopeName+" [ "+scopeType+" ]");
            else if(temp instanceof Table)
                printLine(pair.getKey().toString() + " : Table" ,  temp.getType(), scopeName+" [ "+scopeType+" ]");
            else if(temp instanceof Select)
                printLine(pair.getKey().toString() + " : Select" ,  temp.getType(), scopeName+" [ "+scopeType+" ]");
            else if(temp instanceof SelectCol)
                printLine(pair.getKey().toString() + " : Select Col Alias ("+((SelectCol) temp).colname+")" ,  ((SelectCol) temp).aslis, scopeName+" [ "+scopeType+" ]");

        }
        // print children
        for (Scope scopeIt : children) {
            scopeIt.printScope();
        }
    }

    public void printScopeDebug(){
        System.out.println("SCOPE: "+scopeName+" | "+scopeType+" \t");
        System.out.println(" RECORDS: ");
        Iterator it = records.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();
            Record temp = (Record) pair.getValue();

            if(temp instanceof FunctionRecord){
                System.out.println("\t METHOD RECORD");
            }else{
                System.out.println("\t VAR RECORD");
            }
            printLine(pair.getKey().toString(), temp.getId() + " - " + temp.getType(), scopeName+" [ "+scopeType+" ]");
        }
        System.out.println("-");
        for (Scope scopeIt : children) {
            System.out.println(scopeName+" | "+scopeType+" -> CHILDREN: "+scopeIt.getScopeName()+" | "+scopeIt.getScopeType());
            scopeIt.printScopeDebug();
        }

    }

    // add a new record to the current scope
    public void put(String key, Record item) {
        records.put(key, item);
    }


    public Scope nextChild() {
        Scope nextChild;
        if (next >= children.size()) {
            nextChild = new Scope(this); // create a new ST.Scope passing the parent scope
            children.add(nextChild);
        } else {
            // child exists
            nextChild = (Scope) children.get(next); // visited the next
            // child (ST.Scope)
        }
        next++;
        return nextChild;
    }

    public Record lookuplocaly(String key) {

        if (records.containsKey(key)) { // is the key in current scope?
            Record rec = (Record) records.get(key);
            // if(true)System.out.println("\tST.Record found on: "+scopeName+" [ "+scopeType+" ]");
            return rec;
        } else {
            // move the scope to parent scope
            return null;
        }
    }

    public Record lookup(String key) {

        if (records.containsKey(key)) { // is the key in current scope?
            Record rec = (Record) records.get(key);
            //if(true)System.out.println("\tST.Record found on: "+scopeName+" [ "+scopeType+" ]");
            return rec;
        } else {
            // move the scope to parent scope
            if (parent == null) {
                return null; // identifier is not contained
            } else {
                return parent.lookup(key); // send the req to parent
            }
        }
    }


    public void resetScope() {
        next = 0; // first child to visit next
        for (int i = 0; i < children.size(); i++) {
            ((Scope) children.get(i)).resetScope();
        }
    }

    public Scope getParent() {
        return this.parent;
    }



}
