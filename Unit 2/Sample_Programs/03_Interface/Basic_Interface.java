package sample_programs.interface_demo;

interface Printable {
    void print();
}

class Document implements Printable {
    public void print() {
        System.out.println("Printing document...");
    }
}

/**
 * AIM: Demonstrate basic interface definition and implementation.
 */
public class Basic_Interface {
    public static void main(String[] args) {
        Printable p = new Document();
        p.print();
    }
}
