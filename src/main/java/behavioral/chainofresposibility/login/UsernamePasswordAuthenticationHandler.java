package behavioral.chainofresposibility.login;

public class UsernamePasswordAuthenticationHandler implements AuthenticationHandler {
    private final AuthenticationHandler nextHandler;

    public UsernamePasswordAuthenticationHandler(AuthenticationHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleAuthentication(AuthenticationRequest request) {
        System.out.println("===UsernamePasswordAuthenticationHandler start===");
        if (isValidUsernameAndPassword(request.getUsername(), request.getPassword())) {
            System.out.println("Username and password authentication succeeded");
        } else if (nextHandler != null) {
            nextHandler.handleAuthentication(request);
        } else {
            System.out.println("Authentication failed");
        }
        System.out.println("===UsernamePasswordAuthenticationHandler end===");
    }

    private boolean isValidUsernameAndPassword(String username, String password) {
        // 실제 인증 수행 및 유효성 검사 : DB 조회 등
        return username.equals("admin") && password.equals("password");
    }

}
