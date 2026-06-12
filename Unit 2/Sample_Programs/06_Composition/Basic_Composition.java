package sample_programs.composition;

class Engine {
    void start() { System.out.println("Engine started."); }
}

class Car {
    private final Engine engine; // Strong ownership (Composition)

    Car() {
        this.engine = new Engine(); // Created inside constructor
    }

    void startCar() {
        engine.start();
        System.out.println("Car is moving.");
    }
}

/**
 * AIM: Demonstrate basic Composition concept (strong HAS-A relationship).
 */
public class Basic_Composition {
    public static void main(String[] args) {
        Car car = new Car();
        car.startCar();
    }
}
