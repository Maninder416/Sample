package Abstraction;

abstract class Animal {

    public abstract void animalSound();


    public void sleep(){
        System.out.println("animal is sleeping");
    }
}

class Pig extends Animal{
    @Override
    public void animalSound() {
        System.out.println("Animal is barking");
    }

    public static void main(String[] args) {
        Pig p1= new Pig();
        p1.animalSound();
        p1.sleep();
    }
}
