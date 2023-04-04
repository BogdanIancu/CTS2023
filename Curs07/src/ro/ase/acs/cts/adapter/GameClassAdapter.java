package ro.ase.acs.cts.adapter;

public class GameClassAdapter extends OldGame implements AbstractNewGame{
    @Override
    public void generateCard() {
        super.drawCard();
    }
}
