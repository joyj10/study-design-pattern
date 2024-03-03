package structural.bridge.logger.logging;

public class FileLogger implements Logging {
    @Override
    public void debug(String message) {
        // Write debug message to file
        System.out.println("[File Debug] " + message);
    }

    @Override
    public void info(String message) {
        // Write info message to file
        System.out.println("[File Info] " + message);
    }

    @Override
    public void error(String message) {
        // Write error message to file
        System.out.println("[File Error] " + message);
    }
}
