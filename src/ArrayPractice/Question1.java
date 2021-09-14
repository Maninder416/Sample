
//Create a function that takes two numbers as arguments (num, length) and returns
// an array of multiples of num until the array length reaches length.
package ArrayPractice;

public class Question1 {

    //Creating array method
    public int[] arrayofMultiples(int number, int demo) {
        int[] testing = new int[demo];

        int y = 1;
        int z = number;
        for (int i = 0; i < testing.length; i++) {
            number = z * y;
            testing[i] = number;
            y++;
        }
        return testing;
    }

    public static void main(String[] args) {
        Question1 question1 = new Question1();
        // Creating an array to get the get values of array method
        int[] t1 = question1.arrayofMultiples(17, 6);
        for (int i : t1) {
            System.out.println(i);
        }
    }
}
