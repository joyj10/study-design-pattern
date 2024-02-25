package structural.adapter;

public class ExternalLoggerImpl implements ExternalLogger {
    @Override
    public void log(String message) {
        // 외부 라이브러리의 로깅 메서드 호출
        System.out.println("External library logging: " + message);
    }
}
