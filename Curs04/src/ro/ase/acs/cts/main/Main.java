package ro.ase.acs.cts.main;

import ro.ase.acs.cts.singleton.ColouredJokerCard;
import ro.ase.acs.cts.singleton.ColouredJokerCardV2;

public class Main {
    public static void main(String[] args) {
        ColouredJokerCard jokerCard = ColouredJokerCard.getInstance();
        jokerCard.useCard();
        //...
        ColouredJokerCard.getInstance().useCard();
        //...

        ColouredJokerCardV2.INSTANCE.useCard();
    }
}
