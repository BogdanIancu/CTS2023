package ro.ase.acs.main;

import ro.ase.acs.classes.Car;
import ro.ase.acs.interfaces.Movable;

public class Main {

    public static void main(String[] args) {
        Car car = new Car();

        Movable movable = car;
        movable.move();
        movable.stop();

        System.out.println(Car.getMaxWeight());
    }
}
