package sample_programs.interface_demo;

interface A {
    int VAL = 100; // Implicitly public static final
    void showA();
}

interface B extends A {
    void showB();
}

class TestClass implements B {
    public void showA() { System.out.println("Value of VAL: " + VAL); }
    public void showB() { System.out.println("Hello from B"); }
}

/**
 * AIM: Demonstrate interface inheritance and implicit field modifiers (Exam-Oriented).
 */
public class Exam_Interface {
    public static void main(String[] args) {
        B obj = new TestClass();
        obj.showA();
        obj.showB();
    }
}
