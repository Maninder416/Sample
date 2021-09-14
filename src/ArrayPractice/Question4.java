    package ArrayPractice;

    import java.util.Scanner;

    public class Question4 {
        public String sevenBoom(int[] test) {
            for (int i = 0; i < test.length; i++) {
                StringBuilder sb = new StringBuilder();
                sb.append(test[i]);
                String temp = sb.toString();
                if (temp.contains("7")) {
                    return "Boom";
                }
            }
            return "None of the items contain 7 within them.";
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
            Question4 question3 = new Question4();
            System.out.println(question3.sevenBoom(testing));
        }
    }

