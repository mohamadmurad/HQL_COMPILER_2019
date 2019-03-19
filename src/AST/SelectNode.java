package AST;

import org.stringtemplate.v4.ST;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;

public class SelectNode extends Node {

    public ArrayList<String> Coloms;
    public String tableSource;
    public ArrayList<Experition> expretion;
    public ArrayList<String> Orderby;

    public SelectNode() {

    }


    public void setColoms(ArrayList<String> coloms) {
        Coloms = coloms;
    }

    public void setTableSource(String tableSource) {
        this.tableSource = tableSource;
    }

    public void setExpretion(ArrayList<Experition> expretion) {
        this.expretion = expretion;
    }

    public void setOrderby(ArrayList<String> orderby) {
        Orderby = orderby;
    }

    public ArrayList<String> getColoms() {
        return Coloms;
    }

    public String getTableSource() {
        return tableSource;
    }

    public ArrayList<Experition> getExpretion() {
        return expretion;
    }

    public ArrayList<String> getOrderby() {
        return Orderby;
    }
}
