package ro.ase.acs.template;

public abstract class GameOfCards {
    protected abstract void shuffleCards();
    protected abstract void dealCards();
    protected abstract void pickWinner();
    public final void playRound() {
        shuffleCards();
        dealCards();
        pickWinner();
    }
}
