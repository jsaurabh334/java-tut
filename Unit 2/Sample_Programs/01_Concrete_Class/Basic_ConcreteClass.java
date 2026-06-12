package sample_programs.concrete_class;

/**
 * AIM: Demonstrate simple object creation and method calling using a Concrete Class.
 * 
 * CONCEPT:
 * A Concrete Class has all methods implemented. Objects can be instantiated 
 * using the 'new' keyword.
 * 
 * EXPECTED OUTPUT:
 * Hello from the Basic Concrete Class!
 * 
 * VIVA QUESTIONS:
 * - Can we instantiate a concrete class? (Yes)
 * - Which keyword is used to create an instance? (new)
 */
public class Basic_ConcreteClass {
    public void printMessage() {
        System.out.println("Hello from the Basic Concrete Class!");
    }

    public static void main(String[] args) {
        // Create an instance of the concrete class
        Basic_ConcreteClass obj = new Basic_ConcreteClass();
        // Invoke method
        obj.printMessage();
    }
}
