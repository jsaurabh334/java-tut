package sample_programs.concrete_class;

/**
 * AIM: Demonstrate parameterized constructors and instance variables in a Concrete Class.
 * 
 * EXPECTED OUTPUT:
 * Brand: Toyota, Speed: 120
 */
public class Intermediate_ConcreteClass {
    private String brand;
    private int speed;

    // Parameterized constructor
    public Intermediate_ConcreteClass(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public void display() {
        System.out.println("Brand: " + brand + ", Speed: " + speed);
    }

    public static void main(String[] args) {
        Intermediate_ConcreteClass car = new Intermediate_ConcreteClass("Toyota", 120);
        car.display();
    }
}
