package CG;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Collections;
public class cg {

public interface MyFunction {
        String operation(ArrayList<Integer> c);
    }

static String tempdirectory = "temp";
static String lineSeparator = System.getProperty("line.separator");

public static void delete(File file)
            throws IOException{

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


    public static String concatReducer(String redu1, String redu2,String path1,String path2){

        String reduce = tempdirectory + File.separator +redu1+redu2+".txt";
   
           String shuffl = path1 + File.separator +redu1;
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

        return redu1+redu2+".txt";
    }
static String tableLocation1 = "C:\\Users\\MouAz He\\IdeaProjects\\HQL_COMPILER_2019\\temperature";
static String tableSpilt1  = ",";
    public static void mapper1(String filename){

String maperPath = tempdirectory+File.separator+"temperature"+File.separator+"map1";

        File stockDir1 = new File(maperPath);
        if(!stockDir1.exists()){stockDir1.mkdir();}
        try (BufferedReader br = new BufferedReader(new FileReader(tableLocation1+File.separator+filename))) {
            String line =  br.readLine();
            while ((line ) != null) {
                
                String[] country = line.split(tableSpilt1);
                
                String FileName = filename + "1.txt";
                String absolutePath = maperPath + File.separator + FileName;

                try(FileOutputStream fileOutputStream = new FileOutputStream(absolutePath,true)) {
String fileContent = country[0] + "," +country[1] + "," +"/" + country[2];


fileContent = fileContent.replace(",/","/");                    fileOutputStream.write(fileContent.getBytes());

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
        String maperPath = tempdirectory+File.separator+"temperature"+File.separator+"map1";
        String shuffPath = tempdirectory+File.separator+"temperature"+File.separator+"shuff1";

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
        String shuffPath = tempdirectory+File.separator+"temperature"+File.separator+"shuff1";
        String redusPath = tempdirectory+File.separator+"temperature"+File.separator+"red1";
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

                    String opResult1 = obj1.operation(values);

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

public static String reducer2(MyFunction obj1){
        String shuffPath = tempdirectory+File.separator+"temperature"+File.separator+"shuff1";
        String redusPath = tempdirectory+File.separator+"temperature"+File.separator+"red2";
        String FileName = "redu2.txt";
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

public static void map_reduce( String[] FilesName) throws IOException {
File stockDir1 = new File(tempdirectory+File.separator+"temperature");
        if(!stockDir1.exists()){stockDir1.mkdir();}

for(String name : FilesName){
mapper1(name);}
shuffle1();
String red1 = reducer1(new MyFunction() {
            @Override
            public String operation(ArrayList<Integer> c) {
int sum = 0;
                for(int i=0;i<c.size();i++){

                    sum+=c.get(i);
                }
                return String.valueOf(sum);
            }
        });

String red2 = reducer2(new MyFunction() {
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
                        output+=tuple.getKey()+ " - ";
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

}});red2 = concatReducer(red1,red2,tempdirectory+File.separator+"temperature"+File.separator+"red1",tempdirectory+File.separator+"temperature"+File.separator+"red2");
printResult(red2);}    public static void main(String[] args) {
        
        initFIleDir();
        File tableDir = new File(tableLocation1);
        if(tableDir.exists() && tableDir.isDirectory()){

            try {
                map_reduce(tableDir.list());
            } catch (IOException e) {
                e.printStackTrace();
            }


        }
    }private static void printResult(String ResultFile) {
String colName = "";colName += "id \t\t";
colName += "t_date \t\t";
 colName += "sum(temp) \t\t";
colName += "Count"+"\t\t"+"Mean"+"\t\t"+"Median"+"\t\t"+"Mode"+"\t\t"+"Max"+"\t\t"+"Min"+"\t\t"+"STD";
System.out.println(colName);
        String absolutePath = tempdirectory + File.separator +ResultFile;
File v = new File(absolutePath);
        if(!v.exists()){
            absolutePath = tempdirectory+File.separator +"temperature"+ File.separator+ "red2"+File.separator + ResultFile;
        }        try(BufferedReader br = new BufferedReader(new FileReader(absolutePath))) {

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
}