package singleton.ex1;

public class Singleton {
    // 인스턴스 미리 생성
    private static final Singleton instance = new Singleton();

    // private 생성자로 new 키워드로 객체 생성 막음
    private Singleton() {}

    // 인스턴스 반환하는 static 메서드
    public static Singleton getInstance() {
        return instance;
    }

    // 추가 기능 메서드
    public void print() {
        System.out.println("Singleton : " + instance);
    }
}
