package ro.ase.acs.cts.classes;

import ro.ase.acs.cts.exceptions.InvalidListException;
import ro.ase.acs.cts.interfaces.Calculator;

import java.util.List;

public class SumCalculator implements Calculator {

    /**
     * Method that computes the sum of the elements of a list
     * @param list the list of integers
     * @return the sum as a double
     * @throws InvalidListException
     */
    @Override
    public double compute(List<Integer> list) throws InvalidListException {
        //TODO replace with lambda expression
        double sum = 0;
        for (int i : list) {
            sum += i;
        }
        return sum;
    }
}
