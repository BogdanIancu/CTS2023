package ro.ase.cts.template;

public class RoboticArm extends PartMover{
    @Override
    public void liftPart() {
        System.out.println("The robotic arm is lifting the part");
    }

    @Override
    public void transportPart() {
        System.out.println("The robotic arm is transporting the part");
    }

    @Override
    public void dropPart() {
        System.out.println("The robotic arm is dropping the part");
    }
}
