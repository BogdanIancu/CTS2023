package ro.ase.acs.cts.prototype;

import java.util.ArrayList;
import java.util.List;

public class SolitairePlayingCard extends PlayingCard {
    private int x;
    private int y;

    private List<String> textures;

    public SolitairePlayingCard() {
        try {
            System.out.println("Loading textures...");
            Thread.sleep(3000);
            textures = new ArrayList<>();
            textures.add("T1");
            textures.add("T2");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public void render() {
        System.out.printf("The card %d%c was rendered at %d %d\n",
                rank, suit, x, y);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        SolitairePlayingCard copy =  (SolitairePlayingCard) super.clone();
        copy.x = x;
        copy.y = y;
        copy.textures = List.copyOf(textures);
        return copy;
    }
}
