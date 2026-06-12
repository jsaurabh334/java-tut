package basic;

import java.io.File;

/**
 * AIM: Delete an existing file from the filesystem.
 * 
 * ALGORITHM:
 * 1. Instantiate the File object.
 * 2. Invoke delete() method.
 * 3. Verify and print whether the deletion succeeded.
 */
public class P06_DeleteFile {
    public static void main(String[] args) {
        File file = new File("demo_basic.txt");
        if (file.delete()) {
            System.out.println("File deleted successfully.");
        } else {
            System.out.println("Failed to delete the file (or file does not exist).");
        }
    }
}
