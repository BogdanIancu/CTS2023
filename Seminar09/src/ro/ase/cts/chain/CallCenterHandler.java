package ro.ase.cts.chain;

public abstract class CallCenterHandler {
    protected CallCenterHandler nextHandler;
    public void setNextHandler(CallCenterHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
    public abstract void refund(float sum);
}
