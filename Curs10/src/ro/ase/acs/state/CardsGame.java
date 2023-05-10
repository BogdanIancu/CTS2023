package ro.ase.acs.state;

import java.util.Random;

public class CardsGame {
    private ComputerPlayerState state;
    private Random random = new Random();
    private final int currentCardValue = 6;

    public CardsGame() {
        this.state = new WaitState();
    }

    public void setState(ComputerPlayerState state) {
        this.state = state;
    }

    public void playRound() {
        int cardToBePlayedValue = random.nextInt(13) + 2;
        state.play(cardToBePlayedValue);
        if(cardToBePlayedValue >= currentCardValue) {
            setState(new PlayCardState());
            state.play(cardToBePlayedValue);
        } else {
            setState(new DrawCardState());
            state.play(cardToBePlayedValue);
        }
        setState(new WaitState());
    }
}
