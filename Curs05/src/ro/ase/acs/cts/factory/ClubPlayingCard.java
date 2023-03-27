package ro.ase.acs.cts.factory;

public class ClubPlayingCard extends PlayingCard {

    ClubPlayingCard() {

    }

    @Override
    public String toString() {
        return getRank() + "C";
    }
}
