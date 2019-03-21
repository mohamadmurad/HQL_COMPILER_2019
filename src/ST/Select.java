package ST;

import AST.Experition;

import java.util.ArrayList;

public class Select extends Record {

    public ArrayList<SelectCol> columns;
    public String tableSource;
    //public ArrayList<Experition> expretion;
    //public ArrayList<String> Orderby;

    public Select(String id, String type,String tablename) {
        super(id, type); this.tableSource = tablename;
    }

    public void setColumn(ArrayList<SelectCol> col) {
        this.columns = col;
    }
    /*public void addExperition(Experition exp) {

        this.expretion.add(exp);

    }*/

}
