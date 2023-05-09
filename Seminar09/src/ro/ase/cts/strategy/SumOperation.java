package ro.ase.cts.strategy;

import java.util.List;

public class SumOperation implements Operation{
    @Override
    public Double compute(List<Integer> values) {
        double sum = 0;
        for (Integer v:values) {
            sum += v;
        }
        return sum;
    }
}
