package intermediate;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * AIM: Search for a specific word in a text file.
 */
public class P15_SearchWord {
    public static void main(String[] args) {
        String searchWord = "Java";
        int lineNum = 1;
        boolean found = false;

        try (BufferedReader reader = new BufferedReader(new FileReader("demo_basic.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains(searchWord)) {
                    System.out.println("Found '" + searchWord + "' on line: " + lineNum);
                    found = true;
                }
                lineNum++;
            }
            if (!found) {
                System.out.println("Word '" + searchWord + "' not found in the file.");
            }
        } catch (IOException e) {
            System.out.println("Error reading the file.");
        }
    }
}
