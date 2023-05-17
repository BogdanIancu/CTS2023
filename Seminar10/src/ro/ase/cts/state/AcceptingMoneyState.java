package ro.ase.cts.state;

public class AcceptingMoneyState implements VendingMachineState{
    @Override
    public void displayMessage() {
        System.out.println("Please input money!");
    }
}
