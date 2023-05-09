package ro.ase.acs.command;

public class OnlinePlayer {
    void drawCard() {
        new Thread(() -> {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("New card has been drawn");
        }).start();
    }

    void playCard() {
        new Thread(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Card has been played");
        }).start();
    }
}