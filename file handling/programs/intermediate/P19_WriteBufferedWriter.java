package intermediate;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * AIM: Write text content to file using BufferedWriter.
 */
public class P19_WriteBufferedWriter {
    public static void main(String[] args) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("buffered_output.txt"))) {
            writer.write("Writing using BufferedWriter.");
            writer.newLine(); // Platform-independent newline
            writer.write("This approach is very efficient.");
            System.out.println("BufferedWriter operation complete.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
