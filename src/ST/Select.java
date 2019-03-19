package ST;

import AST.Experition;

import java.util.ArrayList;

public class Select extends Record {

    public ArrayList<String> columns;
    public Table tableSource;
    public ArrayList<Experition> expretion;
    //public ArrayList<String> Orderby;

    public Select(String id, String type) {
        super(id, type);
    }

    public void addColumn(String col) {

        this.columns.add(col);

    }
    public void addExperition(Experition exp) {

        this.expretion.add(exp);

    }

}
