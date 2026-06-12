package basic;

import java.io.File;

/**
 * AIM: Display metadata properties of a file.
 * 
 * ALGORITHM:
 * 1. Instantiate the File object.
 * 2. Invoke canRead(), canWrite(), getAbsolutePath(), and length().
 */
public class P08_FileProperties {
    public static void main(String[] args) {
        File file = new File("renamed_demo.txt");
        if (file.exists()) {
            System.out.println("File Name: " + file.getName());
            System.out.println("Absolute Path: " + file.getAbsolutePath());
            System.out.println("Writable: " + file.canWrite());
            System.out.println("Readable: " + file.canRead());
            System.out.println("File Size in Bytes: " + file.length());
        } else {
            System.out.println("The file does not exist.");
        }
    }
}
