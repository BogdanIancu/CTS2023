package ro.ase.acs.cts.builder;

public class DeckOfCardsDirector {
    private final DeckOfCardsAbstractBuilder builder;

    public DeckOfCardsDirector(DeckOfCardsAbstractBuilder builder) {
        this.builder = builder;
    }

    public DeckOfCards createDeck(String producer, float price) {
        builder.addProducer(producer);
        builder.addPrice(price);
        return builder.buildDeck();
    }

    public DeckOfCards createDeck(String producer, float price, float discount) {
        builder.addProducer(producer);
        builder.addPrice(price);
        builder.addDiscount(discount);
        return builder.buildDeck();
    }
}
