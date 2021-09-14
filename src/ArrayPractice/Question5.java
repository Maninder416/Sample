/*Create a function that determines whether elements in an array can be re-arranged to form a
consecutive list of numbers where each number appears exactly once.*/

package ArrayPractice;
import java.util.Scanner;
public class Question5 {
    public boolean cons(int[] test) {
        for (int i = 0; i < test.length; i++) {
                for (int j = i + 1; j < test.length; j++) {
                    if (test[i] == test[j]) {
                        return false;
                    }
                }
            }
            return true;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the array range: ");
            int x = sc.nextInt();
            int[] testing = new int[x];
            for (int y = 0; y < testing.length; y++) {
                System.out.println("Enter the Array number: " + y);
                testing[y] = sc.nextInt();
            }
            Question5 question5 = new Question5();
            System.out.println(question5.cons(testing));
        }
    }
