package intermediate;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * AIM: Merge two files into a third file.
 */
public class P16_MergeFiles {
    public static void main(String[] args) {
        try (PrintWriter pw = new PrintWriter(new FileWriter("merged.txt"));
             BufferedReader br1 = new BufferedReader(new FileReader("file1.txt"));
             BufferedReader br2 = new BufferedReader(new FileReader("file2.txt"))) {
            
            String line;
            while ((line = br1.readLine()) != null) {
                pw.println(line);
            }
            while ((line = br2.readLine()) != null) {
                pw.println(line);
            }
            System.out.println("Merged file1.txt and file2.txt into merged.txt.");
        } catch (IOException e) {
            System.out.println("Error merging files: " + e.getMessage());
        }
    }
}
