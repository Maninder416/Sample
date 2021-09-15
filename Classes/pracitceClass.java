package Classes;

public class pracitceClass {
    public static <E> void printArray(E [] test){
        for(E element: test){
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        Integer [] integerArray= {1,2,3,4,5};
        Character [] charArray={'a','b','c','d','e'};
        Double [] doubleArray= {10.00,20.00,30.00,40.00,50.00};

        printArray(integerArray);
        printArray(charArray);
        printArray(doubleArray);
    }
}
