package ro.ase.acs.cts.factory;

public class SpadePlayingCard extends PlayingCard{

    SpadePlayingCard() {

    }

    @Override
    public String toString() {
        return getRank() + "D";
    }
}
