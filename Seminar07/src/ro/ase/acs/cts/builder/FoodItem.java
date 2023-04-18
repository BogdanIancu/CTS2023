package ro.ase.acs.cts.builder;

import java.time.LocalDate;

public class FoodItem {
    private String name;
    private float price;
    private String producer;
    private LocalDate bestBefore;
    private float discount;
    private boolean isVegan;

    private FoodItem() {
    }

    FoodItem(String name, float price, String producer, LocalDate bestBefore, float discount, boolean isVegan) {
        this.name = name;
        this.price = price;
        this.producer = producer;
        this.bestBefore = bestBefore;
        this.discount = discount;
        this.isVegan = isVegan;
    }

    @Override
    public String toString() {
        return "FoodItem{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", producer='" + producer + '\'' +
                ", bestBefore=" + bestBefore +
                ", discount=" + discount +
                ", isVegan=" + isVegan +
                '}';
    }

}
