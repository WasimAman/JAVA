package com.wasim;
abstract class Animal{
    /*
     public abstract void sleep(){
        System.out.println("Zzzz");
    }
    1). This code will thorough an error because an abstract class can not have body or implementation,
    2). implementation part will be in child classes because child class is responsible to
        provide implementation
    */
    public abstract void animalSound(); // ---> this is abstract method
    // if At least one method is abstract then declare class with abstract.
    public void sleep(){        // ---> this is normal method
        System.out.println("Zzzzz");
    }

}
class Pig extends Animal{
    // implementation of animal abstract method
    @Override
    public void animalSound() {
        System.out.println("Pig says : Wee Wee");
    }
}
public class AbstractDemo {
    public static void main(String[] args){
        Pig myPig = new Pig();
        myPig.animalSound();
        myPig.sleep();

    }
}
