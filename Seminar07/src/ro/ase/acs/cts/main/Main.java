package ro.ase.acs.cts.main;

import ro.ase.acs.cts.adapter.*;
import ro.ase.acs.cts.builder.FoodItem;
import ro.ase.acs.cts.builder.FoodItemBuilder;
import ro.ase.acs.cts.facade.CarFacade;

public class Main {
    public static void main(String[] args) {

        FoodItemBuilder builder = new FoodItemBuilder();
        builder.addPrice(12);
        builder.addName("Pizza").addProducer("Kaufland");

        FoodItem item = builder.build();
        System.out.println(item);

        builder.addPrice(15);
        System.out.println(item);


        CarFacade carFacade = new CarFacade();
        carFacade.start();
        carFacade.emergencyBrake();


        AbstractTrainTicketingSystem trainTicketingSystem =
                new TrainTicketingSystem();
        trainTicketingSystem.buyTicket(3, 6);

        AbstractBusTicketingSystem busTicketingSystem =
                new BusTicketingSystem();
        busTicketingSystem.reserveSeat();

        trainTicketingSystem =
                new BusToTrainObjectAdapter(busTicketingSystem);
        trainTicketingSystem.buyTicket(5, 20);

        trainTicketingSystem = new BusToTrainClassAdapter();
        trainTicketingSystem.buyTicket(100, 200);
    }


}