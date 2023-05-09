package ro.ase.acs.strategy;

public class PlayCardStrategy implements Strategy{
    @Override
    public void play() {
        System.out.println("Card played");
    }
}
