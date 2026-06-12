package sample_programs.inheritance;

class ParentClass {
    ParentClass() {
        System.out.println("Parent constructor executed first.");
    }
}

class ChildClass extends ParentClass {
    ChildClass() {
        // Implicit super() is called here
        System.out.println("Child constructor executed second.");
    }
}

/**
 * AIM: Demonstrate Constructor execution order under inheritance (Exam-Oriented).
 */
public class Exam_Inheritance {
    public static void main(String[] args) {
        new ChildClass();
    }
}
