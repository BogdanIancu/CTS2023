package ro.ase.acs.cts.classes;

import ro.ase.acs.cts.interfaces.ValueWriter;

public class ConsoleWriter implements ValueWriter {
    @Override
    public void displayValue(double value) {
        System.out.println("result = " + value);
    }
}
