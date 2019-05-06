package CG;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class cg {

public interface MyFunction {
        int operation(ArrayList<Integer> c);
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

static String tableLocation = "C:\\Users\\MouAz He\\IdeaProjects\\HQL_COMPILER_2019\\temperature";
static String tableSpilt  = ",";
    public static void mapper1(String filename){

        try (BufferedReader br = new BufferedReader(new FileReader(tableLocation+File.separator+filename))) {
            String line =  br.readLine();
            while ((line ) != null) {
                
                String[] country = line.split(tableSpilt);
                
                String FileName = filename + ".txt";
                String absolutePath = tempdirectory + File.separator + FileName;

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
public static  void shuffle() throws IOException {

        Map<ArrayList<Integer>,ArrayList<Integer>> mmm = new HashMap<>();

        File stockDir = new File(tempdirectory);
        String[] list = stockDir.list();
        for(String name : list){
            String absolutePath = tempdirectory + File.separator + name;
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

        String shuffl = tempdirectory + File.separator +"shufflResult.txt";

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

 public static void main(String[] args) {System.out.println("hello cg");}}