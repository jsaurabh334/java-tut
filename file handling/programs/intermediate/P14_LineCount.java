package intermediate;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * AIM: Count total lines in a file.
 */
public class P14_LineCount {
    public static void main(String[] args) {
        int lineCount = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader("demo_basic.txt"))) {
            while (reader.readLine() != null) {
                lineCount++;
            }
            System.out.println("Total lines in the file: " + lineCount);
        } catch (IOException e) {
            System.out.println("Could not open file for line count.");
        }
    }
}
