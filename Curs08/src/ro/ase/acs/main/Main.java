package ro.ase.acs.main;

import ro.ase.acs.composite.OldPlayingCard;
import ro.ase.acs.composite.OldPlayingCardDeck;
import ro.ase.acs.composite.SoldableItem;
import ro.ase.acs.flyweight.AbstractSolitairePlayingCard;
import ro.ase.acs.flyweight.SolitaireCardFactory;
import ro.ase.acs.proxy.AbstractPlayingCard;
import ro.ase.acs.proxy.PlayingCard;
import ro.ase.acs.proxy.PlayingCardProxy;

public class Main {
    public static void main(String[] args) {
        AbstractPlayingCard card = new PlayingCardProxy(new PlayingCard());
        card.playCard("AC");
        card.playCard("TH");
        try {
            card.playCard("AC");
        } catch(Exception e) {
            System.out.println("Somebody tried to chea");
        }

        SoldableItem oldCardFromMagician = new OldPlayingCard();
        SoldableItem oldCardFromHoudini = new OldPlayingCard();
        SoldableItem deck = new OldPlayingCardDeck();
        deck.addNode(oldCardFromMagician);
        deck.addNode(oldCardFromHoudini);
        System.out.println(deck.getPrice());

        SolitaireCardFactory factory = new SolitaireCardFactory();
        AbstractSolitairePlayingCard card1 = factory.getCard("AC");
        AbstractSolitairePlayingCard card2 = factory.getCard("2D");
        AbstractSolitairePlayingCard card3 = factory.getCard("AC");

        card1.display(1, 2);
        card2.display(3, 4);
        card3.display(7, 8);

        System.out.println(card1 == card3);
    }
}
