package ro.ase.acs.cts.composite;

public class EmailAddress implements EmailReceiver {
    private String address;

    public EmailAddress(String address) {
        this.address = address;
    }

    @Override
    public void receive(String text) {
        System.out.println(address + ": " + text);
    }

    @Override
    public void addReceiver(EmailReceiver receiver) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void deleteReceiver(EmailReceiver receiver) {
        throw new UnsupportedOperationException();
    }

    @Override
    public EmailReceiver getReceiver(int index) {
        throw new UnsupportedOperationException();
    }
}
