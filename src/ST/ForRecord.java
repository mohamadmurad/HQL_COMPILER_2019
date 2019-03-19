package ST;



public class ForRecord extends Record {


    public assigmentRecord init;
    public condRecord cond;
    public String expre;



    public ForRecord(String id, String type) {
        super(id, type);
    }

   public void addInit_cond_exper(String name , String value ,String exp1,String exp2,String op,String exp){

        this.cond = new condRecord(exp1,exp2,op);
        this.expre = exp;
        this.init=new assigmentRecord(name,value);

   }

}
