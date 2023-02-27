package ro.ase.acs.interfaces;

public interface Movable {
    void move();

    default void stop() {
        System.out.println("The entity has stopped!");
    }
}
