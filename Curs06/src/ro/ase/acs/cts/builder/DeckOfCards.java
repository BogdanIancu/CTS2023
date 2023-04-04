package ro.ase.acs.cts.builder;

public class DeckOfCards {
    private float price;
    private float discount;
    private String producer;
    private String material;
    private float weight;
    private String model;

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
}
