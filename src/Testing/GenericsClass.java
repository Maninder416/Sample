package Testing;

public class GenericsClass<E>{
    E variable;

    GenericsClass(E variable){
        this.variable =variable;
    }

    public E getVariable(){
        return this.variable;
    }



    public static void main(String[] args) {
        GenericsClass genericsClass= new GenericsClass("Maninder");
        System.out.println(genericsClass.getVariable());

        GenericsClass genericsClass1= new GenericsClass(10);
        System.out.println("The roll no is: "+genericsClass1.getVariable());


    }
}
