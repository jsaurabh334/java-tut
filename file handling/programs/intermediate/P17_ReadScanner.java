package intermediate;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * AIM: Read a text file using Scanner.
 */
public class P17_ReadScanner {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new File("demo_basic.txt"))) {
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found for scanning.");
        }
    }
}
