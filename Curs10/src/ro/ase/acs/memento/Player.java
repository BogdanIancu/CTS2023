package ro.ase.acs.memento;

import java.util.ArrayList;
import java.util.List;

public class Player implements Cloneable {
    List<String> cards = new ArrayList<>();

    public String play() {
        String cardToBePlayed = cards.get(0);
        cards.remove(0);
        return cardToBePlayed;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Player player = (Player) super.clone();
        player.cards = new ArrayList<>();
        player.cards.addAll(cards);
        return player;
    }

    @Override
    public String toString() {
        return "Player{" +
                "cards=" + cards +
                '}';
    }
}
