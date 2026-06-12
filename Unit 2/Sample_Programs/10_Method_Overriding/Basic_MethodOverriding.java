package sample_programs.method_overriding;

class Parent {
    void show() { System.out.println("Parent show."); }
}

class Child extends Parent {
    @Override
    void show() { System.out.println("Child show."); }
}

/**
 * AIM: Demonstrate basic method overriding concept.
 */
public class Basic_MethodOverriding {
    public static void main(String[] args) {
        Parent obj = new Child(); // Upcasting
        obj.show(); // Overridden version called
    }
}
