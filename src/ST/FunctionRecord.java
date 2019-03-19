package ST;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FunctionRecord extends Record {

    int paramNumber = 0;
    private HashMap<Integer, VarRecord> parameters = new HashMap<>();



    public FunctionRecord(String id, String type) {
        super(id, type);
    }


    public void addParameter(VarRecord parameter) {

        this.parameters.put(paramNumber, parameter);
        paramNumber++;
    }

    public boolean containParameter(int paramNumber, Record parameter) {
        // hash map
        VarRecord paramRec = parameters.get(paramNumber);
        if(parameter == null || paramRec == null)
            return false;
        return parameters.get(paramNumber).getType().equals(parameter.getType());
    }
    public int numberOfParameters() {
        return parameters.size();
    }

    public void printParameters() {
        System.out.print("( ");
        Iterator it = parameters.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            //System.out.println(pair.getKey() + " = " + pair.getValue());
            System.out.print(pair.getValue().toString());
        }


		/*
		for (ST.VarRecord it : parameters) {
			System.out.print(it.getType() + " " + it.getId() + " ");

		}
		*/
        System.out.print(" )\n");
    }
}

