package sample_programs.exception_handling;

/**
 * AIM: Demonstrate multiple catch blocks and ordering rules (Exam-Oriented).
 */
public class Exam_ExceptionHandling {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            arr[10] = 50 / 0; // Throws ArithmeticException first
        } catch (ArithmeticException e) {
            System.out.println("Handled Arithmetic: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Handled Index OOB: " + e.getMessage());
        } catch (Exception e) { // Catch-all parent must be last
            System.out.println("Handled Generic Exception: " + e.getMessage());
        }
    }
}
