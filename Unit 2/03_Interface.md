# Interface in Java

## 1. Definition
An **Interface** in Java is a reference type, similar to a class, that can contain only constants, method signatures, default methods, static methods, and nested types. It provides 100% abstraction (prior to Java 8) and is used to achieve loose coupling and multiple inheritance.

## 2. Key Features
* **Full Abstraction**: Describes "what" a class does, not "how".
* **Multiple Inheritance**: A class can implement multiple interfaces.
* **Implicit Modifiers**: Fields are public, static, and final. Methods are public and abstract (by default).
* **Java 8 additions**: Can contain `default` and `static` methods with bodies.
* **Java 9 additions**: Can contain private methods.

## 3. Syntax
```java
public interface Drivable {
    // Implicitly: public static final int MAX_SPEED = 120;
    int MAX_SPEED = 120;

    // Implicitly: public abstract void accelerate();
    void accelerate();

    // Default method
    default void stop() {
        System.out.println("Stopping vehicle...");
    }
}
```

## 4. Working Explanation
An interface cannot be instantiated. Classes "implement" interfaces using the `implements` keyword. The implementing class must override all abstract methods of the interface, otherwise, it must be declared abstract.

## 5. Real-Life Example
Think of a **Remote Control**. The remote defines buttons (methods like power, volume up, channel up). Every TV brand implements this interface differently, but they all conform to the same layout of buttons.

## 6. Advantages
* **Loose Coupling**: Decouples specification from implementation.
* **Multiple Inheritance**: Circumvents Java's single inheritance rule.
* **Standardization**: Enforces common contracts across unrelated classes.

## 7. Disadvantages
* **Interface Pollution**: Overdesigning with too many small interfaces can make code hard to manage.
* **Rigidity**: Adding methods to public interfaces breaks all implementing classes (resolved via `default` methods).

## 8. Difference Tables
### Interface vs. Abstract Class
Refer to [02_Abstract_Class.md](file:///Users/saurabhjain/Desktop/java%20tut/Unit%202/02_Abstract_Class.md#8-difference-tables) for a detailed comparison table.

## 9. Rules and Important Points
1. A class can extend only one class but implement multiple interfaces.
2. Interfaces can extend other interfaces using the `extends` keyword.
3. An interface cannot have instance variables or constructors.

## 10. University Exam Questions
* ★ **What is an Interface? How does it help in achieving multiple inheritance in Java? (10 Marks)**
* ★ **Explain default and static methods in interfaces. (5 Marks)**

## 11. 2-Mark Questions with Answers
**Q: Can we create an object of an Interface?**  
**A:** No, interfaces cannot be instantiated directly. However, we can create a reference variable pointing to an object of an implementing class.

## 12. 5-Mark Questions with Answers
**Q: Write a short note on Marker Interfaces.**  
**A:** A Marker Interface is an interface that has no fields or methods (empty). Examples include `Serializable` and `Cloneable`. They instruct the JVM/compiler about special behaviors of the implementing object.

## 13. 10-Mark Questions with Answers
**Q: Program a complete system showing multiple inheritance using Drivable and Flyable interfaces.**  
*(Refer to Program below for details)*

## 14. Viva Questions with Answers
**Q: Can an interface implement another interface?**  
**A:** No. An interface can only *extend* another interface.

## 15. Interview Questions
* **Why did Java 8 introduce default methods?** To allow developers to add new methods to interfaces without breaking existing implementations.

## 16. Memory Tricks and Mnemonics
* **Mnemonic (C-O-N-T-R-A-C-T)**: **C**lass **O**ptions **N**ot **T**ransferred **R**ight **A**way; **C**ontractual **T**reaty.

## 17. Common Mistakes
* Changing access modifiers in implementing methods to something weaker (like package-private). They must remain `public`.

## 18. Best Practices
* Use interfaces to define APIs and contracts. Use abstract classes for base implementations.

## 19. MCQs with Answers
1. **Prior to Java 8, interfaces could only contain:**  
   A) Default methods B) Private methods C) Abstract methods & Constants D) Static methods  
   *Answer: C*

## 20. True/False Questions
* **True or False:** All variables declared in interfaces are final. (True)

## 21. Fill in the Blanks
* Interfaces are implemented using the **implements** keyword.

## 22. Sample Programs (Basic to Advanced)

```java
interface Printable {
    void print();
}

interface Showable {
    void show();
}

class Document implements Printable, Showable {
    public void print() {
        System.out.println("Printing document...");
    }
    public void show() {
        System.out.println("Showing document preview...");
    }
}

public class Main {
    public static void main(String[] args) {
        Document doc = new Document();
        doc.print();
        doc.show();
    }
}
```

## 23. Program Output
```text
Printing document...
Showing document preview...
```

## 24. Line-by-Line Code Explanation
* `interface Printable`: Declares the contract.
* `class Document implements Printable, Showable`: Implements multiple interfaces.
* `public void print()`: Must declare public to match parent interface declaration.

## 25. UML/ASCII Diagrams
```
 [Printable]      [Showable]
      ^               ^
      |               |
      +-------+-------+
              | (implements)
          [Document]
```

## 26. Quick Revision Notes
* **Definition**: A contract class containing only abstract methods and constants.
* **Key Syntax**: `interface InterfaceName { ... }`
* **Rule**: Multiple inheritance achieved; all fields are public, static, and final.
* **Keyword**: `interface`, `implements`
