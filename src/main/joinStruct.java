package main;

public class joinStruct {

    String tbl1,tb2,join,col1,col2,onOP,alis1,alis2;


    public joinStruct(String tbl1, String tb2, String join, String col1, String col2, String onOP,String alis1,String alis2) {
        this.tbl1 = tbl1;
        this.tb2 = tb2;
        this.join = join;
        this.col1 = col1;
        this.col2 = col2;
        this.onOP = onOP;
        this.alis1=alis1;
        this.alis2=alis2;
    }

    public String getTbl1() {
        return tbl1;
    }

    public String getTb2() {
        return tb2;
    }

    public String getJoin() {
        return join;
    }

    public String getCol1() {
        return col1;
    }

    public String getCol2() {
        return col2;
    }

    public String getOnOP() {
        return onOP;
    }

    public String getAlis1() {
        return alis1;
    }

    public String getAlis2() {
        return alis2;
    }
}
