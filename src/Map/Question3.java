package Map;

import java.util.ArrayList;
import java.util.Scanner;

public class Question3 {
    public void factorize(int number) {
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                temp.add(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number do you want to check factorize: ");
        int i = sc.nextInt();
        Question3 question3 = new Question3();
        question3.factorize(i);

    }
}
