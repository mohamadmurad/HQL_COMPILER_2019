package TypeArray;


import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


/**
 *
 * @author MouAz HE
 */
public class TypeArray {

public static String fileName = "data.set";
public static List<data> data_type = new ArrayList<>();
public ArrayList<name_type> intt =  new ArrayList<>();
public ArrayList<name_type> str =  new ArrayList<>();
public ArrayList<name_type> reall =  new ArrayList<>();
public ArrayList<name_type> bool =  new ArrayList<>();
    public ArrayList<name_type> var =  new ArrayList<>();
    public ArrayList<name_type> voi_d =  new ArrayList<>();

public TypeArray() throws IOException {
    File tempFile = new File(fileName);
    boolean exists = tempFile.exists();
    if(exists){
        try {
            data_type = read_array();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
    else{
        intt.add(new name_type("int","int"));
        str.add(new name_type("string","string"));
        reall.add(new name_type("float","float"));
        bool.add(new name_type("bool","bool"));
        var.add(new name_type("var","var"));
        voi_d.add(new name_type("void","void"));
        data_type.add(new data("int",intt,false));
        data_type.add(new data("string",str,false));
        data_type.add(new data("float",reall,false));
        data_type.add(new data("bool",bool,false));
        data_type.add(new data("var",var,false));
        data_type.add(new data("void",voi_d,false));
        store_array(data_type);
    }

}

public static boolean find_typ(String type) {
    for(int i=0;i<data_type.size();i++)
    {
        if(data_type.get(i).name_typ.equals(type))
        {
            return true;
        }
    }
    return false;
}

public static boolean find_col_in_table(String col,String table) {
    for(int i=0;i<data_type.size();i++)
    {
        if(data_type.get(i).name_typ.equals(table))
        {
            for(int j=0;j<data_type.get(i).typ.size();j++)
            {
                if(data_type.get(i).typ.get(j).name.equals(col))
                {
                    return true;
                }
            }
        }
    }
    return false;

}

    public static String find_type_col_in_table(String col,String table) {
        for(int i=0;i<data_type.size();i++)
        {
            if(data_type.get(i).name_typ.equals(table))
            {
                for(int j=0;j<data_type.get(i).typ.size();j++)
                {
                    if(data_type.get(i).typ.get(j).name.equals(col))
                    {
                        return data_type.get(i).typ.get(j).type;
                    }
                }
            }
        }
        return null;

    }

public static void set(String name_typ , ArrayList<name_type> typ,String location,String delimeeter,String store) throws IOException {
    boolean find = true;
    String s;
    if(!find_typ(name_typ))
    {
        for(int i=0;i<typ.size();i++)
        {
            if(!find_typ(typ.get(i).type))
            {
                find = false;
                s = typ.get(i).type;
                break;
            }
        }
        if(find)
        {
            data d = new data(name_typ,typ,true);
            d.setTableLocation(location);
            d.setTsbleDELIMITER(delimeeter);
            d.setStore(store);
            data_type.add(d);
            store_array(data_type);
        }
    }
    
    
}

public static data get(String name) throws IOException, FileNotFoundException, ClassNotFoundException {
    
    List<data> d = read_array();
    
    for(int i=0;i<d.size();i++)
    {
        if(d.get(i).name_typ.equals(name))
        {

            return d.get(i);

        }
    }

    return null;
       
}


public static void flat(String name) throws IOException, FileNotFoundException, ClassNotFoundException {
    
    List<data> d = read_array();
    
    for(int i=0;i<d.size();i++)
    {
        if(d.get(i).name_typ.equals(name))
        {
            data newtype = d.get(i);
            System.out.print(name + " : ");
            System.out.print( "[ ");
            if(newtype.typ!=null)
            {
                 for(int j=0;j<newtype.typ.size();j++)
                 {
                     if(j!=0) System.out.print(" , ");
                     if(newtype.typ.get(j).type.equals("int") || newtype.typ.get(j).type.equals("real") || 
                     newtype.typ.get(j).type.equals("bool") || newtype.typ.get(j).type.equals("string"))
                     {
                        System.out.print("{ " + "name : " + newtype.typ.get(j).name + " , " + " type : " + newtype.typ.get(j).type);
                    
                     }
                     else
                     {
                        
                        flatt(newtype.typ.get(j).type,newtype.typ.get(j).name);
                     }
                     System.out.print(" } ");
                
                 }
            }
            else
            {
                System.out.print("{ name : " + newtype.name_typ + " , " + "type : " + newtype.name_typ);
                System.out.print(" } ");
            }
            System.out.print( "]");
            
        }
    }
       
}
public static void flatt(String type ,String name ) throws IOException, FileNotFoundException, ClassNotFoundException {
    List<data> d = read_array();
    for(int i=0;i<d.size();i++)
    {
        if(d.get(i).name_typ.equals(type))
        {
                data newtype = d.get(i);
            
                for(int j=0;j<newtype.typ.size();j++)
                {
                    if(j!=0) System.out.print(" , ");
                    if(newtype.typ.get(j).type.equals("int") || newtype.typ.get(j).type.equals("real") || 
                     newtype.typ.get(j).type.equals("bool") || newtype.typ.get(j).type.equals("string"))
                    {
                        System.out.print("{ " + "name : " + name + "_" + newtype.typ.get(j).name + " , " + " type : " + newtype.typ.get(j).type);
                        System.out.print(" } ");
                        System.out.print("\n");
                    }
                    else
                    {
                        
                        flatt(newtype.typ.get(j).type,newtype.typ.get(j).name);
                    }
                    
                }
                    }
    }
}

public static void store_array(List<data> d) throws FileNotFoundException, IOException {
    

    try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))) {
    out.writeObject(d);
    out.close();
   
    }
}


public static List<data> read_array() throws FileNotFoundException, IOException, ClassNotFoundException {
    try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName))) 
    {
        
        List<data> d = (List<data>) in.readObject();
        in.close();
        return d;
  
    }
}

   /* public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        TypeArray t = new TypeArray();
        List<name_type> a = new LinkedList<>();
        List<name_type> b = new LinkedList<>();
        List<name_type> c = new LinkedList<>();
        
        c.add(new name_type("find","bool"));
        
        b.add(new name_type("weight","real"));
        b.add(new name_type("height","int"));
        b.add(new name_type("COCO","C"));

        a.add(new name_type("name","string"));
        a.add(new name_type("education","string"));
        a.add(new name_type("id","int"));
        a.add(new name_type("BODY","B"));
        
        set("C",c);
        set("B",b);
        set("A",a);
        
        flat("A");
       
    }*/
    
}
