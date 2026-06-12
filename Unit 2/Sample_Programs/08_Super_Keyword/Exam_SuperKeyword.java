package sample_programs.super_keyword;

class SuperClass {
    String type = "Base";
    SuperClass(String type) { this.type = type; }
    void render() { System.out.println("Rendering Base class."); }
}

class SubClass extends SuperClass {
    String type = "Derived";

    SubClass() {
        super("Custom Base"); // Use 1: Parent constructor
    }

    void process() {
        System.out.println("Derived type: " + type);
        System.out.println("Base type: " + super.type); // Use 2: Parent variable
        super.render(); // Use 3: Parent method
    }
}

/**
 * AIM: Consolidate all three uses of the 'super' keyword (Exam-Oriented).
 */
public class Exam_SuperKeyword {
    public static void main(String[] args) {
        SubClass obj = new SubClass();
        obj.process();
    }
}
