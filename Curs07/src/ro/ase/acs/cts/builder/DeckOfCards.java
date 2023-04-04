package ro.ase.acs.cts.builder;

public class DeckOfCards {
    private float price;
    private float discount;
    private String producer;
    private String material;
    private float weight;
    private String model;

    private DeckOfCards() {

    }

    DeckOfCards(float price, float discount, String producer, String material, float weight, String model) {
        this.price = price;
        this.discount = discount;
        this.producer = producer;
        this.material = material;
        this.weight = weight;
        this.model = model;
    }

    @Override
    public String toString() {
        return "DeckOfCards{" +
                "price=" + price +
                ", discount=" + discount +
                ", producer='" + producer + '\'' +
                ", material='" + material + '\'' +
                ", weight=" + weight +
                ", model='" + model + '\'' +
                '}';
    }

    public static class Builder implements DeckOfCardsAbstractBuilder{
        private DeckOfCards deckOfCards = new DeckOfCards();

        public Builder addPrice(float price) {
            deckOfCards.price = price;
            return this;
        }

        public Builder addDiscount(float discount) {
            deckOfCards.discount = discount;
            return this;
        }

        public Builder addProducer(String producer) {
            deckOfCards.producer = producer;
            return this;
        }

        public Builder addMaterial(String material) {
            deckOfCards.material = material;
            return this;
        }

        public Builder addWeight(float weight) {
            deckOfCards.weight = weight;
            return this;
        }

        public Builder addModel(String model) {
            deckOfCards.model = model;
            return this;
        }

        public DeckOfCards buildDeck() {
            DeckOfCards copy = new DeckOfCards();
            copy.discount = deckOfCards.discount;
            copy.material = deckOfCards.material;
            copy.model = deckOfCards.model;
            copy.price = deckOfCards.price;
            copy.weight = deckOfCards.weight;
            copy.producer = deckOfCards.producer;
            deckOfCards = new DeckOfCards();
            return copy;
        }
    }
}
