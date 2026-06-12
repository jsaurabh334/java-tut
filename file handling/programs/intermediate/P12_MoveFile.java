package intermediate;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 * AIM: Move or rename a file using Java NIO.2.
 */
public class P12_MoveFile {
    public static void main(String[] args) {
        Path sourcePath = Paths.get("destination.txt");
        Path targetPath = Paths.get("moved_destination.txt");
        
        try {
            // Ensure source exists for the demo to work
            if (!Files.exists(sourcePath)) {
                Files.createFile(sourcePath);
            }
            Files.move(sourcePath, targetPath, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File moved successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
