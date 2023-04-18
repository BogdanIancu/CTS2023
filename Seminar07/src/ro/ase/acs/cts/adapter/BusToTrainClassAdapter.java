package ro.ase.acs.cts.adapter;

public class BusToTrainClassAdapter extends BusTicketingSystem implements AbstractTrainTicketingSystem {
    @Override
    public void buyTicket(int wagonNo, int seatNo) {
        super.reserveSeat();
    }
}
