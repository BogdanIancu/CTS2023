package ro.ase.acs.cts.proxy;

public interface AuthenticationService {
    boolean login(String username, String password);
}
