package ro.ase.acs.cts.factory;

public interface AbstractPlayingCardFactory {
    PlayingCard getCard(CardSuit cardSuit);
}
