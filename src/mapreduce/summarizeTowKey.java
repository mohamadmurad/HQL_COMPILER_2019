package mapreduce;

import java.io.*;
import java.util.*;

public class summarizeTowKey {

    public interface MyFunction {
        String operation(ArrayList<Integer> c);
    }

    String sql = "Select id,date , SUMMARIZE(temp) from temp group by id,date";
    static String tempdirectory = "temp";
    static String lineSeparator = System.getProperty("line.separator");

    static String tableLocation = "temperature";
    static String tableSpilt = ",";

    //static ArrayList<mymap> ss = new ArrayList<>();

    public static void main(String[] args) {


        initFIleDir();

/*
        ArrayList<String> FilesName = new ArrayList<>();
        FilesName.add("temperature.csv");
        FilesName.add("temperature2.csv");*/
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
        // sum


        for (String name : FilesName) {
            mapper(name);
        }

        shuffle();
        reducer(new MyFunction() {
            @Override
            public String operation(ArrayList<Integer> c) {
                String output = "";
                //calculate count
                output += c.size() + " \t\t ";
                //calculate mean(avg)
                double sum = 0.0;
                for (double num : c) {
                    sum += num;
                }
                double avg = sum / c.size();
                avg = Math.floor(avg);
                output += avg + " \t\t ";
                //calculate median
                Collections.sort(c);
                double median;
                if (c.size() % 2 == 0) {
                    median = (double) (c.get(c.size() / 2) + c.get(c.size() / 2 - 1)) / 2;
                } else {
                    median = (double) c.get(c.size() / 2);
                }
                output += median + " \t\t ";
                //calculate mode
                final Map<Integer, Integer> countMap = new HashMap<Integer, Integer>();

                int max = -1;

                for (final int n : c) {
                    int count = 0;

                    if (countMap.containsKey(n)) {
                        count = countMap.get(n) + 1;
                    } else {
                        count = 1;
                    }

                    countMap.put(n, count);

                    if (count > max) {
                        max = count;
                    }
                }
                output += "[";
                for (final Map.Entry<Integer, Integer> tuple : countMap.entrySet()) {
                    if (tuple.getValue() == max) {
                        output += tuple.getKey() + " \t\t ";
                    }
                }
                output += "]" + " \t\t ";

                //max value
                int maxVal = c.get(0);
                for (int i = 1; i < c.size(); i++) {
                    if (c.get(i) > maxVal) {
                        maxVal = c.get(i);
                    }
                }

                output += maxVal + " \t\t ";
                //min value
                int minValue = c.get(0);
                for (int i = 1; i < c.size(); i++) {
                    if (c.get(i) < minValue) {
                        minValue = c.get(i);
                    }
                }
                output += minValue + " \t\t ";
                //calculate std
                double summ = 0.0, standardDeviation = 0.0;
                int length = c.size();

                for (double num : c) {
                    summ += num;
                }

                double mean = summ / length;

                for (double num : c) {
                    standardDeviation += Math.pow(num - mean, 2);
                }
                output += Math.sqrt(standardDeviation / length) + " \t\t ";


                return output;
            }
        });


    }


    public static void mapper(String filename) {

        try (BufferedReader br = new BufferedReader(new FileReader(tableLocation + File.separator + filename))) {
            String line = br.readLine();
            while ((line) != null) {

                String[] country = line.split(tableSpilt);

                String FileName = filename + ".txt";
                String absolutePath = tempdirectory + File.separator + FileName;

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

    public static void shuffle() throws IOException {

        Map<ArrayList<Integer>, ArrayList<Integer>> mmm = new HashMap<>();

        File stockDir = new File(tempdirectory);
        String[] list = stockDir.list();
        for (String name : list) {
            String absolutePath = tempdirectory + File.separator + name;
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

        String shuffl = tempdirectory + File.separator + "shufflResult.txt";

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


    public static void reducer(MyFunction obj) {


        ArrayList<mymap> result = new ArrayList<>();
        String shuffl = tempdirectory + File.separator + "shufflResult.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(shuffl))) {

            String line;
            try (BufferedWriter fileOutputStream = new BufferedWriter(new FileWriter(tempdirectory + File.separator + "redu.txt", true))) {
                fileOutputStream.write("\t\t\t\t" + "Count" + "\t\t" + "Mean" + "\t\t" + "Median" + "\t\t\t" + "Mode" + "\t\t"
                        + "Max" + "\t\t\t" + "Min" + "\t\t\t" + "STD" + System.lineSeparator());

            }

            while ((line = br.readLine()) != null) {

                String[] KeyAndVal = line.split("/");

                String[] vlas = KeyAndVal[1].split(",");
                ArrayList<Integer> values = new ArrayList<>();

                for (String s : vlas) {
                    values.add(Integer.parseInt(s));
                }

                String opResult = obj.operation(values);
                String reduce = tempdirectory + File.separator + "redu.txt";
                try (BufferedWriter fileOutputStream = new BufferedWriter(new FileWriter(reduce, true))) {

                    fileOutputStream.write(KeyAndVal[0] + "/" + opResult);

                  /*  for(int i=0;i<opResult.size();i++){
                        if(opResult.get(i) instanceof ArrayList){
                            String output_mode = "";
                            fileOutputStream.write("\t[");
                            for(int k=0;k<((ArrayList) opResult.get(i)).size();k++){
                                output_mode+= ((ArrayList) opResult.get(i)).get(k) + ",";
                            }
                            output_mode+="]\t\t";
                            output_mode = output_mode.replaceFirst(",]","]");
                            fileOutputStream.write(output_mode);

                        }else {
                            fileOutputStream.write("     " + opResult.get(i) + "     ");
                        }

                    }*/
                    fileOutputStream.write(System.lineSeparator());

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
