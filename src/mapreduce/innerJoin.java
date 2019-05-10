package mapreduce;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class innerJoin {

    public interface MyFunction {
        int operation(ArrayList<Integer> c);
    }

    String sql = "SELECT dep.dep_id , SUM(emp.salary) FROM emp INNER JOIN dep ON dep.dep_id = emp.dep_id GROUP by dep.dep_id";

    static String lineSeparator = System.getProperty("line.separator");
    static String tempdirectory = "temp";

    static String tableLocation1 = "emp";
    static String tableLocation2 = "dep";
    static String tableSpilt1  = ",";
    static String tableSpilt2  = ",";

    public static void main(String[] args) {
        initFIleDir();
        File tableDir1 = new File(tableLocation1);
        File tableDir2 = new File(tableLocation2);


        if(tableDir1.exists() && tableDir1.isDirectory() && tableDir2.exists() && tableDir2.isDirectory()){

            try {

                map_reduce(tableDir1.list(),tableDir2.list());
            } catch (IOException e) {
                e.printStackTrace();
            }


        }

    }

    public static void map(String[] line){
        String maperPath = tempdirectory+File.separator+"map1";
        File stockDir1 = new File(maperPath);
        if(!stockDir1.exists()){stockDir1.mkdir();}
        String FileName = "1.txt";
        String outPath = maperPath + File.separator + FileName;
        try(FileOutputStream fileOutputStream = new FileOutputStream(outPath,true)) {

            String fileContent = line[4] +","+line[3];

            fileOutputStream.write(fileContent.getBytes());


            fileOutputStream.flush();

            fileOutputStream.close();

        } catch (FileNotFoundException e) {

        } catch (IOException e) {

        }


    }


    public static void map_reduce(String[] FilesName1,String[] FilesName2) throws IOException {
        // sum
        /*File stockDir1 = new File(tempdirectory+File.separator+"emp");
        if(!stockDir1.exists()){stockDir1.mkdir();}

        File stockDir2 = new File(tempdirectory+File.separator+"dep");
        if(!stockDir2.exists()){stockDir2.mkdir();}*/
        /* start join */
       /* int i=0;
        for(String name : FilesName1){

            JoinMap1(name,i++);
        }
        i=0;
        for(String name : FilesName2){
            JoinMap2(name,i++);
        }*/


        innerJoin1();




        /* end join */

       /* File joinDir = new File(tableLocation1);
        for(String name : joinDir.list()){
            mapper1(name);
        }*/
        shuffle1();
       // shuffle2();
        //shuffle();

        reducer1(new MyFunction() {
            @Override
            public int operation(ArrayList<Integer> c) {
                int sum = 0;
                for(int i=0;i<c.size();i++){

                    sum+=c.get(i);
                }
                return sum;
            }
        });
/*
        String absolutePath = directory + File.separator + "redu.txt";
        try(BufferedReader br = new BufferedReader(new FileReader(absolutePath))) {

            String line;

            while ((line = br.readLine()) != null) {
                String[] r = line.split("/");
                String[] k = r[0].split(",");

                for(String kk:k){
                    System.out.print(kk + "  ");
                }

                System.out.println( r[1]);

            }
        }
*/

    }

    public static void JoinMap1(String filename,int meta_d){

        String maperPath = tempdirectory+File.separator+"emp"+File.separator+"JoinMap";

        File stockDir1 = new File(maperPath);
        if(!stockDir1.exists()){stockDir1.mkdir();}
        File metaDir = new File(maperPath+File.separator+"meta");
        if(!metaDir.exists()){metaDir.mkdir();}

        try (BufferedReader br = new BufferedReader(new FileReader(tableLocation1+File.separator+filename))) {
            String line =  br.readLine();
            String metaOut = "dep_id"+","+"salary" + lineSeparator;

            String FileName = filename + ".txt";
            String absolutePath = maperPath + File.separator + FileName;
            if(meta_d==0){
                String metaData = maperPath + File.separator +"meta"+File.separator+ "meta.txt";

                try(FileOutputStream meta = new FileOutputStream(metaData,true)) {
                    meta.write(metaOut.getBytes());
                }
            }
            while ((line ) != null) {

                String[] country = line.split(tableSpilt1);
                for(int i=0;i<country.length;i++) {
                    country[i] = country[i].replace("\"", "");

                }
                try(FileOutputStream fileOutputStream = new FileOutputStream(absolutePath,true)) {

                    String fileContent = country[2] +","+country[3];




                    fileOutputStream.write(fileContent.getBytes());

                    line =  br.readLine();

                    if(line != null){
                        fileOutputStream.write(lineSeparator.getBytes());
                    }



                    fileOutputStream.flush();

                    fileOutputStream.close();

                } catch (FileNotFoundException e) {
                    System.out.println("sdsd");
                } catch (IOException e) {
                    System.out.println("sssssss");
                }


            }

        } catch (IOException e) {
            e.printStackTrace();
        }



    }

    public static void JoinMap2(String filename,int meta_d){

        String maperPath = tempdirectory+File.separator+"dep"+File.separator+"JoinMap";

        File stockDir1 = new File(maperPath);
        if(!stockDir1.exists()){stockDir1.mkdir();}
        File metaDir = new File(maperPath+File.separator+"meta");
        if(!metaDir.exists()){metaDir.mkdir();}


        try (BufferedReader br = new BufferedReader(new FileReader(tableLocation2+File.separator+filename))) {
            String line =  br.readLine();
            String metaOut = "id" + lineSeparator;
            String FileName = filename + ".txt";
            String absolutePath = maperPath + File.separator + FileName;

            if(meta_d==0){
                String metaData = maperPath + File.separator +"meta"+File.separator+ "meta.txt";

                try(FileOutputStream meta = new FileOutputStream(metaData,true)) {
                    meta.write(metaOut.getBytes());
                }
            }
            while ((line ) != null) {

                String[] country = line.split(tableSpilt2);
                for(int i=0;i<country.length;i++){
                    country[i] = country[i].replace("\"","");
                }

                try(FileOutputStream fileOutputStream = new FileOutputStream(absolutePath,true)) {

                    String fileContent = country[0];

                    fileOutputStream.write(fileContent.getBytes());

                    line =  br.readLine();
                    if(line != null){
                        fileOutputStream.write(lineSeparator.getBytes());
                    }



                    fileOutputStream.flush();

                    fileOutputStream.close();

                } catch (FileNotFoundException e) {

                } catch (IOException e) {

                }


            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void innerJoin1() {

        String Table_1_path = tableLocation1;
        String Table_2_path = tableLocation2;
        File table1 = new File(Table_1_path);
        File table2 = new File(Table_2_path);
        String[] Table_1_list = table1.list();
        String[] Table_2_list = table2.list();
        for(String name1 : Table_1_list) {
            String absolutePath1 = Table_1_path + File.separator + name1;
            try (BufferedReader br = new BufferedReader(new FileReader(absolutePath1))) {
                String line;

                while ((line = br.readLine()) != null) {

                    String[] country1 = line.split(tableSpilt1);
                    if (!(country1[2].matches("null") || country1[2].matches("NULL"))) {
                        for (String name2 : Table_2_list) {
                            String absolutePath2 = Table_2_path + File.separator + name2;
                            try (BufferedReader depbr = new BufferedReader(new FileReader(absolutePath2))) {
                                String dep_line;

                                while ((dep_line = depbr.readLine()) != null) {
                                    String[] country2 = dep_line.split(tableSpilt2);
                                    String[] concat_Line =new String[country1.length+country2.length];
                                    for (int i = 0; i < country1.length; i++) {
                                        concat_Line[i] = country1[i];
                                    }

                                    for (int i = country1.length; i < country2.length; i++) {
                                        concat_Line[i]= country2[i];
                                    }
                                    if (country1[2].equals(country2[0])){
                                        map(concat_Line);

                                    }

                                }
                                }
                        }
                    }
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }



    }

    public static  String innerJoin() throws IOException {
        String outPath = tempdirectory + File.separator + "emp_dep";
       // Map<ArrayList<Integer>,ArrayList<Integer>> mmm = new HashMap<>();
        //String Table_1_path = tempdirectory+File.separator+"emp"+File.separator+"JoinMap";
        //String Table_2_path = tempdirectory+File.separator+"dep"+File.separator+"JoinMap";
        String Table_1_path = tempdirectory+File.separator+"emp"+File.separator+"JoinMap";
        String Table_2_path = tempdirectory+File.separator+"dep"+File.separator+"JoinMap";
        File table1 = new File(Table_1_path);
        File table2 = new File(Table_2_path);
        String[] Table_1_list = table1.list();
        String[] Table_2_list = table2.list();
        ArrayList<String> meta_table1= new ArrayList<>();
        ArrayList<String> meta_table2= new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(Table_1_path+File.separator+"meta/meta.txt"))) {
            String x = br.readLine();
            if(x!=null){
                String[] xx = x.split(",");
                for(String i : xx){
                    meta_table1.add(i);
                }
            }

        }

        try (BufferedReader br = new BufferedReader(new FileReader(Table_2_path+File.separator+"meta/meta.txt"))) {
            String x = br.readLine();
            if(x!=null){
                String[] xx = x.split(",");
                for(String i : xx){
                    meta_table2.add(i);
                }
            }

        }

        for(String name1 : Table_1_list) {

            String absolutePath1 = Table_1_path + File.separator + name1;
            if(!(new File(absolutePath1).isDirectory())){
            try (BufferedReader br = new BufferedReader(new FileReader(absolutePath1))) {

                String line;

                while ((line = br.readLine()) != null) {

                    String[] country1 = line.split(tableSpilt1);


                    //String[] KeyAndVal = line.split("/");
                    //  String[] Keys = KeyAndVal[0].split(",");

                    int T_1_on = meta_table1.indexOf("dep_id");
                    int T_2_on = meta_table2.indexOf("id");

                    if (!(country1[T_1_on].matches("null") || country1[T_1_on].matches("NULL"))) {
                        //int dep_id = Integer.parseInt(Keys[1]);
                        for (String name2 : Table_2_list) {
                            String absolutePath2 = Table_2_path + File.separator + name2;

                            if (!(new File(absolutePath2).isDirectory())) {

                                try (BufferedReader depbr = new BufferedReader(new FileReader(absolutePath2))) {
                                    String dep_line;

                                    while ((dep_line = depbr.readLine()) != null) {
                                        String[] country2 = dep_line.split(tableSpilt2);

                                        // on Condion
                                        if (country1[T_1_on].equals(country2[T_2_on])) {
                                            String output = "";

                                            for (int i = 1; i < country1.length; i++) {
                                                output += country1[i] + ",";
                                            }

                                            for (int i = 0; i < country2.length; i++) {
                                                output += country2[i] + ",";
                                            }

                                            output = output.substring(0, output.length() - 1);

                                            output += System.lineSeparator();


                                            File out = new File(outPath);
                                            if (!out.exists()) {
                                                out.mkdir();
                                            }
                                            String joinResult = outPath + File.separator + "emp_dep.txt";

                                            try (BufferedWriter fileOutputStream = new BufferedWriter(new FileWriter(joinResult, true))) {
                                                fileOutputStream.write(output);
                                            }


                                        }


                                    }


                                }
                            }
                        }
                    }

                }

            }
        }
        }

        return outPath;
    }

    public static void mapper1(String filename){

        String maperPath = tempdirectory+File.separator+"emp_dep"+File.separator+"map1";

        File stockDir1 = new File(maperPath);
        if(!stockDir1.exists()){stockDir1.mkdir();}

        try (BufferedReader br = new BufferedReader(new FileReader(tableLocation1+File.separator+filename))) {
            String line =  br.readLine();
            while ((line ) != null) {

                String[] country = line.split(tableSpilt1);

                String FileName = filename + "1.txt";
                String absolutePath = maperPath + File.separator + FileName;

                try(FileOutputStream fileOutputStream = new FileOutputStream(absolutePath,true)) {

                    String fileContent = country[1]  + "/" + country[0];

                    fileOutputStream.write(fileContent.getBytes());

                    line =  br.readLine();
                    if(line != null){
                        fileOutputStream.write(lineSeparator.getBytes());
                    }



                    fileOutputStream.flush();

                    fileOutputStream.close();

                } catch (FileNotFoundException e) {

                } catch (IOException e) {

                }


            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public static  void shuffle1() throws IOException {
        String maperPath = tempdirectory+File.separator+"map1";
        String shuffPath = tempdirectory+File.separator+"shuff1";

        File stockDir1 = new File(shuffPath);
        if(!stockDir1.exists()){stockDir1.mkdir();}

        Map<ArrayList<Integer>,ArrayList<Integer>> mmm = new HashMap<>();

        File stockDir = new File(maperPath);
        String[] list = stockDir.list();
        for(String name : list){
            String absolutePath = maperPath + File.separator + name;
            try(BufferedReader br = new BufferedReader(new FileReader(absolutePath))) {

                String line;

                while ((line = br.readLine()) != null){
                    String[] KeyAndVal = line.split("/");
                    String[] Keys = KeyAndVal[0].split(",");
                    ArrayList<Integer> ALKeys = new ArrayList<>();
                    for(String k :Keys){
                        ALKeys.add(Integer.parseInt(k));
                    }


                    if(mmm.containsKey(ALKeys)){
                        mmm.get(ALKeys).add(Integer.parseInt(KeyAndVal[1]));

                    }else {

                        ArrayList<Integer> dd = new ArrayList<>();
                        dd.add(Integer.parseInt(KeyAndVal[1]));
                        mmm.put(ALKeys,dd);
                    }
                }

                br.close();

            } catch (FileNotFoundException e) {
                // exception handling
            } catch (IOException e) {
                // exception handling
            }



        }

        String shuffl = shuffPath + File.separator +"shufflResult1.txt";

        try(BufferedWriter fileOutputStream = new BufferedWriter(new FileWriter(shuffl,true))) {


            for (Map.Entry<ArrayList<Integer>, ArrayList<Integer>> entry : mmm.entrySet()) {
                System.out.println(entry.getKey()+" : "+entry.getValue());
                String output = "";

                for(int key : entry.getKey()){
                    output += key + ",";
                }
                output +="/";
                output = output.replaceFirst(",/","/");

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

    public static String reducer1(MyFunction obj1){
        String shuffPath = tempdirectory+File.separator+"shuff1";;
        String redusPath = tempdirectory+File.separator+"red1";
        String FileName = "redu1.txt";
        File stockDir1 = new File(redusPath);
        if(!stockDir1.exists()){stockDir1.mkdir();}

        File stockDir = new File(shuffPath);
        String[] list = stockDir.list();
        for(String name : list){

            String shuffl = shuffPath + File.separator +name;
            try (BufferedReader br = new BufferedReader(new FileReader(shuffl))) {

                String line;

                while ((line = br.readLine()) != null){

                    String[] KeyAndVal = line.split("/");

                    String[] vlas = KeyAndVal[1].split(",");
                    ArrayList<Integer> values = new ArrayList<>();

                    for(String s : vlas){
                        values.add(Integer.parseInt(s));
                    }

                    int opResult1 = obj1.operation(values);

                    String reduce = redusPath + File.separator +FileName;
                    try(BufferedWriter fileOutputStream = new BufferedWriter(new FileWriter(reduce,true))) {
                        fileOutputStream.write(KeyAndVal[0] + "/" + opResult1+ System.lineSeparator());
                        fileOutputStream.close();
                    }

                }


            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }


        }
        return FileName;


    }


    public static void delete(File file) throws IOException{

        if(file.isDirectory()){

            //directory is empty, then delete it
            if(file.list().length==0){

                file.delete();

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

                }
            }

        }else{
            //if file, then delete it
            file.delete();
        }
    }

    public static void initFIleDir(){
        File stockDir = new File(tempdirectory);

        try {

            delete(stockDir);

            stockDir.mkdir();
        } catch (SecurityException Se) {

            System.out.println("Error while creating directory in Java:" + Se);
        }catch (IOException e) {

            e.printStackTrace();
        }

    }

}
