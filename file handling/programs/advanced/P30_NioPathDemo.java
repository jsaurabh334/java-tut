package advanced;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * AIM: Demonstrate modern Path and Files (NIO.2) API operations.
 */
public class P30_NioPathDemo {
    public static void main(String[] args) {
        Path path = Paths.get("demo_basic.txt");
        System.out.println("File Name: " + path.getFileName());
        System.out.println("Parent Directory: " + path.getParent());
        System.out.println("Exists: " + Files.exists(path));
        System.out.println("Is Directory: " + Files.isDirectory(path));
        System.out.println("Is Readable: " + Files.isReadable(path));
    }
}
