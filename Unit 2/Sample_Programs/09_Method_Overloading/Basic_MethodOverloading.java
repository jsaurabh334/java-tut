package sample_programs.method_overloading;

class Calculator {
    // Overloaded with 2 parameters
    int add(int a, int b) { return a + b; }
    
    // Overloaded with 3 parameters
    int add(int a, int b, int c) { return a + b + c; }
}

/**
 * AIM: Demonstrate basic method overloading by changing the number of parameters.
 */
public class Basic_MethodOverloading {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Sum of 2: " + calc.add(5, 10));
        System.out.println("Sum of 3: " + calc.add(5, 10, 15));
    }
}
