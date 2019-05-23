package mapreduce;

import java.io.*;
import java.util.*;


public class fullouterjoin {

    public interface MyFunction {
        String operation(ArrayList<Integer> c);
    }

    String sql = "SELECT  Customers.Name , SUM(orders.salary)\n" +
            "FROM Customers\n" +
            "FULL OUTER JOIN Orders ON Orders.CustomersID = Customers.CustomersID GROUP BY Customers.Name";
    String x  = "SELECT customer.name,sum(salary) FROM customer\n" +
            "LEFT JOIN ord on ord.cust_id= customer.cust_id GROUP by customer.name\n" +
            "UNION\n" +
            "SELECT customer.name,sum(salary) FROM customer\n" +
            "RIGHT JOIN ord on ord.cust_id= customer.cust_id GROUP by customer.name ORDER BY 1";

    static Comparator<String> comparator = new Comparator<String>() {
        public int compare(String r1, String r2){


            String[] r11 = r1.split(",");
            String[] r22 = r2.split(",");

            return r11[0].compareTo(r22[0]);
        }};





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


    public static void map_reduce() throws IOException {

        fullOuterJoin();

          shuffle11(1,false);
        //  shuffle(2);

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

        sum_all_red(1);


        String all_path = tempdirectory+File.separator+"All_red";
        File n = new File(all_path);
        String[] list = n.list();
        order.start(all_path+File.separator+list[0],all_path+File.separator+list[0],comparator);


      /*  String red2 = reducer(2,new MyFunction() {
            @Override
            public String operation(ArrayList<Integer> c) {
                int sum = 0;
                for(int i=0;i<c.size();i++){

                    sum+=c.get(i);
                }
                return String.valueOf(sum/c.size());
            }
        });*/


       // sum_all_red(1);
        // sum_all_red(2);

      /*

        String all =concatReducer(list[0],list[1],tempdirectory+File.separator+"All_red",tempdirectory+File.separator+"All_red");;
        for(int i=1;i<list.length;i++){
            if(i+1 <list.length){
                all = concatReducer(all,list[i+1],tempdirectory,tempdirectory+File.separator+"All_red");
            }

        }*/
        if(list.length==1){
          printResult(tempdirectory+File.separator+"All_red/1.txt");
         //}else {
       //     printResult(tempdirectory+File.separator+all);
         }


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
                    if(kk.equals("")){
                        System.out.print("Nil \t\t ");
                    }
                    System.out.print(kk + " \t\t ");
                }

                if(r.length == 2){



                    String[] values = r[1].split(",");

                    for(String kk:values){
                        System.out.print(kk + " \t\t ");
                    }
                }else{


                    System.out.print("Nil \t\t ");

                }


                System.out.println("\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void LeftJoin(){

        String Table_1_path = tableLocation1;
        String Table_2_path = tableLocation2;
        File table1 = new File(Table_1_path);
        File table2 = new File(Table_2_path);
        String[] Table_1_list = table1.list();
        String[] Table_2_list = table2.list();
        int length_country2=0;
        int length_country1=0;
        for(String name1 : Table_1_list) {
            String absolutePath1 = Table_1_path + File.separator + name1;
            try (BufferedReader br = new BufferedReader(new FileReader(absolutePath1))) {
                String line1;

                while ((line1 = br.readLine()) != null) {

                    //String[] country1 = line1.split(",");

                    byte[] comaList1 = new byte[1];

                    comaList1 = FindCommasInLine(line1,comaList1,tableSpilt1);
                    int index1 = 0;
                    String col1;
                    if(index1==0){

                        col1= getCol(index1,comaList1[index1],line1);

                    }else if(comaList1.length+1 == index1){

                        col1= getCol(comaList1[comaList1.length-1]+1,line1.length(),line1);
                    }else{
                        col1=getCol(comaList1[index1-1]+1,comaList1[index1],line1);
                    }

                    int null_value =0;
                    int i=0;
                    for (String name2 : Table_2_list) {
                        String absolutePath2 = Table_2_path + File.separator + name2;
                        try (BufferedReader depbr = new BufferedReader(new FileReader(absolutePath2))) {
                            String line2;



                            while ((line2 = depbr.readLine()) != null) {
                                i++;

                                byte[] comaList2 = new byte[2];

                                comaList2 = FindCommasInLine(line2,comaList2,tableSpilt2);

                                //String[] country2 = line2.split(tableSpilt2);
                                length_country2 = comaList2.length+1;
                                // if(!(country1[2].matches("NULL") || country1[2].matches("null"))) {

                                int index2 = 1;
                                String col2;
                                if(index2==0){

                                    col2= getCol(index2,comaList2[index2],line2);

                                }else if(comaList2.length+1 == index2){

                                    col2= getCol(comaList2[comaList2.length-1]+1,line2.length(),line2);
                                }else{
                                    col2=getCol(comaList2[index2-1]+1,comaList2[index2],line2);
                                }

                                if ((col1.equals(col2))) {

                                    line1 = line1.replace(tableSpilt1,',');
                                    line2 = line2.replace(tableSpilt2,',');
                                    String concat_line1 = line1+','+line2;

                                    byte[] comaConcat1 = new byte[comaList1.length+comaList2.length+1];

                                    comaConcat1 = FindCommasInLine(concat_line1,comaConcat1,',');

                                    byte[] Keys1 = new byte[1];

                                    Keys1[0] =(byte)(1);



                                    map1(1,concat_line1,name1+"_"+name2,comaConcat1,Keys1,(byte)4);



                                }else {
                                    null_value++;
                                }
                                // }
                            }

                        }
                    }
                    if(null_value==i){
                        String c_null = "";
                        for(int k=1;k<length_country2;k++){
                           c_null+=",";
                        }
                        line1 = line1.replace(tableSpilt1,',');
                        String concat_line1 = line1+','+c_null;
                        byte[] comaConcat1 = new byte[comaList1.length+c_null.length()+1];

                        comaConcat1 = FindCommasInLine(concat_line1,comaConcat1,',');

                        byte[] Keys1 = new byte[1];
                        Keys1[0] =(byte)(1);


                        map1(1,concat_line1,name1+"_",comaConcat1,Keys1,(byte)4);

                    }

                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void RightJoin_WithoutInnerJoin(){


        File table1 = new File(tableLocation1);
        File table2 = new File(tableLocation2);
        String[] Table_1_list = table1.list();
        String[] Table_2_list = table2.list();

        int length_country1=0;

        for(String name2 : Table_2_list) {
            String absolutePath2 = tableLocation2 + File.separator + name2;
            try (BufferedReader br = new BufferedReader(new FileReader(absolutePath2))) {
                String line1;


                while ((line1 = br.readLine()) != null) {

                    byte[] comaList1 = new byte[2];

                    comaList1 = FindCommasInLine(line1,comaList1,tableSpilt2);
                    int index1 = 1;
                    String col1;
                    if(index1==0){

                        col1= getCol(index1,comaList1[index1],line1);

                    }else if(comaList1.length+1 == index1){

                        col1= getCol(comaList1[comaList1.length-1]+1,line1.length(),line1);
                    }else{
                        col1=getCol(comaList1[index1-1]+1,comaList1[index1],line1);
                    }

                    length_country1 = comaList1.length+1;

                    int null_value =0;
                    int i=0;
                    for (String name1 : Table_1_list) {
                        String absolutePath1 = tableLocation1 + File.separator + name1;
                        try (BufferedReader br2 = new BufferedReader(new FileReader(absolutePath1))) {
                            String line2;



                            while ((line2 = br2.readLine()) != null) {
                                i++;

                                byte[] comaList2 = new byte[1];

                                comaList2 = FindCommasInLine(line2,comaList2,tableSpilt1);

                                int index2 = 0;
                                String col2;
                                if(index2==0){

                                    col2= getCol(index2,comaList2[index2],line2);

                                }else if(comaList2.length+1 == index2){

                                    col2= getCol(comaList2[comaList2.length-1]+1,line2.length(),line2);
                                }else{
                                    col2=getCol(comaList2[index2-1]+1,comaList2[index2],line2);
                                }
                               // length_country1 = country1.length;

                                if (col1.equals(col2)){



                                }else{
                                    null_value++;
                                }
                            }

                        }
                    }
                    if(null_value==i){
                        String c_null = "";
                        for(int k=1;k<length_country1;k++){
                            c_null+=",";
                        }

                        line1 = line1.replace(tableSpilt1,',');

                        String concat_line1 = c_null+','+line1;
                        byte[] comaConcat1 = new byte[comaList1.length+c_null.length()+1];
                        System.out.println(concat_line1);
                        comaConcat1 = FindCommasInLine(concat_line1,comaConcat1,',');

                        byte[] Keys1 = new byte[1];

                        Keys1[0] =(byte)(1);
                        map1(1,concat_line1,name2+"_",comaConcat1,Keys1,(byte)(comaList1.length+1+2));

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
        File tableDir2 = new File(tableLocation2);


        if(tableDir1.exists() && tableDir1.isDirectory() && tableDir2.exists() && tableDir2.isDirectory()){

            try {

                map_reduce();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }
    static String lineSeparator = System.getProperty("line.separator");
    static String tempdirectory = "temp";

    static String tableLocation1 = "Customers";
    static String tableLocation2 = "Orders";
    static char tableSpilt1  = ',';
    static char tableSpilt2  = ',';

    static String numberREG = "^[-+]?\\d+(\\.\\d+)?$";



    public static void fullOuterJoin() {

        LeftJoin();
        RightJoin_WithoutInnerJoin();

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

    public static String reducer(int shuff, int red, MyFunction obj1){

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

