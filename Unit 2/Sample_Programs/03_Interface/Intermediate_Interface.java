package sample_programs.interface_demo;

interface Runneable {
    void run();
}

interface Flyable {
    void fly();
}

class ToyDrone implements Runneable, Flyable {
    public void run() { System.out.println("Drone running on ground."); }
    public void fly() { System.out.println("Drone flying in air."); }
}

/**
 * AIM: Demonstrate multiple inheritance in Java using Interfaces.
 */
public class Intermediate_Interface {
    public static void main(String[] args) {
        ToyDrone drone = new ToyDrone();
        drone.run();
        drone.fly();
    }
}
