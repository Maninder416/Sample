        package Map;
        import java.util.ArrayList;
        public class Practice7 {
            public void testing() {
                int test[] = {10212,10202,11000,11000,11010};
                ArrayList<Integer> temp = new ArrayList<>();
                StringBuilder sb = new StringBuilder();
                for(int i=0;i<test.length;i++){
                    if(test[i]>0){

                        sb.append(test[i]);
                        String s= sb.toString();
                        //System.out.println(s);
                        for(int m=0;m<s.length();m++){
                            //System.out.println(s.charAt(m));
                            temp.add((int) s.charAt(m)-'0');
                        }

                        for(int b: temp){
                            System.out.println(b);
                        }

                    }
                }





            }
            public static void main(String[] args) {
                Practice7 practice7= new Practice7();
                practice7.testing();


            }
        }
