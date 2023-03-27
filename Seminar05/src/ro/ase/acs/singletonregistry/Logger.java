package ro.ase.acs.singletonregistry;

import java.time.LocalDateTime;

public class Logger {
    Logger() {
    }

    public void log(String message) {
        System.out.println(LocalDateTime.now() + ": " + message);
    }
}
