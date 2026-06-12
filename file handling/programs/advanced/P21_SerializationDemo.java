package advanced;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    String name;
    int id;
    transient String password; // Will not be serialized

    public Student(String name, int id, String password) {
        this.name = name;
        this.id = id;
        this.password = password;
    }
}

/**
 * AIM: Demonstrate object serialization.
 */
public class P21_SerializationDemo {
    public static void main(String[] args) {
        Student student = new Student("Alice", 101, "secret123");
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.ser"))) {
            oos.writeObject(student);
            System.out.println("Object serialized and saved to student.ser");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
