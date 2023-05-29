package ro.ase.acs.tests;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import ro.ase.acs.tests.categories.SmokeTestCategory;

@RunWith(Categories.class)
@Suite.SuiteClasses({OperationCorrectTests.class, OperationRightBicepTests.class})
@Categories.IncludeCategory(SmokeTestCategory.class)
public class SmokeTests {
}
