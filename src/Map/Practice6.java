        package Map;
        import java.util.Scanner;
        public class Practice6 {
            public int sum(int [] temp){
                if(temp.length>0) {
                    int value = 0;
                    for (int i = 0; i < temp.length; i++) {
                        value += temp[i];
                    }
                    return value;
                }return 0;
            }

            public static void main(String[] args) {
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter the array: ");
                int x= sc.nextInt();
                int [] data= new int[x];
                for(int m=0; m<data.length;m++){
                    System.out.println("Enter the number "+m);
                    data[m]= sc.nextInt();
                }
                Practice6 practice6= new Practice6();
                System.out.println(practice6.sum(data));
            }
        }
