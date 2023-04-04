package ro.ase.acs.cts.main;

import ro.ase.acs.cts.adapter.*;
import ro.ase.acs.cts.builder.DeckOfCards;
import ro.ase.acs.cts.builder.DeckOfCardsBuilder;
import ro.ase.acs.cts.builder.DeckOfCardsDirector;

public class Main {
    public static void main(String[] args) {
        DeckOfCardsBuilder builder = new DeckOfCardsBuilder();
        builder.addPrice(40).addProducer("ACME").addMaterial("plastic");
        builder.addModel("bicycle");
        DeckOfCards deckOfCards = builder.buildDeck();
        System.out.println(deckOfCards);

        DeckOfCards.Builder deckOfCardsBuilder = new DeckOfCards.Builder();
        deckOfCardsBuilder.addPrice(50);
        deckOfCardsBuilder.addProducer("ABCD").addModel("Kings");
        deckOfCardsBuilder.addMaterial("cardboard");
        DeckOfCards deckOfCards2 = deckOfCardsBuilder.buildDeck();
        System.out.println(deckOfCards2);
        deckOfCardsBuilder.addDiscount(50);
        System.out.println(deckOfCards2);

        DeckOfCardsDirector director =
                new DeckOfCardsDirector(new DeckOfCardsBuilder());
        DeckOfCards deckOfCards3 =
                director.createDeck("XYZ", 35);
        System.out.println(deckOfCards3);


        AbstractNewGame newGame = new NewGame();
        newGame.generateCard();

        AbstractOldGame oldGame = new OldGame();
        newGame = new GameObjectAdapter(oldGame);
        newGame.generateCard();

        newGame = new GameClassAdapter();
        newGame.generateCard();
    }
}
