package sample_programs.aggregation;

class Faculty {
    String name;
    Faculty(String name) { this.name = name; }
}

class School {
    Faculty principal;
    School(Faculty principal) { this.principal = principal; }
}

/**
 * AIM: Demonstrate that child object lifecycle is independent of parent class (Advanced).
 */
public class Advanced_Aggregation {
    public static void main(String[] args) {
        Faculty principal = new Faculty("Dr. Roy");
        School school = new School(principal);
        
        // Destruct school object
        school = null;
        
        // Principal object still exists and is reachable
        System.out.println("Principal after school dissolution: " + principal.name);
    }
}
