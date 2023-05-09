package ro.ase.acs.command;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<Command> commands = new ArrayList<>();

    public void playHand(Command command) {
        commands.add(command);
    }

    public void playRound() {
        for(Command c :  commands) {
            c.doAction();
        }
        commands.clear();
    }
}
