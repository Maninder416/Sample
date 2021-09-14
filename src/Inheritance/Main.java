package Inheritance;

public class Main {
    public static void main(String[] args) {
        Cat c= new Cat("Cat","Male",3,10,"Black");
        System.out.println(c.getColor());
        c.meow();
        Dog d= new Dog("BeeCC","Female",3,50,"White");
        d.bark();
    }
}
