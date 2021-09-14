package Map;

import java.security.Key;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PracticeMap {
    public static void main(String[] args) {
        Map<String, Integer > phonebook= new HashMap<>();
        phonebook.put("Maninder",416854);
        phonebook.put("Gurjeet",1234);
        phonebook.put("Udham",5678);

        System.out.println("The contact number of Maninder is: "+phonebook.get("Maninder"));

        Set<String> keys= phonebook.keySet();
        for(String i: keys){
            //System.out.println(i);
        }

       Set<Map.Entry<String,Integer>> testing= phonebook.entrySet();
        for(Map.Entry<String,Integer> i: testing){
            System.out.println("Maninder no is: "+i.getValue());
        }



    }
}
