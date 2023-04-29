package ro.ase.acs.cts.proxy;

public class AuthenticationProxy implements AuthenticationService {
    private final AuthenticationService authenticationService;
    private int numberOfFailedAttempts = 0;

    public AuthenticationProxy(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @Override
    public boolean login(String username, String password) {
        if (numberOfFailedAttempts > 2) {
            return false;
        } else {
            boolean isLoginSuccessful = authenticationService.login(username, password);
            if (isLoginSuccessful) {
                numberOfFailedAttempts = 0;
            } else {
                numberOfFailedAttempts++;
            }
            return isLoginSuccessful;
        }
    }
}
