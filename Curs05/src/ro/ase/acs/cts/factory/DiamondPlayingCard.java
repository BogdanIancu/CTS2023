package ro.ase.acs.cts.factory;

public class DiamondPlayingCard extends PlayingCard {

    DiamondPlayingCard() {

    }

    @Override
    public String toString() {
        return getRank() + "D";
    }
}
