# Exception Handling in Java

## 1. Definition
**Exception Handling** in Java is a mechanism to handle runtime errors (such as `ArithmeticException`, `IOException`, `SQLException`, etc.) so that the normal flow of the application can be maintained.

## 2. Key Features
* **Exception Hierarchy**: Superclass of all exceptions is `Throwable` (subclasses are `Exception` and `Error`).
* **Checked vs. Unchecked**: Checked exceptions are verified at compile-time. Unchecked exceptions are verified at runtime.
* **Keywords**: `try`, `catch`, `finally`, `throw`, `throws`.

## 3. Syntax
```java
try {
    // Code that might throw an exception
    int data = 50 / 0;
} catch (ArithmeticException e) {
    // Code to handle exception
    System.out.println(e);
} finally {
    // Code that always executes
    System.out.println("finally block executed");
}
```

## 4. Working Explanation
When an exception occurs inside the `try` block, execution of the block stops, and the JVM searches the matching `catch` block. If a match is found, it executes the handler. The `finally` block is executed afterward, regardless of whether an exception occurred or was caught.

## 5. Real-Life Example
Think of **Driving a Car**. If you get a flat tire (exception), you don't throw the car away. You use a spare tire (exception handler) to resolve the issue and continue your journey.

## 6. Advantages
* **Flow Control**: Keeps the application running instead of crashing.
* **Error Separation**: Separates error-handling code from regular logic.
* **Propagation**: Allows bubble-up of error reports to parent callers.

## 7. Disadvantages
* **Performance Cost**: Creating exception objects and walking the stack trace is computationally expensive.
* **Verbosity**: Can lead to cluttered code.

## 8. Difference Tables
### Checked Exception vs. Unchecked Exception
| Feature | Checked Exception | Unchecked Exception (Runtime) |
| :--- | :--- | :--- |
| **Check Time** | Checked by compiler. | Checked at runtime. |
| **Handling** | Must catch or declare `throws`. | Optional to catch/declare. |
| **Example** | `IOException`, `SQLException` | `NullPointerException`, `ArithmeticException` |

## 9. Rules and Important Points
1. A `try` block must be followed by at least one `catch` block or a `finally` block.
2. The `finally` block executes even if there is a `return` statement in `try` or `catch`.
3. Subclass exceptions must be caught before superclass exceptions in multiple catch blocks.

## 10. University Exam Questions
* ★ **Explain Java Exception Hierarchy. Differentiate between Checked and Unchecked exceptions. (10 Marks)**
* ★ **What is the difference between final, finally, and finalize? (5 Marks)**

## 11. 2-Mark Questions with Answers
**Q: What is the purpose of the `throw` keyword?**  
**A:** Used to explicitly throw a single exception from a method or block.

## 12. 5-Mark Questions with Answers
**Q: Explain the try-with-resources statement introduced in Java 7.**  
**A:** It is a try statement that declares one or more resources (like file streams) that are automatically closed at the end of the statement, eliminating the need for explicit finally blocks.

## 13. 10-Mark Questions with Answers
**Q: Design a custom exception class InvalidAgeException and throw it when user age is less than 18.**  
*(Refer to Program below)*

## 14. Viva Questions with Answers
**Q: Can a catch block exist without a try block?**  
**A:** No, a catch block must always follow a try block.

## 15. Interview Questions
* **Will the finally block execute if `System.exit(0)` is called?** No, because `System.exit(0)` terminates the JVM immediately.

## 16. Memory Tricks and Mnemonics
* **Mnemonic (T-C-F)**: **T**ry **C**atch **F**inally: **T**est, **C**orrect, **F**inish.

## 17. Common Mistakes
* Catching the superclass `Exception` before specific exceptions like `ArithmeticException`, which makes the specific catch blocks unreachable.

## 18. Best Practices
* Do not swallow exceptions (e.g. empty catch blocks). Always log them or rethrow.

## 19. MCQs with Answers
1. **Which class is the parent of all Exception classes in Java?**  
   A) `Throwable` B) `Object` C) `Exception` D) `Error`  
   *Answer: A*

## 20. True/False Questions
* **True or False:** Multiple catch blocks can execute for a single exception. (False)

## 21. Fill in the Blanks
* Unchecked exceptions inherit from the **RuntimeException** class.

## 22. Sample Programs (Basic to Advanced)

```java
// Custom Exception
class InvalidAgeException extends Exception {
    InvalidAgeException(String msg) { super(msg); }
}

public class Main {
    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age is not valid to vote.");
        } else {
            System.out.println("Welcome to vote.");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(15);
        } catch (InvalidAgeException e) {
            System.out.println("Caught Custom Exception: " + e.getMessage());
        }
    }
}
```

## 23. Program Output
```text
Caught Custom Exception: Age is not valid to vote.
```

## 24. Line-by-Line Code Explanation
* `class InvalidAgeException extends Exception`: Creates a checked custom exception.
* `throws InvalidAgeException`: Declares that the method may throw this exception.
* `throw new InvalidAgeException(...)`: Throws the custom exception instance.

## 25. UML/ASCII Diagrams
```
      [Throwable]
        ^     ^
        |     |
    [Error]  [Exception]
                ^
                |
        [RuntimeException]
```

## 26. Quick Revision Notes
* **Definition**: Process of handling runtime errors to prevent program crash.
* **Key Syntax**: `try { } catch (Exception e) { } finally { }`
* **Rule**: Catch block order must go from subclass to superclass.
* **Keyword**: `try`, `catch`, `finally`, `throw`, `throws`.
