package singleton.ex2;

public class SingletonMain2 {
    public static void main(String[] args) {
        ConfigurationManager configurationManager = ConfigurationManager.getInstance();
        String property = configurationManager.getProperty("db-kind");
        System.out.println("property = " + property);
    }
}
