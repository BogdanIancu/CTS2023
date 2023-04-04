package ro.acs.cts.builder;

import java.time.LocalDate;

public class FoodItem implements Cloneable {
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

    @Override
    public Object clone() throws CloneNotSupportedException {
        FoodItem copy = (FoodItem)super.clone();
        copy.name = name;
        copy.price = price;
        copy.producer = producer;
        copy.bestBefore = bestBefore;
        copy.discount = discount;
        copy.isVegan = isVegan;
        return copy;
    }

    public static class FoodItemBuilder{
        private FoodItem foodItem = new FoodItem();

        public FoodItemBuilder addName(String name){
            foodItem.name = name;
            return this;
        }

        public FoodItemBuilder addPrice (float price){
            foodItem.price = price;
            return this;
        }

        public FoodItemBuilder addProducer(String producer){
            foodItem.producer = producer;
            return this;
        }

        public FoodItemBuilder addDiscount (float discount){
            foodItem.discount = discount;
            return this;
        }

        public FoodItemBuilder addBestBefore (LocalDate bestBefore){
            foodItem.bestBefore = bestBefore;
            return this;
        }

        public FoodItemBuilder addIsVegan (boolean isVegan){
            foodItem.isVegan = isVegan;
            return this;
        }

        public FoodItem build(){
            try {
                FoodItem copy = (FoodItem) foodItem.clone();
                foodItem = new FoodItem();
                return copy;
            } catch (CloneNotSupportedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
