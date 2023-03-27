package ro.ase.acs.cts.factory;

import java.util.Random;

public abstract class PlayingCard {
    private Random random = new Random();
    private int rank;

    PlayingCard() {
        rank = random.nextInt(13) + 2;
    }

    public int getRank() {
        return rank;
    }
}
