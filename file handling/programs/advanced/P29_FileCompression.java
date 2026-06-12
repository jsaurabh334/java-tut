package advanced;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

/**
 * AIM: Compress a file into GZIP format.
 */
public class P29_FileCompression {
    public static void main(String[] args) {
        String sourceFile = "demo_basic.txt";
        String gzipFile = "demo_basic.txt.gz";

        try (FileInputStream fis = new FileInputStream(sourceFile);
             GZIPOutputStream gzos = new GZIPOutputStream(new FileOutputStream(gzipFile))) {
            
            byte[] buffer = new byte[1024];
            int len;
            while ((len = fis.read(buffer)) > 0) {
                gzos.write(buffer, 0, len);
            }
            System.out.println("File compressed to GZIP successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
