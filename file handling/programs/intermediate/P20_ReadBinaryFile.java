package intermediate;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * AIM: Read binary files using BufferedInputStream.
 */
public class P20_ReadBinaryFile {
    public static void main(String[] args) {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("demo_basic.txt"))) {
            int data;
            while ((data = bis.read()) != -1) {
                // Read and output the raw byte values
                System.out.print(data + " ");
            }
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
