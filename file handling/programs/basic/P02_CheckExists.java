package basic;

import java.io.File;

/**
 * AIM: Check if a file exists on disk.
 * 
 * ALGORITHM:
 * 1. Instantiate the File object.
 * 2. Invoke the exists() method.
 * 3. Print the existence status.
 * 
 * TIME COMPLEXITY: O(1)
 */
public class P02_CheckExists {
    public static void main(String[] args) {
        File file = new File("demo_basic.txt");
        if (file.exists()) {
            System.out.println("The file exists: " + file.getAbsolutePath());
        } else {
            System.out.println("The file does not exist.");
        }
    }
}
