package basic;

import java.io.FileWriter;
import java.io.IOException;

/**
 * AIM: Append data to the end of an existing file.
 * 
 * ALGORITHM:
 * 1. Open FileWriter passing true as the second parameter for append mode.
 * 2. Invoke write() to add new content.
 * 3. Close the writer.
 */
public class P05_AppendFile {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("demo_basic.txt", true)) {
            writer.write("\nThis line is appended using append mode.");
            System.out.println("Data appended successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
