package ro.ase.acs.state;

public class WaitState implements ComputerPlayerState{
    @Override
    public void play(int value) {
        System.out.println("Waiting...");
    }
}
