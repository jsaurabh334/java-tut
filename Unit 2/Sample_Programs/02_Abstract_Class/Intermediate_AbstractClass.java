package sample_programs.abstract_class;

abstract class Vehicle {
    void honk() {
        System.out.println("Beep Beep!");
    }
    abstract void drive();
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Driving a car.");
    }
}

/**
 * AIM: Demonstrate abstract class containing both abstract and concrete methods.
 */
public class Intermediate_AbstractClass {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        myCar.honk();
        myCar.drive();
    }
}
