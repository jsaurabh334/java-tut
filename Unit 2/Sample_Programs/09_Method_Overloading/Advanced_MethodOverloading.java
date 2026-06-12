package sample_programs.method_overloading;

class OverloadDemo {
    void show(int a) { System.out.println("int signature: " + a); }
    void show(double d) { System.out.println("double signature: " + d); }
}

/**
 * AIM: Demonstrate argument type promotion in method overloading (Advanced).
 */
public class Advanced_MethodOverloading {
    public static void main(String[] args) {
        OverloadDemo demo = new OverloadDemo();
        byte b = 5;
        demo.show(b); // Promoted to int
        float f = 2.5f;
        demo.show(f); // Promoted to double
    }
}
