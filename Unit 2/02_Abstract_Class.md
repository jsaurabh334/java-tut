# Abstract Class in Java

## 1. Definition
An **Abstract Class** is a class declared with the `abstract` keyword. It serves as a blueprint or template for other classes. It can contain both abstract methods (methods without a body) and concrete methods (methods with a body). You **cannot** create objects of an abstract class directly.

## 2. Key Features
* **Abstract Keyword**: Declared using the `abstract` modifier.
* **No Instantiation**: Cannot construct instances directly using `new`.
* **Subclassing**: Designed to be inherited (extended) by subclasses.
* **Partial Abstraction**: Can have variables, constructors, concrete methods, static methods, and final methods.

## 3. Syntax
```java
public abstract class Vehicle {
    protected String type;

    public Vehicle(String type) {
        this.type = type;
    }

    // Abstract method (no body, ends with semicolon)
    public abstract void startEngine();

    // Concrete method
    public void displayType() {
        System.out.println("Vehicle type: " + type);
    }
}
```

## 4. Working Explanation
When the compiler encounters `abstract class`, it marks this class as incomplete. The JVM prevents direct instantiation. To use it, a concrete subclass must extend it and implement all of its abstract methods. If the subclass fails to implement them, the subclass itself must also be declared `abstract`.

## 5. Real-Life Example
Consider the concept of **Animal**. You cannot see or touch a generic "Animal" object. You only see concrete animals like a Dog, Cat, or Lion. Thus, Animal is abstract, while Dog is concrete.

## 6. Advantages
* **Code Reusability**: Common code goes in the abstract base class.
* **Template Design**: Enforces subclasses to implement specific interfaces/methods.
* **Loose Coupling**: Promotes clean inheritance trees.

## 7. Disadvantages
* **No Multi-Inheritance**: Java classes can extend only one abstract class.
* **Tight Coupling**: Subclasses are strongly tied to the abstract parent class implementation.

## 8. Difference Tables
### Abstract Class vs. Interface
| Feature | Abstract Class | Interface |
| :--- | :--- | :--- |
| **Methods** | Can have abstract & concrete. | Prior to Java 8, only abstract. Now defaults allowed. |
| **Inheritance** | Single class inheritance (`extends`). | Multiple inheritance (`implements`). |
| **Variables** | Can have instance, static, and final. | All variables are implicitly `public static final`. |

## 9. Rules and Important Points
1. An abstract class can have a constructor (called during subclass instantiation).
2. It cannot be declared `final` (because `final` prevents inheritance).
3. Abstract methods cannot be declared `private` or `static`.

## 10. University Exam Questions
* ★ **What is an Abstract Class? Explain with an example. (5 Marks)**
* ★ **Can an abstract class have constructors? Explain. (5 Marks)**

## 11. 2-Mark Questions with Answers
**Q: Can we declare an abstract class without any abstract methods?**  
**A:** Yes. We can declare a class abstract simply to prevent it from being instantiated.

## 12. 5-Mark Questions with Answers
**Q: Why can't we instantiate an abstract class?**  
**A:** Since an abstract class can contain unimplemented (abstract) methods, calling such methods on a raw instance would cause runtime failure. To avoid this, Java prevents direct instantiation.

## 13. 10-Mark Questions with Answers
**Q: Design a shape drawing system using an abstract class Shape and concrete subclasses Circle and Rectangle.**  
*(Refer to Program below for implementation details)*

## 14. Viva Questions with Answers
**Q: What is the default access modifier of an abstract method?**  
**A:** Default package-private, but typically declared `public` or `protected` so subclasses can access and override them.

## 15. Interview Questions
* **Why can't abstract methods be static?** Because static methods belong to the class, not instances, and cannot be overridden dynamically.

## 16. Memory Tricks and Mnemonics
* **Mnemonic (T-E-M-P-L-A-T-E)**: **T**emplate **E**xemplifies **M**ethods, **P**roviding **L**ayouts **A**nd **T**ransmitting **E**xecution.

## 17. Common Mistakes
* Writing a method body for an abstract method (e.g., `abstract void run() {}`). It must end with a semicolon.

## 18. Best Practices
* Use abstract classes when classes share common properties and behavior, and are closely related.

## 19. MCQs with Answers
1. **Which of the following is true for an abstract class?**  
   A) Must have at least one abstract method. B) Cannot have constructor. C) Cannot be instantiated. D) Can be final.  
   *Answer: C*

## 20. True/False Questions
* **True or False:** An abstract class can implement an interface without implementing its methods. (True)

## 21. Fill in the Blanks
* If a class contains at least one abstract method, the class **must** be declared abstract.

## 22. Sample Programs (Basic to Advanced)

```java
abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }
}

public class Main {
    public static void main(String[] args) {
        Shape s = new Circle(); // Polymorphic instantiation
        s.draw();
    }
}
```

## 23. Program Output
```text
Drawing Circle
```

## 24. Line-by-Line Code Explanation
* `abstract class Shape`: Defines the abstract base template.
* `abstract void draw()`: Declares the abstract signature.
* `class Circle extends Shape`: Implements the draw behavior.

## 25. UML/ASCII Diagrams
```
    [Shape (Abstract)]
           ^
           | (extends)
        [Circle]
```

## 26. Quick Revision Notes
* **Definition**: A template class containing abstract and concrete methods.
* **Key Syntax**: `abstract class ClassName { ... }`
* **Rule**: Cannot be instantiated; subclasses must implement abstract methods.
* **Keyword**: `abstract`
