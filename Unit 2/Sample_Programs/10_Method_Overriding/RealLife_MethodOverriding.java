package sample_programs.method_overriding;

class Employee {
    double calculateBonus(double salary) { return salary * 0.05; } // Default 5%
}

class Developer extends Employee {
    @Override
    double calculateBonus(double salary) { return salary * 0.10; } // Developer gets 10%
}

class Manager extends Employee {
    @Override
    double calculateBonus(double salary) { return salary * 0.20; } // Manager gets 20%
}

/**
 * AIM: Model real-world Employee bonus distributions using overriding polymorphism.
 */
public class RealLife_MethodOverriding {
    public static void main(String[] args) {
        Employee emp1 = new Developer();
        Employee emp2 = new Manager();
        System.out.println("Developer Bonus: " + emp1.calculateBonus(50000));
        System.out.println("Manager Bonus: " + emp2.calculateBonus(80000));
    }
}
