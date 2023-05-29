package ro.ase.acs.tests;

import org.junit.*;
import org.junit.experimental.categories.Category;
import ro.ase.acs.classes.Operation;
import ro.ase.acs.classes.exceptions.NullInputException;
import ro.ase.acs.tests.categories.SmokeTestCategory;

import static org.junit.Assert.*;

public class OperationCorrectTests {
    private static Operation operation;
    private double result;

    @Before
    public void initialize() {
        result = 0;
    }

    @After
    public void releaseResult() {
        result = 0;
    }

    @BeforeClass
    public static void initializeOperation() {
        operation = new Operation();
    }

    @AfterClass
    public static void releaseOperation() {
        operation = null;
    }

    @Test
    @Category(SmokeTestCategory.class)
    public void testOperationConformance() {
        try {
            result = operation.sum(1.5, 2.333, 4.67);
        } catch (NullInputException e) {
            fail(e.getMessage());
        }
        assertEquals("The sum is not conform", 8.503,
                result, 0.0009);
    }

    @Test
    public void testOperationOrdering() {
        double result2 = 0;
        try {
            result = operation.sum(1.5, 2.333, 4.67);
            result2 = operation.sum(4.67, 2.333, 1.5);
        } catch (NullInputException e) {
            fail(e.getMessage());
        }
        assertEquals("The order influences the sum",
                result, result2, 0.0009);
    }

    @Test
    public void testOperationRangeMin() {
        try {
            result = operation.sum(Double.MIN_VALUE, -1);
        } catch (NullInputException e) {
            fail(e.getMessage());
        }
        assertEquals("The sum is lower than min double",
                Double.MIN_VALUE, result, 0.0009);
    }

    @Test
    public void testOperationRangeMax() {
        try {
            result = operation.sum(Double.MAX_VALUE, 5);
        } catch (NullInputException e) {
            fail(e.getMessage());
        }
        assertEquals("The sum greater than max double",
                Double.MAX_VALUE, result, 0.0009);
    }

    @Test(expected = NullInputException.class)
    public void testOperationReference() throws NullInputException {
        result = operation.sum(null);
    }

    @Test
    public void testOperationExistence() {
        try {
            result = operation.sum();
        } catch (NullInputException e) {
            fail(e.getMessage());
        }
        assertEquals("An empty parameter list does not return 0",
                0, result, 0.0009);
    }

    @Test
    public void testOperationCardinality1() {
        try {
            result = operation.sum(4.567);
        } catch (NullInputException e) {
            fail(e.getMessage());
        }
        assertEquals("Just 1 parameter should return itself",
                4.567, result, 0.0009);
    }

    @Test
    public void testOperationCardinalityN() {
        double[] input = new double[1000];
        for(int i = 0; i < input.length; i++) {
            input[i] = i + 1;
        }
        try {
            result = operation.sum(input);
        } catch (NullInputException e) {
            fail(e.getMessage());
        }
        assertEquals("Just 1 parameter should return itself",
                (1000.0 * 1001)/2, result, 0.0009);
    }

    @Test(timeout = 50)
    public void testOperationTime() {
        double[] input = new double[1000];
        for(int i = 0; i < input.length; i++) {
            input[i] = i + 1;
        }
        try {
            result = operation.sum(input);
        } catch (NullInputException e) {
            fail(e.getMessage());
        }
    }

}
