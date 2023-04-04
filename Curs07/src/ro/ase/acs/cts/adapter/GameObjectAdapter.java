package ro.ase.acs.cts.adapter;

public class GameObjectAdapter implements AbstractNewGame {
    private AbstractOldGame oldGame;

    public GameObjectAdapter(AbstractOldGame oldGame) {
        this.oldGame = oldGame;
    }

    @Override
    public void generateCard() {
        oldGame.drawCard();
    }
}
