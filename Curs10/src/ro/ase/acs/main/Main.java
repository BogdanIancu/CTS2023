package ro.ase.acs.main;

import ro.ase.acs.memento.Game;
import ro.ase.acs.observer.Player;
import ro.ase.acs.observer.PlayingCard;
import ro.ase.acs.state.CardsGame;
import ro.ase.acs.template.GameOfCards;
import ro.ase.acs.template.Macau;

public class Main {
    public static void main(String[] args) {
        CardsGame game = new CardsGame();
        game.playRound();

        PlayingCard playingCard = new PlayingCard("5H");
        Player player1 = new Player();
        Player player2 = new Player();
        playingCard.subscribe(player1);
        playingCard.subscribe(player2);
        playingCard.play();
        playingCard.unsubscribe(player1);
        playingCard.play();

        Game game1 = new Game();
        System.out.println(game1);
        game1.play();
        game1.saveGame();
        System.out.println(game1);
        game1.play();
        System.out.println(game1);
        game1.undoPreviousMove();
        System.out.println(game1);

        GameOfCards cardsGame = new Macau();
        cardsGame.playRound();
    }
}
