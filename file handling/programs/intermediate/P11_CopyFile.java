package intermediate;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * AIM: Copy contents of one file to another using byte streams.
 * 
 * ALGORITHM:
 * 1. Open FileInputStream for source.
 * 2. Open FileOutputStream for destination.
 * 3. Read bytes into buffer and write to destination.
 */
public class P11_CopyFile {
    public static void main(String[] args) {
        try (FileInputStream in = new FileInputStream("source.txt");
             FileOutputStream out = new FileOutputStream("destination.txt")) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = in.read(buffer)) != -1) {
                out.write(buffer, 0, bytesRead);
            }
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("Error copying file: " + e.getMessage());
        }
    }
}
