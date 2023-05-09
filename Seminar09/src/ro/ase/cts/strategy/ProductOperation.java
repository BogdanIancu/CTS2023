package ro.ase.cts.strategy;

import java.util.List;

public class ProductOperation implements Operation{
    @Override
    public Double compute(List<Integer> values) {
        double product = 1;
        for (Integer v:values) {
            product *= v;
        }
        return product;
    }
}
