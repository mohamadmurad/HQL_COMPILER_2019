package ST;

public class VarRecord extends Record {

    public String value = "";

    public VarRecord(String id, String type,String value,String Kind) {

        super(id, type,Kind);
        this.value = value;

    }

    public VarRecord(String id, String type,String Kind) {

        super(id, type,Kind);


    }

    public String getKind(){return this.Kind;}
}
