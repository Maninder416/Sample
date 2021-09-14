package PalindroneNumber;

import java.util.ArrayList;
import java.util.List;

public class ReverseAnarray {
    public static void main(String[] args) {
        int [] test={1,2,3,40,5};
        for(int i: test) {
            //System.out.println(i);
        }
        List<Object> dataguise= new ArrayList<>();
        dataguise.add(test);
        for(Object i: dataguise){
            System.out.println(i);
        }


        System.out.println("Reverse an array");
        int [] test2;
        List<Integer> testing= new ArrayList<>();
        for(int i= test.length-1;i>=0;i--){
           //System.out.println(test[i]);
           testing.add(test[i]);
            }

        System.out.println(testing);



    }
}
