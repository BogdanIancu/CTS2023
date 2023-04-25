package ro.ase.acs.flyweight;

import java.util.HashMap;
import java.util.Map;

public class SolitaireCardFactory {
    private Map<String, AbstractSolitairePlayingCard> cards = new HashMap<>();

    public AbstractSolitairePlayingCard getCard(String card) {
        if(cards.containsKey(card)) {
            return cards.get(card);
        } else {
            AbstractSolitairePlayingCard newCard =
                    new SolitairePlayingCard(card, new byte[] {1, 2, 3});
            cards.put(card, newCard);
            return newCard;
        }
    }
}
