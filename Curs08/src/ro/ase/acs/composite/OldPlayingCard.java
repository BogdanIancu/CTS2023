package ro.ase.acs.composite;

public class OldPlayingCard implements SoldableItem{
    @Override
    public double getPrice() {
        return 50;
    }

    @Override
    public void addNode(SoldableItem node) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void deleteNode(SoldableItem node) {
        throw new UnsupportedOperationException();
    }

    @Override
    public SoldableItem getNode(int id) {
        throw new UnsupportedOperationException();
    }
}
