package ST;

public class SelectCol extends Record{

    public String colname = "";
    public String tablename = "";
    public String aslis = "";

    public String func_name = "";


    public boolean is_colom;
    public boolean is_func;


    public SelectCol(String colname, String tablename, String aslis) {
        super(colname,"int","select Col");
        this.colname = colname;
        this.tablename = tablename;
        this.aslis = aslis;
        is_colom = true;

    }


    public SelectCol(String tablename,String func_name, String param, String aslis) {
        super(param,"int","select Col");

        this.func_name = func_name;
        this.colname = param;
        this.tablename = tablename;
        this.aslis = aslis;
        is_func = true;

    }

}