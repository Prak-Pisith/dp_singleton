public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

//        // Access the singleton logger instance
//        SingletonLogger logger = SingletonLogger.getInstance();
//        System.out.println("Logger instance: " + logger);
//
//        // Log messages using the singleton logger
//        logger.info("This is an info message");
//        logger.error("This is an error message");
//        logger.debug("This is a debug message");

        // ENUM Singleton usage
//        EnumSingleton enumSingleton1 = EnumSingleton.INSTANCE;
//        EnumSingleton enumSingleton2 = EnumSingleton.INSTANCE;
//        System.out.println("EnumSingleton instance 1: " + enumSingleton1);
//        System.out.println("EnumSingleton instance 2: " + enumSingleton2);
//        System.out.println("Same EnumSingleton instance? " + (enumSingleton1 == enumSingleton2));
//        enumSingleton1.doSomething();
//        System.out.println(enumSingleton1.getInfo());
//        System.out.println(enumSingleton2.getInfo());

        // ENUM Logger usage
        EnumLogger enumLogger = EnumLogger.INSTANCE;
        System.out.println("EnumLogger instance: " + enumLogger);
        enumLogger.info("This is an info message from EnumLogger");
        enumLogger.error("This is an error message from EnumLogger");
        enumLogger.debug("This is a debug message from EnumLogger");


    }
}