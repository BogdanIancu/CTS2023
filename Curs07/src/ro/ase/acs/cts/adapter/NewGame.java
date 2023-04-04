package ro.ase.acs.cts.adapter;

import java.util.List;
import java.util.Random;

public class NewGame implements AbstractNewGame{
    private Random random = new Random();
    @Override
    public void generateCard() {
        int rank = random.nextInt(13) + 2;
        String suit = List.of("H", "D", "C", "S").get(random.nextInt(4));
        System.out.println(rank + suit);
    }
}
