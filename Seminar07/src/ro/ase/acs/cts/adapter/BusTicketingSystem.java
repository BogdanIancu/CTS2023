package ro.ase.acs.cts.adapter;

public class BusTicketingSystem implements AbstractBusTicketingSystem {
    private int numberOfSeats = 50;
    private int numberOfReservedSeats = 0;
    @Override
    public void reserveSeat() {
        if(numberOfReservedSeats<numberOfSeats){
            numberOfReservedSeats++;
            System.out.println("Seat reserved!");
        }
    }
}
