package ro.ase.acs.cts.builder;

public class DeckOfCardsBuilder implements DeckOfCardsAbstractBuilder {
    private float price;
    private float discount;
    private String producer;
    private String material;
    private float weight;
    private String model;

    @Override
    public DeckOfCardsBuilder addPrice(float price) {
        this.price = price;
        return this;
    }

    @Override
    public DeckOfCardsBuilder addDiscount(float discount) {
        this.discount = discount;
        return this;
    }

    @Override
    public DeckOfCardsBuilder addProducer(String producer) {
        this.producer = producer;
        return this;
    }

    @Override
    public DeckOfCardsBuilder addMaterial(String material) {
        this.material = material;
        return this;
    }

    @Override
    public DeckOfCardsBuilder addWeight(float weight) {
        this.weight = weight;
        return this;
    }

    @Override
    public DeckOfCardsBuilder addModel(String model) {
        this.model = model;
        return this;
    }

    @Override
    public DeckOfCards buildDeck() {
        return new DeckOfCards(price, discount, producer, material,
                weight, model);
    }

}
