package Inheritance;

public class Dog extends Animal{
    public Dog(String name, String sex, int age, double weight, String color) {
        super(name, sex, age, weight, color);
    }

    public void bark(){
        System.out.println("Dog do barking");
    }
}
