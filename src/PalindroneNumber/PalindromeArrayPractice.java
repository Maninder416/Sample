package PalindroneNumber;
import java.util.Arrays;
import java.util.Scanner;

public class PalindromeArrayPractice {
    public static void reverseArray(){
        int[] test = {1, 2, 3, 4, 5, 6};
        int start= test[0];
        int len= (test.length)-1;
        int temp= test[start];
        test[start]= test[len];
        test[len]= temp;
        start++;
        len--;
    }

    public static void main(String[] args) {
        PalindromeArrayPractice p1= new PalindromeArrayPractice();
        reverseArray();


    }
}

