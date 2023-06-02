package ro.ase.acs.tests;

import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses(StudentTests.class)
@IncludeTags("important")
public class ImportantTests {
}
