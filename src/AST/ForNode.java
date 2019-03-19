package AST;

import java.util.ArrayList;

public class ForNode extends Node{

    public String init;
    public String cond;
    public String expre;




    ArrayList<Node> ForChiled = new ArrayList<Node>();

    public ForNode(String init,String cond,String expre) {
        this.cond = cond;
        this.expre = expre;
        this.init = init;
    }

    public void setForChiled(ArrayList<Node> forChiled) {
        ForChiled = forChiled;
    }
    public ArrayList<Node> getForChiled() {
        return ForChiled;
    }

}
