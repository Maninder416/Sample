package PalindroneNumber;

public class PracticeExercise {
    public boolean isPalindrome(int number){
        int reminder,sum=0,temp;
        temp=number;
        while(number>0){
            reminder=number%10;
            sum=(sum*10)+reminder;
            number=number/10;
        }
        if(temp==sum){
            return true;
        }
        else {
            return false;
        }

    }

    public static void main(String[] args) {
        PracticeExercise p1= new PracticeExercise();
        System.out.println(p1.isPalindrome(120));
    }
}
