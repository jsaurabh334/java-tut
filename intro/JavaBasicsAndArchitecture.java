package intro;
/**
 * JavaBasicsAndArchitecture.java
 *
 * This file serves as a comprehensive guide to understanding the basics of the
 * Java programming language and its underlying architecture. It includes both
 * detailed conceptual explanations (in comments) and run-ready code examples.
 *
 * ============================================================================
 * Part 1: JAVA ARCHITECTURE & EXECUTION MODEL
 * ============================================================================
 * 
 * 1. The Java Platform Components:
 *    +--------------------------------------------------------------+
 *    |                    JDK (Java Development Kit)                |
 *    |  Includes Development Tools (javac, jar, jdb, javadoc)       |
 *    |  +--------------------------------------------------------+  |
 *    |  |                 JRE (Java Runtime Environment)         |  |
 *    |  |  Includes Library Classes (APIs)                       |  |
 *    |  |  +--------------------------------------------------+  |  |
 *    |  |  |                 JVM (Java Virtual Machine)       |  |  |
 *    |  |  |  Executes Bytecode (.class files)                |  |  |
 *    |  |  +--------------------------------------------------+  |  |
 *    |  +--------------------------------------------------------+  |
 *    +--------------------------------------------------------------+
 * 
 *    - JVM (Java Virtual Machine): The engine that drives the Java code. It converts
 *      bytecode into machine language.
 *    - JRE (Java Runtime Environment): Provides the minimum requirements for executing
 *      a Java application (contains JVM + core libraries).
 *    - JDK (Java Development Kit): The complete software development environment
 *      containing JRE and tools needed to compile and debug Java code.
 *
 * 2. Compilation and Execution Flow:
 *    [Source Code (.java)] -> Compiler (javac) -> [Bytecode (.class)] -> JVM -> [Machine Code]
 *
 *    - Java compiler (javac) compiles the source code into platform-independent
 *      bytecode (.class files) rather than native machine code.
 *    - The JVM on the target machine interprets or compiles this bytecode into native
 *      machine instructions during execution.
 *    - This separation makes Java platform-independent ("Write Once, Run Anywhere" or WORA).
 *
 * 3. Inside the JVM Architecture:
 *    - ClassLoader Subsystem: Loads, links, and initializes the class files (.class).
 *    - JVM Memory Areas (Runtime Data Areas):
 *      a. Method Area: Stores class-level data, static variables, and constant pool.
 *      b. Heap Area: Stores all objects and their corresponding instance variables.
 *      c. Stack Area: Stores local variables and temporary results (one stack per thread).
 *      d. PC Registers: Stores the address of the current execution instruction.
 *      e. Native Method Stack: Stores native method information for C/C++ libraries.
 *    - Execution Engine:
 *      a. Interpreter: Reads bytecode stream and executes instructions sequentially.
 *      b. JIT (Just-In-Time) Compiler: Compiles frequently executed bytecode (hotspots)
 *         into native machine code to improve performance.
 *      c. Garbage Collector (GC): Automatically reclaims heap memory by destroying
 *         unreferenced objects.
 */

// Package declaration (omitted or default for simplicity of run-ready execution)

import java.util.ArrayList;
import java.util.List;

public class JavaBasicsAndArchitecture {

    // Global constant (static final variable stored in the Method Area)
    public static final String COURSE_NAME = "Java Basics and Architecture Tutorial";

    public static void main(String[] args) {
        System.out.println("====================================================");
        System.out.println("   Welcome to: " + COURSE_NAME);
        System.out.println("====================================================\n");

        // Demonstration sections
        demoVariablesAndDataTypes();
        demoControlFlow();
        demoObjectOrientedProgramming();
        demoExceptionHandling();
        explainArchitectureConcepts();
    }

    /**
     * Section 1: Variables and Data Types
     * Demonstrates Java's primitive types (stored on Stack) and reference types (stored on Heap).
     */
    private static void demoVariablesAndDataTypes() {
        System.out.println("--- 1. Variables and Data Types ---");

        // Primitives (Stored directly in Stack memory)
        byte byteVar = 127;                  // 1 byte (8-bit)
        short shortVar = 32767;              // 2 bytes (16-bit)
        int intVar = 2_147_483_647;          // 4 bytes (32-bit), supports underscores for readability
        long longVar = 9_223_372_036_854_775_807L; // 8 bytes (64-bit), suffixed with 'L'
        float floatVar = 3.14f;              // 4 bytes (32-bit floating point), suffixed with 'f'
        double doubleVar = 3.14159265359;    // 8 bytes (64-bit floating point)
        boolean isJavaFun = true;            // 1 bit representing logical state
        char grade = 'A';                   // 2 bytes (16-bit Unicode character)

        System.out.println("Primitive Types:");
        System.out.printf("  int: %d, long: %d, double: %.5f, char: %c, boolean: %b%n", 
                intVar, longVar, doubleVar, grade, isJavaFun);

        // Reference Types (References stored on Stack, actual object/content on Heap)
        String greeting = "Hello, World!"; // String pool reference (part of heap/method area)
        int[] numbers = {1, 2, 3, 4, 5};   // Array object on Heap

        System.out.println("Reference Types:");
        System.out.println("  String: " + greeting);
        System.out.print("  Array elements: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println("\n");
    }

    /**
     * Section 2: Control Flow
     * Demonstrates selection (if, switch) and iteration (for, while, do-while) statements.
     */
    private static void demoControlFlow() {
        System.out.println("--- 2. Control Flow ---");

        int score = 85;

        // If-Else statement
        if (score >= 90) {
            System.out.println("  Grade: Excellent");
        } else if (score >= 75) {
            System.out.println("  Grade: Good");
        } else {
            System.out.println("  Grade: Needs Improvement");
        }

        // Switch statement (modern switch syntax available in Java 12+)
        String day = "Monday";
        System.out.print("  Switch output: ");
        switch (day) {
            case "Saturday":
            case "Sunday":
                System.out.println("It's the weekend!");
                break;
            default:
                System.out.println("It's a weekday.");
                break;
        }

        // Loops
        System.out.print("  For loop iteration: ");
        for (int i = 1; i <= 3; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
    }

    /**
     * Section 3: Object-Oriented Programming (OOP)
     * Demonstrates Encapsulation, Inheritance, and Polymorphism.
     */
    private static void demoObjectOrientedProgramming() {
        System.out.println("--- 3. Object-Oriented Programming (OOP) ---");

        // Polymorphism: Reference of superclass type pointing to subclass object
        Animal dog = new Dog("Buddy");
        Animal cat = new Cat("Whiskers");

        // Encapsulation: Accessing state via getters/methods, not direct field access
        System.out.println("  Dog's Name: " + dog.getName());
        
        // Dynamic Polymorphism: Correct overridden sound method called at runtime
        System.out.print("  Dog sound: ");
        dog.makeSound();

        System.out.println("  Cat's Name: " + cat.getName());
        System.out.print("  Cat sound: ");
        cat.makeSound();
        System.out.println();
    }

    /**
     * Section 4: Exception Handling
     * Demonstrates runtime error catching with try-catch-finally.
     */
    private static void demoExceptionHandling() {
        System.out.println("--- 4. Exception Handling ---");

        try {
            int numerator = 10;
            int denominator = 0;
            System.out.println("  Attempting division...");
            int result = numerator / denominator; // Throws ArithmeticException
            System.out.println("  Result: " + result); // This line won't execute
        } catch (ArithmeticException e) {
            System.out.println("  Caught Exception: Cannot divide by zero!");
        } finally {
            System.out.println("  Finally block: Executed regardless of exceptions.");
        }
        System.out.println();
    }

    /**
     * Section 5: JVM & Memory Architecture Explanation Printout
     * Summarizes key conceptual details about JVM memory structure.
     */
    private static void explainArchitectureConcepts() {
        System.out.println("--- 5. Java Virtual Machine (JVM) Architecture ---");
        System.out.println("  The JVM manages memory dynamically through key regions:");
        System.out.println("  - METHOD AREA: Stores class bytecode, static fields, and constant pool.");
        System.out.println("  - HEAP AREA: Stores all instantiated objects (e.g., 'new Dog()').");
        System.out.println("  - STACK AREA: Stores local variables and stack frames for method execution.");
        System.out.println("  - JIT COMPILER: Monitors runtime execution and translates frequently used");
        System.out.println("                  bytecode to native machine code for maximum performance.");
        System.out.println("  - GARBAGE COLLECTOR: Automatically scans the Heap and reclaims memory");
        System.out.println("                       of objects that are no longer reachable.");
        System.out.println("====================================================");
    }
}

// ============================================================================
// OOP HELPER CLASSES (Demonstrating Inheritance and Polymorphism)
// ============================================================================

/**
 * Abstract Base Class representing Abstraction.
 */
abstract class Animal {
    // Encapsulation: Private field, only accessible via getter/setter
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Abstract method to be implemented by subclass
    public abstract void makeSound();
}

/**
 * Dog subclass inheriting from Animal.
 */
class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }
}

/**
 * Cat subclass inheriting from Animal.
 */
class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}
