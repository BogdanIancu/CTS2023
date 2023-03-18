package ro.ase.acs.singleton;

import java.time.LocalDateTime;

public class LoggerV3 {
    public static LoggerV3 logger = new LoggerV3();
    private LoggerV3() {
    }

    public void log (String message){
        System.out.println(LocalDateTime.now() + ": " + message);
    }
}
