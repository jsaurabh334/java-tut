# Inheritance in Java

## 1. Definition
**Inheritance** is a mechanism in Java by which one class acquires the properties (variables) and behaviors (methods) of another class. It represents an **"IS-A"** relationship (e.g., Dog is an Animal). The class that inherits is called the **Subclass** (child), and the class being inherited is the **Superclass** (parent).

## 2. Key Features
* **Reusability**: Subclass reuses parent code without writing it again.
* **Method Overriding**: Subclass can change parent method behavior.
* **Extends Keyword**: Used to establish inheritance.
* **Types**: Single, Multilevel, Hierarchical, Multiple (via interfaces), Hybrid (via interfaces).

## 3. Syntax
```java
class Animal {
    void eat() { System.out.println("Eating..."); }
}

class Dog extends Animal {
    void bark() { System.out.println("Barking..."); }
}
```

## 4. Working Explanation
When you use `extends`, the subclass gains access to non-private fields and methods of the superclass. When an object of the subclass is created, memory is allocated for both superclass and subclass properties. The superclass constructor is executed first (via `super()`), followed by the subclass constructor.

## 5. Real-Life Example
Consider a **Bicycle** and a **MountainBike**. A MountainBike is a Bicycle. It inherits the basic features of a bicycle (gears, speed, brakes) but adds specialized features (suspension, off-road tires).

## 6. Advantages
* **Code Reusability**: Eliminates redundant code in subclasses.
* **Method Overriding (Polymorphism)**: Allows subclasses to implement specific behavior.
* **Extensibility**: Easy to add new classes sharing common code.

## 7. Disadvantages
* **Tight Coupling**: Subclasses depend heavily on parent class implementation.
* **Security Risk**: If parent class implementation changes, it affects all subclasses.

## 8. Difference Tables
### IS-A vs. HAS-A Relationship
| Feature | IS-A (Inheritance) | HAS-A (Association/Composition) |
| :--- | :--- | :--- |
| **Concept** | One class is a type of another class. | One class contains an instance of another. |
| **Keyword** | Established using `extends` or `implements`. | Established using variables/references. |
| **Example** | `Dog extends Animal` | `Car has Engine` |

## 9. Rules and Important Points
1. Java does not support **Multiple Inheritance** with classes (a class cannot extend more than one class directly) to avoid ambiguity (the Diamond Problem).
2. Private members of a superclass are not inherited.
3. Constructors are not inherited (but are invoked).

## 10. University Exam Questions
* ★ **Explain types of inheritance supported in Java with examples. Why is multiple inheritance not supported? (10 Marks)**
* ★ **What is the Diamond Problem in Java? How is it resolved? (5 Marks)**

## 11. 2-Mark Questions with Answers
**Q: Which class is the root of all classes in Java?**  
**A:** The `java.lang.Object` class.

## 12. 5-Mark Questions with Answers
**Q: Explain the Diamond Problem with a diagram.**  
**A:** If Class A has two subclasses B and C, and Class D extends both B and C, there is ambiguity if B and C override a method from A. D wouldn't know which method to call. Java avoids this by not allowing multiple class inheritance.

## 13. 10-Mark Questions with Answers
**Q: Program single, multilevel, and hierarchical inheritance in a single file.**  
*(Refer to Program below)*

## 14. Viva Questions with Answers
**Q: Can we prevent a class from being inherited?**  
**A:** Yes, by declaring it with the `final` keyword.

## 15. Interview Questions
* **Does a child class copy the parent class variables?** Yes, space for inherited fields is allocated in heap memory when the subclass object is instantiated.

## 16. Memory Tricks and Mnemonics
* **Mnemonic (I-S-A)**: **I**nheritance **S**hows **A**llocation-parent-first.

## 17. Common Mistakes
* Attempting to extend multiple classes (e.g., `class C extends A, B`). This results in a compilation error.

## 18. Best Practices
* Use inheritance only when the "IS-A" relationship is strictly true throughout the lifecycle. Otherwise, prefer composition.

## 19. MCQs with Answers
1. **Which keyword is used to implement inheritance in Java?**  
   A) `implements` B) `extends` C) `inherits` D) `super`  
   *Answer: B*

## 20. True/False Questions
* **True or False:** A subclass has access to the private constructor of a superclass. (False)

## 21. Fill in the Blanks
* Multiple inheritance in Java can be achieved only through **interfaces**.

## 22. Sample Programs (Basic to Advanced)

```java
class Device {
    void powerOn() { System.out.println("Device is now powered ON."); }
}

class Computer extends Device {
    void boot() { System.out.println("OS Booting..."); }
}

class Laptop extends Computer {
    void chargeBattery() { System.out.println("Battery charging..."); }
}

public class Main {
    public static void main(String[] args) {
        Laptop myLaptop = new Laptop();
        myLaptop.powerOn(); // Inherited from Device
        myLaptop.boot();    // Inherited from Computer
        myLaptop.chargeBattery(); // Laptop specific
    }
}
```

## 23. Program Output
```text
Device is now powered ON.
OS Booting...
Battery charging...
```

## 24. Line-by-Line Code Explanation
* `class Laptop extends Computer`: Multilevel inheritance. `Laptop` is a `Computer`, which is a `Device`.

## 25. UML/ASCII Diagrams
```
  [Device]
     ^
     | (extends)
  [Computer]
     ^
     | (extends)
  [Laptop]
```

## 26. Quick Revision Notes
* **Definition**: Process where one class inherits features of another.
* **Key Syntax**: `class Child extends Parent { ... }`
* **Rule**: Multiple inheritance not allowed for classes; private variables not inherited.
* **Keyword**: `extends`
