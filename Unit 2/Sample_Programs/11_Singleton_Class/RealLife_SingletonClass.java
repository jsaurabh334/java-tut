package sample_programs.singleton_class;

class ConfigManager {
    private static ConfigManager instance;
    private String dbUrl = "jdbc:mysql://localhost:3306/mydb";

    private ConfigManager() {}

    public static ConfigManager getInstance() {
        if (instance == null) {
            instance = new ConfigManager();
        }
        return instance;
    }

    String getDbUrl() { return dbUrl; }
}

/**
 * AIM: Model real-world database configuration storage via Singleton class.
 */
public class RealLife_SingletonClass {
    public static void main(String[] args) {
        ConfigManager conf = ConfigManager.getInstance();
        System.out.println("Config URL: " + conf.getDbUrl());
    }
}
