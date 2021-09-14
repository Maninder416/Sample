/*Write a function that returns true if you can partition an array into one element and the rest,
such that this element is equal to the product of all other elements excluding itself.*/

package ArrayPractice;
        import java.util.Arrays;
        import java.util.Scanner;
        public class Question7 {
            public boolean canPartition(int[] data) {
                Arrays.sort(data);
                int i = data[data.length - 1];
                System.out.println(i);
                int x = 1;
                int v = 1;
                for (int y = 0; y <= data.length - 2; y++) {
                    x = data[y];
                    v *= x;}
                if (v == i) {
                    return true;}
                return false;}
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the array range: ");
                int x = sc.nextInt();
                int[] testing = new int[x];
                for (int y = 0; y < testing.length; y++) {
                    System.out.println("Enter the Array number: " + y);
                    testing[y] = sc.nextInt();}
                Question7 question7 = new Question7();
                System.out.println(question7.canPartition(testing));
            }}


