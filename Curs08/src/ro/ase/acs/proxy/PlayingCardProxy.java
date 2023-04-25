package ro.ase.acs.proxy;

import java.util.HashSet;
import java.util.Set;

public class PlayingCardProxy implements AbstractPlayingCard {
    private Set<String> playedCards = new HashSet<>();
    private AbstractPlayingCard playingCard;

    public PlayingCardProxy(AbstractPlayingCard playingCard) {
        this.playingCard = playingCard;
    }

    @Override
    public void playCard(String card) {
        if(playedCards.contains(card)) {
            throw new RuntimeException("Cheating attempt!!!");
        }
        playingCard.playCard(card);
        playedCards.add(card);
    }
}
