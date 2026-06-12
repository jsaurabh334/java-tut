package sample_programs.inner_classes;

class LocalOuter {
    void process() {
        int x = 100; // Effectively final
        class LocalInner {
            void print() {
                System.out.println("Variable from outer scope: " + x);
            }
        }
        LocalInner inner = new LocalInner();
        inner.print();
    }
}

/**
 * AIM: Demonstrate Local Inner Classes.
 */
public class Advanced_InnerClass {
    public static void main(String[] args) {
        LocalOuter outer = new LocalOuter();
        outer.process();
    }
}
