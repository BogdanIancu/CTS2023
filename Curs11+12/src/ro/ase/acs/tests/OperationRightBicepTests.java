package ro.ase.acs.tests;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import ro.ase.acs.classes.Operation;
import ro.ase.acs.classes.exceptions.NullInputException;
import ro.ase.acs.tests.categories.SmokeTestCategory;

import java.util.Arrays;

import static org.junit.Assert.*;

public class OperationRightBicepTests {
    private static Operation operation = new Operation();

    @Test
    public void testOperationRight() {
        double result = 0;
        try {
            result = operation.sum(1.5, 2.333, 4.67);
        } catch (NullInputException e) {
            fail(e.getMessage());
        }
        assertEquals("The sum is not conform", 8.503,
                result, 0.0009);
    }

    @Test
    public void testOperationBoundaryMin() {
        double result = 0;
        try {
            result = operation.sum(Double.MIN_VALUE);
        } catch (NullInputException e) {
            fail(e.getMessage());
        }
        assertEquals("The min boundary is not met",
                Double.MIN_VALUE, result, 0.009);
    }

    @Test
    public void testOperationBoundaryMax() {
        double result = 0;
        try {
            result = operation.sum(Double.MAX_VALUE);
        } catch (NullInputException e) {
            fail(e.getMessage());
        }
        assertEquals("The max boundary is not met",
                Double.MAX_VALUE, result, 0.009);
    }

    @Test
    @Category(SmokeTestCategory.class)
    public void testOperationInverse() {
        double result = 0;
        try {
            result = operation.sum(1.5, 2.333, 4.67);
        } catch (NullInputException e) {
            fail(e.getMessage());
        }
        result -= 1.5;
        result -= 2.333;
        result -= 4.67;
        assertEquals("The inverse relationship did not pass",
                0, result, 0.0009);
    }

    @Test
    public void testOperationCrossCheck() {
        double[] input = new double[] {1.5, 2.333, 4.67};
        double result = 0;
        try {
            result = operation.sum(input);
        } catch (NullInputException e) {
            fail(e.getMessage());
        }
        double result2 = Arrays.stream(input).sum();
        assertEquals("The sum is not conform", result2,
                result, 0.0009);
    }

    @Test
    public void testOperationError() {
        assertThrows("A null input doesn't throw an exception",
                NullInputException.class,
                ()-> operation.sum(null));
    }

    @Test(timeout = 100)
    public void testOperationPerformance() {
        double[] input = new double[1_000_000];
        for(int i = 0; i < input.length; i++) {
            input[i] = i + 1;
        }
        try {
            operation.sum(input);
        } catch (NullInputException e) {
            fail(e.getMessage());
        }
    }

}
