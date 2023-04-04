package ro.ase.acs.cts.builder;

public interface DeckOfCardsAbstractBuilder {
    DeckOfCardsAbstractBuilder addPrice(float price);

    DeckOfCardsAbstractBuilder addDiscount(float discount);

    DeckOfCardsAbstractBuilder addProducer(String producer);

    DeckOfCardsAbstractBuilder addMaterial(String material);

    DeckOfCardsAbstractBuilder addWeight(float weight);

    DeckOfCardsAbstractBuilder addModel(String model);

    DeckOfCards buildDeck();
}
