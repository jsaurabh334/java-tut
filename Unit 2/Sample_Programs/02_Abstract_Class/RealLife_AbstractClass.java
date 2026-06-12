package sample_programs.abstract_class;

abstract class DatabaseConnector {
    abstract void connect();
    abstract void disconnect();

    void runQuery(String sql) {
        System.out.println("Executing: " + sql);
    }
}

class MySqlConnector extends DatabaseConnector {
    void connect() { System.out.println("Connecting to MySQL Database..."); }
    void disconnect() { System.out.println("Disconnecting from MySQL Database..."); }
}

/**
 * AIM: Model real-life Database connector APIs using Abstract Classes.
 */
public class RealLife_AbstractClass {
    public static void main(String[] args) {
        DatabaseConnector db = new MySqlConnector();
        db.connect();
        db.runQuery("SELECT * FROM users");
        db.disconnect();
    }
}
