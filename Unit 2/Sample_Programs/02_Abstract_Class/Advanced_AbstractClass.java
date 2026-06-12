package sample_programs.abstract_class;

abstract class Device {
    String brand;
    Device(String brand) {
        this.brand = brand;
        System.out.println("Device constructor called.");
    }
    abstract void powerOn();
}

class Laptop extends Device {
    Laptop(String brand) {
        super(brand);
    }
    void powerOn() {
        System.out.println(brand + " laptop powered ON.");
    }
}

/**
 * AIM: Demonstrate constructors in abstract classes.
 */
public class Advanced_AbstractClass {
    public static void main(String[] args) {
        Device myLap = new Laptop("Dell");
        myLap.powerOn();
    }
}
