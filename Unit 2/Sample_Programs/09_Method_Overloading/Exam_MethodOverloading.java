package sample_programs.method_overloading;

class Geometry {
    // Valid: Parameter types are different, so return types can be different
    int getVolume(int side) { return side * side * side; }
    double getVolume(double radius) { return (4.0/3.0) * Math.PI * Math.pow(radius, 3); }
}

/**
 * AIM: Demonstrate valid overloading with parameter type and return type variations (Exam-Oriented).
 */
public class Exam_MethodOverloading {
    public static void main(String[] args) {
        Geometry geom = new Geometry();
        System.out.println("Cube Volume: " + geom.getVolume(5));
        System.out.println("Sphere Volume: " + geom.getVolume(3.5));
    }
}
