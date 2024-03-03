package structural.bridge.logger;

import structural.bridge.logger.logging.Logging;

public class CustomLogger extends Logger {
    public CustomLogger(Logging impl) {
        super(impl);
    }

    @Override
    void debug(String message) {
        impl.debug(message);
    }

    @Override
    void info(String message) {
        impl.info(message);
    }

    @Override
    void error(String message) {
        impl.error(message);
    }
}
