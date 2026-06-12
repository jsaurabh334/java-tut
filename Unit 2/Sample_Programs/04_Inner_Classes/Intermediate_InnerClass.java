package sample_programs.inner_classes;

class OuterClass {
    static String staticMsg = "Static Outer message";

    static class StaticNested {
        void show() {
            System.out.println("Accessing: " + staticMsg);
        }
    }
}

/**
 * AIM: Demonstrate Static Nested Classes in Java.
 */
public class Intermediate_InnerClass {
    public static void main(String[] args) {
        OuterClass.StaticNested nested = new OuterClass.StaticNested();
        nested.show();
    }
}
