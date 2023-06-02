package ro.ase.acs.tests;

import org.junit.jupiter.api.*;
import ro.ase.acs.classes.Student;
import ro.ase.acs.exceptions.NullGradesException;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.TimeUnit;


public class StudentTests {
    private Student student;

    @BeforeEach
    public void initializeStudent() {
        student = new Student();
    }

    @Test
    public void testAverageRight() throws NullGradesException {
        int[] grades = {8, 6, 5};
        student.setGrades(grades);
        double result = student.computeAverage();
        Assertions.assertEquals(6.33, result,
                0.009, "The average is not right");
    }

    @Test
    @Tag("important")
    public void testAverageLeftBoundary() throws NullGradesException {
        int[] grades = {1, 1, 1};
        student.setGrades(grades);
        double result = student.computeAverage();
        Assertions.assertEquals(1, result, 0.009,
                "The minimum average is not 1");
    }

    @Test
    public void testAverageRightBoundary() throws NullGradesException {
        int[] grades = {10, 10, 10};
        student.setGrades(grades);
        double result = student.computeAverage();
        Assertions.assertEquals(10, result, 0.009,
                "The maximum average is not 10");
    }

    @Test
    @Tag("important")
    public void testAverageBelowLeftBoundary() throws NullGradesException {
        int[] grades = new int[100];
        for(int i = 0; i < 99; i++){
            grades[i] = 1;
        }
        grades[99]=0;
        student.setGrades(grades);
        double result = student.computeAverage();
        Assertions.assertEquals(1, result, 0.009,
                "The minimum average is not 1");
    }

    @Test
    @Tag("important")
    public void testAverageInverseRelationship() throws NullGradesException {
        int[] grades = {8, 6, 5};
        student.setGrades(grades);

        double average = student.computeAverage();
        double sum = Arrays.stream(grades).sum();
        Assertions.assertEquals(sum, average*grades.length,
                0.01, "The inverse relationship is not" +
                        "met");
    }

    @Test
    @Tag("important")
    public void testAverageCrosscheck() {
        int[] grades = {8, 6, 5};
        student.setGrades(grades);

        double average = 0;
        try {
            average = student.computeAverage();
        } catch (NullGradesException e) {
            Assertions.fail(e.getMessage());
        }
        double expected = Arrays.stream(grades).average().getAsDouble();
        Assertions.assertEquals(expected, average, 0.009, "" +
                "The crosscheck is not met");
    }

    @Test
    public void testAverageErrorCondition()  {
        student.setGrades(null);

        Assertions.assertThrows(NullGradesException.class,
                ()->student.computeAverage(),
                "The method does not throw the exception");
    }

    @Test
    @Timeout(value=10, unit = TimeUnit.MILLISECONDS)
    public void testPerformance() throws NullGradesException {
        int [] grades = new int[1000];
        Random random = new Random();
        for(int i=0; i<1000;i++){
            grades[i] = random.nextInt(10)+1;
        }
        student.setGrades(grades);
        student.computeAverage();
    }
}
