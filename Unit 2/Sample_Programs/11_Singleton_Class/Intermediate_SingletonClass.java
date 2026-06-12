package sample_programs.singleton_class;

class EagerSingleton {
    // Instance created during class loading
    private static final EagerSingleton INSTANCE = new EagerSingleton();

    private EagerSingleton() {}

    public static EagerSingleton getInstance() {
        return INSTANCE;
    }
    
    void show() { System.out.println("Eager Singleton accessed."); }
}

/**
 * AIM: Demonstrate Eager Initialization Singleton.
 */
public class Intermediate_SingletonClass {
    public static void main(String[] args) {
        EagerSingleton s = EagerSingleton.getInstance();
        s.show();
    }
}
