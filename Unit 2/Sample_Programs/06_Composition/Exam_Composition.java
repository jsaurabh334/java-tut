package sample_programs.composition;

class Processor {
    String model;
    Processor(String model) { this.model = model; }
}

class Computer {
    // Encapsulated final field guarantees exclusive lifecycle control
    private final Processor cpu;

    Computer(String cpuModel) {
        this.cpu = new Processor(cpuModel); // Instantiated internally
    }

    void showSpec() {
        System.out.println("System CPU: " + cpu.model);
    }
}

/**
 * AIM: Demonstrate safe encapsulation practices using final fields in Composition (Exam-Oriented).
 */
public class Exam_Composition {
    public static void main(String[] args) {
        Computer pc = new Computer("Intel i7");
        pc.showSpec();
    }
}
