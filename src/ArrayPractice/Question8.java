package ArrayPractice;
import java.util.*;
public class Question8 {
    public static ArrayList<Integer> dataguise= new ArrayList<>();
    public void filterArray(Object[] data){
        for(int i=0;i<data.length;i++){
            if(data[i] instanceof Integer){
                dataguise.add(i);
            }}
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array range: ");
        int i= sc.nextInt();
        int [] data= new int[i];
        Object [] demo= new Object[i];
        for (int y = 0; y < data.length; y++) {
            System.out.println("Enter the Array number: " + y);
            if(sc.hasNextInt()){
                int value= sc.nextInt();
                dataguise.add(value);
            }else{
                demo[y]= sc.next();
            }

        }
        Question8 question8= new Question8();
        question8.filterArray(demo);

        for(int v: dataguise){
            System.out.println(v);
        }

    }

}