package AST;

import TypeArray.name_type;

import java.util.ArrayList;

public class CreateTableNode extends Node {



    ArrayList<name_type> columns = new ArrayList<>();


    public CreateTableNode(String name) {
        this.setNodeName(name);
    }

    public void setColumns(ArrayList<name_type> col){

        this.columns= col;
    }
    public ArrayList<name_type> getColumns() {
        return columns;
    }

}
