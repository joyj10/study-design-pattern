package structural.bridge.logger;

import structural.bridge.logger.logging.Logging;

public abstract class Logger {
    protected Logging impl;

    public Logger(Logging impl) {
        this.impl = impl;
    }

    abstract void debug(String message);
    abstract void info(String message);
    abstract void error(String message);
}
