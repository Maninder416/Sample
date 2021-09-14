package Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Practice5 {

    public void squarePatch(int number){
        int m=0;
        if(number!=0) {
            int[][] test = new int[number][number];
            ArrayList<Integer> temp = new ArrayList<>();
            for (int y = 0; y < test.length; y++) {
                for (int z = 0; z < test[y].length; z++) {
                     m = test[y][z] = number;
                    System.out.print(m + " ");
                }
                System.out.println();
            }
        }
        else{
            m=0;
            System.out.println(m);
        }
    }


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the integer do u want to create square: ");
        int x= sc.nextInt();
        Practice5 practice5= new Practice5();
        practice5.squarePatch(x);



    }
}
