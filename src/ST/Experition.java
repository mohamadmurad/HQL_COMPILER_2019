package ST;

import AST.Node;

public class Experition  {
    public String exp1;
    public String exp2;
    public String op;

    public Experition(String exp1, String exp2, String op) {
        this.exp1 = exp1;
        this.exp2 = exp2;
        this.op = op;
    }


    public void setExp1(String exp1) {
        this.exp1 = exp1;
    }

    public void setExp2(String exp2) {
        this.exp2 = exp2;
    }

    public void setOp(String op) {
        this.op = op;
    }

    public String getExp1() {
        return exp1;
    }

    public String getExp2() {
        return exp2;
    }

    public String getOp() {
        return op;
    }
}
