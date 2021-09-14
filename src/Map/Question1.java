package Map;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Question1 {
    public static void main(String[] args) {
        Map<String, Integer> testing = new HashMap<>();
        testing.put("Maninder", 4054);
        testing.put("g", 40);
        testing.put("xy", 50);
        testing.put("x", 00);
        Set<Map.Entry<String, Integer>> demo = testing.entrySet();

        Map<String, Integer> CopyData = new HashMap<>();

        for(Map.Entry<String, Integer> i: demo){
            CopyData.put(i.getKey(),i.getValue());
        }

        Set<Map.Entry<String, Integer>> dataguise= CopyData.entrySet();
        CopyData.clear();
        System.out.println(CopyData.isEmpty());

        for(Map.Entry<String,Integer> temp: dataguise){


                    System.out.println(temp.getValue());
        }

    }

    }

