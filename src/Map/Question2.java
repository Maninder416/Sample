package Map;
import org.apache.commons.lang3.StringUtils;


public class Question2 {

    public void split(String name) {
        String solution="";
        String test= name.replaceAll("[aeiouAEIOU]","");
        String ans= name.replace(test, "");
       System.out.print(test+"\n");
        if(ans.contains("a")||ans.contains("e")||ans.contains("i")||ans.contains("o")||ans.contains("u")) {
            // solution= ans.concat(test);
        }
        //System.out.println(solution);

        //System.out.println(StringUtils.difference("abc","cd"));
        System.out.println(StringUtils.difference("abc", "a"));


    }

    public static void main(String[] args) {
        Question2 question2= new Question2();
        question2.split("Hello");

    }
}


