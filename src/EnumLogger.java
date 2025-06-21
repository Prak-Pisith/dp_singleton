enum EnumLogger {

    INSTANCE;

    EnumLogger() {
        // Initialization code here
        System.out.println("EnumLogger instance created");
    }

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
