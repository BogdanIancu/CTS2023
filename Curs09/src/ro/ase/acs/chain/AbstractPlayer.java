package ro.ase.acs.chain;

public abstract class AbstractPlayer {
    protected AbstractPlayer nextPlayer;

    public void setNextPlayer(AbstractPlayer nextPlayer) {
        this.nextPlayer = nextPlayer;
    }

    public abstract void playRound(String currentCard);
}
