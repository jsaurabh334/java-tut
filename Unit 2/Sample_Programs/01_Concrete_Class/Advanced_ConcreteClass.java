package sample_programs.concrete_class;

class Engine {
    String type;
    Engine(String type) { this.type = type; }
    Engine(Engine other) { this.type = other.type; } // Copy constructor
}

/**
 * AIM: Demonstrate advanced concrete class concepts like deep copying and encapsulation.
 */
public class Advanced_ConcreteClass {
    private String model;
    private Engine engine;

    public Advanced_ConcreteClass(String model, Engine engine) {
        this.model = model;
        this.engine = new Engine(engine); // Deep copy
    }

    public void showDetails() {
        System.out.println("Model: " + model + ", Engine: " + engine.type);
    }

    public static void main(String[] args) {
        Engine eng = new Engine("V8");
        Advanced_ConcreteClass car = new Advanced_ConcreteClass("Mustang", eng);
        car.showDetails();
    }
}
