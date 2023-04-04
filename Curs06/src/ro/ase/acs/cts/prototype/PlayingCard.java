package ro.ase.acs.cts.prototype;

public abstract class PlayingCard implements Cloneable {
    protected int rank;
    protected char suit;

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public char getSuit() {
        return suit;
    }

    public void setSuit(char suit) {
        this.suit = suit;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        PlayingCard copy = (PlayingCard) super.clone();
        copy.rank = rank;
        copy.suit = suit;
        return copy;
    }

    public abstract void render();
}
