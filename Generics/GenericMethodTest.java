package Generics;

public class GenericMethodTest {

    public static<E> void printArray(E[] inputArray){
        for(E element: inputArray){
            //System.out.printf("%s", element);
            System.out.println(element);
        }

    }

    public static void main(String[] args) {
        Integer [] integerArray= {1,2,3,4,5,6};
        Double [] doubleArray= {10.00,20.00,30.00};
        Character [] charArray={'a','b','c','d'};

        //Interger Array
        System.out.println("Integer Array");
       printArray(integerArray);
        //Double Array
        System.out.println("Double Array");
        printArray(doubleArray);
        //Character Array
        System.out.println("Charcter Array");
        printArray(charArray);

    }
}
