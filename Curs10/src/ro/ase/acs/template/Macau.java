package ro.ase.acs.template;

public class Macau extends GameOfCards {
    @Override
    protected void shuffleCards() {
        System.out.println("Shuffling cards");
    }

    @Override
    protected void dealCards() {
        System.out.println("Dealing 5 cards to each player");
    }

    @Override
    protected void pickWinner() {
        System.out.println("The first player out of cards wins");
    }
}
