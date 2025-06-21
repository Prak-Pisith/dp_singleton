public class SingletonLogger {

    private static final SingletonLogger instance = new SingletonLogger();

    private SingletonLogger() {
        // Private constructor to prevent instantiation
        System.out.println("SingletonLogger initialized");
    }

    public static SingletonLogger getInstance() {
        return instance;
    }

    // Example method to log messages
    public void info(String message) {
        System.out.println("INFO: " + message + "." + "Timestamp: " + System.currentTimeMillis());
    }
    public void error(String message) {
        System.err.println("ERROR: " + message + "." + "Timestamp: " + System.currentTimeMillis());
    }
    public void debug(String message) {
        System.out.println("DEBUG: " + message + "." + "Timestamp: " + System.currentTimeMillis());
    }
}
