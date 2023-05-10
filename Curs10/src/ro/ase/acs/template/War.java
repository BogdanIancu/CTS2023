package ro.ase.acs.template;

public class War extends GameOfCards {
    @Override
    protected void shuffleCards() {
        System.out.println("Shuffling the cards");
    }

    @Override
    protected void dealCards() {
        System.out.println("Dealing all the cards to the players");
    }

    @Override
    protected void pickWinner() {
        System.out.println("The last player with cards in his hand wins");
    }
}
