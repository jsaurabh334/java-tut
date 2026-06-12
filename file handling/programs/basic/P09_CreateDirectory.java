package basic;

import java.io.File;

/**
 * AIM: Create a new directory.
 * 
 * ALGORITHM:
 * 1. Instantiate a File object with the directory path.
 * 2. Invoke mkdir() or mkdirs().
 */
public class P09_CreateDirectory {
    public static void main(String[] args) {
        File dir = new File("test_directory");
        if (dir.mkdir()) {
            System.out.println("Directory created successfully: " + dir.getName());
        } else {
            System.out.println("Directory already exists or creation failed.");
        }
    }
}
