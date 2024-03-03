package structural.bridge.logger;

import structural.bridge.logger.logging.ConsoleLogger;
import structural.bridge.logger.logging.FileLogger;

public class Main {
    public static void main(String[] args) {
        // Create console logger
        Logger consoleLogger = new CustomLogger(new ConsoleLogger());
        consoleLogger.debug("Debug message to console");
        consoleLogger.info("Info message to console");
        consoleLogger.error("Error message to console");

        // Create file logger
        Logger fileLogger = new CustomLogger(new FileLogger());
        fileLogger.debug("Debug message to file");
        fileLogger.info("Info message to file");
        fileLogger.error("Error message to file");
    }
}
