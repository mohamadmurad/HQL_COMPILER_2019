package ST;

public class Record {

    protected String id;
    protected String type;
    public String Kind = "";
    private String value = "";


    public Record(String id, String type) {
        this.id = id;
        this.type = type;
    }

    public Record(String id, String type, String kind) {
        this.id = id;
        this.type = type;
        this.Kind = kind;
    }

    public Record(String id, String type, String kind, String value) {
        this.id = id;
        this.type = type;
        this.Kind = kind;
        this.value = value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public String getId() {
        return this.id;
    }

    public String getType() {
        return this.type;
    }

    public String getKind() {
        return this.Kind;
    }

    @Override
    public String toString() {
        return "ST.Record: " + id + " : " + type;
    }
}
