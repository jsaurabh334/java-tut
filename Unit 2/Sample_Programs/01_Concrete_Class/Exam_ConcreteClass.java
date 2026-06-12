package sample_programs.concrete_class;

/**
 * AIM: Demonstrate class initialization blocks and constructor execution order (Exam-Oriented).
 * 
 * EXPECTED OUTPUT:
 * Static Block Executed
 * Instance Block Executed
 * Constructor Executed
 */
public class Exam_ConcreteClass {
    static {
        System.out.println("Static Block Executed");
    }

    {
        System.out.println("Instance Block Executed");
    }

    public Exam_ConcreteClass() {
        System.out.println("Constructor Executed");
    }

    public static void main(String[] args) {
        new Exam_ConcreteClass();
    }
}
