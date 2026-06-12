package sample_programs.composition;

class ConnectionPool {
    private int size;
    ConnectionPool(int size) { this.size = size; }
    void init() { System.out.println("Initialized " + size + " active DB connections."); }
}

class AppServer {
    private final ConnectionPool pool; // Composition

    AppServer() {
        this.pool = new ConnectionPool(10); // Managed exclusively by the server
    }

    void startServer() {
        pool.init();
        System.out.println("App Server started.");
    }
}

/**
 * AIM: Model real-world Application Server Connection Pool composition.
 */
public class RealLife_Composition {
    public static void main(String[] args) {
        AppServer server = new AppServer();
        server.startServer();
    }
}
