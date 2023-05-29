package ro.ase.acs.classes;

import ro.ase.acs.classes.exceptions.NullInputException;

public class Operation {
    public double sum(double... values) throws NullInputException {
        if(values == null) {
            throw new NullInputException();
        }
        double sum = 0;

        for(double d : values) {
            if(sum + d < Double.MIN_VALUE) {
                return Double.MIN_VALUE;
            }
            sum += d;
        }
        return sum;
    }
}
