package ro.ase.acs.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SumTests {
    @Test
    public void testSum(){
        int result = 2 + 2;
        Assertions.assertEquals(4,result,"The sum is not correct.");
    }
}
