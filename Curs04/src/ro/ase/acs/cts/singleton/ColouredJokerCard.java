package ro.ase.acs.cts.singleton;

public class ColouredJokerCard {
    private static ColouredJokerCard instance;

    private ColouredJokerCard() {
    }

    public static synchronized ColouredJokerCard getInstance() {
        if(instance == null) {
            instance = new ColouredJokerCard();
        }
        return instance;
    }

    public void useCard() {
        System.out.println("The Joker has been used!");
    }
}
