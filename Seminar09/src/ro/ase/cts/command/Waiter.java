package ro.ase.cts.command;

import java.util.ArrayList;
import java.util.List;

public class Waiter {
    private List<FoodOrder> orders = new ArrayList<>();

    public void takeOrder(FoodOrder order){
        orders.add(order);
    }

    public void sendOrdersToChef(){
        for (FoodOrder order : orders){
            order.prepare();
        }
        orders.clear();
    }
}
