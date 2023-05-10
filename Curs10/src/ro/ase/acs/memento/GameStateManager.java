package ro.ase.acs.memento;

import java.util.ArrayList;
import java.util.List;

public class GameStateManager {
    private List<CurrentGame> stateHistory = new ArrayList<>();

    public void saveCurrentState(CurrentGame state) {
        try {
            stateHistory.add((CurrentGame) state.clone());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public CurrentGame getPreviousState() {
        CurrentGame previousState = stateHistory.get(stateHistory.size() - 1);
        stateHistory.remove(stateHistory.size() - 1);
        return previousState;
    }
}
