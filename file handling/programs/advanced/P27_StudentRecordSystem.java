package advanced;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * AIM: Student record management system (Text-based database).
 */
public class P27_StudentRecordSystem {
    private static final String FILE_NAME = "students.txt";

    public static void addStudent(int id, String name, double marks) {
        try (FileWriter fw = new FileWriter(FILE_NAME, true)) {
            fw.write(id + "," + name + "," + marks + "\n");
            System.out.println("Record added successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void displayRecords() {
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            System.out.println("Student Records:");
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                System.out.printf("  ID: %s | Name: %-10s | Marks: %s%n", data[0], data[1], data[2]);
            }
        } catch (IOException e) {
            System.out.println("No records found.");
        }
    }

    public static void main(String[] args) {
        addStudent(101, "Amit", 89.5);
        addStudent(102, "Rahul", 92.0);
        displayRecords();
    }
}
