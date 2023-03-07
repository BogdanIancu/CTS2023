package ro.ase.acs.cts.classes;

import ro.ase.acs.cts.exceptions.InvalidListException;
import ro.ase.acs.cts.interfaces.Calculator;

import java.security.InvalidParameterException;
import java.util.List;

public class ProductCalculator implements Calculator {
    @Override
    public double compute(List<Integer> list) throws InvalidListException {
        if(list == null || list.size() == 0){
            throw new InvalidListException();
        }
        double product = 1;

        for(int i : list){
            product *= i;
        }
        return product;
    }
}
