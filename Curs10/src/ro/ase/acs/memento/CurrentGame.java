package ro.ase.acs.memento;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class CurrentGame implements Cloneable{
    private Stack<String> playedCards = new Stack<>();
    private List<Player> players = new ArrayList<>();

    public void addPlayer(Player player) {
        players.add(player);
    }

    void playRound() {
        for(Player p : players) {
            String card = p.play();
            playedCards.push(card);
        }
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        CurrentGame state = (CurrentGame) super.clone();
        state.playedCards = new Stack<>();
        state.playedCards.addAll(playedCards);
        state.players = new ArrayList<>();
        for(Player p : players) {
            state.players.add((Player) p.clone());
        }
        return state;
    }

    @Override
    public String toString() {
        return "CurrentGameState{" +
                "playedCards=" + playedCards +
                ", players=" + players +
                '}';
    }
}
