# Aggregation in Java

## 1. Definition
**Aggregation** is a specialized form of Association where two classes have a **"has-a"** relationship, but both have independent lifecycles. It represents a **weak** relationship because the child object can exist even if the parent object is destroyed.

## 2. Key Features
* **HAS-A Relationship**: E.g., Library has Books.
* **Weak Association**: Ownership is shared; lifetime of objects is independent.
* **Loose Coupling**: Code changes in one object do not break the other.

## 3. Syntax
```java
class Book {
    String title;
    Book(String title) { this.title = title; }
}

class Library {
    // Aggregation: Library has reference to Book, but doesn't manage its creation
    private List<Book> books;
    Library(List<Book> books) { this.books = books; }
}
```

## 4. Working Explanation
In aggregation, objects are created independently elsewhere in the program and then passed to the container class (e.g. via a constructor or setter). Because the container does not instantiate the objects directly, destroying the container (Library) will not destroy the contained objects (Books).

## 5. Real-Life Example
A **Department** and a **Teacher**. If the Department is closed, the Teachers are not destroyed; they can join another department.

## 6. Advantages
* **Reusability**: The associated class objects can be reused across multiple components.
* **Maintainability**: Keeps classes modular and decoupled.

## 7. Disadvantages
* **Loose control**: The container cannot guarantee the state of referenced objects.

## 8. Difference Tables
### Aggregation vs. Composition
| Feature | Aggregation | Composition |
| :--- | :--- | :--- |
| **Relationship type** | Weak "has-a" | Strong "has-a" |
| **Lifecycle** | Independent. | Dependent (contained dies with container). |
| **Instantiation** | Passed from outside. | Instantiated inside the owner. |

## 9. Rules and Important Points
1. Always implement aggregation by passing references (references are passed to setters/constructors).
2. Avoid instantiation using `new` inside the container constructor when implementing aggregation.

## 10. University Exam Questions
* ★ **Explain Aggregation with a real-life example and UML diagram. (5 Marks)**
* ★ **Differentiate between Aggregation and Composition. (10 Marks)**

## 11. 2-Mark Questions with Answers
**Q: What type of relationship is Aggregation?**  
**A:** It is a weak Association representing a "HAS-A" relationship.

## 12. 5-Mark Questions with Answers
**Q: Why is Aggregation preferred over Inheritance sometimes?**  
**A:** Aggregation prevents class explosion and keeps relationships dynamic. It follows the design principle: "Favor composition/aggregation over inheritance."

## 13. 10-Mark Questions with Answers
**Q: Write a program containing Student and Address classes. Show Aggregation and explain why it represents a weak relationship.**  
*(Refer to Program below)*

## 14. Viva Questions with Answers
**Q: If a student object is deleted, is the Address object deleted in Aggregation?**  
**A:** No, because the Address object was created independently outside the Student object.

## 15. Interview Questions
* **How do you represent Aggregation in UML?** Using an empty diamond symbol (`◇`).

## 16. Memory Tricks and Mnemonics
* **Mnemonic (W-E-A-K)**: **W**eak **E**xistence, **A**lways **K**eeps-alive.

## 17. Common Mistakes
* Instantiating the dependent class inside the container constructor (which turns it into Composition).

## 18. Best Practices
* Use Aggregation when objects share a helper/relationship but need to exist independently.

## 19. MCQs with Answers
1. **Aggregation represents which kind of relationship?**  
   A) IS-A B) HAS-A C) USES-A D) None of the above  
   *Answer: B*

## 20. True/False Questions
* **True or False:** In aggregation, the child object cannot exist without the parent. (False)

## 21. Fill in the Blanks
* Aggregation is represented by a **hollow** diamond in UML diagrams.

## 22. Sample Programs (Basic to Advanced)

```java
import java.util.List;

class Professor {
    String name;
    Professor(String name) { this.name = name; }
}

class University {
    String name;
    private List<Professor> professors;

    University(String name, List<Professor> professors) {
        this.name = name;
        this.professors = professors;
    }
}

public class Main {
    public static void main(String[] args) {
        Professor p = new Professor("Dr. John");
        // University is created and holds Professor reference
        University uni = new University("XYZ Uni", List.of(p));
        System.out.println("University and Professor linked.");
    }
}
```

## 23. Program Output
```text
University and Professor linked.
```

## 24. Line-by-Line Code Explanation
* `University(..., List<Professor> professors)`: Receives pre-created professors.
* If `uni` variable is set to `null`, `p` still exists.

## 25. UML/ASCII Diagrams
```
  [University] ◇--------> [Professor]
```

## 26. Quick Revision Notes
* **Definition**: Weak "has-a" relationship where objects have independent lifecycles.
* **Key Syntax**: Pass referenced object in constructor/setter.
* **Rule**: Parent destruction does not affect child existence.
* **Keyword**: HAS-A, weak association.
