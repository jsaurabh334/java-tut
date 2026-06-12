# Method Overloading in Java

## 1. Definition
**Method Overloading** is a feature in Java that allows a class to have more than one method with the same name, provided their parameter lists (signatures) are different. It is also known as **Compile-time Polymorphism** or **Static Binding**.

## 2. Key Features
* **Same Name**: Methods share identical names.
* **Different Parameters**: Must differ in number, type, or sequence of arguments.
* **Class Scope**: Usually occurs within the same class.
* **Early Binding**: Resolution of the method call is done by the compiler during compilation.

## 3. Syntax
```java
class Calculator {
    // Overloaded method: 2 parameters
    int add(int a, int b) { return a + b; }

    // Overloaded method: 3 parameters
    int add(int a, int b, int c) { return a + b + c; }

    // Overloaded method: different type
    double add(double a, double b) { return a + b; }
}
```

## 4. Working Explanation
When you compile the program, the compiler checks the method signatures (name + parameter types). When a method call like `add(10, 20)` is found, the compiler binds it to `add(int, int)`. If `add(10.5, 2.5)` is called, it binds to `add(double, double)`.

## 5. Real-Life Example
Consider the word **"Play"**. You can "Play music", "Play cricket", or "Play a role". The action is the same ("Play"), but what you play (arguments) determines the actual behavior.

## 6. Advantages
* **Readability**: Keeps method names consistent instead of creating `addInt()`, `addDouble()`, etc.
* **Clean Design**: Promotes structured interfaces.
* **Flexibility**: Handles different kinds of input data types seamlessly.

## 7. Disadvantages
* **Return Type Confusion**: You cannot overload methods by changing the return type only.
* **Ambiguity Risk**: Automatic type promotion can sometimes lead to compilation errors.

## 8. Difference Tables
### Method Overloading vs. Method Overriding
| Feature | Method Overloading | Method Overriding |
| :--- | :--- | :--- |
| **Polymorphism** | Compile-time (Static) Polymorphism. | Runtime (Dynamic) Polymorphism. |
| **Method Name** | Must be same. | Must be same. |
| **Parameters** | Must be different. | Must be same. |
| **Inheritance** | Occurs within the same class (usually). | Requires inheritance (parent and child classes). |

## 9. Rules and Important Points
1. Overloaded methods must change the **argument list** (number, type, or sequence).
2. Changing the return type alone **does not** overload a method; it causes a compilation error.
3. Overloading can be done with static methods and constructors (Constructor Overloading).

## 10. University Exam Questions
* ★ **What is Method Overloading? Explain rules with a programming example. (10 Marks)**
* ★ **Why can't we overload a method by changing its return type? (5 Marks)**

## 11. 2-Mark Questions with Answers
**Q: Can we overload the main method in Java?**  
**A:** Yes. We can define multiple `main` methods, but the JVM will only execute the standard `public static void main(String[] args)` method as the entry point.

## 12. 5-Mark Questions with Answers
**Q: Explain how automatic type promotion works in method overloading.**  
**A:** If no exact match of parameter types is found, Java promotes smaller data types to larger ones (e.g. `byte` to `int`, `int` to `long`, `float` to `double`) to find a matching overloaded method.

## 13. 10-Mark Questions with Answers
**Q: Program a Shape class containing overloaded area() methods to calculate area of Square, Circle, and Rectangle.**  
*(Refer to Program below)*

## 14. Viva Questions with Answers
**Q: Does method overloading happen at runtime or compile-time?**  
**A:** Compile-time.

## 15. Interview Questions
* **Can you overload a method by throwing different exceptions?** No, exception declarations are not part of the method signature for overloading.

## 16. Memory Tricks and Mnemonics
* **Mnemonic (S-A-M-E-S-I-G-N)**: **S**ame **A**ction, **M**any **E**ntries, **S**ignature **I**s **G**overning **N**umber.

## 17. Common Mistakes
* Attempting to overload two methods with identical parameters but different return types:
  `int show(int a)` and `void show(int a)` will fail to compile.

## 18. Best Practices
* Keep overloaded methods logically consistent (they should perform similar operations on different types).

## 19. MCQs with Answers
1. **Method overloading is an example of:**  
   A) Runtime polymorphism B) Compile-time polymorphism C) Inheritance D) Encapsulation  
   *Answer: B*

## 20. True/False Questions
* **True or False:** Overloaded methods must have different access modifiers. (False)

## 21. Fill in the Blanks
* Method overloading is also known as **static** binding.

## 22. Sample Programs (Basic to Advanced)

```java
class AreaCalculator {
    // Overloaded area for Square
    double area(int side) {
        return side * side;
    }
    // Overloaded area for Rectangle
    double area(int length, int width) {
        return length * width;
    }
    // Overloaded area for Circle
    double area(double radius) {
        return Math.PI * radius * radius;
    }
}

public class Main {
    public static void main(String[] args) {
        AreaCalculator calc = new AreaCalculator();
        System.out.println("Square Area: " + calc.area(5));
        System.out.println("Rectangle Area: " + calc.area(5, 10));
        System.out.println("Circle Area: " + calc.area(4.5));
    }
}
```

## 23. Program Output
```text
Square Area: 25.0
Rectangle Area: 50.0
Circle Area: 63.61725123519331
```

## 24. Line-by-Line Code Explanation
* `calc.area(5)`: Maps to `area(int)` because 5 is an integer.
* `calc.area(4.5)`: Maps to `area(double)` because 4.5 is a double literal.

## 25. UML/ASCII Diagrams
```
  [Calculator]
     |---> area(int)
     |---> area(int, int)
     |---> area(double)
```

## 26. Quick Revision Notes
* **Definition**: Multiple methods with same name but different parameter signatures.
* **Key Syntax**: Keep method name identical, change parameter list.
* **Rule**: Return type alone cannot differentiate overloaded methods.
* **Keyword**: Compile-time polymorphism, static binding.
