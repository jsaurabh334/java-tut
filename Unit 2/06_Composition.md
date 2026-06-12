# Composition in Java

## 1. Definition
**Composition** is a strong form of Association where a container object (parent) owns a contained object (child). It represents a **"part-of"** relationship. In composition, the lifecycle of the child object is entirely managed by the parent; if the parent is destroyed, the child is destroyed too.

## 2. Key Features
* **Strong Association**: Ownership is exclusive and absolute.
* **Co-dependency**: The child cannot exist without the parent.
* **Internal Instantiation**: The child object is created inside the parent object's constructor or definition.

## 3. Syntax
```java
class Engine {
    void start() { System.out.println("Engine starting..."); }
}

class Car {
    // Composition: Car owns and manages Engine lifecycle
    private final Engine engine;

    Car() {
        this.engine = new Engine(); // Created internally
    }
}
```

## 4. Working Explanation
Because the `Engine` is instantiated inside the `Car` constructor using `new Engine()`, it is tied to the memory structure of the `Car` instance. When the `Car` goes out of scope and is Garbage Collected, the inner `Engine` instance is dereferenced and cleaned up as well.

## 5. Real-Life Example
A **Human** and a **Heart**. A Heart cannot exist outside a Human body, and when the Human dies, the Heart ceases to function as well.

## 6. Advantages
* **Control**: Parent guarantees availability of child resources.
* **Encapsulation**: The child class is kept hidden from outside classes.
* **Polymorphism**: The parent can swap internal implementations dynamically.

## 7. Disadvantages
* **Tight Coupling**: Changes in the child class can easily break the parent class.
* **Harder to Test**: Mocking internal instances requires special tools/patterns.

## 8. Difference Tables
Refer to [05_Aggregation.md](file:///Users/saurabhjain/Desktop/java%20tut/Unit%202/05_Aggregation.md#8-difference-tables) for the Aggregation vs. Composition comparison table.

## 9. Rules and Important Points
1. Implement Composition by instantiating the dependent object inside the parent class (usually constructor).
2. The contained class reference should generally be `private` or `private final` to enforce ownership.

## 10. University Exam Questions
* ★ **What is Composition? Explain with a programming example. (5 Marks)**
* ★ **Differentiate between Aggregation and Composition with UML diagrams. (10 Marks)**

## 11. 2-Mark Questions with Answers
**Q: How is Composition represented in UML?**  
**A:** Using a filled solid black diamond (`◆`).

## 12. 5-Mark Questions with Answers
**Q: Explain how Composition differs from Inheritance.**  
**A:** Inheritance represents an "IS-A" relationship (e.g. Dog is an Animal). Composition represents a "HAS-A" (specifically "PART-OF") relationship (e.g. Car has an Engine). Composition is generally preferred because it provides lower coupling.

## 13. 10-Mark Questions with Answers
**Q: Write a Java program representing a House composed of multiple Rooms. Explain its memory execution.**  
*(Refer to Program below)*

## 14. Viva Questions with Answers
**Q: If `House h = null;` is executed, what happens to the internal `Room` objects?**  
**A:** They become unreachable and will be reclaimed by the Garbage Collector.

## 15. Interview Questions
* **Why is composition preferred over inheritance in modern software architecture?** It allows changing behavior at runtime (dynamic subclass swapping) and avoids deep, fragile inheritance hierarchies.

## 16. Memory Tricks and Mnemonics
* **Mnemonic (T-I-G-H-T)**: **T**ightly **I**ntertwined, **G**arbage-collector **H**alts **T**ogether.

## 17. Common Mistakes
* Passing an already created object from the outside and calling it Composition (that is Aggregation).

## 18. Best Practices
* Use Composition when the parent class completely dominates and manages the lifecycle of the helper objects.

## 19. MCQs with Answers
1. **Composition represents a:**  
   A) Weak Association B) Strong HAS-A relationship C) IS-A relationship D) None of the above  
   *Answer: B*

## 20. True/False Questions
* **True or False:** In Composition, a child object can be shared by multiple parents. (False)

## 21. Fill in the Blanks
* Composition is a strong form of **Association**.

## 22. Sample Programs (Basic to Advanced)

```java
class Room {
    String name;
    Room(String name) { this.name = name; }
}

class House {
    private Room kitchen;

    House() {
        // Room created inside House (Composition)
        this.kitchen = new Room("Kitchen");
    }

    void showHouse() {
        System.out.println("House has: " + kitchen.name);
    }
}

public class Main {
    public static void main(String[] args) {
        House myHouse = new House();
        myHouse.showHouse();
    }
}
```

## 23. Program Output
```text
House has: Kitchen
```

## 24. Line-by-Line Code Explanation
* `this.kitchen = new Room("Kitchen")`: The House object creates its own kitchen.
* If `myHouse` is set to null, the kitchen room is also reclaimed.

## 25. UML/ASCII Diagrams
```
  [House] ◆--------> [Room]
```

## 26. Quick Revision Notes
* **Definition**: Strong "has-a" relationship where child objects die with the parent.
* **Key Syntax**: Instantiate child inside the parent constructor.
* **Rule**: Life of child depends completely on parent.
* **Keyword**: Part-of, strong association, composition.
