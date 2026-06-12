package sample_programs.singleton_class;

class ThreadSafeSingleton {
    private static volatile ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {}

    public static ThreadSafeSingleton getInstance() {
        if (instance == null) { // Block 1
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null) { // Block 2 (Double Check)
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }
}

/**
 * AIM: Demonstrate Thread-Safe Singleton with Double-Checked Locking.
 */
public class Advanced_SingletonClass {
    public static void main(String[] args) {
        ThreadSafeSingleton s = ThreadSafeSingleton.getInstance();
        System.out.println("Thread safe instance loaded: " + s);
    }
}
