package mapreduce;


import java.io.*;
import java.util.*;


public class partition {

    public interface MyFunction {
        String operation(ArrayList<Integer> c);
    }

    String sql = "Select name,weight_class,victories , MAX(victories) OVER (PARTITION BY weight_class) FROM exam";

    static String lineSeparator = System.getProperty("line.separator");
    static String tempdirectory = "temp";

    static String tableLocation1 = "exam";

    static String tableSpilt1  = ",";


    public static void main(String[] args) {
        initFIleDir();
        File tableDir1 = new File(tableLocation1);



        if(tableDir1.exists() && tableDir1.isDirectory()){

            try {

                map_reduce();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }

    public static void map1(String[] line,String fileName){
        String maperPath = tempdirectory+File.separator+"map1";
        File stockDir1 = new File(maperPath);
        if(!stockDir1.exists()){stockDir1.mkdir();}
        String FileName = fileName + ".txt";
        String outPath = maperPath + File.separator + FileName;
        try(FileOutputStream fileOutputStream = new FileOutputStream(outPath,true)) {

            for(int i=0;i<line.length;i++) {
                line[i] = line[i].replace("\"", "");
            }
            String fileContent = line[0]+","+line[1]+","+line[2] +"/"+line[2];

            fileOutputStream.write(fileContent.getBytes());
            fileOutputStream.write(lineSeparator.getBytes());


            fileOutputStream.flush();

            fileOutputStream.close();

        } catch (FileNotFoundException e) {

        } catch (IOException e) {

        }


    }

    public static void map2(String[] line,String fileName){
        String maperPath = tempdirectory+File.separator+"map2";
        File stockDir1 = new File(maperPath);
        if(!stockDir1.exists()){stockDir1.mkdir();}
        String FileName = fileName + ".txt";
        String outPath = maperPath + File.separator + FileName;
        try(FileOutputStream fileOutputStream = new FileOutputStream(outPath,true)) {

            for(int i=0;i<line.length;i++) {
                line[i] = line[i].replace("\"", "");
            }
            String fileContent = line[0]+","+line[1] +"/"+line[1];

            fileOutputStream.write(fileContent.getBytes());
            fileOutputStream.write(lineSeparator.getBytes());


            fileOutputStream.flush();

            fileOutputStream.close();

        } catch (FileNotFoundException e) {

        } catch (IOException e) {

        }


    }

    public static void map_reduce() throws IOException {

        read_files();

        shuffle11(1);
        String red1 = reducer(1,1,new MyFunction() {
            @Override
            public String operation(ArrayList<Integer> c) {
                int sum = 0;

                for(int i=0;i<c.size();i++){

                    sum+=c.get(i);
                }

                return String.valueOf(sum);
            }
        });
        /*
        reducer(1,3,new MyFunction() {
            @Override
            public String operation(ArrayList<Integer> c) {
                String output="";
                //calculate count
                output+=c.size() + " \t\t ";
                //calculate mean(avg)
                double sum = 0.0;
                for(double num : c){
                    sum+=num;
                }
                double avg = sum/c.size();
                avg = Math.floor(avg);
                output+=avg + " \t\t ";
                //calculate median
                Collections.sort(c);
                double median;
                if (c.size() % 2 == 0)
                { median = (double)(c.get(c.size()/2) + c.get(c.size()/2 - 1))/2;}
                else
                { median = (double)c.get(c.size()/2);}
                output+=median + " \t\t ";
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
                output+="[";
                for (final Map.Entry<Integer, Integer> tuple : countMap.entrySet()) {
                    if (tuple.getValue() == max) {
                        output+=tuple.getKey()+ " \t\t ";
                    }
                }
                output+="]"+ " \t\t ";

                //max value
                int maxVal = c.get(0);
                for(int i=1;i < c.size();i++){
                    if(c.get(i) > maxVal){
                        maxVal = c.get(i);
                    }
                }

                output+=maxVal+ " \t\t ";
                //min value
                int minValue = c.get(0);
                for(int i=1;i<c.size();i++){
                    if(c.get(i) < minValue){
                        minValue = c.get(i);
                    }
                }
                output+=minValue+ " \t\t ";
                //calculate std
                double summ = 0.0, standardDeviation = 0.0;
                int length = c.size();

                for(double num : c) {
                    summ += num;
                }

                double mean = summ/length;

                for(double num: c) {
                    standardDeviation += Math.pow(num - mean, 2);
                }
                output+=Math.sqrt(standardDeviation/length)+ " \t\t ";


                return output;
            }
        });*/



       /* shuffle11(2);
        String red2 = reducer(2,2,new MyFunction() {
            @Override
            public String operation(ArrayList<Integer> c) {
                int sum = 0;
                for(int i=0;i<c.size();i++){

                    sum+=c.get(i);
                }
                return String.valueOf(sum/c.size());
            }
        });*/





        sum_all_red(1);
        partition();
        //sum_all_red(2);
        //sum_all_red(3);

       /* File n = new File(tempdirectory+File.separator+"All_red");
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
        }*/


    }

    private static void printResult(String ResultFile) {
        String colName = "";
        //colName+=""
        colName += "id \t\t t_date \t\t avg(temp) \t\t sum(temp) \t\t\n";
        System.out.println(colName);
        //String absolutePath = ResultFile;
        try(BufferedReader br = new BufferedReader(new FileReader(ResultFile))) {

            String line;

            while ((line = br.readLine()) != null) {

                String[] r = line.split("/");
                String[] k = r[0].split(",");

                for(String kk:k){
                    System.out.print(kk + " \t\t ");
                }

                String[] values = r[1].split(",");

                for(String kk:values){
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


    public static void read_files() {

        String Table_1_path = tableLocation1;
        File table1 = new File(Table_1_path);
        String[] Table_1_list = table1.list();

        for(String name1 : Table_1_list) {
            String absolutePath1 = Table_1_path + File.separator + name1;
            try (BufferedReader br = new BufferedReader(new FileReader(absolutePath1))) {
                String line;

                while ((line = br.readLine()) != null) {

                    String[] country1 = line.split(tableSpilt1);

                    // where
                    if ((true)){
                        map1(country1,name1);
                        //map2(country1,name1);
                    }

                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    /* public static  void shuffle(int map) throws IOException {
         String maperPath = tempdirectory+File.separator+"map"+map;
         String shuffPath = tempdirectory+File.separator+"shuff"+map;

         File stockDir1 = new File(shuffPath);
         if(!stockDir1.exists()){stockDir1.mkdir();}

         Map<ArrayList<Object>,ArrayList<Object>> mmm = new HashMap<>();

         File stockDir = new File(maperPath);
         String[] list = stockDir.list();
         for(String name : list){
             String absolutePath = maperPath + File.separator + name;
             try(BufferedReader br = new BufferedReader(new FileReader(absolutePath))) {

                 String line;

                 while ((line = br.readLine()) != null){
                     String[] KeyAndVal = line.split("/");
                     String[] Keys = KeyAndVal[0].split(",");
                     ArrayList<Object> ALKeys = new ArrayList<>();
                     for(String k :Keys){
                         if(k.matches("NULL") || k.matches("null")){
                             ALKeys.add(k);
                         }else{
                             ALKeys.add(Integer.parseInt(k));
                         }
                     }


                     if(mmm.containsKey(ALKeys)){
                         mmm.get(ALKeys).add(KeyAndVal[1]);

                     }else {

                         ArrayList<Object> dd = new ArrayList<>();
                         dd.add(KeyAndVal[1]);
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


             for (Map.Entry<ArrayList<Object>, ArrayList<Object>> entry : mmm.entrySet()) {
                 System.out.println(entry.getKey()+" : "+entry.getValue());
                 String output = "";

                 for(Object key : entry.getKey()){
                     output += key + ",";
                 }
                 output +="/";
                 output = output.replaceFirst(",/","/");

                 for(Object val :entry.getValue()){
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

     }*/
    public static  void shuffle11(int map) throws IOException {
        //   RandomAccessFile raf = new RandomAccessFile("c:/test.txt", "rw");

        String maperPath = tempdirectory+File.separator+"map"+map;
        String shuffPath = tempdirectory+File.separator+"shuff"+map;

        File stockDir1 = new File(shuffPath);
        if(!stockDir1.exists()){stockDir1.mkdir();}

        Map<String,String> mmm = new HashMap<>();

        File stockDir = new File(maperPath);
        String[] list = stockDir.list();
        int fNum=0;
        for(String name : list){
            String absolutePath = maperPath + File.separator + name;
            try(BufferedReader br = new BufferedReader(new FileReader(absolutePath))) {

                String line;

                while ((line = br.readLine()) != null){
                    String[] KeyAndVal = line.split("/");
                    String[] keys = KeyAndVal[0].split(",");
                    String shuffname = mmm.get(KeyAndVal[0]);
                    if(shuffname == null){
                        shuffname = ++fNum+"_"+KeyAndVal[0];
                        mmm.put(KeyAndVal[0],shuffname);
                    }
                    String ou_file = shuffPath+File.separator+shuffname+".txt";
                    File n = new File(ou_file);
                    if(n.exists()){
                        try(RandomAccessFile fileOutputStream = new RandomAccessFile(ou_file,"rw")){


                            String l = fileOutputStream.readLine();

                            String[] KVal = l.split("/");

                            //String[] val = l.split("/")[1].split(",");
                            if(KVal.length == 2){
                                String[] val = KVal[1].split(",");

                                boolean dis = false;
                                // Distnict function
                               /* for(String d:val){
                                    if(d.equals(KeyAndVal[1])){
                                        dis = true;
                                        break;
                                    }

                                }*/

                                if(!dis){
                                    fileOutputStream.write((","+KeyAndVal[1]).getBytes());
                                }


                            }else{
                                fileOutputStream.write((","+KeyAndVal[1]).getBytes());
                            }




                        }


                       /* try(BufferedWriter fileOutputStream = new BufferedWriter(new FileWriter(ou_file,true))) {
                            if(KeyAndVal.length == 2){
                                fileOutputStream.write(","+KeyAndVal[1]);
                            }else{
                                fileOutputStream.write(",");
                            }

                        }*/
                    }else{
                        try(BufferedWriter fileOutputStream = new BufferedWriter(new FileWriter(ou_file,true))) {
                            if(KeyAndVal.length == 2){
                                fileOutputStream.write(KeyAndVal[0] + "/" + KeyAndVal[1]);
                            }else{
                                fileOutputStream.write(KeyAndVal[0] + "/" );
                            }

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


        shufSort(shuffPath);

    }

    private static void shufSort(String shuffPath) {
        File stockDir = new File(shuffPath);
        String[] list = stockDir.list();

        int numOfLine = 0;
        int MAXLINES = 5;
        List<String> temp = new ArrayList<>();
        int i=0;
        String Line = "";
        String ou_file = null;
        for(String name :list){
            String absolutePath = shuffPath + File.separator + name;
            try(BufferedReader br = new BufferedReader(new FileReader(absolutePath))) {


                ou_file = shuffPath + File.separator +(++i) +".txt" ;
                while ((numOfLine<MAXLINES) && (Line = br.readLine()) !=null){

                    //while ((Line = br.readLine()) != null){

                    temp.add(Line);

                    numOfLine++;

                    //  }




                }

                if((numOfLine>=MAXLINES)){

                    numOfLine =0;
                    ou_file = shuffPath + File.separator +(++i) +".txt" ;
                    try(BufferedWriter fileOutputStream = new BufferedWriter(new FileWriter(ou_file,true))) {
                        for(String r : temp) {

                            fileOutputStream.write(r);
                            fileOutputStream.newLine();
                        }
                    }

                    temp.clear();

                }




            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            new File(absolutePath).delete();
        }

        if((temp.size()!=0)){

            numOfLine =0;

            try(BufferedWriter fileOutputStream = new BufferedWriter(new FileWriter(ou_file,true))) {
                for(String r : temp) {

                    fileOutputStream.write(r);
                    fileOutputStream.newLine();
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            temp.clear();

        }

    }

    public static String reducer(int shuff,int red,MyFunction obj1){

        String shuffPath = tempdirectory+File.separator+"shuff"+shuff;;
        String redusPath = tempdirectory+File.separator+"red"+red;
        // String FileName = "redu"+numReduce+".txt";

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

                    String opResult1 = obj1.operation(values);

                    String reduce = redusPath + File.separator +name;
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
        return "";


    }

    public static void partition(){
        String maperPath = tempdirectory+File.separator+"map1";
        String ALl_red_path = tempdirectory+File.separator+"All_red";
        String out = tempdirectory+File.separator;
        File stockDir1 = new File(out);
        if(!stockDir1.exists()){stockDir1.mkdir();}
        File stockDir_map = new File(maperPath);
        String[] list_map = stockDir_map.list();
        File stockDir = new File(ALl_red_path);
        String[] list = stockDir.list();
        for(String name : list){
            String all = ALl_red_path + File.separator +name;
            try (BufferedReader br = new BufferedReader(new FileReader(all))) {

                String line;

                while ((line = br.readLine()) != null){
                    String[] key_val = line.split("/");
                    String[] keys = key_val[0].split(",");
                    for(String name1 : list_map){
                        String map = maperPath + File.separator +name1;
                        try (BufferedReader br1 = new BufferedReader(new FileReader(map))) {

                            String line1;

                            while ((line1 = br1.readLine()) != null){
                                String[] key_val1 = line1.split("/");
                                String[] keys1 = key_val1[0].split(",");
                                if(key_val[0].equals(key_val1[0])){
                                    String output = key_val1[0] + "/" + key_val[1];
                                    try(BufferedWriter fileOutputStream = new BufferedWriter(new FileWriter(out+File.separator+"res.txt",true))) {
                                        fileOutputStream.write(output+ System.lineSeparator());
                                        fileOutputStream.close();
                                    }
                                }
                            }

                        }

                    }

                }

            }
            catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

    public static void sum_all_red(int red){

        String redusPath = tempdirectory+File.separator+"red"+red;
        String ALl_red_path = tempdirectory+File.separator+"All_red";
        String all_file = ALl_red_path + File.separator+red+".txt";
        // String FileName = "redu"+numReduce+".txt";

        File stockDir1 = new File(ALl_red_path);
        if(!stockDir1.exists()){stockDir1.mkdir();}


        File stockDir = new File(redusPath);
        String[] list = stockDir.list();
        for(String name : list){

            String all = redusPath + File.separator +name;
            try (BufferedReader br = new BufferedReader(new FileReader(all))) {

                String line;

                while ((line = br.readLine()) != null){

                    try(BufferedWriter fileOutputStream = new BufferedWriter(new FileWriter(all_file,true))) {
                        fileOutputStream.write(line+ System.lineSeparator());
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

    public static String concatReducer(String redu1, String redu2,String path1,String path2){

        String reduce = tempdirectory + File.separator +redu1+redu2+"res.txt";
        //String out_File = tempdirectory+File.separator+"res.txt";
        String shuffl = path1 + File.separator +redu1;

        //File stockDir = new File(reduce);
        //     String[] list = stockDir.list();

        try (BufferedReader br = new BufferedReader(new FileReader(shuffl))) {

            String line;

            while ((line = br.readLine()) != null){

                String[] KeyAndVal = line.split("/");

                String shuff2 = path2 + File.separator +redu2;
                try (BufferedReader br2 = new BufferedReader(new FileReader(shuff2))) {
                    String line2;
                    while ((line2 = br2.readLine()) != null) {

                        String[] KeyAndVal2 = line2.split("/");
                        if(KeyAndVal[0].equals(KeyAndVal2[0])){
                            String output = KeyAndVal[0] + "/" + KeyAndVal[1] + "," +KeyAndVal2[1]+lineSeparator;
                            try(BufferedWriter fileOutputStream = new BufferedWriter(new FileWriter(reduce,true))) {
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

        return redu1+redu2+"res.txt";
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
