package ro.ase.acs.composite;

import java.util.ArrayList;
import java.util.List;

public class OldPlayingCardDeck implements SoldableItem{
    private List<SoldableItem> nodes = new ArrayList<>();

    @Override
    public double getPrice() {
        double price = 0;
        for(SoldableItem node : nodes) {
            price += node.getPrice();
        }
        return price;

        //return nodes.stream().mapToDouble(s -> s.getPrice()).sum();
    }

    @Override
    public void addNode(SoldableItem node) {
        nodes.add(node);
    }

    @Override
    public void deleteNode(SoldableItem node) {
        nodes.remove(node);
    }

    @Override
    public SoldableItem getNode(int id) {
        if(id >=0 && id < nodes.size()) {
            return nodes.get(id);
        }
        throw new RuntimeException("Invalid id");
    }
}
