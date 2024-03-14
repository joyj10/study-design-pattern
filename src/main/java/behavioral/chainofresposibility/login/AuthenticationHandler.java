package behavioral.chainofresposibility.login;

public interface AuthenticationHandler {
    void handleAuthentication(AuthenticationRequest request);
}
