package sample_programs.super_keyword;

class Animal {
    void eat() { System.out.println("Animal is eating."); }
}

class Dog extends Animal {
    void eat() { System.out.println("Dog is eating meat."); }
    
    void displayEat() {
        eat();        // Invokes child method
        super.eat();  // Invokes parent method using super
    }
}

/**
 * AIM: Demonstrate 'super' keyword invoking parent overridden method.
 */
public class Intermediate_SuperKeyword {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.displayEat();
    }
}
