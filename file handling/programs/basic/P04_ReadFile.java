package basic;

import java.io.FileReader;
import java.io.IOException;

/**
 * AIM: Read character content from a file.
 * 
 * ALGORITHM:
 * 1. Open FileReader.
 * 2. Loop read() until it returns -1.
 * 3. Convert characters and print them.
 * 
 * TIME COMPLEXITY: O(N) where N is the size of the file.
 */
public class P04_ReadFile {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("demo_basic.txt")) {
            int character;
            System.out.println("Reading file contents:");
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            System.out.println();
        } catch (IOException e) {
            System.err.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}
