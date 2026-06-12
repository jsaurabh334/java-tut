package sample_programs.singleton_class;

class BillPughSingleton {
    private BillPughSingleton() {}
    
    // Static helper class loaded only when getInstance is called
    private static class Helper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return Helper.INSTANCE;
    }
}

/**
 * AIM: Demonstrate Bill Pugh Singleton pattern using static helper class (Exam-Oriented).
 */
public class Exam_SingletonClass {
    public static void main(String[] args) {
        BillPughSingleton s = BillPughSingleton.getInstance();
        System.out.println("Bill Pugh instance: " + s);
    }
}
