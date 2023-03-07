package ro.ase.acs.cts.interfaces;

import ro.ase.acs.cts.exceptions.InvalidListException;

import java.util.List;

public interface Calculator {
    double compute(List<Integer> values) throws InvalidListException;

}
