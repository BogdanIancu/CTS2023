package ro.ase.acs.proxy;

public class PlayingCard implements AbstractPlayingCard{
    //...

    @Override
    public void playCard(String card) {
        System.out.println(card + " has been played");
    }
}
