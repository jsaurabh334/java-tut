# Method Overriding in Java

## 1. Definition
**Method Overriding** is a feature in Java that allows a subclass to provide a specific implementation of a method that is already defined in its superclass. It is also known as **Runtime Polymorphism** or **Dynamic Binding**.

## 2. Key Features
* **Same Signature**: Overriding method must have the exact same name, return type, and parameter list as the parent method.
* **Inheritance Required**: Can only happen between a superclass and subclass.
* **Late Binding**: Resolution of the method call is done by the JVM at runtime based on the actual object instance type, not the reference type.

## 3. Syntax
```java
class Bank {
    double getRateOfInterest() { return 0.0; }
}

class SBI extends Bank {
    @Override // Optional but recommended annotation
    double getRateOfInterest() { return 6.5; }
}
```

## 4. Working Explanation
When you use a parent reference to point to a child object (e.g. `Bank b = new SBI();`) and invoke `b.getRateOfInterest()`, the compiler only checks if the method exists in the `Bank` class. During runtime, the JVM looks up the actual object type (`SBI`) in memory and executes the overridden version.

## 5. Real-Life Example
Consider the action **"Draw"**. If a parent tells a child to "Draw", the parent has a default idea. But if the child is an artist who draws landscape (`overrides` the default action), the output is a landscape sketch. The command is the same, but the implementation is specific to the child.

## 6. Advantages
* **Runtime Flexibility**: Allows writing code that behaves differently based on object instances.
* **Loose Coupling**: Supports the Open-Closed Design Principle (open for extension, closed for modification).
* **Interface Implementation**: Fundamental for using abstract classes and interfaces.

## 7. Disadvantages
* **Performance overhead**: Dynamic method dispatch requires lookup tables (vtable) during execution, which is slightly slower than direct static binding.

## 8. Difference Tables
Refer to [09_Method_Overloading.md](file:///Users/saurabhjain/Desktop/java%20tut/Unit%202/09_Method_Overloading.md#8-difference-tables) for Method Overloading vs. Method Overriding comparison table.

## 9. Rules and Important Points
1. The overriding method cannot have a **more restrictive access modifier** than the parent method (e.g., if parent method is `protected`, child method cannot be package-private or `private`).
2. Private, static, and final methods **cannot** be overridden.
3. The `@Override` annotation tells the compiler to verify that the method actually overrides a parent method.

## 10. University Exam Questions
* ★ **What is Method Overriding? Explain rules and Dynamic Method Dispatch with an example. (10 Marks)**
* ★ **Why can't we override static and private methods in Java? (5 Marks)**

## 11. 2-Mark Questions with Answers
**Q: Can we override a constructor?**  
**A:** No. Constructors cannot be inherited, so they cannot be overridden.

## 12. 5-Mark Questions with Answers
**Q: Explain Dynamic Method Dispatch.**  
**A:** Dynamic Method Dispatch is the mechanism by which a call to an overridden method is resolved at runtime rather than compile-time. It is achieved by assigning a subclass object to a superclass reference variable.

## 13. 10-Mark Questions with Answers
**Q: Design a Payment processing system showing runtime polymorphism with UPI, Card, and Cash subclasses.**  
*(Refer to Program below)*

## 14. Viva Questions with Answers
**Q: What is Covariant Return Type?**  
**A:** Since Java 5, an overriding method can return a subclass type of the type returned by the overridden superclass method.

## 15. Interview Questions
* **What happens if an overriding method throws a checked exception?** The child method cannot throw a broader or new checked exception than the parent method. It can only throw narrower exceptions or no exceptions.

## 16. Memory Tricks and Mnemonics
* **Mnemonic (R-U-N)**: **R**untime **U**nderstands **N**ature-of-object.

## 17. Common Mistakes
* Changing the parameter list slightly in the subclass. This results in Method Overloading, not Method Overriding, which might go unnoticed without the `@Override` annotation.

## 18. Best Practices
* Always use `@Override` annotation to catch signature mismatches during compilation.

## 19. MCQs with Answers
1. **Method overriding occurs at:**  
   A) Compile-time B) Runtime C) Pre-compilation D) None of the above  
   *Answer: B*

## 20. True/False Questions
* **True or False:** An overriding method can have a different return type if they are covariant. (True)

## 21. Fill in the Blanks
* A method declared as **final** cannot be overridden.

## 22. Sample Programs (Basic to Advanced)

```java
class Vehicle {
    void run() { System.out.println("Vehicle is running"); }
}

class Bike extends Vehicle {
    @Override
    void run() { System.out.println("Bike is running safely"); }
}

public class Main {
    public static void main(String[] args) {
        Vehicle v = new Bike(); // Dynamic Method Dispatch
        v.run();
    }
}
```

## 23. Program Output
```text
Bike is running safely
```

## 24. Line-by-Line Code Explanation
* `Vehicle v = new Bike()`: Parent reference points to subclass instance.
* `v.run()`: JVM checks runtime object type (`Bike`) and executes its overridden `run()` method.

## 25. UML/ASCII Diagrams
```
  [Vehicle] {run()}
     ^
     | (extends)
  [Bike] {run() - overridden}
```

## 26. Quick Revision Notes
* **Definition**: Providing specific implementation of parent class method in child class.
* **Key Syntax**: Keep signature identical, add `@Override`.
* **Rule**: Cannot override static, private, or final methods; access modifier cannot be restricted.
* **Keyword**: Dynamic binding, runtime polymorphism.
