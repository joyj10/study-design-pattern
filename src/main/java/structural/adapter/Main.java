package structural.adapter;

public class Main {
    private static final InternalLogger LOGGER = new ExternalToInternalLoggerAdapter(new ExternalLoggerImpl());

    public static void main(String[] args) {
        LOGGER.info("Application started.");
        LOGGER.info("Application finished.");
    }
}
