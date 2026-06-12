package sample_programs.aggregation;

import java.util.List;

class Teacher {
    String name;
    Teacher(String name) { this.name = name; }
}

class Department {
    String deptName;
    List<Teacher> teachers; // Aggregation reference

    Department(String deptName, List<Teacher> teachers) {
        this.deptName = deptName;
        this.teachers = teachers;
    }
}

/**
 * AIM: Demonstrate Department-Teacher aggregation (Intermediate).
 */
public class Intermediate_Aggregation {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Dr. Sharma");
        Teacher t2 = new Teacher("Prof. Verma");
        
        Department cs = new Department("Computer Science", List.of(t1, t2));
        System.out.println("Department: " + cs.deptName + " has " + cs.teachers.size() + " teachers.");
    }
}
