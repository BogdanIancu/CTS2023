package ro.ase.acs.cts.composite;

import java.util.ArrayList;
import java.util.List;

public class EmailGroup implements EmailReceiver {
    private List<EmailReceiver> receivers = new ArrayList<>();
    private String address;

    public EmailGroup(String address) {
        this.address = address;
    }

    @Override
    public void receive(String text) {
        for (EmailReceiver r : receivers) {
            r.receive(text);
        }
    }

    @Override
    public void addReceiver(EmailReceiver receiver) {
        receivers.add(receiver);
    }

    @Override
    public void deleteReceiver(EmailReceiver receiver) {
        receivers.remove(receiver);
    }

    @Override
    public EmailReceiver getReceiver(int index) {
        return receivers.get(index);
    }
}
