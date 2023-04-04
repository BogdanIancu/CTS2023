package ro.acs.cts.main;

import ro.acs.cts.builder.FoodItem;
import ro.acs.cts.prototype.BuildingBlock;
import ro.acs.cts.prototype.PrototypeCollection;
import ro.acs.cts.prototype.WoodBlock;

public class Main {
    public static void main(String[] args) {
        BuildingBlock block1=new WoodBlock();
        block1.setX(1);
        block1.setY(2);
        block1.setZ(3);
        block1.render();

        try {
            BuildingBlock block2 = (BuildingBlock) block1.clone();
            block2.setX(5);
            block2.setY(10);
            block2.setZ(15);
            block2.render();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

        PrototypeCollection prototypeCollection =
                new PrototypeCollection();
        BuildingBlock block3 =
                prototypeCollection.getBlock("stone");
        BuildingBlock block4 =
                prototypeCollection.getBlock("wood");
        block3.render();
        block4.render();

        FoodItem.FoodItemBuilder builder =
                new FoodItem.FoodItemBuilder();
        builder.addName("unt");
        builder.addPrice(10);
        builder.addDiscount(5);

        FoodItem foodItem = builder.build();
        System.out.println(foodItem);
        builder.addPrice(12);
        System.out.println(foodItem);
    }
}