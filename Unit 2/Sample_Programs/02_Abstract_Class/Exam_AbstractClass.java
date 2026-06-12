package sample_programs.abstract_class;

abstract class Shape {
    abstract double area();
}

// Concrete class implementing the abstract contract
class Circle extends Shape {
    private double radius;
    Circle(double radius) { this.radius = radius; }
    
    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

/**
 * AIM: Demonstrate dynamic polymorph methods using Shape base class (Exam-Oriented).
 */
public class Exam_AbstractClass {
    public static void main(String[] args) {
        Shape shape = new Circle(5.0);
        System.out.println("Area: " + shape.area());
    }
}
