package AST;

import java.util.ArrayList;

public class Node {

    private int LineNumber;
    private int ColNumber;
    private String NodeName;
    private Node parent;



    //private ArrayList<Node> child = new ArrayList<>();


    public Node() {
        parent = null;
    }

   /* public void setChild(ArrayList<Node> child) {
        this.child = child;
    }*/
    public void setLineNumber(int lineNumber) {
        LineNumber = lineNumber;
    }

    public void setColNumber(int colNumber) {
        ColNumber = colNumber;
    }

    public void setNodeName(String nodeName) {
        NodeName = nodeName;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

   /* public void addCild(Node child){
        this.child.add(child);
    }*/

    public int getLineNumber() {
        return LineNumber;
    }

    public int getColNumber() {
        return ColNumber;
    }

    public String getNodeName() {
        return NodeName;
    }

    public Node getParent() {
        return parent;
    }

     public ArrayList<Node> getChild(){return null;};
}
