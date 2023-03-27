package ro.ase.acs.cts.main;

import ro.ase.acs.cts.factory.AbstractPlayingCardFactory;
import ro.ase.acs.cts.factory.CardSuit;
import ro.ase.acs.cts.factory.PlayingCard;
import ro.ase.acs.cts.factory.PlayingCardFactory;

public class Main {
    public static void main(String[] args) {
        AbstractPlayingCardFactory factory = new PlayingCardFactory();
        PlayingCard card1 = factory.getCard(CardSuit.HEART);
        System.out.println(card1);
        PlayingCard card2 = factory.getCard(CardSuit.DIAMOND);
        System.out.println(card2);
        PlayingCard card3 = factory.getCard(CardSuit.SPADE);
        System.out.println(card3);
        PlayingCard card4 = factory.getCard(CardSuit.CLUB);
        System.out.println(card4);
    }
}
