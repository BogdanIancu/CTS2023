package ro.ase.cts.strategy;

import java.util.Arrays;
import java.util.List;

public class Calculator {
    private Operation operation;

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public Double calculate(Integer... values) throws StrategyNotSetException {
        if (operation != null) {
            return operation.compute(Arrays.asList(values));
        }
        else {
            throw new StrategyNotSetException();
        }
    }
}
