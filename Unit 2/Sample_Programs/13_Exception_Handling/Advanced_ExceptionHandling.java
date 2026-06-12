package sample_programs.exception_handling;

class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String msg) { super(msg); }
}

/**
 * AIM: Demonstrate custom user-defined checked exceptions (Advanced).
 */
public class Advanced_ExceptionHandling {
    static void withdraw(double balance, double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Not enough balance! Available: " + balance);
        }
        System.out.println("Withdrawal successful.");
    }

    public static void main(String[] args) {
        try {
            withdraw(100.0, 150.0);
        } catch (InsufficientBalanceException e) {
            System.out.println("Custom Exception caught: " + e.getMessage());
        }
    }
}
