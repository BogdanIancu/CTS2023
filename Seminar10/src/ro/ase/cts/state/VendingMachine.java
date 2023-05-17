package ro.ase.cts.state;

public class VendingMachine {
    private double moneyInserted;
    private VendingMachineState machineState;

    public VendingMachine() {
        machineState = new AcceptingMoneyState();
        machineState.displayMessage();
    }

    public void setMachineState(VendingMachineState machineState) {
        this.machineState = machineState;
    }

    public void inputMoney(double sum){
        moneyInserted += sum;
        setMachineState(new SelectingProductState());
        machineState.displayMessage();
    }

    public void selectProduct(double price){
        if(price <= moneyInserted){
            setMachineState(new DeliveringProductState());
            machineState.displayMessage();
        }
        if(moneyInserted - price > 0){
            setMachineState(new ReturningChangeState());
            machineState.displayMessage();
            moneyInserted = 0;
        }
        setMachineState(new AcceptingMoneyState());
        machineState.displayMessage();
    }
}
