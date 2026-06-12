package basic;

import java.io.File;
import java.io.IOException;

/**
 * AIM: Create a new file in Java.
 * 
 * ALGORITHM:
 * 1. Instantiate a File object with a path string.
 * 2. Invoke the createNewFile() method.
 * 3. Handle the IOException using a try-catch block.
 * 4. Print whether the file was successfully created or already existed.
 * 
 * TIME COMPLEXITY: O(1) file creation call.
 * 
 * VIVA QUESTIONS:
 * - What does createNewFile() return if the file already exists? (false)
 * - Which package contains the File class? (java.io)
 */
public class P01_CreateFile {
    public static void main(String[] args) {
        try {
            File file = new File("demo_basic.txt");
            if (file.createNewFile()) {
                System.out.println("File created successfully: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.err.println("An error occurred during file creation.");
            e.printStackTrace();
        }
    }
}
