package ro.ase.cts.chain;

public class CallCenterManager extends CallCenterHandler {
    public static final int MANAGER_THRESHOLD = 5000;

    @Override
    public void refund(float sum) {
        if (sum < MANAGER_THRESHOLD) {
            System.out.println("Refund approved by the manager");
        } else {
            if (nextHandler != null) {
                nextHandler.refund(sum);
            }
        }
    }
}
