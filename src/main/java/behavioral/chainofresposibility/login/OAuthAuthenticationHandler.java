package behavioral.chainofresposibility.login;

public class OAuthAuthenticationHandler implements AuthenticationHandler {
    private final AuthenticationHandler nextHandler;

    public OAuthAuthenticationHandler(AuthenticationHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleAuthentication(AuthenticationRequest request) {
        System.out.println("===OAuthAuthenticationHandler start===");
        if (isValidOAuthToken(request.getOAuthToken())) {
            System.out.println("OAuth token authentication succeeded");
        } else if (nextHandler != null) {
            nextHandler.handleAuthentication(request);
        } else {
            System.out.println("Authentication failed");
        }
        System.out.println("===OAuthAuthenticationHandler end===");
    }

    private boolean isValidOAuthToken(String oAuthToken) {
        // OAuth 토큰 유효성 검사
        return oAuthToken.equals("valid_token");
    }
}
