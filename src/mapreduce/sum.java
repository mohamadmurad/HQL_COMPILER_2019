package mapreduce;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class sum {

    public interface MyFunction {
        int operation(ArrayList<Integer> c);
    }

    String sql = "Select id ,date, sum(temp) from temp group by id,date";
    static String tempdirectory = "temp";
    static String lineSeparator = System.getProperty("line.separator");

    static String tableLocation = "temperature";
    static String tableSpilt = ",";

    public static void main(String[] args) {

        initFIleDir();
        File tableDir = new File(tableLocation);
        if (tableDir.exists() && tableDir.isDirectory()) {

            try {
                map_reduce(tableDir.list());
            } catch (IOException e) {
                e.printStackTrace();
            }


        }
    }


    public static void initFIleDir() {
        File stockDir = new File(tempdirectory);

        try {

            delete(stockDir);

            stockDir.mkdir();
        } catch (SecurityException Se) {

            System.out.println("Error while creating directory in Java:" + Se);
        } catch (IOException e) {

            e.printStackTrace();
        }

    }


    public static void map_reduce(String[] FilesName) throws IOException {


        File stockDir1 = new File(tempdirectory + File.separator + "temperature");
        if (!stockDir1.exists()) {
            stockDir1.mkdir();
        }

        for (String name : FilesName) {
            mapper1(name);
        }

        shuffle1();

        String red1 = reducer1(new MyFunction() {
            @Override
            public int operation(ArrayList<Integer> c) {
                int sum = 0;
                for (int i = 0; i < c.size(); i++) {

                    sum += c.get(i);
                }
                return sum;
            }
        });


        // String re1 = concatReducer(red1,red2,tempdirectory+File.separator+"temperature"+File.separator+"red1",tempdirectory+File.separator+"temperature"+File.separator+"red2");

        //  System.out.println(re1);

        // String absolutePath = tempdirectory + File.separator +re1;
       /* try(BufferedReader br = new BufferedReader(new FileReader(absolutePath))) {

            String line;

            while ((line = br.readLine()) != null) {
                String[] r = line.split("/");
                String[] k = r[0].split(",");

                for(String kk:k){
                    System.out.print(kk + "  ");
                }

                System.out.println( r[1].split(","));

            }
        }

*/
    }


    public static void mapper1(String filename) {

        String maperPath = tempdirectory + File.separator + "temperature" + File.separator + "map1";

        File stockDir1 = new File(maperPath);
        if (!stockDir1.exists()) {
            stockDir1.mkdir();
        }

        try (BufferedReader br = new BufferedReader(new FileReader(tableLocation + File.separator + filename))) {
            String line = br.readLine();
            while ((line) != null) {

                String[] country = line.split(tableSpilt);

                String FileName = filename + "1.txt";
                String absolutePath = maperPath + File.separator + FileName;

                try (FileOutputStream fileOutputStream = new FileOutputStream(absolutePath, true)) {

                    String fileContent = country[0] + "," + country[1] + "/" + country[2];

                    fileOutputStream.write(fileContent.getBytes());

                    line = br.readLine();
                    if (line != null) {
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

    public static void shuffle1() throws IOException {
        String maperPath = tempdirectory + File.separator + "temperature" + File.separator + "map1";
        String shuffPath = tempdirectory + File.separator + "temperature" + File.separator + "shuff1";

        File stockDir1 = new File(shuffPath);
        if (!stockDir1.exists()) {
            stockDir1.mkdir();
        }

        Map<ArrayList<Integer>, ArrayList<Integer>> mmm = new HashMap<>();

        File stockDir = new File(maperPath);
        String[] list = stockDir.list();
        for (String name : list) {
            String absolutePath = maperPath + File.separator + name;
            try (BufferedReader br = new BufferedReader(new FileReader(absolutePath))) {

                String line;

                while ((line = br.readLine()) != null) {
                    String[] KeyAndVal = line.split("/");
                    String[] Keys = KeyAndVal[0].split(",");
                    ArrayList<Integer> ALKeys = new ArrayList<>();
                    for (String k : Keys) {
                        ALKeys.add(Integer.parseInt(k));
                    }


                    if (mmm.containsKey(ALKeys)) {
                        mmm.get(ALKeys).add(Integer.parseInt(KeyAndVal[1]));

                    } else {

                        ArrayList<Integer> dd = new ArrayList<>();
                        dd.add(Integer.parseInt(KeyAndVal[1]));
                        mmm.put(ALKeys, dd);
                    }
                }

                br.close();

            } catch (FileNotFoundException e) {
                // exception handling
            } catch (IOException e) {
                // exception handling
            }


        }

        String shuffl = shuffPath + File.separator + "shufflResult1.txt";

        try (BufferedWriter fileOutputStream = new BufferedWriter(new FileWriter(shuffl, true))) {


            for (Map.Entry<ArrayList<Integer>, ArrayList<Integer>> entry : mmm.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
                String output = "";

                for (int key : entry.getKey()) {
                    output += key + ",";
                }
                output += "/";
                output = output.replaceFirst(",/", "/");

                for (int val : entry.getValue()) {
                    output += "," + val;
                }
                output += System.lineSeparator();
                output = output.replaceFirst("/,", "/");
                fileOutputStream.write(output);

            }

            fileOutputStream.close();

        } catch (FileNotFoundException e) {
            // exception handling
        } catch (IOException e) {
            // exception handling
        }

    }


    public static String reducer1(MyFunction obj1) {
        String shuffPath = tempdirectory + File.separator + "temperature" + File.separator + "shuff1";
        String redusPath = tempdirectory + File.separator + "temperature" + File.separator + "red1";
        String FileName = "redu1.txt";
        File stockDir1 = new File(redusPath);
        if (!stockDir1.exists()) {
            stockDir1.mkdir();
        }

        File stockDir = new File(shuffPath);
        String[] list = stockDir.list();
        for (String name : list) {

            String shuffl = shuffPath + File.separator + name;
            try (BufferedReader br = new BufferedReader(new FileReader(shuffl))) {

                String line;

                while ((line = br.readLine()) != null) {

                    String[] KeyAndVal = line.split("/");

                    String[] vlas = KeyAndVal[1].split(",");
                    ArrayList<Integer> values = new ArrayList<>();

                    for (String s : vlas) {
                        values.add(Integer.parseInt(s));
                    }

                    int opResult1 = obj1.operation(values);

                    String reduce = redusPath + File.separator + FileName;
                    try (BufferedWriter fileOutputStream = new BufferedWriter(new FileWriter(reduce, true))) {
                        fileOutputStream.write(KeyAndVal[0] + "/" + opResult1 + System.lineSeparator());
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

    public static void delete(File file)
            throws IOException {

        if (file.isDirectory()) {

            //directory is empty, then delete it
            if (file.list().length == 0) {

                file.delete();


            } else {

                //list all the directory contents
                String files[] = file.list();

                for (String temp : files) {
                    //construct the file structure
                    File fileDelete = new File(file, temp);

                    //recursive delete
                    delete(fileDelete);
                }

                //check the directory again, if empty then delete it
                if (file.list().length == 0) {
                    file.delete();

                }
            }

        } else {
            //if file, then delete it
            file.delete();
        }
    }

}
