package mapreduce;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Main {

    public interface MyFunction {

        int operation(ArrayList<Integer> c);
    }

    /*static MyFunction myfunction = (c) -> {
        int sum = 0;
        for(int i=0;i<c.size();i++){

            sum+=c.get(i);
        }
        return sum;
    };*/

    String sql = "Select id , Sum(temp) from temporetior group by id";

    static ArrayList<mymap> ss = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Hello World!");

        ArrayList<String> FilesName = new ArrayList<>();
        FilesName.add("temperature.csv");


        try {
            map_reduce("temperature.csv");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


    public static void map_reduce(String f) throws IOException {
        // sum
        mapper(f);



       // shuffle();
        ArrayList<Integer> dd = new ArrayList<>();
        ArrayList<mymap> r = reducer(shuffle(), new MyFunction() {
            @Override
            public int operation(ArrayList<Integer> c) {
                int sum = 0;
                for(int i=0;i<c.size();i++){

                    sum+=c.get(i);
                }
                return sum;
            }
        });

        for (mymap m: r) {

            System.out.println(m.getKey() + "  "  + m.getValue());
        }

    }

    public static void mapper(String filename){
        String line;
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {

            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] country = line.split(",");

                // Reopen the file but for appending:
               try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("xx.dat", true))) {
                    output.writeObject(new mymap(Integer.parseInt(country[0]),Integer.parseInt(country[2])));
                    output.close();
                   ss.add(new mymap(Integer.parseInt(country[0]),Integer.parseInt(country[2])));

                }

                //System.out.println("Country [code= " + Integer.parseInt(country[0]) + " , name=" + Integer.parseInt(country[2]) + "]");

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static  Map<Integer,ArrayList<Integer>> shuffle() throws IOException {
        Map<Integer,ArrayList<Integer>> mmm = new HashMap<>();

        for(mymap m :ss){

            if(mmm.containsKey(m.getKey())){
                mmm.get(m.getKey()).add(m.getValue());
            }else {
                ArrayList<Integer> dd = new ArrayList<>();
                dd.add(m.getValue());
                mmm.put(m.getKey(),dd);
            }
        }


        for (Map.Entry<Integer, ArrayList<Integer>> entry : mmm.entrySet()) {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

       /* try (ObjectInputStream output = new ObjectInputStream(new FileInputStream("xx.dat"))) {
            m = (mymap) output.readObject();
            while (m != null){
                m = (mymap) output.readObject();
                System.out.println(m.getValue());
                m=null;

            }
            output.close();




            //output.writeObject(new mymap(Integer.parseInt(country[1]),Integer.parseInt(country[1])));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }*/
return  mmm;

    }



    public static ArrayList<mymap> reducer(Map<Integer,ArrayList<Integer>> mmm,MyFunction obj){


        ArrayList<mymap> result = new ArrayList<>();

        for (Map.Entry<Integer, ArrayList<Integer>> entry : mmm.entrySet()) {
            //System.out.println(entry.getKey()+" : "+entry.getValue());
            /*int sum = 0;
            for(int i=0;i<entry.getValue().size();i++){

                sum+=entry.getValue().get(i);
            }
//reducer(() -> Sum());
            */

            result.add(new mymap(entry.getKey(),obj.operation(entry.getValue())));


        }


        return result;

    }


    public static int Sum(ArrayList<Integer> ss){


            //System.out.println(entry.getKey()+" : "+entry.getValue());
            int sum = 0;
            for(int i=0;i<ss.size();i++){

                sum+=ss.get(i);
            }

            //result.add(new mymap(entry.getKey(),sum));



        return sum;
    }
}
