package ro.ase.acs.cts.adapter;

public class TrainTicketingSystem implements AbstractTrainTicketingSystem {
    private int numberOfWagons = 7;
    private int numberOfSeats = 100;

    @Override
    public void buyTicket(int wagonNo, int seatNo) {
        boolean isValidWagon = wagonNo>=1 && wagonNo<=numberOfWagons;
        boolean isValidSeat = seatNo>=1 && seatNo<=numberOfSeats;
        if(isValidSeat && isValidWagon){
            System.out.println("Ticket issued for wagon " +
                    wagonNo  + " and seat " + seatNo);
        }
    }
}
