package ro.ase.acs.decorator;

public class BonusPlayingCard extends PlayingCardDecorator {
    private int bonusPoints;

    public BonusPlayingCard(AbstractPlayingCard playingCard) {
        super(playingCard);
    }

    public int getBonusPoints() {
        return bonusPoints;
    }

    public void setBonusPoints(int bonusPoints) {
        this.bonusPoints = bonusPoints;
    }
}
