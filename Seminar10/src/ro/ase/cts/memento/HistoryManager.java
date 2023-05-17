package ro.ase.cts.memento;

import java.util.Stack;

public class HistoryManager {
    private Stack<Video> history = new Stack<>();

    public void save(Video video) {
        try {
            history.push((Video) video.clone());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

    }

    public Video undo() {
        return history.pop();
    }

}
