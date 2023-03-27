package ro.ase.acs.cts.factory;

import java.io.InvalidObjectException;

public class PlayingCardFactory implements AbstractPlayingCardFactory {

    @Override
    public PlayingCard getCard(CardSuit cardSuit) {
        switch (cardSuit) {
            case CLUB: return new ClubPlayingCard();
            case DIAMOND: return new DiamondPlayingCard();
            case HEART: return new HeartPlayingCard();
            case SPADE: return new SpadePlayingCard();
            default: throw new UnsupportedOperationException();
        }
    }
}
