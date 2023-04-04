package ro.ase.acs.cts.main;

import ro.ase.acs.cts.builder.DeckOfCards;
import ro.ase.acs.cts.builder.DeckOfCardsBuilder;
import ro.ase.acs.cts.prototype.SolitairePlayingCard;

public class Main {
    public static void main(String[] args) {
        SolitairePlayingCard solitairePlayingCard = new SolitairePlayingCard();
        solitairePlayingCard.setRank(7);
        solitairePlayingCard.setSuit('H');
        solitairePlayingCard.setX(1);
        solitairePlayingCard.setY(1);
        solitairePlayingCard.render();

        try {
            SolitairePlayingCard secondCard =
                    (SolitairePlayingCard) solitairePlayingCard.clone();
            secondCard.setX(2);
            secondCard.setY(2);
            secondCard.render();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

        DeckOfCardsBuilder builder = new DeckOfCardsBuilder();
        builder.addPrice(40).addProducer("ACME").addMaterial("plastic");
        builder.addModel("bicycle");
        DeckOfCards deckOfCards = builder.buildDeck();
        System.out.println(deckOfCards);
    }
}
