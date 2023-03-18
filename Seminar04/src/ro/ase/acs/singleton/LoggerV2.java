package ro.ase.acs.singleton;

import java.time.LocalDateTime;

public enum LoggerV2 {
    INSTANCE;
    public void log (String message){
        System.out.println(LocalDateTime.now() + ": " + message);
    }
}
