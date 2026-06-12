package sample_programs.inheritance;

class Parent {
    void show() { System.out.println("Parent show method."); }
}

class Child extends Parent {
    void display() { System.out.println("Child display method."); }
}

/**
 * AIM: Demonstrate basic Single Inheritance.
 */
public class Basic_Inheritance {
    public static void main(String[] args) {
        Child c = new Child();
        c.show(); // Inherited method
        c.display();
    }
}
