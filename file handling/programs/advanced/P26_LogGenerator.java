package advanced;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * AIM: Create a log generator writing logs with timestamps.
 */
public class P26_LogGenerator {
    public static void log(String level, String msg) {
        try (PrintWriter pw = new PrintWriter(new FileWriter("app.log", true))) {
            String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            pw.printf("[%s] [%s] - %s%n", timestamp, level, msg);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        log("INFO", "Application started successfully.");
        log("WARNING", "Low disk space alert.");
        log("ERROR", "Database connection timed out.");
        System.out.println("Logs generated in app.log.");
    }
}
