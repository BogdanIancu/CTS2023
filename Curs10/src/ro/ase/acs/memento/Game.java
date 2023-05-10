package ro.ase.acs.memento;

public class Game {
    private GameStateManager stateManager = new GameStateManager();
    private CurrentGame state = new CurrentGame();

    public Game() {
        Player player1 = new Player();
        player1.cards.add("4H");
        player1.cards.add("5D");

        Player player2 = new Player();
        player2.cards.add("3C");
        player2.cards.add("AS");

        state.addPlayer(player1);
        state.addPlayer(player2);
    }

    public void undoPreviousMove() {
        state = stateManager.getPreviousState();
    }

    public void saveGame() {
        stateManager.saveCurrentState(state);
    }

    public void play() {
        state.playRound();
    }

    @Override
    public String toString() {
        return "Game{" +
                "state=" + state +
                '}';
    }
}
