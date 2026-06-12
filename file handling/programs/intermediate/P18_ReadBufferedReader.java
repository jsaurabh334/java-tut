package intermediate;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * AIM: Read file using BufferedReader.
 */
public class P18_ReadBufferedReader {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("demo_basic.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
