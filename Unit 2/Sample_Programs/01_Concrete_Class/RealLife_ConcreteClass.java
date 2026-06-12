package sample_programs.concrete_class;

/**
 * AIM: Model a real-life Bank Account system using a Concrete Class.
 */
public class RealLife_ConcreteClass {
    private String accountHolder;
    private double balance;

    public RealLife_ConcreteClass(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited. Current Balance: " + balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + " withdrawn. Current Balance: " + balance);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public static void main(String[] args) {
        RealLife_ConcreteClass account = new RealLife_ConcreteClass("Amit", 1000.0);
        account.deposit(500.0);
        account.withdraw(300.0);
    }
}
