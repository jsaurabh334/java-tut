# Package Concepts in Java

## 1. Definition
A **Package** in Java is a mechanism used to group related classes, interfaces, and sub-packages together. It acts like a folder on a computer, preventing name conflicts and controlling access to class members.

## 2. Key Features
* **Namespace Management**: Prevents name collisions (e.g. you can have two classes named `User` if they are in different packages).
* **Access Control**: Used with access modifiers (`protected`, `private`, public, default) to control class/method visibility.
* **Organization**: Systematically arranges large software projects.

## 3. Syntax
```java
// Declaring a package at the very top of a file
package com.mycompany.project;

// Importing other packages
import java.util.Scanner; // Import specific class
import java.io.*;        // Import all classes in package
```

## 4. Working Explanation
When you specify `package mypack;` at the top of a file, the compiler builds the compiled `.class` file and expects it to be run from a directory structure matching `mypack/`. To execute a class inside a package, you must run it from the root directory using its fully qualified name: `java mypack.ClassName`.

## 5. Real-Life Example
Think of a **Postal Address**. Multiple people can have the name "Rahul". To send a letter to the correct Rahul, you specify the city and street name (e.g., `India.Karnataka.Bangalore.Rahul`). The city/street acting as namespaces are like packages.

## 6. Advantages
* **Prevents Class Clashes**: Resolves class naming conflicts easily.
* **Cleaner Maintenance**: Easy to maintain files because they are organized logically.
* **Encapsulation**: Helps enforce default (package-private) scopes.

## 7. Disadvantages
* **File Redirection**: Moving class files requires updating package and import lines across the codebase.

## 8. Difference Tables
### Built-in Packages vs. User-defined Packages
| Feature | Built-in Packages | User-defined Packages |
| :--- | :--- | :--- |
| **Origin** | Provided by Java Standard API. | Created by application developers. |
| **Examples** | `java.lang`, `java.util`, `java.io` | `com.mycompany.helper` |
| **Import requirement** | `java.lang` is imported automatically. | Must import explicitly. |

## 9. Rules and Important Points
1. The `package` statement must be the **first line** of code in a Java file (comments excluded).
2. Directory structures must exactly mirror the package names (dots represent subfolders).
3. Access modifiers work closely with packages:
   * **Default (no modifier)**: Visible only inside the same package.
   * **Protected**: Visible inside the same package and to subclasses in other packages.

## 10. University Exam Questions
* ★ **What is a Package in Java? Explain its types and benefits. (5 Marks)**
* ★ **How do you compile and run a class stored inside a package? Explain with commands. (5 Marks)**

## 11. 2-Mark Questions with Answers
**Q: Which package is imported by default in all Java programs?**  
**A:** The `java.lang` package.

## 12. 5-Mark Questions with Answers
**Q: Explain how access modifiers control visibility across packages.**  
**A:** `public` is visible everywhere. `private` is visible only in its class. `protected` is visible in the same package and subclasses. Default (no modifier) is package-private (only visible in the same package).

## 13. 10-Mark Questions with Answers
**Q: Show how to create, compile, import, and run a user-defined package with multiple classes.**  
*(Refer to Program below)*

## 14. Viva Questions with Answers
**Q: Can we have two package statements in a single Java file?**  
**A:** No. A Java file can belong to only one package.

## 15. Interview Questions
* **What is a fully qualified name in Java?** The class name preceded by its package path, e.g. `java.util.ArrayList`.

## 16. Memory Tricks and Mnemonics
* **Mnemonic (F-O-L-D-E-R)**: **F**iles **O**f **L**ike-logic **D**ecidedly **E**nclosed **R**outinely.

## 17. Common Mistakes
* Running the package program from inside the package directory. You must run it from the root directory of the packages.

## 18. Best Practices
* Use reverse domain name structure (e.g. `com.google.project`) for packages to ensure globally unique namespaces.

## 19. MCQs with Answers
1. **Which statement is used to access classes from other packages?**  
   A) `package` B) `import` C) `include` D) `export`  
   *Answer: B*

## 20. True/False Questions
* **True or False:** Sub-packages (like `java.util.regex`) are automatically imported when you import the parent package (`java.util.*`). (False)

## 21. Fill in the Blanks
* A package is declared using the **package** keyword.

## 22. Sample Programs (Basic to Advanced)

To compile and run this package:
1. Save `MyClass.java` inside a directory named `mypack`.
2. Compile: `javac mypack/MyClass.java`
3. Run: `java mypack.MyClass`

```java
// Save as mypack/MyClass.java
package mypack;

public class MyClass {
    public void display() {
        System.out.println("Hello from mypack!");
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.display();
    }
}
```

## 23. Program Output
```text
Hello from mypack!
```

## 24. Line-by-Line Code Explanation
* `package mypack;`: Associates this file with package `mypack`.
* `java mypack.MyClass`: Runs the class using its fully qualified name from the parent directory of `mypack`.

## 25. UML/ASCII Diagrams
```
  [Project Root]
        |
        └── [mypack] (Folder)
               └── MyClass.class (File)
```

## 26. Quick Revision Notes
* **Definition**: Namespace container grouping related classes and interfaces.
* **Key Syntax**: `package package_name;`
* **Rule**: Must be the first statement; run using fully qualified class name.
* **Keyword**: `package`, `import`.
