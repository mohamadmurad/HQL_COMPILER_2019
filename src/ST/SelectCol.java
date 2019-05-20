package ST;

public class SelectCol extends Record{

    public String colname = "";
    public String tablename = "";
    public String aslis = "";

    public String func_name = "";


    public boolean is_colom = false;
    public boolean is_func = false;
    public boolean is_distnict=false;


    public SelectCol(String colname, String tablename, String aslis) {
        super(colname,"int","select Col");
        this.colname = colname;
        this.tablename = tablename;
        this.aslis = aslis;
        is_colom = true;

    }


    public SelectCol(String tablename,String func_name, String param, String aslis,boolean is_distnict) {
        super(param,"int","select Col");

        this.func_name = func_name;
        this.colname = param;
        this.is_distnict=is_distnict;
        this.tablename = tablename;
        this.aslis = aslis;
        is_func = true;

    }

}
