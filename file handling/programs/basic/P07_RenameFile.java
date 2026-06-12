package basic;

import java.io.File;

/**
 * AIM: Rename a file.
 * 
 * ALGORITHM:
 * 1. Instantiate the File objects for the source and target name.
 * 2. Invoke renameTo() method on source.
 */
public class P07_RenameFile {
    public static void main(String[] args) {
        File oldFile = new File("demo_basic.txt");
        File newFile = new File("renamed_demo.txt");
        
        // Ensure source exists for the demo to work
        try {
            oldFile.createNewFile();
        } catch (Exception ignored) {}

        if (oldFile.renameTo(newFile)) {
            System.out.println("File renamed successfully to: " + newFile.getName());
        } else {
            System.out.println("Failed to rename the file.");
        }
    }
}
