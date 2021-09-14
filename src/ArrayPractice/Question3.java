/*Create a function that takes an array of numbers and return "Boom!" if the digit 7 appears in the array.
Otherwise, return "there is no 7 in the array".
sevenBoom([2, 55, 60, 97, 86]) ➞ "Boom!"
// 97 contains the number seven.
 */

    package ArrayPractice;
    import java.util.Scanner;
    public class Question3 {
        public String sevenBoom(int [] test) {
            for(int i=0;i<test.length;i++){
                if(test[i]==7){
                    return "Boom";}
                if(test[i]>=10){
                    StringBuilder sb= new StringBuilder();
                    sb.append(test[i]);
                    String temp= sb.toString();
                    for(int v=0;v<temp.length();v++){
                        char c= temp.charAt(v);
                        if(c=='7'){
                            return "Boom";
                        }}}
            }return "None of the items contain 7 within them.";}
        public static void main(String[] args) {
            System.out.println("Enter the array Range: ");
            Scanner sc= new Scanner(System.in);
            int i= sc.nextInt();
            int [] testing= new int[i];
            for(int x=0;x<testing.length;x++){
                System.out.println("Enter the array number: "+x);
                testing[x]= sc.nextInt();}
            Question4 question3= new Question4();
            System.out.println(question3.sevenBoom(testing));
        }}
