package sample_programs.inner_classes;

interface Greeting {
    void sayHello();
}

/**
 * AIM: Demonstrate Anonymous Inner Classes (Exam-Oriented).
 */
public class Exam_InnerClass {
    public static void main(String[] args) {
        // Anonymous inner class implementing Greeting interface
        Greeting g = new Greeting() {
            public void sayHello() {
                System.out.println("Hello from Anonymous Inner Class!");
            }
        };
        g.sayHello();
    }
}
