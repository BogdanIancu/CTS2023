package ro.ase.acs.cts.builder;

import java.time.LocalDate;

public class FoodItemBuilder {
    private String name;
    private float price;
    private String producer;
    private LocalDate bestBefore;
    private float discount;
    private boolean isVegan;

    public FoodItemBuilder addName(String name){
        this.name=name;
        return this;
    }

    public FoodItemBuilder addPrice(float price){
        this.price=price;
        return this;
    }

    public FoodItemBuilder addProducer(String producer){
        this.producer=producer;
        return this;
    }

    public FoodItemBuilder addBestBefore(LocalDate bestBefore){
        this.bestBefore=bestBefore;
        return this;
    }

    public FoodItemBuilder addDiscount(float discount){
        this.discount=discount;
        return this;
    }

    public FoodItemBuilder addIsVegan(boolean isVegan){
        this.isVegan=isVegan;
        return this;
    }

    public FoodItem build(){
        return new FoodItem(name,price,producer,
                bestBefore,discount, isVegan);
    }
}
