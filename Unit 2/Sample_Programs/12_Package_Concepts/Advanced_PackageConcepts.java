package sample_programs.package_concepts;

import static java.lang.Math.*; // Static import of mathematical functions

/**
 * AIM: Demonstrate static imports to access static members directly (Advanced).
 */
public class Advanced_PackageConcepts {
    public static void main(String[] args) {
        // No need to write Math.sqrt or Math.PI
        System.out.println("Square root: " + sqrt(25));
        System.out.println("PI Value: " + PI);
    }
}
