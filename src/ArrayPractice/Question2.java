/*There's a great war between the even and odd numbers. Many numbers already lost their life in
this war and it's your task to end this. You have to determine which group sums larger: the even, or the odd.
The larger group wins.
Create a function that takes an array of integers, sums the even and odd numbers separately, then returns
the difference between sum of even and odd numbers.*/

package ArrayPractice;
import java.util.Scanner;
public class Question2 {
    public int dataguise(int [] test){
        int even=0;
        int odd=0;
        int return_number=0;
        for(int i=0; i<test.length;i++){
            if(test[i]%2==0){
                even+=test[i];}
            else{
                odd+=test[i];}
            if(even> odd){
                return_number= even-odd;
            }else if(odd>even){
                return_number=odd-even;}
        }return return_number;
    }
    public static void main(String[] args) {
        Question2 question2= new Question2();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the array range: ");
        int temp= sc.nextInt();
        int [] demo= new int[temp];
        System.out.println("Enter the elements of array");
        for(int y=0;y<demo.length;y++){
            demo[y]=sc.nextInt();
        }
        System.out.println(question2.dataguise(demo));

    }
}
