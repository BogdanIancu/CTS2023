package ro.ase.acs.decorator;

public final class PlayingCard implements AbstractPlayingCard{
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public void play() {
        System.out.println("A card with the value " + value +
                " has been played");
    }
}
