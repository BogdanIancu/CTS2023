package ro.ase.acs.cts.main;

import ro.ase.acs.cts.classes.*;
import ro.ase.acs.cts.exceptions.InvalidListException;
import ro.ase.acs.cts.interfaces.Calculator;
import ro.ase.acs.cts.interfaces.ValueReader;
import ro.ase.acs.cts.interfaces.ValueWriter;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ValueReader valueReader = new ConsoleReader();
        List<Integer> list = valueReader.readNumbers();

        Calculator calculator = new ProductCalculator();
        double result = 0;
        try {
            result = calculator.compute(list);
        } catch (InvalidListException e) {
            throw new RuntimeException(e);
        }

        ValueWriter valueWriter = new ConsoleWriter();
        valueWriter.displayValue(result);
    }
}