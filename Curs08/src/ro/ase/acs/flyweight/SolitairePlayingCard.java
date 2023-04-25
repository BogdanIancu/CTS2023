package ro.ase.acs.flyweight;

import java.util.Arrays;

public class SolitairePlayingCard implements AbstractSolitairePlayingCard{
    private String card;
    private byte[] image;

    public SolitairePlayingCard(String card, byte[] image) {
        this.card = card;
        this.image = Arrays.copyOf(image, image.length);
    }

    @Override
    public void display(int x, int y) {
        System.out.printf("Displaying card %s at %d %d", card, x, y);
        System.out.println();
    }
}
