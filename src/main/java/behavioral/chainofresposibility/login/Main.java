package behavioral.chainofresposibility.login;

public class Main {
    public static void main(String[] args) {
        // 인증 요청 생성
        AuthenticationRequest request1 = new AuthenticationRequest("admin", "password", "");
        AuthenticationRequest request2 = new AuthenticationRequest("", "", "valid_token");

        // 클라이언트 생성
        AuthenticationClient client = new AuthenticationClient();

        // 요청 처리
        System.out.println("Processing request 1:");
        client.authenticate(request1);

        System.out.println();
        System.out.println("Processing request 2:");
        client.authenticate(request2);
    }
}
