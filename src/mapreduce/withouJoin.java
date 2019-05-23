package mapreduce;


import java.io.*;
import java.lang.reflect.Array;
import java.util.*;


public class withouJoin {

    public interface MyFunction {
        String operation(ArrayList<Integer> c);
    }

    String sql = "Select id,date ,sum(temp),avg(date)  from temp group by id";

    static String numberREG = "^[-+]?\\d+(\\.\\d+)?$";



    public static void map_reduce() throws IOException {

        read_files();

       //shuffle11(1,true);
        shuffle11(1,false);
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



     //  shuffle11(2,false);

     /*  String red2 = reducer(2,2,new MyFunction() {
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
     //  sum_all_red(2);
        //sum_all_red(3);

        String all_path = tempdirectory+File.separator+"All_red";
        File n = new File(all_path);
        String[] list = n.list();




        String all = null;

        if(list.length == 2){
            all = concatReducer(list[0],list[1],tempdirectory+File.separator+"All_red",tempdirectory+File.separator+"All_red" , ',');
        }else if(list.length == 1){
            removeSlashFromRed(list,all_path);
        }else {
            all = concatReducer(list[0],list[1],tempdirectory+File.separator+"All_red",tempdirectory+File.separator+"All_red" , '/');
        }

        for(int i=1;i<list.length;i++){
            if(i+1 <list.length){
                all = concatReducer(all,list[i+1],tempdirectory,tempdirectory+File.separator+"All_red" , '/');
            }else if(i+1 == list.length-1){
                all = concatReducer(all,list[i+1],tempdirectory,tempdirectory+File.separator+"All_red" , ',');

            }

        }

       // otrder.start(tempdirectory+File.separator+all,tempdirectory+File.separator+all,comparaor);
        if(list.length==1){
            printResult(tempdirectory+File.separator+"All_red/result.txt");
        }else {
            printResult(tempdirectory+File.separator+all);
        }


    }

    private static void removeSlashFromRed(String[] list,String path) {


        for(String name : list){
            System.out.println(name);
            try (BufferedReader br = new BufferedReader(new FileReader(path+File.separator+name))) {

                String line;

                while ((line = br.readLine()) != null) {
                    line = line.replace("/",",");

                    String shuff2 = path + File.separator + "result.txt";

                        try (BufferedWriter fileOutputStream = new BufferedWriter(new FileWriter(shuff2, true))) {
                            fileOutputStream.write(line);
                            fileOutputStream.newLine();
                            fileOutputStream.close();
                        }
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            new File(path+File.separator+name).delete();
     }

    }

    static Comparator<String> comparator = new Comparator<String>() {
        public int compare(String r1, String r2){
            byte[] comaList1 = new byte[3];

            comaList1 =FindCommasInLine(r1,comaList1,',');

            int index1 = 2;
            String col1=null;
            String col2 = null;
            if(index1==0){

                col1= getCol(index1,comaList1[index1],r1);
                col2= getCol(index1,comaList1[index1],r2);

            }else if(comaList1.length+1 == index1){

                col1= getCol(comaList1[comaList1.length-1]+1,r1.length(),r1);
                col2= getCol(comaList1[comaList1.length-1]+1,r1.length(),r2);
            }else{
                col1=getCol(comaList1[index1-1]+1,comaList1[index1],r1);
                col2=getCol(comaList1[index1-1]+1,comaList1[index1],r2);
            }

            return (Integer.parseInt(col1) - Integer.parseInt(col2)) * -1;
        }};

    private static void printResult(String ResultFile) {
        String colName = "";

        colName += "id \t\t t_date \t\t avg(temp) \t\t sum(temp) \t\t\n";
        System.out.println(colName);

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

                    //String[] country1 = line.split(tableSpilt1);
                    // change
                    byte[] comaList = new byte[2];

                    comaList = FindCommasInLine(line,comaList,tableSpilt1);



                    // where change
                    // get col to where
                    if ((true)){

                        byte[] Keys1 = new byte[2];
                        Keys1[0] = 0;
                        Keys1[1] = 1;
                        map1(1,line,name1,comaList,Keys1,(byte)2);

                        byte[] Keys2 = new byte[2];
                        Keys2[0] = 0;
                        Keys2[1] = 1;
                        map1(2,line,name1,comaList,Keys2,(byte)1);
                    }

                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


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
    static String lineSeparator = System.getProperty("line.separator");
    static String tempdirectory = "temp";

    static String tableLocation1 = "temperature";

    static char tableSpilt1  = ',';

    public static void map1(int mapNum,String line,String fileName,byte[] comalist , byte[] KeyIndex,byte valIndex){
        String maperPath = tempdirectory+File.separator+"map"+mapNum;
        File stockDir1 = new File(maperPath);
        if(!stockDir1.exists()){stockDir1.mkdir();}
        String FileName = fileName + ".txt";
        String outPath = maperPath + File.separator + FileName;
        try(FileOutputStream fileOutputStream = new FileOutputStream(outPath,true)) {
/*
            for(int i=0;i<line.length;i++) {
                line[i] = line[i].replace("\"", "");
            }*/

            // String fileContent = line[0]+","+line[1] +"/"+line[2];
            String fileContent="";
            for(byte b:KeyIndex){

                if(b==0){
                    fileContent+= getCol(b,comalist[b],line)+",";

                }else if(comalist.length+1 == b){

                    fileContent+= getCol(comalist[comalist.length-1]+1,line.length(),line)+",";
                }else{

                    fileContent+=getCol(comalist[b-1]+1,comalist[b],line)+",";

                }

            }
            fileContent+="/";

            fileContent = fileContent.replace(",/","/");

            if(valIndex==0){

                fileContent+= getCol(valIndex,comalist[valIndex],line);

            }else if(comalist.length == valIndex){

                fileContent+= getCol(comalist[comalist.length-1]+1,line.length(),line);
            }else{



                fileContent+=getCol(comalist[valIndex-1]+1,comalist[valIndex],line);

            }

            //fileContent = getCol(0,comalist[0],line)+","+getCol(comalist[0]+1,comalist[1],line) +"/"+getCol(comalist[1]+1,line.length(),line);
            // String col1 = getCol(0,comalist[0],line);
            fileOutputStream.write(fileContent.getBytes());
            fileOutputStream.write(lineSeparator.getBytes());


            fileOutputStream.flush();

            fileOutputStream.close();

        } catch (FileNotFoundException e) {

        } catch (IOException e) {

        }


    }


   public static  void shuffle11(int map,boolean isDistnict) throws IOException {

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

                   byte slash1 = 0;

                   slash1 =FindSlash(line);

                  // String[] KeyAndVal = line.split("/");

                   String Key = getCol(0,slash1,line);

                   String value = getCol(slash1+1,line.length(),line);

                   String shuffname = mmm.get(Key);
                   if(shuffname == null){
                       shuffname = ++fNum+"_"+Key;
                       mmm.put(Key,shuffname);
                   }
                   String ou_file = shuffPath+File.separator+shuffname+".txt";
                   File n = new File(ou_file);
                   if(n.exists()){
                       try(RandomAccessFile fileOutputStream = new RandomAccessFile(ou_file,"rw")){


                           String l = fileOutputStream.readLine();
                           byte slash2 = 0;

                           slash2 =FindSlash(l);


                           String[] KVal = l.split("/");



                           if(KVal.length == 2) {
                               String[] val = KVal[1].split(",");

                               boolean dis = false;
                               // Distnict function
                               if(isDistnict){
                                   for (String d : val) {
                                       if (d.equals(value)) {
                                           dis = true;
                                           break;
                                       }

                                   }
                               }

                               if(!dis){
                                   fileOutputStream.write((","+value).getBytes());
                               }


                           }else{
                               fileOutputStream.write((","+value).getBytes());
                           }




                       }


                   }else{
                       try(BufferedWriter fileOutputStream = new BufferedWriter(new FileWriter(ou_file,true))) {
                           if(value.length() !=0 ){
                               fileOutputStream.write(Key + "/" + value);
                           }else{
                               fileOutputStream.write(Key + "/" );
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

        Arrays.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {

                int e1 = o1.indexOf('_');
                int e2= o2.indexOf('_');
                int number1 = Integer.parseInt(o1.substring(0, e1));

                int number2 = Integer.parseInt(o2.substring(0, e2));

                return number1 - number2;

            }
        });

        int numOfLine = 0;
        int MAXLINES = 100;
        List<String> temp = new ArrayList<>();
        int i=0;
        String Line = "";
        String ou_file = null;
        for(String name :list){

            String absolutePath = shuffPath + File.separator + name;
            try(BufferedReader br = new BufferedReader(new FileReader(absolutePath))) {


              //  ou_file = shuffPath + File.separator +(++i) +".txt" ;
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
            ou_file = shuffPath + File.separator +(++i) +".txt" ;
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


        File stockDir1 = new File(redusPath);
        if(!stockDir1.exists()){stockDir1.mkdir();}

        File stockDir = new File(shuffPath);
        String[] list = stockDir.list();
        for(String name : list){

            String shuffl = shuffPath + File.separator +name;
            try (BufferedReader br = new BufferedReader(new FileReader(shuffl))) {

                String line;

                while ((line = br.readLine()) != null){

                    String[] vlas ;

                    byte slash1 = 0;

                    slash1 =FindSlash(line);

                    // String[] KeyAndVal = line.split("/");

                    String Key = getCol(0,slash1,line);

                    String value = getCol(slash1+1,line.length(),line);



                    if(value.length() != 2){
                        vlas = value.split(",");
                    }else{
                        vlas= new String[1];
                        vlas[0]  = "";
                    }


                    ArrayList<Integer> values = new ArrayList<>();

                    boolean isNum = false;
                    for(String s : vlas){
                        if(s.matches(numberREG)){
                            isNum = true;
                            values.add(Integer.parseInt(s));
                        }else{

                        }

                    }
                    if(isNum) {

                        String opResult1 = obj1.operation(values);

                        String reduce = redusPath + File.separator + name;
                        try (BufferedWriter fileOutputStream = new BufferedWriter(new FileWriter(reduce, true))) {
                            fileOutputStream.write(Key + "/" + opResult1 + System.lineSeparator());
                            fileOutputStream.close();
                        }
                    }
                    else {
                        String reduce = redusPath + File.separator + name;
                        try (BufferedWriter fileOutputStream = new BufferedWriter(new FileWriter(reduce, true))) {
                            fileOutputStream.write(line+ System.lineSeparator());
                            fileOutputStream.close();
                        }
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

    public static void sum_all_red(int red){

        String redusPath = tempdirectory+File.separator+"red"+red;
        String ALl_red_path = tempdirectory+File.separator+"All_red";
        String all_file = ALl_red_path + File.separator+red+".txt";


        File stockDir1 = new File(ALl_red_path);
        if(!stockDir1.exists()){stockDir1.mkdir();}


        File stockDir = new File(redusPath);
        String[] list = stockDir.list();

        Arrays.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {

                int e1 = o1.indexOf('.');
                int e2= o2.indexOf('.');
                int number1 = Integer.parseInt(o1.substring(0, e1));

                int number2 = Integer.parseInt(o2.substring(0, e2));

                return number1 - number2;

            }
        });


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

    public static String concatReducer(String redu1, String redu2,String path1,String path2,char sp){

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
                            String output = KeyAndVal[0] + sp + KeyAndVal[1] + "," +KeyAndVal2[1]+lineSeparator;
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

    private static byte[] FindCommasInLine(String line,byte[] list,char split){

        int counter = 0;

        for (byte index = 0; index < line.length(); index++)
        {
            if (line.charAt(index) == split)
            {
                list[counter++] = index;

            }
        }

        return list;
    }

    private static byte FindSlash(String line){

        int counter = 0;
        byte list = 0;
        for (byte index = 0; index < line.length(); index++)
        {
            if (line.charAt(index) == '/')
            {
                list =  index;

            }
        }

        return list;
    }

    private static String getCol(int start, int end, String line){
        String sb = "";
        int c=0;
        for (int index = start; index < end; index++)
        {
            sb+= line.charAt(index);
        }

        return sb;
    }


}
