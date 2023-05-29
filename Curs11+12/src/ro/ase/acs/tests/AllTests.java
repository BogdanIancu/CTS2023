package ro.ase.acs.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({OperationCorrectTests.class,
OperationRightBicepTests.class, OperationTests.class})
public class AllTests {
}
