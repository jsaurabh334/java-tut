package advanced;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * AIM: XOR-based file encryption and decryption.
 */
public class P24_FileEncryption {
    private static final byte KEY = 0x5A; // XOR Encryption Key

    public static void processFile(String src, String dest) {
        try (FileInputStream fis = new FileInputStream(src);
             FileOutputStream fos = new FileOutputStream(dest)) {
            int data;
            while ((data = fis.read()) != -1) {
                fos.write(data ^ KEY); // XOR operation
            }
            System.out.println("Processing file complete: " + src + " -> " + dest);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // Encrypt Demo
        processFile("demo_basic.txt", "encrypted.enc");
        // Decrypt Demo
        processFile("encrypted.enc", "decrypted.txt");
    }
}
