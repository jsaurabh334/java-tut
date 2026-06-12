package sample_programs.interface_demo;

interface Vehicle {
    void start();

    // Default method
    default void stop() {
        System.out.println("Vehicle stopped.");
    }

    // Static method
    static void service() {
        System.out.println("Vehicles require regular servicing.");
    }
}

class Bike implements Vehicle {
    public void start() { System.out.println("Bike started."); }
}

/**
 * AIM: Demonstrate default and static methods in Interfaces.
 */
public class Advanced_Interface {
    public static void main(String[] args) {
        Vehicle myBike = new Bike();
        myBike.start();
        myBike.stop(); // Calling default method
        Vehicle.service(); // Calling static method
    }
}
