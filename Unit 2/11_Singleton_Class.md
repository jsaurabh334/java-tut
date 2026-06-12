# Singleton Class in Java

## 1. Definition
A **Singleton Class** in Java is a design pattern that restricts the instantiation of a class to **one single instance**. It provides a global point of access to that instance, ensuring that no other instances of the class can be created.

## 2. Key Features
* **Single Instance**: Exactly one instance exists throughout the JVM lifecycle.
* **Private Constructor**: Prevents instantiation from other classes.
* **Static Member**: Holds the single instance reference.
* **Global Access Method**: A public static method (usually `getInstance()`) that returns the instance.

## 3. Syntax
```java
public class Singleton {
    // 1. Private static variable of the same class
    private static Singleton instance;

    // 2. Private constructor
    private Singleton() {}

    // 3. Public static method to get the instance
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton(); // Lazy initialization
        }
        return instance;
    }
}
```

## 4. Working Explanation
When a program calls `Singleton.getInstance()`, the method checks if the static variable `instance` is `null`. If it is null, it instantiates the class using the private constructor and stores the reference. Future calls immediately return this existing reference without creating new objects.

## 5. Real-Life Example
Consider the **Government of a Country**. There can only be one President at a time. Anyone needing presidential services must go through the same single office.

## 6. Advantages
* **Memory Savings**: Avoids repeated allocation of memory for heavy objects.
* **Controlled Access**: Manages access to shared resources (like database connection pools or thread managers).
* **Data Consistency**: Ensures centralized configuration control.

## 7. Disadvantages
* **Threading Issues**: Basic lazy initialization fails in multi-threaded environments (requires synchronization).
* **Testing Difficulty**: Hard to unit test because they maintain global state between tests.

## 8. Difference Tables
### Singleton Class vs. Normal Class
| Feature | Singleton Class | Normal Class |
| :--- | :--- | :--- |
| **Constructor** | Private. | Public (usually). |
| **Number of Instances** | Exactly one. | Unlimited (as many as memory permits). |
| **Instantiation** | Via static method (`getInstance()`). | Via `new` keyword. |

## 9. Rules and Important Points
1. The constructor must be private.
2. The instance variable must be private static.
3. Thread safety should be handled using `synchronized` blocks or double-checked locking.

## 10. University Exam Questions
* ★ **What is a Singleton Class? Write a thread-safe Singleton implementation in Java. (10 Marks)**
* ★ **Explain Lazy vs. Eager initialization in Singleton Design Pattern. (5 Marks)**

## 11. 2-Mark Questions with Answers
**Q: What is Eager Initialization?**  
**A:** In Eager Initialization, the singleton instance is created at class loading time, regardless of whether the program uses it.

## 12. 5-Mark Questions with Answers
**Q: Explain Double-Checked Locking in Singleton.**  
**A:** It is a performance optimization where synchronization is applied only when the instance is created for the first time, preventing synchronized overhead on subsequent calls.

## 13. 10-Mark Questions with Answers
**Q: Write a thread-safe singleton program utilizing the Bill Pugh Singleton helper class or double-checked locking.**  
*(Refer to Program below)*

## 14. Viva Questions with Answers
**Q: How can you break a Singleton pattern?**  
**A:** Using Java Reflection API (by changing constructor accessibility to public) or via Serialization/Deserialization.

## 15. Interview Questions
* **How can you protect a Singleton from serialization issues?** By implementing the `readResolve()` method and returning the existing instance.

## 16. Memory Tricks and Mnemonics
* **Mnemonic (O-N-E)**: **O**nly **N**eed **E**xemplar.

## 17. Common Mistakes
* Forgetting to mark the constructor private, allowing other classes to instantiate it using `new`.

## 18. Best Practices
* Use the **Bill Pugh Singleton Implementation** (static inner helper class) for high performance and thread-safety.

## 19. MCQs with Answers
1. **Which method is standard for accessing a Singleton class instance?**  
   A) `create()` B) `getInstance()` C) `new()` D) `main()`  
   *Answer: B*

## 20. True/False Questions
* **True or False:** A Singleton class can have multiple static instances. (False)

## 21. Fill in the Blanks
* To implement a singleton, the class constructor must be **private**.

## 22. Sample Programs (Basic to Advanced)

```java
class ThreadSafeSingleton {
    // volatile ensures write visibility across threads
    private static volatile ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {}

    public static ThreadSafeSingleton getInstance() {
        if (instance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null) { // Double check
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }

    void showMessage() { System.out.println("Thread-safe Singleton accessed."); }
}

public class Main {
    public static void main(String[] args) {
        ThreadSafeSingleton s1 = ThreadSafeSingleton.getInstance();
        s1.showMessage();
    }
}
```

## 23. Program Output
```text
Thread-safe Singleton accessed.
```

## 24. Line-by-Line Code Explanation
* `private static volatile ThreadSafeSingleton instance`: Volatile prevents caching issues.
* `synchronized(ThreadSafeSingleton.class)`: Restricts execution to one thread at a time during instance initialization.

## 25. UML/ASCII Diagrams
```
+----------------------------------+
|       ThreadSafeSingleton        |
+----------------------------------+
| - instance: ThreadSafeSingleton  |
+----------------------------------+
| - ThreadSafeSingleton()          |
| + getInstance(): ThreadSafeSingle|
+----------------------------------+
```

## 26. Quick Revision Notes
* **Definition**: Class designed to allow only one instance.
* **Key Syntax**: Private constructor, private static instance, public static `getInstance()`.
* **Rule**: Constructor must be private; handle thread safety.
* **Keyword**: `volatile`, `synchronized`, private constructor.
