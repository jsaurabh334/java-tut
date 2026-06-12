package sample_programs.method_overriding;

class Shape {
    void draw() { System.out.println("Drawing generic shape."); }
}

class Circle extends Shape {
    void draw() { System.out.println("Drawing Circle."); }
}

class Square extends Shape {
    void draw() { System.out.println("Drawing Square."); }
}

/**
 * AIM: Demonstrate Dynamic Method Dispatch (runtime polymorphism) with multiple subclasses.
 */
public class Intermediate_MethodOverriding {
    public static void main(String[] args) {
        Shape s;
        s = new Circle();
        s.draw(); // Calls Circle's draw
        
        s = new Square();
        s.draw(); // Calls Square's draw
    }
}
