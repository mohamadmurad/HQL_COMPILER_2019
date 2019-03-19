package ST;

public class condRecord {
    String exp1;
    String exp2;
    String operation_logical;


    public condRecord(String exp1, String exp2, String operation_logical) {
        this.exp1 = exp1;
        this.exp2 = exp2;
        this.operation_logical = operation_logical;
    }

    public String getExp1() {
        return exp1;
    }

    public String getExp2() {
        return exp2;
    }

    public String getOperation_logical() {
        return operation_logical;
    }
}
