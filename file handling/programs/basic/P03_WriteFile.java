package basic;

import java.io.FileWriter;
import java.io.IOException;

/**
 * AIM: Write content to a text file.
 * 
 * ALGORITHM:
 * 1. Open file using FileWriter.
 * 2. Invoke write() passing the string content.
 * 3. Close the writer to release resources.
 * 
 * TIME COMPLEXITY: O(N) where N is the length of the string content.
 */
public class P03_WriteFile {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("demo_basic.txt")) {
            writer.write("Welcome to Java File Handling Tutorial.\nLearn basic commands first.");
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}
