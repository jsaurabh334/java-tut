package sample_programs.abstract_class;

abstract class Animal {
    abstract void makeSound();
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Woof");
    }
}

/**
 * AIM: Demonstrate basic abstract class and abstract method implementation.
 */
public class Basic_AbstractClass {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.makeSound();
    }
}
