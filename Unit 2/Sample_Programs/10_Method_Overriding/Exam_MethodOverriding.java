package sample_programs.method_overriding;

class SuperClass {
    static void staticMethod() { System.out.println("Static in SuperClass"); }
}

class SubClass extends SuperClass {
    // This hides SuperClass's staticMethod, it does not override it.
    static void staticMethod() { System.out.println("Static in SubClass"); }
}

/**
 * AIM: Demonstrate Method Hiding with static methods (Exam-Oriented).
 */
public class Exam_MethodOverriding {
    public static void main(String[] args) {
        SuperClass obj = new SubClass();
        obj.staticMethod(); // Calls SuperClass's method because binding is static
    }
}
