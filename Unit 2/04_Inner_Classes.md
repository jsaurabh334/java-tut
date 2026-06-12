# Inner Classes in Java

## 1. Definition
An **Inner Class** (or Nested Class) is a class declared inside another class. It allows logically grouping classes that are only used in one place, enhancing encapsulation and readability.

## 2. Key Features
* **Types**: Member Inner Class, Static Nested Class, Local Inner Class, Anonymous Inner Class.
* **Encapsulation**: Inner classes can access all members (including private members) of the outer class.
* **Access Control**: Can be private, protected, public, or package-private.

## 3. Syntax
```java
public class Outer {
    private String msg = "Hello from Outer";

    class Inner {
        void display() {
            System.out.println(msg); // Access private outer field
        }
    }
}
```

## 4. Working Explanation
To instantiate a non-static Inner Class, you must first create an instance of the Outer Class. The inner class instance is implicitly tied to the outer class instance.
```java
Outer outer = new Outer();
Outer.Inner inner = outer.new Inner();
```

## 5. Real-Life Example
Think of a **Car** and its **Engine**. The Engine class only makes sense in the context of the Car, and it needs direct access to the Car's private components (like the fuel tank).

## 6. Advantages
* **Better Encapsulation**: Restricts access of helper classes to the outer class only.
* **Readability**: Groups helper code near the place of use.
* **Direct Access**: Code is clean because the inner class can access outer fields without getters/setters.

## 7. Disadvantages
* **Complexity**: Can make code hard to read if inner classes contain nested logic.
* **Memory Leak**: Non-static inner classes keep a reference to the outer class, preventing garbage collection of the outer object.

## 8. Difference Tables
### Member Inner Class vs. Static Nested Class
| Feature | Member Inner Class | Static Nested Class |
| :--- | :--- | :--- |
| **Static Keyword** | No | Yes |
| **Outer Access** | Accesses instance and static members. | Accesses static members only. |
| **Instantiation** | Requires Outer instance (`outer.new Inner()`). | Does not require Outer instance (`new Outer.Inner()`). |

## 9. Rules and Important Points
1. Non-static inner classes cannot declare static methods or static fields (until Java 16).
2. Local inner classes can only access local variables that are final or effectively final.

## 10. University Exam Questions
* ★ **Explain types of Nested Classes in Java with examples. (10 Marks)**
* ★ **What is an Anonymous Inner Class? Write its syntax. (5 Marks)**

## 11. 2-Mark Questions with Answers
**Q: How do you instantiate a static nested class?**  
**A:** `Outer.StaticInner nested = new Outer.StaticInner();` (No outer instance is needed).

## 12. 5-Mark Questions with Answers
**Q: Explain Anonymous Inner Classes with an example.**  
**A:** An anonymous inner class is a class without a name created to override a method or implement an interface on the fly (e.g., event listeners).

## 13. 10-Mark Questions with Answers
**Q: Compare Member, Static, Local, and Anonymous inner classes with syntax and code block.**  
*(Refer to Program below for details)*

## 14. Viva Questions with Answers
**Q: Does compiler create separate `.class` files for inner classes?**  
**A:** Yes, in the format `Outer$Inner.class`.

## 15. Interview Questions
* **What is an "effectively final" variable?** A variable whose value is never changed after initialization.

## 16. Memory Tricks and Mnemonics
* **Mnemonic (N-E-S-T)**: **N**on-static **E**xpects **S**ource **T**ie.

## 17. Common Mistakes
* Attempting to instantiate a member inner class using `new Outer.Inner()` directly without an outer instance.

## 18. Best Practices
* Use `static` nested classes unless you explicitly need access to the outer class's instance fields.

## 19. MCQs with Answers
1. **Which nested class does not require an instance of the outer class?**  
   A) Member inner class B) Static nested class C) Local inner class D) Anonymous inner class  
   *Answer: B*

## 20. True/False Questions
* **True or False:** Local inner classes can be declared public. (False)

## 21. Fill in the Blanks
* Anonymous inner classes are defined and instantiated in a **single** expression.

## 22. Sample Programs (Basic to Advanced)

```java
class Outer {
    static class StaticNested {
        void show() { System.out.println("Static Nested Class"); }
    }
    class MemberInner {
        void show() { System.out.println("Member Inner Class"); }
    }
}

public class Main {
    public static void main(String[] args) {
        // Static
        Outer.StaticNested nested = new Outer.StaticNested();
        nested.show();

        // Non-static
        Outer outer = new Outer();
        Outer.MemberInner inner = outer.new MemberInner();
        inner.show();
    }
}
```

## 23. Program Output
```text
Static Nested Class
Member Inner Class
```

## 24. Line-by-Line Code Explanation
* `static class StaticNested`: Direct member layout, no parent tie.
* `class MemberInner`: Tied to instance of Outer.

## 25. UML/ASCII Diagrams
```
   [Outer]
      | (contains)
      +---> [MemberInner] (tied to Outer object)
      +---> [StaticNested] (independent class)
```

## 26. Quick Revision Notes
* **Definition**: A class defined inside another class.
* **Key Syntax**: `class Outer { class Inner {} }`
* **Rule**: Non-static inner class needs outer object to instantiate.
* **Keyword**: `class`, `static`
