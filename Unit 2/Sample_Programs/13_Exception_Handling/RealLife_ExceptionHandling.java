package sample_programs.exception_handling;

class NetworkResource implements AutoCloseable {
    void use() throws Exception {
        System.out.println("Using network resource...");
        throw new Exception("Network connection lost!");
    }
    public void close() {
        System.out.println("Resource closed automatically to prevent leak.");
    }
}

/**
 * AIM: Model connection failure cleanup using Java try-with-resources.
 */
public class RealLife_ExceptionHandling {
    public static void main(String[] args) {
        try (NetworkResource res = new NetworkResource()) {
            res.use();
        } catch (Exception e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}
