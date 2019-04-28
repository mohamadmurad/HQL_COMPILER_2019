package mapreduce;

import java.io.Serializable;
import java.util.ArrayList;

public class mymap implements Serializable {

    private static final long serialVersionUID = 6970684876337098691L;

    private int key;
    private int value;
    private ArrayList<Integer> arrayVal;


    public mymap(int key, int value) {
        this.key = key;
        this.value = value;
    }




    public int getKey() {
        return key;
    }

    public int getValue() {
        return value;
    }
}
