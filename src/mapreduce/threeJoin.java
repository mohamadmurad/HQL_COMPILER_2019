package mapreduce;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class threeJoin {

    public interface MyFunction {
        String operation(ArrayList<Integer> c);
    }

    String sql = "select s_name, score, status, address_city, email_id,\n" +
            "accomplishments from student s inner join marks m on\n" +
            "s.s_id = m.s_id inner join details d on \n" +
            "d.school_id = m.school_id;";

    static String lineSeparator = System.getProperty("line.separator");
    static String tempdirectory = "temp";

    static String tableLocation1 = "student";
    static String tableLocation2 = "marks";
    static String tableLocation3 = "details";
    static String tableSpilt1 = ",";
    static String tableSpilt2 = ",";
    static String tableSpilt3 = ",";


    public static void main(String[] args) {
        initFIleDir();
        File tableDir1 = new File(tableLocation1);
        File tableDir2 = new File(tableLocation2);
        File tableDir3 = new File(tableLocation3);


        if (tableDir1.exists() && tableDir1.isDirectory() && tableDir2.exists() && tableDir2.isDirectory()) {

            try {

                map_reduce();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }

    public static void map1(String[] line, String fileName) {

        String maperPath = tempdirectory + File.separator + "map1";
        File stockDir1 = new File(maperPath);
        if (!stockDir1.exists()) {
            stockDir1.mkdir();
        }
        String FileName = fileName + ".txt";
        String outPath = maperPath + File.separator + FileName;
        try (FileOutputStream fileOutputStream = new FileOutputStream(outPath, true)) {

            for (int i = 0; i < line.length; i++) {
                //line[i] = line[i].replace("\"", "");
            }
            String fileContent = line[1] + "," + line[4] + "," + line[5] + "," + line[6] + "," + line[7] + "," + line[9];

            fileOutputStream.write(fileContent.getBytes());
            fileOutputStream.write(lineSeparator.getBytes());


            fileOutputStream.flush();

            fileOutputStream.close();

        } catch (FileNotFoundException e) {

        } catch (IOException e) {

        }


    }

    public static void map2(String[] line, String fileName) {
        String maperPath = tempdirectory + File.separator + "map2";
        File stockDir1 = new File(maperPath);
        if (!stockDir1.exists()) {
            stockDir1.mkdir();
        }
        String FileName = fileName + ".txt";
        String outPath = maperPath + File.separator + FileName;
        try (FileOutputStream fileOutputStream = new FileOutputStream(outPath, true)) {

            for (int i = 0; i < line.length; i++) {
                line[i] = line[i].replace("\"", "");
            }
            String fileContent = line[5] + "/" + line[4];

            fileOutputStream.write(fileContent.getBytes());
            fileOutputStream.write(lineSeparator.getBytes());


            fileOutputStream.flush();

            fileOutputStream.close();

        } catch (FileNotFoundException e) {

        } catch (IOException e) {

        }


    }


    public static void map_reduce() throws IOException {

        innerJoin1();


        shuffle(1);
        // shuffle(2);
/*
        String red1 = reducer(1,new MyFunction() {
            @Override
            public String operation(ArrayList<Integer> c) {
                int sum = 0;
                for(int i=0;i<c.size();i++){

                    sum+=c.get(i);
                }

                return String.valueOf(sum);
            }
        });
*/
/*
        String red2 = reducer(2,new MyFunction() {
            @Override
            public String operation(ArrayList<Integer> c) {
                int sum = 0;
                for(int i=0;i<c.size();i++){

                    sum+=c.get(i);
                }
                return String.valueOf(sum/c.size());
            }
        });
*/
/*
        sum_all_red(1);
        sum_all_red(2);

        File n = new File(tempdirectory+File.separator+"All_red");
        String[] list = n.list();
        String all =concatReducer(list[0],list[1],tempdirectory+File.separator+"All_red",tempdirectory+File.separator+"All_red");;
        for(int i=1;i<list.length;i++){
            if(i+1 <list.length){
                all = concatReducer(all,list[i+1],tempdirectory,tempdirectory+File.separator+"All_red");
            }

        }
        if(list.length==1){
            printResult(tempdirectory+File.separator+"All_red/1.txt");
        }else {
            printResult(tempdirectory+File.separator+all);
        }
*/

    }

    private static void printResult(String ResultFile) {
        String colName = "";
        //colName+=""
        colName += "id \t\t t_date \t\t avg(temp) \t\t sum(temp) \t\t\n";
        System.out.println(colName);
        //String absolutePath = ResultFile;
        try (BufferedReader br = new BufferedReader(new FileReader(ResultFile))) {

            String line;

            while ((line = br.readLine()) != null) {

                String[] r = line.split("/");
                String[] k = r[0].split(",");

                for (String kk : k) {
                    System.out.print(kk + " \t\t ");
                }

                String[] values = r[1].split(",");

                for (String kk : values) {
                    System.out.print(kk + " \t\t ");
                }
                System.out.println("\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void innerJoin1() {

        String Table_1_path = tableLocation1;
        String Table_2_path = tableLocation2;
        String Table_3_path = tableLocation3;
        File table1 = new File(Table_1_path);
        File table2 = new File(Table_2_path);
        File table3 = new File(Table_3_path);
        String[] Table_1_list = table1.list();
        String[] Table_2_list = table2.list();
        String[] Table_3_list = table3.list();


        for (String name1 : Table_1_list) {
            String absolutePath1 = Table_1_path + File.separator + name1;
            try (BufferedReader br = new BufferedReader(new FileReader(absolutePath1))) {
                String line;

                while ((line = br.readLine()) != null) {

                    String[] country1 = line.split(tableSpilt1);
                    //if (!(country1[2].matches("null") || country1[2].matches("NULL"))) {

                    // for table 2
                    for (String name2 : Table_2_list) {
                        String absolutePath2 = Table_2_path + File.separator + name2;
                        try (BufferedReader depbr = new BufferedReader(new FileReader(absolutePath2))) {
                            String dep_line;

                            while ((dep_line = depbr.readLine()) != null) {
                                String[] country2 = dep_line.split(tableSpilt2);

                                // on
                                if ((country1[0].equals(country2[1]))) {
/*
                                        String[] concat_Line =new String[country1.length+country2.length];
                                        System.arraycopy(country1, 0, concat_Line, 0, country1.length);
                                        System.arraycopy(country2, 0, concat_Line, country1.length, country2.length);
*/
                                    // for table 3 ..... join

                                    for (String name3 : Table_3_list) {
                                        String absolutePath3 = Table_3_path + File.separator + name3;
                                        try (BufferedReader depbr3 = new BufferedReader(new FileReader(absolutePath3))) {
                                            String dep_line3;

                                            while ((dep_line3 = depbr3.readLine()) != null) {
                                                String[] country3 = dep_line3.split(tableSpilt3);

                                                // on
                                                if ((country2[0].equals(country3[2]))) {

                                                    String[] concat_Line = new String[country1.length + country2.length + country3.length];
                                                   /*     System.arraycopy(country1, 0, concat_Line, 0, country1.length);
                                                        System.arraycopy(country2, 0, concat_Line, country1.length, country2.length);
                                                        System.arraycopy(country3, 0, concat_Line, country2.length, country3.length);
*/
                                                    int i = 0;
                                                    for (int j = 0; j < country1.length; j++) {
                                                        concat_Line[i++] = country1[j];
                                                    }
                                                    for (int j = 0; j < country2.length; j++) {
                                                        concat_Line[i++] = country2[j];
                                                    }
                                                    for (int j = 0; j < country3.length; j++) {
                                                        concat_Line[i++] = country3[j];
                                                    }
                                                    System.out.println(country2[2]);


                                                    map1(concat_Line, name1 + "_" + name2 + "_" + name3);
                                                    //  map2(concat_Line,name1+name2);


                                                }

                                            }
                                        }
                                    }

                                    //map1(concat_Line,name1+"_"+name2);
                                    //   map2(concat_Line,name1+name2);


                                }

                            }
                        }
                    }
                    //  }
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }


    public static void shuffle(int map) throws IOException {

        String maperPath = tempdirectory + File.separator + "map" + map;
        String shuffPath = tempdirectory + File.separator + "shuff" + map;

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

                    String shuffname = KeyAndVal[0];
                    String ou_file = shuffPath + File.separator + shuffname + ".txt";
                    File n = new File(ou_file);
                    if (n.exists()) {
                        // for distnict
                        try (BufferedWriter fileOutputStream = new BufferedWriter(new FileWriter(ou_file, true))) {
                            fileOutputStream.write("," + KeyAndVal[1]);
                        }
                    } else {
                        try (BufferedWriter fileOutputStream = new BufferedWriter(new FileWriter(ou_file, true))) {
                            fileOutputStream.write(KeyAndVal[0] + "/" + KeyAndVal[1]);
                        }
                    }

                }

                br.close();

            } catch (FileNotFoundException e) {
                // exception handling
            } catch (IOException e) {
                // exception handling
            }

        }

    }

    public static String reducer(int shuff, MyFunction obj1) {

        String shuffPath = tempdirectory + File.separator + "shuff" + shuff;
        ;
        String redusPath = tempdirectory + File.separator + "red" + shuff;
        // String FileName = "redu"+numReduce+".txt";

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

                    String opResult1 = obj1.operation(values);

                    String reduce = redusPath + File.separator + name;
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
        return "";


    }

    public static void sum_all_red(int red) {

        String redusPath = tempdirectory + File.separator + "red" + red;
        String ALl_red_path = tempdirectory + File.separator + "All_red";
        String all_file = ALl_red_path + File.separator + red + ".txt";
        // String FileName = "redu"+numReduce+".txt";

        File stockDir1 = new File(ALl_red_path);
        if (!stockDir1.exists()) {
            stockDir1.mkdir();
        }


        File stockDir = new File(redusPath);
        String[] list = stockDir.list();
        for (String name : list) {

            String all = redusPath + File.separator + name;
            try (BufferedReader br = new BufferedReader(new FileReader(all))) {

                String line;

                while ((line = br.readLine()) != null) {

                    try (BufferedWriter fileOutputStream = new BufferedWriter(new FileWriter(all_file, true))) {
                        fileOutputStream.write(line + System.lineSeparator());
                        fileOutputStream.close();
                    }

                }


            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }


        }

    }

    public static String concatReducer(String redu1, String redu2, String path1, String path2) {

        String reduce = tempdirectory + File.separator + redu1 + redu2 + "res.txt";
        //String out_File = tempdirectory+File.separator+"res.txt";
        String shuffl = path1 + File.separator + redu1;

        //File stockDir = new File(reduce);
        //     String[] list = stockDir.list();

        try (BufferedReader br = new BufferedReader(new FileReader(shuffl))) {

            String line;

            while ((line = br.readLine()) != null) {

                String[] KeyAndVal = line.split("/");

                String shuff2 = path2 + File.separator + redu2;
                try (BufferedReader br2 = new BufferedReader(new FileReader(shuff2))) {
                    String line2;
                    while ((line2 = br2.readLine()) != null) {

                        String[] KeyAndVal2 = line2.split("/");
                        if (KeyAndVal[0].equals(KeyAndVal2[0])) {
                            String output = KeyAndVal[0] + "/" + KeyAndVal[1] + "," + KeyAndVal2[1] + lineSeparator;
                            try (BufferedWriter fileOutputStream = new BufferedWriter(new FileWriter(reduce, true))) {
                                fileOutputStream.write(output);
                                fileOutputStream.close();
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

        return redu1 + redu2 + "res.txt";
    }


    public static void delete(File file) throws IOException {

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


}
