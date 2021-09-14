        package Map;
        import java.util.ArrayList;
        public class Practice8 {
            public int highestDigit(int number){
                ArrayList<Integer> temp= new ArrayList<>();
                StringBuilder sb= new StringBuilder();
                sb.append(number);
                String value= sb.toString();
                for(int i=0;i<value.length();i++){
                    temp.add((int)value.charAt(i)-'0');
                }
                int max=0;
                for(int x: temp){
                     if(x>max){
                        max=x;
                    }
                }
                return max;

            }
            public static void main(String[] args) {
                Practice8 practice8= new Practice8();
                System.out.println(practice8.highestDigit(379));
            }
        }
