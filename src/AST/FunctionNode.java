package AST;

import java.util.ArrayList;

public class FunctionNode extends Node {



    ArrayList<VarDecleration> param = new ArrayList<VarDecleration>();
    public String returnTyoe;



    private ArrayList<Node> child = new ArrayList<>();

    public FunctionNode(String NodeName,Node parent, ArrayList<Node> child, ArrayList<VarDecleration> param, String returnTyoe) {
        this.param = param;
        this.returnTyoe = returnTyoe;
        this.setNodeName(NodeName);
        this.setParent(parent);
        this.setChild(child);

        //printlll(this);
    }

    public void setChild(ArrayList<Node> child) {
        this.child = child;
    }

    private void printlll(FunctionNode functionNode) {
        System.out.println("name : " +this.getNodeName());
        System.out.println("paran : " +this.param.get(0).getNodeName());
        System.out.println("paran : " +this.param.get(1).getNodeName());
        System.out.println("param :" +this.param.get(2).getNodeName());

    }

    public void addParam(VarDecleration param){
        this.param.add(param);
    }

    public void setReturnTyoe(String returnTyoe) {
        this.returnTyoe = returnTyoe;
    }

    public String getReturnTyoe() {
        return returnTyoe;
    }
    @Override
    public ArrayList<Node> getChild(){return child;};

    public ArrayList<VarDecleration> getParam()

    {
        return param;
    }



}
