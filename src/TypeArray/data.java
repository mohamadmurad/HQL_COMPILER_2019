package TypeArray;

import org.stringtemplate.v4.ST;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class data implements Serializable {
    String name_typ;
    boolean isTable;
    String TableLocation = "";
    String TsbleDELIMITER = "";
    String store = "";
    ArrayList<name_type> typ = new ArrayList<name_type>();

    public data(String name_typ, ArrayList<name_type> typ, boolean isTable) {
        this.name_typ = name_typ;
        this.typ = typ;
        this.isTable = isTable;
    }

    public int getIndexCol(String col) {
        for (int i = 0; i < typ.size(); i++) {
            if (typ.get(i).name.equals(col)) {
                return i;
            }
        }
        return -1;
    }


    public void setTableLocation(String tableLocation) {
        TableLocation = tableLocation;
    }

    public void setTsbleDELIMITER(String tsbleDELIMITER) {
        TsbleDELIMITER = tsbleDELIMITER;
    }

    public boolean isTable() {
        return isTable;
    }

    public String getTableLocation() {
        return TableLocation;
    }

    public String getTsbleDELIMITER() {
        return TsbleDELIMITER;
    }

    public String getName_typ() {
        return name_typ;
    }

    public ArrayList<name_type> getTyp() {
        return typ;
    }

    public void setStore(String store) {
        this.store = store;
    }
}
