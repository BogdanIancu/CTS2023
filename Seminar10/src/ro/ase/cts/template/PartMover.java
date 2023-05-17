package ro.ase.cts.template;

public abstract class PartMover {
    public abstract void liftPart();
    public abstract void transportPart();
    public abstract void dropPart();

    public final void movePart() {
        liftPart();
        transportPart();
        dropPart();
    }
}
