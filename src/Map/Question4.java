package Map;

import java.util.ArrayList;
import java.util.Scanner;


public class Question4 {

    public void countPalindromes(int x,int y){
        ArrayList<Integer> testing3= new ArrayList<>();
        for(int v=x; v<=y;v++){
            StringBuilder sb= new StringBuilder();
            String testing= Integer.toString(v);
            sb.append(v);
            sb.reverse();
            String testing2= sb.toString();
            if(testing.equals(testing2)){
                System.out.println("no is palindrome");
                int tmp= Integer.parseInt(testing);
                testing3.add(tmp);
            }

            for(int b: testing3){
                System.out.println(b);
            }

        }}

//






    public static void main(String[] args) {
        System.out.println("Enter the numbers in which you want to check the list of palindrome numbers: ");
        Scanner sc= new Scanner(System.in);
        int i= sc.nextInt();
        System.out.println("Enter second no.: ");
        int x= sc.nextInt();

        Question4 question4= new Question4();
        question4.countPalindromes(i,x);
        //question4.testing();



    }
}

  //  public void testing(){
//            StringBuilder sb= new StringBuilder();
//            String testing= Integer.toString(v);
//            sb.append(v);
//            sb.reverse();
//            String testing2= sb.toString();
//            if(testing.equals(testing2)){
//                System.out.println("no is palindrome");
//            }
//            else {
//                System.out.println("Testing");
//            }
//
//        }
