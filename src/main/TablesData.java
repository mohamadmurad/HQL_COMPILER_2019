package main;

import TypeArray.data;

public class TablesData {

    TypeArray.data data;
    String alis;

    public TablesData(TypeArray.data data, String alis) {
        this.data = data;
        this.alis = alis;
    }

    public TypeArray.data getData() {
        return data;
    }

    public String getAlis() {
        return alis;
    }
}
