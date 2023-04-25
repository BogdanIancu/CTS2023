package ro.ase.acs.composite;

public interface SoldableItem {
    double getPrice();
    void addNode(SoldableItem node);
    void deleteNode(SoldableItem node);
    SoldableItem getNode(int id);
}
