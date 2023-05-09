package ro.ase.acs.main;

import ro.ase.acs.chain.Player;
import ro.ase.acs.command.DrawCardCommand;
import ro.ase.acs.command.Game;
import ro.ase.acs.command.OnlinePlayer;
import ro.ase.acs.command.PlayCardCommand;
import ro.ase.acs.decorator.AdvantagePlayingCard;
import ro.ase.acs.decorator.BonusPlayingCard;
import ro.ase.acs.decorator.PlayingCard;
import ro.ase.acs.strategy.DrawCardStrategy;
import ro.ase.acs.strategy.PlayCardStrategy;
import ro.ase.acs.strategy.SinglePlayerGame;

public class Main {
    public static void main(String[] args) {
        PlayingCard normalCard = new PlayingCard();
        normalCard.setValue(5);
        normalCard.play();

        BonusPlayingCard bonusCard = new BonusPlayingCard(normalCard);
        bonusCard.setBonusPoints(2);

        AdvantagePlayingCard advantageCard = new AdvantagePlayingCard(bonusCard);
        advantageCard.givePenalty("George");

        Player player1 = new Player();
        player1.setCardToBePlayed("AD");
        Player player2 = new Player();
        player2.setCardToBePlayed("5H");
        Player player3 = new Player();
        player3.setCardToBePlayed("8C");

        player1.setNextPlayer(player2);
        player2.setNextPlayer(player3);

        player1.playRound("7S");

        Game game = new Game();
        OnlinePlayer onlinePlayer1 = new OnlinePlayer();
        OnlinePlayer onlinePlayer2 = new OnlinePlayer();
        OnlinePlayer onlinePlayer3 = new OnlinePlayer();

        game.playHand(new PlayCardCommand(onlinePlayer1));
        game.playHand(new PlayCardCommand(onlinePlayer2));
        game.playHand(new DrawCardCommand(onlinePlayer3));
        game.playRound();

        SinglePlayerGame singlePlayerGame = new SinglePlayerGame();
        singlePlayerGame.setStrategy(new PlayCardStrategy());
        singlePlayerGame.playRound();
        singlePlayerGame.setStrategy(new DrawCardStrategy());
        singlePlayerGame.playRound();
        singlePlayerGame.setStrategy(() -> System.out.println("Paused game"));
        singlePlayerGame.playRound();
    }
}
