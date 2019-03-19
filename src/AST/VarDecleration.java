package AST;

public class VarDecleration extends Node {

    private String Type;

    public VarDecleration(String name,String Type)
    {
        setType(Type);
        this.setNodeName(name);
    }

    public void setType(String type) {
        Type = type;
    }

    public String getType() {
        return Type;
    }



}
