package main;

public class whereStruct {

    private String tbl1, tbl2 = null, col1, col2 = null, op, after;


    public whereStruct(String tbl1, String col1, String op) {
        this.tbl1 = tbl1;
        this.col1 = col1;
        this.op = op;
    }

    public whereStruct(String tbl1, String tbl2, String col1, String col2, String op, String after) {
        this.tbl1 = tbl1;
        this.tbl2 = tbl2;
        this.col1 = col1;
        this.col2 = col2;
        this.op = op;
        this.after = after;
    }

    public String getTbl1() {
        return tbl1;
    }

    public String getTbl2() {
        return tbl2;
    }

    public String getCol1() {
        return col1;
    }

    public String getCol2() {
        return col2;
    }

    public String getOp() {
        return op;
    }

    public String getAfter() {
        return after;
    }
}
