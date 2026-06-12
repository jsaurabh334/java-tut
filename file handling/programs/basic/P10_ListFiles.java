package basic;

import java.io.File;

/**
 * AIM: List all files and folders in a directory.
 * 
 * ALGORITHM:
 * 1. Instantiate the File object pointing to the directory.
 * 2. Invoke list() or listFiles().
 * 3. Loop and display details.
 */
public class P10_ListFiles {
    public static void main(String[] args) {
        File dir = new File(".");
        String[] contents = dir.list();
        if (contents != null) {
            System.out.println("Contents of the current directory:");
            for (String fileOrDir : contents) {
                System.out.println("  " + fileOrDir);
            }
        } else {
            System.out.println("Directory is empty or path is invalid.");
        }
    }
}
