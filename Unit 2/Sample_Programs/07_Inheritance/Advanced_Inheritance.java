package sample_programs.inheritance;

class Shape {
    void draw() { System.out.println("Drawing a shape."); }
}

class Circle extends Shape {
    void drawCircle() { System.out.println("Drawing Circle."); }
}

class Rectangle extends Shape {
    void drawRectangle() { System.out.println("Drawing Rectangle."); }
}

/**
 * AIM: Demonstrate Hierarchical Inheritance.
 */
public class Advanced_Inheritance {
    public static void main(String[] args) {
        Circle c = new Circle();
        Rectangle r = new Rectangle();

        c.draw(); // Inherited
        c.drawCircle();

        r.draw(); // Inherited
        r.drawRectangle();
    }
}
