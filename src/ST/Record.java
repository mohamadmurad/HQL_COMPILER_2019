package ST;

public class Record {

    protected String id;
    protected String type;
    public String Kind = "";

    public Record (String id, String type){
        this.id = id;
        this.type = type;
    }

    public Record(String id, String type, String kind) {
        this.id = id;
        this.type = type;
        this.Kind = kind;
    }

    public String getId(){
        return this.id;
    }

    public String getType(){
        return this.type;
    }

    public String getKind(){return this.Kind;}

    @Override
    public String toString() {
        return "ST.Record: "+id+" : "+type;
    }
}
