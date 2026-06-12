# Unit 2 Quick Revision Notes

This guide provides a comprehensive summary of all Object-Oriented Programming (OOP) concepts in Unit 2 for last-minute exam preparation.

---

## 1. One-Line Definitions

* **Concrete Class**: A class with full implementations of all its methods that can be instantiated directly.
* **Abstract Class**: A template class declared with `abstract` that cannot be instantiated and may contain abstract methods.
* **Interface**: A specification contract containing abstract methods and static constants to achieve loose coupling.
* **Inner Class**: A class declared inside another class for logical grouping and encapsulated helper behavior.
* **Aggregation**: A weak "has-a" relationship where associated objects exist independently.
* **Composition**: A strong "has-a" relationship where child object lifecycles are controlled by the parent.
* **Inheritance**: A mechanism where one class inherits fields and methods of another class ("is-a" relationship).
* **Super Keyword**: A reference variable pointing to the parent class portion of a subclass instance.
* **Method Overloading**: Defining multiple methods with the same name but different signatures in a class.
* **Method Overriding**: Redefining a superclass method in a subclass with the same signature to perform specific actions.
* **Singleton Class**: A class that limits its instantiation to exactly one object instance.
* **Package**: A namespace grouping related classes and interfaces together.
* **Exception Handling**: A runtime framework that prevents program crashes by catching execution errors.

---

## 2. Syntax Cheat Sheet

### Abstract Class & Interface
```java
// Abstract Class
public abstract class Template {
    public abstract void action();
}

// Interface
public interface Contract {
    void execute(); // Implicitly public abstract
}
```

### Inheritance & Super
```java
public class Child extends Parent {
    Child() {
        super("Initialize parent first"); // Call parent constructor
    }
}
```

### Method Overloading & Overriding
```java
// Overloading
int add(int a, int b) { return a + b; }
double add(double a, double b) { return a + b; }

// Overriding
@Override
void render() { System.out.println("Subclass render"); }
```

---

## 3. Key Comparison Tables

### Overloading vs. Overriding
| Feature | Method Overloading | Method Overriding |
| :--- | :--- | :--- |
| **Binding Time** | Compile-time (Static). | Runtime (Dynamic). |
| **Method Name** | Same. | Same. |
| **Parameters** | Must be different. | Must be same. |

### Aggregation vs. Composition
| Feature | Aggregation | Composition |
| :--- | :--- | :--- |
| **Relationship** | Weak "has-a". | Strong "has-a" (part-of). |
| **Child Lifecycle** | Independent of parent. | Dependent on parent. |

---

## 4. Exam Tips & Mnemonics
* ★ **Remember the Diamond Problem**: Java doesn't support multiple class inheritance to avoid method resolution ambiguity.
* ★ **Exception Catch Order**: Always catch subclasses (like `NullPointerException`) before superclasses (like `Exception`).
* **Mnemonic (A-C-I)**: **A**bstract **C**lasses **I**nherit; **I**nterfaces **I**mplement.
