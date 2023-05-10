package ro.ase.acs.observer;

public class PlayingCard extends Observable {
    private String card;
    //...

    public PlayingCard(String card) {
        this.card = card;
    }

    public void play() {
        //...
        if(card != null && card.charAt(1) == 'H') {
            sendNotificationToAll();
        }
    }
}
