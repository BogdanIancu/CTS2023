package ro.ase.cts.chain;

public class CallCenterOperator extends CallCenterHandler {
    public static final int OPERATOR_THRESHOLD = 1000;

    @Override
    public void refund(float sum) {
        if (sum < OPERATOR_THRESHOLD) {
            System.out.println("Refund approved by the operator");
        } else {
            if (nextHandler != null) {
                nextHandler.refund(sum);
            }
        }
    }
}
