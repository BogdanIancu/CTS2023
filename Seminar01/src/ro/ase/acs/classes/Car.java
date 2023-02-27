package ro.ase.acs.classes;

import ro.ase.acs.interfaces.Movable;

public class Car implements Movable {
    private static final int MAX_WEIGHT_CAR_KG_RO;
    private String producer;
    private float price;
    private Engine engine;

    static {
        MAX_WEIGHT_CAR_KG_RO = 3500;
    }

    @Override
    public void move() {
        System.out.println("The car is moving!");
    }

    @Override
    public void stop() {
        //Movable.super.stop();
        System.out.println("The car has stopped!");
    }

    public static int getMaxWeight() {
        return MAX_WEIGHT_CAR_KG_RO;
    }
}
