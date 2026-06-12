package sample_programs.interface_demo;

interface PaymentGateway {
    void pay(double amount);
}

class UpiPayment implements PaymentGateway {
    public void pay(double amount) { System.out.println("Paid " + amount + " using UPI."); }
}

class CardPayment implements PaymentGateway {
    public void pay(double amount) { System.out.println("Paid " + amount + " using Credit Card."); }
}

/**
 * AIM: Model real-life payment systems using interface polymorphism.
 */
public class RealLife_Interface {
    public static void main(String[] args) {
        PaymentGateway gateway = new UpiPayment();
        gateway.pay(250.0);
        
        gateway = new CardPayment();
        gateway.pay(1200.0);
    }
}
