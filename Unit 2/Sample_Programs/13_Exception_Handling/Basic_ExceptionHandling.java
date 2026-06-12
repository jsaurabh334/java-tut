package sample_programs.exception_handling;

/**
 * AIM: Demonstrate basic try-catch-finally structure.
 */
public class Basic_ExceptionHandling {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // Throws ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}
