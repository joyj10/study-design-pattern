package structural.bridge.logger.logging;

public class ConsoleLogger implements Logging {
    @Override
    public void debug(String message) {
        System.out.println("[Console Debug] " + message);
    }

    @Override
    public void info(String message) {
        System.out.println("[Console Info] " + message);
    }

    @Override
    public void error(String message) {
        System.out.println("[Console Error] " + message);
    }
}
