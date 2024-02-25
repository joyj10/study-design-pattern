package creational.singleton.ex1;

public class SingletonMain1 {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        instance1.print();
        instance2.print();
    }
}
