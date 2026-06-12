package advanced;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * AIM: CSV Reader and Writer example.
 */
public class P25_CsvHandler {
    public static void main(String[] args) {
        String csvFile = "users.csv";
        
        // Write CSV
        try (FileWriter writer = new FileWriter(csvFile)) {
            writer.write("ID,Name,Email\n");
            writer.write("1,John Doe,john@example.com\n");
            writer.write("2,Jane Smith,jane@example.com\n");
            System.out.println("CSV created successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Read CSV
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            String line;
            System.out.println("\nReading CSV file content:");
            while ((line = br.readLine()) != null) {
                String[] fields = line.split(",");
                System.out.printf("  %-5s %-15s %-20s%n", fields[0], fields[1], fields[2]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
