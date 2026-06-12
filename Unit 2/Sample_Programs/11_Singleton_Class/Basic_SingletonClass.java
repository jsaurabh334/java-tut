package sample_programs.singleton_class;

class SimpleSingleton {
    private static SimpleSingleton instance;
    
    private SimpleSingleton() {}

    public static SimpleSingleton getInstance() {
        if (instance == null) {
            instance = new SimpleSingleton();
        }
        return instance;
    }
    
    void show() { System.out.println("Simple Singleton accessed."); }
}

/**
 * AIM: Demonstrate basic Lazy Initialization Singleton.
 */
public class Basic_SingletonClass {
    public static void main(String[] args) {
        SimpleSingleton s = SimpleSingleton.getInstance();
        s.show();
    }
}
