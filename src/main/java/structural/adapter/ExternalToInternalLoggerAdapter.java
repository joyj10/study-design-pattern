package structural.adapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExternalToInternalLoggerAdapter implements InternalLogger {
    private static final Logger LOGGER = LoggerFactory.getLogger(ExternalToInternalLoggerAdapter.class);
    private ExternalLogger externalLogger;

    public ExternalToInternalLoggerAdapter(ExternalLogger externalLogger) {
        this.externalLogger = externalLogger;
    }

    @Override
    public void info(String message) {
        LOGGER.info(message);
    }

    @Override
    public void error(String message) {
        LOGGER.error(message);
    }

}
