package Inheritance;

public class Cat extends Animal{

    public Cat(String name, String sex, int age, double weight, String color) {
        super(name, sex, age, weight, color);
    }

    public void meow(){
        System.out.println("Cat do meow");
    }




}
