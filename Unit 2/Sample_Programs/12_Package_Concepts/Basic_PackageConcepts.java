package sample_programs.package_concepts;

/**
 * AIM: Demonstrate basic user-defined package declaration.
 * 
 * COMPILATION:
 * javac -d . Basic_PackageConcepts.java
 * 
 * EXECUTION:
 * java sample_programs.package_concepts.Basic_PackageConcepts
 */
public class Basic_PackageConcepts {
    public void display() {
        System.out.println("Hello from basic package!");
    }
    
    public static void main(String[] args) {
        Basic_PackageConcepts obj = new Basic_PackageConcepts();
        obj.display();
    }
}
