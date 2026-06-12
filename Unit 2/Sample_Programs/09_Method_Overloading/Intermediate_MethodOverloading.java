package sample_programs.method_overloading;

class Printer {
    void printData(int i) { System.out.println("Printing int: " + i); }
    void printData(String s) { System.out.println("Printing String: " + s); }
}

/**
 * AIM: Demonstrate method overloading by changing argument data types.
 */
public class Intermediate_MethodOverloading {
    public static void main(String[] args) {
        Printer p = new Printer();
        p.printData(100);
        p.printData("Hello");
    }
}
