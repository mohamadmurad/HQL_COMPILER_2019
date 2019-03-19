package AST;

import TypeArray.name_type;

public class AST {

    public static Node root = null;

    public Node CreateNode(String name, int Line, int col, Node parent){
        Node newNode = new Node();
        newNode.setNodeName(name);
        newNode.setLineNumber(Line);
        newNode.setColNumber(col);
        newNode.setParent(parent);
        return newNode;
    }

    public void AddChild(Node parent, Node child){

        //parent.addCild(child);
    }

    public static void PrintAST(Node root,Node p,int d){

        if(root == null){System.out.println("Root Is null"); return;}
        if(root instanceof FunctionNode){
            for(int i=0;i<d;i++) System.out.print(" ");
            System.out.println("func ("+root.getNodeName() + ") returned : " +((FunctionNode) root).getReturnTyoe());


                for( VarDecleration param : ((FunctionNode) root).getParam() ){
                    for(int i=0;i<d+5;i++) System.out.print(" ");

                    System.out.println("-Paramiters of ("+root.getNodeName()+") - "+param.getType()+ " "+param.getNodeName());
                }


            for( Node child : root.getChild() ){

                PrintAST(child,root,d);
            }
        }else if(root instanceof VarDecleration){

            for(int i=0;i<d+5;i++) System.out.print(" ");
            System.out.println("-Var Child of ("+root.getParent().getNodeName()+") - "+((VarDecleration) root).getType()+" "+ root.getNodeName() );

        } else if(root instanceof CreateTableNode){

            for(int i=0;i<d+5;i++) System.out.print(" ");
            System.out.println("-Create Table Child of ("+p.getNodeName()+") - "+root.getNodeName());
            for (name_type n :((CreateTableNode) root).getColumns()){
                for(int i=0;i<d+10;i++) System.out.print(" ");
                System.out.println("-Table ("+root.getNodeName()+") colom - "+n.type+" "+n.name);

            }

        } else if(root instanceof ForNode){
            for(int i=0;i<d+5;i++) System.out.print(" ");
            System.out.println("-For Child of (" + p.getNodeName() + ") - " + root.getNodeName());

            for (Node n : ((ForNode) root).getForChiled()) {


                PrintAST(n,root,d+=5);
            }
        }else if(root instanceof SelectNode){
            for(int i=0;i<d+5;i++) System.out.print(" ");
            System.out.println("-Select Child of (" + p.getNodeName() + ") - " + root.getNodeName());
            for(int i=0;i<d+10;i++) System.out.print(" ");
            System.out.println("-Select source - " + ((SelectNode) root).getTableSource());
            for (String n : ((SelectNode) root).getColoms()) {
                for(int i=0;i<d+10;i++) System.out.print(" ");
                System.out.println("-colom - " + n);

            }
        }

    }
}
