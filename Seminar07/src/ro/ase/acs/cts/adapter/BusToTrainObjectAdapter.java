package ro.ase.acs.cts.adapter;

public class BusToTrainObjectAdapter implements AbstractTrainTicketingSystem {
    private AbstractBusTicketingSystem busTicketingSystem;

    public BusToTrainObjectAdapter(AbstractBusTicketingSystem busTicketingSystem) {
        this.busTicketingSystem = busTicketingSystem;
    }

    @Override
    public void buyTicket(int wagonNo, int seatNo) {
        busTicketingSystem.reserveSeat();
    }
}
