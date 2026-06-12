package sample_programs.super_keyword;

class Person {
    String name;
    Person(String name) {
        this.name = name;
        System.out.println("Person constructor: " + name);
    }
}

class Employee extends Person {
    Employee(String name) {
        super(name); // Explicit call to parent parameterized constructor
        System.out.println("Employee constructor executed.");
    }
}

/**
 * AIM: Demonstrate 'super' keyword calling parent parameterized constructor.
 */
public class Advanced_SuperKeyword {
    public static void main(String[] args) {
        new Employee("John");
    }
}
