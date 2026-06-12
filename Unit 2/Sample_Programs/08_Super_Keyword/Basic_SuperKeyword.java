package sample_programs.super_keyword;

class Parent {
    int value = 10;
}

class Child extends Parent {
    int value = 20;

    void display() {
        System.out.println("Child value: " + value);
        System.out.println("Parent value: " + super.value); // Access parent variable
    }
}

/**
 * AIM: Demonstrate 'super' keyword accessing parent instance variable.
 */
public class Basic_SuperKeyword {
    public static void main(String[] args) {
        Child c = new Child();
        c.display();
    }
}
