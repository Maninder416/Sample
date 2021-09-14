        package ArrayPractice;
        import java.util.*;
        public class Question6 {
            public static List<Integer> data = new ArrayList<>();

            //Created an array method which we are using to sort the array and getting the maxmium difference of array variables
            // and save the values of array into list
            public int[] largestGap(int[] test) {
                Arrays.sort(test);
                int z = 0;
                for (int x = 0; x < test.length - 1; x++) {
                    z = test[x + 1] - test[x];
                    data.add(z);
                }
                return test;
            }

            //Created a method which are getting the maxmium difference of array variables
            private void maxValue(List data) {
                System.out.println(Collections.max(data, null));
            }

            public static void main(String[] args) {
                System.out.println("Enter the array Range: ");
                Scanner sc = new Scanner(System.in);
                int i = sc.nextInt();
                int[] testing = new int[i];
                for (int x = 0; x < testing.length; x++) {
                    System.out.println("Enter the array number: " + x);
                    testing[x] = sc.nextInt();
                }
                Question6 question6 = new Question6();
                question6.maxValue(data);

            }
        }
