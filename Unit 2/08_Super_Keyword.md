# Super Keyword in Java

## 1. Definition
The `super` keyword in Java is a reference variable used to refer to the immediate parent class object. It is used to access parent class instance variables, invoke parent class methods, and call parent class constructors.

## 2. Key Features
* **Variable Resolution**: Resolves variable name conflicts when parent and child have variables with the same name.
* **Method Invocation**: Invokes parent class overridden methods.
* **Constructor Calling**: Invokes parent class constructors (both default and parameterized).

## 3. Syntax
```java
// Calling parent class constructor
super(); 
super(param1, param2);

// Accessing parent field or method
super.fieldName;
super.methodName();
```

## 4. Working Explanation
During execution, the JVM sets up a reference named `super` inside the child class context pointing to the parent class portion of the subclass object instance. When the code uses `super.method()`, JVM bypasses the child class's overridden methods and runs the method implementation defined in the parent class.

## 5. Real-Life Example
Think of a **Branch Office** calling the **Head Office** for instructions. If both have an employee named "Manager", the branch manager uses the prefix "Head Office Manager" (`super.manager`) to refer to the corporate manager.

## 6. Advantages
* **Resolves Ambiguity**: Differentiates between parent and child elements sharing the same names.
* **Constructor Chaining**: Ensures parent state is initialized before child state.
* **Access to Original Logic**: Allows extending parent method functionality instead of rewriting it.

## 7. Disadvantages
* **Tight Dependency**: Overuse makes subclass tightly coupled to the internal parent structure.
* **Strict Placement**: Constructor calls (`super()`) must be the very first statement.

## 8. Difference Tables
### super vs. this
| Feature | super | this |
| :--- | :--- | :--- |
| **Reference** | Refers to the immediate parent class object. | Refers to the current class object instance. |
| **Constructor Call** | `super()` invokes parent constructor. | `this()` invokes current class overloaded constructor. |
| **Access** | Used to access parent fields/methods. | Used to access current class fields/methods. |

## 9. Rules and Important Points
1. `super()` must be the **first statement** in the subclass constructor.
2. You cannot use `super` inside a static context (like static methods or static blocks).
3. If a subclass constructor does not call `super()`, the compiler automatically inserts an implicit `super()` call.

## 10. University Exam Questions
* ★ **Explain the uses of the 'super' keyword in Java with code snippets. (10 Marks)**
* ★ **Can we use 'this()' and 'super()' in the same constructor? Explain. (5 Marks)**

## 11. 2-Mark Questions with Answers
**Q: What happens if the parent class doesn't have a default constructor and we don't call `super(args)`?**  
**A:** A compilation error occurs because Java tries to call the non-existent default constructor `super()`.

## 12. 5-Mark Questions with Answers
**Q: Explain constructor chaining using `super`.**  
**A:** Constructor chaining is the process of calling one constructor from another. When a subclass object is created, its constructor automatically calls the parent's constructor first, which propagates up to `java.lang.Object`.

## 13. 10-Mark Questions with Answers
**Q: Program a complete working system showing all three uses of `super` (variable, method, and constructor).**  
*(Refer to Program below)*

## 14. Viva Questions with Answers
**Q: Can we write `super.super.method()` to access grandparent class methods?**  
**A:** No, Java does not support direct grandparent access via `super` due to encapsulation rules.

## 15. Interview Questions
* **Why must `super()` be the first statement in a constructor?** Because parent state initialization must occur before child state initialization to prevent child members from accessing uninitialized parent state.

## 16. Memory Tricks and Mnemonics
* **Mnemonic (U-P)**: **U**se **P**arent.

## 17. Common Mistakes
* Writing `super()` on the second line of a constructor, after initializing child variables.

## 18. Best Practices
* Always explicitly write `super(...)` when extending classes that do not contain default constructors.

## 19. MCQs with Answers
1. **Which of the following is true about super?**  
   A) Can be used in static methods B) Must be the first statement in constructor C) Can access grandparent methods D) None  
   *Answer: B*

## 20. True/False Questions
* **True or False:** `super()` can be used to call a private constructor of the parent class. (False)

## 21. Fill in the Blanks
* The compiler automatically inserts **super()** if it is not explicitly defined in the constructor.

## 22. Sample Programs (Basic to Advanced)

```java
class Parent {
    String name = "ParentClass";
    Parent(String msg) {
        System.out.println("Parent constructor: " + msg);
    }
    void show() { System.out.println("Parent show()"); }
}

class Child extends Parent {
    String name = "ChildClass";
    Child() {
        super("Calling from Child"); // 1st Use: Parent constructor
    }
    void display() {
        System.out.println("Variable: " + super.name); // 2nd Use: Parent variable
        super.show(); // 3rd Use: Parent method
    }
}

public class Main {
    public static void main(String[] args) {
        Child c = new Child();
        c.display();
    }
}
```

## 23. Program Output
```text
Parent constructor: Calling from Child
Variable: ParentClass
Parent show()
```

## 24. Line-by-Line Code Explanation
* `super("Calling from Child")`: Invokes the parameterized parent constructor.
* `super.name`: Resolves ambiguity and prints the parent variable.

## 25. UML/ASCII Diagrams
```
+-------------+
|   Parent    | <--- super
+-------------+
|   Child     | <--- this
+-------------+
```

## 26. Quick Revision Notes
* **Definition**: A keyword referring to the immediate parent class.
* **Key Syntax**: `super()`, `super.method()`, `super.variable`
* **Rule**: Must be first statement in child constructor; cannot be used in static context.
* **Keyword**: `super`
