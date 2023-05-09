package ro.ase.acs.strategy;

public class DrawCardStrategy implements Strategy{
    @Override
    public void play() {
        System.out.println("Card drawn");
    }
}
