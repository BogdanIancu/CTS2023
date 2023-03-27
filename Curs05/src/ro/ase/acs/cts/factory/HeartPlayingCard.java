package ro.ase.acs.cts.factory;

public class HeartPlayingCard extends PlayingCard{
    HeartPlayingCard() {

    }

    @Override
    public String toString() {
        return getRank() + "H";
    }
}
