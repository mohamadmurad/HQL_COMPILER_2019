package ST;

public class SelectCol {

    public String colname = "";
    public String tablename = "";
    public String aslis = "";

    public String func_name = "";


    public boolean is_colom;
    public boolean is_func;


    public SelectCol(String colname, String tablename, String aslis) {
        this.colname = colname;
        this.tablename = tablename;
        this.aslis = aslis;
        is_colom = true;

    }


    public SelectCol(String tablename,String func_name, String param, String aslis) {
        this.func_name = func_name;
        this.colname = param;
        this.tablename = tablename;
        this.aslis = aslis;
        is_func = true;

    }

}
