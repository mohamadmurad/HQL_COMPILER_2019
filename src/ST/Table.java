package ST;

import TypeArray.name_type;

import java.util.ArrayList;

public class Table extends Record {

    ArrayList<Record> columns = new ArrayList<>();

    public Table(String id, String type) {
        super(id, type);
    }

    public void addColumn(Record col) {

        this.columns.add(col);

    }
    public boolean containColumn(String col) {
        // hash map
        for(int i=0;i<columns.size();i++){
            if(columns.get(i).id.equals(col)){
                return true;
            }
        }
        return false;
    }

    public int getIndexOfCol(String col){

        System.out.println(col);
        for(int i=0;i<columns.size();i++){
            if(columns.get(i).id.equals(col)){
                return i;
            }
        }
        return -1;
    }
}
