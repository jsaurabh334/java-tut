package sample_programs.method_overloading;

class Logger {
    void log(String message) {
        System.out.println("[INFO]: " + message);
    }
    void log(String level, String message) {
        System.out.println("[" + level + "]: " + message);
    }
    void log(String level, String message, int code) {
        System.out.println("[" + level + "] (Code: " + code + "): " + message);
    }
}

/**
 * AIM: Model real-world Logger API methods using Overloading.
 */
public class RealLife_MethodOverloading {
    public static void main(String[] args) {
        Logger logger = new Logger();
        logger.log("System started.");
        logger.log("WARNING", "High temperature.");
        logger.log("ERROR", "Database connection lost.", 503);
    }
}
