package ro.ase.cts.chain;

public class ChiefFinancialOfficer extends CallCenterHandler {

    @Override
    public void refund(float sum) {
        System.out.println("Approved by the CFO");
    }
}
