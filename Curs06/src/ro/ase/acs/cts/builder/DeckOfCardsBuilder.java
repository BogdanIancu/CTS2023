package ro.ase.acs.cts.builder;

public class DeckOfCardsBuilder {
    private float price;
    private float discount;
    private String producer;
    private String material;
    private float weight;
    private String model;

    public DeckOfCardsBuilder addPrice(float price) {
        this.price = price;
        return this;
    }

    public DeckOfCardsBuilder addDiscount(float discount) {
        this.discount = discount;
        return this;
    }

    public DeckOfCardsBuilder addProducer(String producer) {
        this.producer = producer;
        return this;
    }

    public DeckOfCardsBuilder addMaterial(String material) {
        this.material = material;
        return this;
    }

    public DeckOfCardsBuilder addWeight(float weight) {
        this.weight = weight;
        return this;
    }

    public DeckOfCardsBuilder addModel(String model) {
        this.model = model;
        return this;
    }

    public DeckOfCards buildDeck() {
        return new DeckOfCards(price, discount, producer, material,
                weight, model);
    }

}
