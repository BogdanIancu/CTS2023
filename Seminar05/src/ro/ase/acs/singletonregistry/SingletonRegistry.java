package ro.ase.acs.singletonregistry;

import java.util.HashMap;
import java.util.Map;

public class SingletonRegistry {
    private static Map<String, Object> registry = new HashMap<>();

    static {
        registry.put("logger", new Logger());
        registry.put("databaseConnection", new DatabaseConnection());
    }

    public <T> T getSingleton(String key) {
        return (T) registry.get(key);
    }

    public static class DatabaseConnection {
        private DatabaseConnection() {
        }

        public void connect() {
            System.out.println("Connecting to the database...");
        }
    }
}
