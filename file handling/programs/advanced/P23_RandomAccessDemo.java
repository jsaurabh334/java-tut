package advanced;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * AIM: Demonstrate random file access operations.
 */
public class P23_RandomAccessDemo {
    public static void main(String[] args) {
        try (RandomAccessFile file = new RandomAccessFile("random_data.txt", "rw")) {
            file.writeUTF("Java File Handling");
            file.seek(0); // Go back to start
            System.out.println("Read Data: " + file.readUTF());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
