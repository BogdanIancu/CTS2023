package ro.ase.acs.state;

public class DrawCardState implements ComputerPlayerState{
    @Override
    public void play(int value) {
        System.out.println("Drawing card...");
    }
}
