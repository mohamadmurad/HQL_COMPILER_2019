package mapreduce;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class avg {

    String sql = "Select id , avg(temp) from temporetior group by id";
    static String directory = "temp";
    static String lineSeparator = System.getProperty("line.separator");

    //static ArrayList<mymap> ss = new ArrayList<>();

    public static void main(String[] args) {
        boolean dirFlag = false;

// create File object
        File stockDir = new File(directory);

        try {

            delete(stockDir);

            dirFlag = stockDir.mkdir();
        } catch (SecurityException Se) {

            System.out.println("Error while creating directory in Java:" + Se);
        }catch (IOException e) {

            e.printStackTrace();
        }

        if (dirFlag)
            System.out.println("Directory created successfully");
        else
            System.out.println("Directory was not created successfully");




        System.out.println("Hello World!");

        ArrayList<String> FilesName = new ArrayList<>();
        FilesName.add("temperature.csv");
        FilesName.add("temperature2.csv");


        try {
           map_reduce(FilesName);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


    public static void map_reduce(ArrayList<String> FilesName) throws IOException {
        // sum


        for(String name : FilesName){
            mapper(name);
        }

        shuffle();
       reducer(new MyFunction() {
            @Override
            public int operation(ArrayList<Integer> c) {
                int sum = 0;
                for(int i=0;i<c.size();i++){

                    sum+=c.get(i);
                }
                return sum;
            }
        });

        String absolutePath = directory + File.separator + "redu.txt";
        try(BufferedReader br = new BufferedReader(new FileReader(absolutePath))) {

            String line;

            while ((line = br.readLine()) != null) {
                String[] r = line.split("/");

                System.out.println(r[0] + "  "  + r[1]);

            }
        }


    }

    public static void mapper(String filename){

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line =  br.readLine();
            while ((line ) != null) {

                // use comma as separator
                String[] country = line.split(",");
               // ss.add(new mymap(Integer.parseInt(country[0]),Integer.parseInt(country[2])));
                // Reopen the file but for appending:

                String FileName = filename + ".txt";
                String absolutePath = directory + File.separator + FileName;

                try(FileOutputStream fileOutputStream = new FileOutputStream(absolutePath,true)) {
                    String fileContent = country[0] + "/" + country[2] ;
                    fileOutputStream.write(fileContent.getBytes());

                    line =  br.readLine();
                    if(line != null){
                        fileOutputStream.write(lineSeparator.getBytes());
                    }



                    fileOutputStream.flush();

                    fileOutputStream.close();

                } catch (FileNotFoundException e) {
                    // exception handling
                } catch (IOException e) {
                    // exception handling
                }



                //System.out.println("Country [code= " + Integer.parseInt(country[0]) + " , name=" + Integer.parseInt(country[2]) + "]");

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static  void shuffle() throws IOException {
        Map<Integer,ArrayList<Integer>> mmm = new HashMap<>();

        File stockDir = new File(directory);
        String[] list = stockDir.list();
        for(String name : list){
            String absolutePath = directory + File.separator + name;
            try(BufferedReader br = new BufferedReader(new FileReader(absolutePath))) {

                String line;

                while ((line = br.readLine()) != null){
                    String[] KeyAndVal = line.split("/");

                    if(mmm.containsKey(Integer.parseInt(KeyAndVal[0]))){

                        mmm.get(Integer.parseInt(KeyAndVal[0])).add(Integer.parseInt(KeyAndVal[1]));

                    }else {

                        ArrayList<Integer> dd = new ArrayList<>();
                        dd.add(Integer.parseInt(KeyAndVal[1]));
                        mmm.put(Integer.parseInt(KeyAndVal[0]),dd);
                    }
                }

                br.close();







            } catch (FileNotFoundException e) {
                // exception handling
            } catch (IOException e) {
                // exception handling
            }



        }

        String shuffl = directory + File.separator +"shufflResult.txt";

        try(BufferedWriter fileOutputStream = new BufferedWriter(new FileWriter(shuffl,true))) {


            for (Map.Entry<Integer, ArrayList<Integer>> entry : mmm.entrySet()) {
                System.out.println(entry.getKey()+" : "+entry.getValue());

                String output = entry.getKey() + "/";
                for(int val :entry.getValue()){
                    output+=","+val;
                }
                output += System.lineSeparator();
                output = output.replaceFirst("/,","/");
                fileOutputStream.write(output);

            }

            fileOutputStream.close();

        } catch (FileNotFoundException e) {
            // exception handling
        } catch (IOException e) {
            // exception handling
        }

    }



    public static void reducer(MyFunction obj){


        ArrayList<mymap> result = new ArrayList<>();
        String shuffl = directory + File.separator +"shufflResult.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(shuffl))) {

            String line;

            while ((line = br.readLine()) != null){

                String[] KeyAndVal = line.split("/");

                String[] vlas = KeyAndVal[1].split(",");
                ArrayList<Integer> values = new ArrayList<>();

                for(String s : vlas){
                    values.add(Integer.parseInt(s));
                }

                int opResult = obj.operation(values);
                String reduce = directory + File.separator +"redu.txt";
                try(BufferedWriter fileOutputStream = new BufferedWriter(new FileWriter(reduce,true))) {
                    fileOutputStream.write(KeyAndVal[0] + "/" + opResult+System.lineSeparator());
                    fileOutputStream.close();
                }








            }



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

/*
        for (Map.Entry<Integer, ArrayList<Integer>> entry : mmm.entrySet()) {
            //System.out.println(entry.getKey()+" : "+entry.getValue());
            /*int sum = 0;
            for(int i=0;i<entry.getValue().size();i++){

                sum+=entry.getValue().get(i);
            }
//reducer(() -> Sum());
            */

        //    result.add(new mymap(entry.getKey(),obj.operation(entry.getValue())));


     //   }



    }


    public static void delete(File file)
            throws IOException{

        if(file.isDirectory()){

            //directory is empty, then delete it
            if(file.list().length==0){

                file.delete();
                System.out.println("Directory is deleted : "
                        + file.getAbsolutePath());

            }else{

                //list all the directory contents
                String files[] = file.list();

                for (String temp : files) {
                    //construct the file structure
                    File fileDelete = new File(file, temp);

                    //recursive delete
                    delete(fileDelete);
                }

                //check the directory again, if empty then delete it
                if(file.list().length==0){
                    file.delete();
                    System.out.println("Directory is deleted : "
                            + file.getAbsolutePath());
                }
            }

        }else{
            //if file, then delete it
            file.delete();
            System.out.println("File is deleted : " + file.getAbsolutePath());
        }
    }

}
