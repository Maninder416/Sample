import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BrijeshAssignment {

    public static String getDayNumberOld(String input_date) throws Exception{
        SimpleDateFormat format1=new SimpleDateFormat("dd-MMM-yy");
        Date dt1=format1.parse(input_date);
        DateFormat format2=new SimpleDateFormat("EEEE");
        String finalDay=format2.format(dt1);
        return finalDay;
    }

    public static void ReadFile() throws Exception{
        String test="";
        File file= new File("/Users/manindersingh/Documents/testing/bank_transactions.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        BufferedWriter bw= new BufferedWriter(new FileWriter("/Users/manindersingh/Documents/testing/temp.txt"));
        test= br.readLine();
        while (test!=null){
           test= br.readLine();
           String [] split= test.split("\t");
           String day= getDayNumberOld(split[1]);

           if(day.equalsIgnoreCase("Monday") || day.equalsIgnoreCase("Wednesday") || day.equalsIgnoreCase("Friday")){
               bw.write(split[2]);
               bw.newLine();
               bw.flush();
           }

       }
        bw.close();

    }

    public static void main(String[] args) throws Exception{
        String input_date= "28-Jun-17";
        //System.out.println(getDayNumberOld(input_date));
        ReadFile();





    }
}
