package ro.ase.acs.decorator;

public class AdvantagePlayingCard extends PlayingCardDecorator{
    public AdvantagePlayingCard(AbstractPlayingCard playingCard) {
        super(playingCard);
    }

    public void givePenalty(String player) {
        System.out.println("Penalty given to " + player);
    }
}
