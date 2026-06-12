package advanced;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * AIM: Demonstrate object deserialization.
 */
public class P22_DeserializationDemo {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.ser"))) {
            Student student = (Student) ois.readObject();
            System.out.println("Object deserialized successfully.");
            System.out.println("Name: " + student.name);
            System.out.println("ID: " + student.id);
            System.out.println("Password (transient): " + student.password); // Should print null
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
