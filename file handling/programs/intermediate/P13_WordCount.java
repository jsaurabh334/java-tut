package intermediate;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * AIM: Count total words in a file.
 */
public class P13_WordCount {
    public static void main(String[] args) {
        int wordCount = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader("demo_basic.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    String[] words = line.split("\\s+");
                    wordCount += words.length;
                }
            }
            System.out.println("Total word count: " + wordCount);
        } catch (IOException e) {
            System.out.println("Could not read file for word count.");
        }
    }
}
