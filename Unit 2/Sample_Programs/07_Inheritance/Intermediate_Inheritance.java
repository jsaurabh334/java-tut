package sample_programs.inheritance;

class Animal {
    void eat() { System.out.println("Eating..."); }
}

class Dog extends Animal {
    void bark() { System.out.println("Barking..."); }
}

class Puppy extends Dog {
    void weep() { System.out.println("Weeping..."); }
}

/**
 * AIM: Demonstrate Multilevel Inheritance.
 */
public class Intermediate_Inheritance {
    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.eat();  // From Grandparent
        p.bark(); // From Parent
        p.weep(); // From Self
    }
}
