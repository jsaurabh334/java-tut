package sample_programs.inheritance;

class Employee {
    String name;
    double baseSalary;
    
    Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }
    
    void work() { System.out.println(name + " is working."); }
}

class Manager extends Employee {
    double bonus;

    Manager(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    void showDetails() {
        System.out.println("Manager: " + name + ", Total Income: " + (baseSalary + bonus));
    }
}

/**
 * AIM: Model real-world Employee payroll structures using inheritance.
 */
public class RealLife_Inheritance {
    public static void main(String[] args) {
        Manager mgr = new Manager("Saurabh", 80000.0, 15000.0);
        mgr.work();
        mgr.showDetails();
    }
}
