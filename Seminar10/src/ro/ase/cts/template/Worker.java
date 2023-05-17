package ro.ase.cts.template;

public class Worker extends PartMover{
    @Override
    public void liftPart() {
        System.out.println("The worker is lifting the part");
    }

    @Override
    public void transportPart() {
        System.out.println("The worker is transporting the part");
    }

    @Override
    public void dropPart() {
        System.out.println("The worker is dropping the part");
    }
}
