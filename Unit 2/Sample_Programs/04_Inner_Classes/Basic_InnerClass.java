package sample_programs.inner_classes;

class Outer {
    private String msg = "Outer private message";

    class Inner {
        void display() {
            System.out.println("Accessing: " + msg);
        }
    }
}

/**
 * AIM: Demonstrate Member Inner Class definition and instantiation.
 */
public class Basic_InnerClass {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.display();
    }
}
