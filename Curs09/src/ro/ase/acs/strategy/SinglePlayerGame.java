package ro.ase.acs.strategy;

public class SinglePlayerGame {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void playRound() {
        if(strategy != null) {
            strategy.play();
        }
    }
}
