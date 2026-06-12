package sample_programs.super_keyword;

class BasicAccount {
    double balance;
    BasicAccount(double balance) { this.balance = balance; }
    
    void printStatement() {
        System.out.println("Basic Account Balance: " + balance);
    }
}

class SavingsAccount extends BasicAccount {
    double interestRate;

    SavingsAccount(double balance, double interestRate) {
        super(balance);
        this.interestRate = interestRate;
    }

    @Override
    void printStatement() {
        super.printStatement(); // Reuse parent statement printing
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

/**
 * AIM: Model Savings Bank Account statements reusing superclass logic.
 */
public class RealLife_SuperKeyword {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(5000.0, 3.5);
        sa.printStatement();
    }
}
