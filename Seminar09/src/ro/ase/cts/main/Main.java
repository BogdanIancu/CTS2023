package ro.ase.cts.main;

import ro.ase.cts.chain.CallCenterManager;
import ro.ase.cts.chain.CallCenterOperator;
import ro.ase.cts.chain.ChiefFinancialOfficer;
import ro.ase.cts.command.BurgerOrder;
import ro.ase.cts.command.Chef;
import ro.ase.cts.command.PizzaOrder;
import ro.ase.cts.command.Waiter;
import ro.ase.cts.decorator.Car;
import ro.ase.cts.decorator.CarWithAlarm;
import ro.ase.cts.decorator.CarWithSportSeats;
import ro.ase.cts.decorator.Vehicle;
import ro.ase.cts.strategy.Calculator;
import ro.ase.cts.strategy.StrategyNotSetException;
import ro.ase.cts.strategy.SumOperation;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.start();
        car.stop();

        CarWithAlarm carWithAlarm = new CarWithAlarm(car);
        carWithAlarm.activateAlarm();

        CarWithSportSeats carWithSportSeats =
                new CarWithSportSeats(car);
        carWithSportSeats.setSeatProducer("Recaro");

        CallCenterOperator operator = new CallCenterOperator();
        CallCenterManager manager = new CallCenterManager();
        ChiefFinancialOfficer cfo = new ChiefFinancialOfficer();

        operator.setNextHandler(manager);
        manager.setNextHandler(cfo);
        operator.refund(700);
        operator.refund(2000);
        operator.refund(6000);


        Waiter waiter = new Waiter();
        Chef chef = new Chef();
        waiter.takeOrder(new PizzaOrder(chef));
        waiter.takeOrder(new PizzaOrder(chef));
        waiter.takeOrder(new BurgerOrder(chef));
        waiter.sendOrdersToChef();

        Calculator calculator = new Calculator();
        calculator.setOperation(new SumOperation());
        try {
            Double result =calculator.calculate(4, 6, 8);
            System.out.println(result);
        } catch (StrategyNotSetException e) {
            throw new RuntimeException(e);
        }
    }
}