package ro.ase.acs.tests;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import ro.ase.acs.classes.Operation;
import ro.ase.acs.classes.exceptions.NullInputException;

import static org.junit.Assert.*;

public class OperationTests {
    private Operation operation;

    @Before
    public void prepare() {
        operation = new Operation();
    }

    @Test
    public void testSum() {
        //Arrange
        double[] input = new double[] {1.5, 2.5, 3};

        //Act
        double result = 0;
        try {
            result = operation.sum(input);
        } catch (NullInputException e) {
            fail(e.getMessage());
        }

        //Assert
        assertEquals("The sum doesn't work", 7, result, 0.01);
    }

    @Test
    public void testSumForEmptyInput() {
        double result = 0;
        try {
            result = operation.sum();
        } catch (NullInputException e) {
            fail(e.getMessage());
        }

        assertEquals("The sum doesn't return 0 for an empty input",
                0, result, 0.01);
    }

    @Ignore
    @Test
    public void failingTest() {
        fail("To be implemented");
    }
}
