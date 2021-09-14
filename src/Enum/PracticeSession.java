package Enum;

//This program is for java pass by value or pass by reference

public class PracticeSession {

    public static void methodTesting(int [] num){
        System.out.println("Value of number in method before changing : "+num[0]);
        System.out.println();
        num[0] =50;
        System.out.println("Value of number in method after changing : "+num[0]);
    }

    public static void main(String[] args) {
        //int number=100;
        int [] temp= {1000,2000};
        System.out.println("Value of array is before calling method: "+temp[0]);
        System.out.println();
        methodTesting(temp);
        System.out.println("Value of number is after calling method: "+temp[0]);




    }
}
