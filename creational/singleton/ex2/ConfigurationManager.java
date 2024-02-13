package singleton.ex2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationManager {
    private static final ConfigurationManager instance = new ConfigurationManager();

    private Properties properties;

    private ConfigurationManager() {
        properties = new Properties();

        try {
            properties.load(new FileInputStream("creational/singleton/ex2/config.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ConfigurationManager getInstance() {
        return instance;
    }

    public String getProperty(String key) {
        return properties.getProperty(key);
    }
}
