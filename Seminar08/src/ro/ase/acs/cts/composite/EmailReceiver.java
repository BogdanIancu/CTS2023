package ro.ase.acs.cts.composite;

public interface EmailReceiver {
    void receive(String text);
    void addReceiver(EmailReceiver receiver);
    void deleteReceiver(EmailReceiver receiver);
    EmailReceiver getReceiver(int index);
}
