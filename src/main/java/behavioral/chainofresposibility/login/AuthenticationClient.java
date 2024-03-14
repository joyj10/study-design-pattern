package behavioral.chainofresposibility.login;

public class AuthenticationClient {
    private AuthenticationHandler authenticationHandler;

    public AuthenticationClient() {
        buildChain();
    }

    private void buildChain() {
        AuthenticationHandler oauthHandler = new OAuthAuthenticationHandler(null);
        AuthenticationHandler usernamePasswordHandler = new UsernamePasswordAuthenticationHandler(oauthHandler);
        authenticationHandler = usernamePasswordHandler;
    }

    public void authenticate(AuthenticationRequest request) {
        authenticationHandler.handleAuthentication(request);
    }
}
