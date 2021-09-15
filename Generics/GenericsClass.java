/* Generics Class, there is no need to describe the datatype.
We can call the variable when we create the object.
With only one variable we can call it many times. We can use it as String type, Integer type
* */


package Generics;
public class GenericsClass<E> {
    E variable;

    GenericsClass(E variable){
        this.variable=variable;
    }

    public E getVariable() {
        return variable;
    }

    public static void main(String[] args) {
        GenericsClass genericsClass= new GenericsClass("Maninder");
        System.out.println("My Name is : "+genericsClass.getVariable());

        GenericsClass genericsClass1= new GenericsClass(100);
        System.out.println("Roll Number is: "+genericsClass1.getVariable());
    }
}
