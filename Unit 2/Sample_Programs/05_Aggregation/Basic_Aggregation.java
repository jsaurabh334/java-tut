package sample_programs.aggregation;

class Address {
    String city;
    Address(String city) { this.city = city; }
}

class Student {
    String name;
    Address address; // HAS-A relationship (Aggregation)

    Student(String name, Address address) {
        this.name = name;
        this.address = address;
    }
}

/**
 * AIM: Demonstrate basic Aggregation concept (weak HAS-A relationship).
 */
public class Basic_Aggregation {
    public static void main(String[] args) {
        Address addr = new Address("Mumbai");
        Student stud = new Student("Rohit", addr);
        System.out.println("Student: " + stud.name + ", City: " + stud.address.city);
    }
}
