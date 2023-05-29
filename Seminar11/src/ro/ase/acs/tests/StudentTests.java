package ro.ase.acs.tests;

import org.junit.Test;
import ro.ase.acs.classes.Student;
import static org.junit.Assert.*;

public class StudentTests {
    @Test
    public void defaultConstructorTest() {
        Student student;

        student = new Student();

        assertNull("The grades array is not null" +
                "when using a default constructor.",
                student.getGrades());
    }
    @Test
    public void testComputeAverageConformance() {
        Student student = new Student();
        int[] grades = new int[] {9,9,10};
        student.setGrades(grades);

        double result = student.computeAverage();

        assertEquals("The average is not conform!",
                9.33, result, 0.009);
    }

    @Test
    public void testComputeAverageOrdering() {
        Student student = new Student();
        int[] grades = new int[] {10, 9, 9};
        student.setGrades(grades);

        double result1 = student.computeAverage();
        student.setGrades(new int[] {9, 10, 9});
        double result2 = student.computeAverage();

        assertEquals("The order influences the average!",
                result1, result2, 0.009);
    }

    @Test
    public void testComputeAverageRangeMin() {
        Student student = new Student();
        int[] grades = new int[] {0, 1, 1};
        student.setGrades(grades);

        double result = student.computeAverage();

        assertEquals("The minimum average is not 1",
                1, result, 0.009);
    }

    @Test
    public void testComputeAverageRangeMax() {
        Student student = new Student();
        int[] grades = new int[] {10, 10, 10, 11};
        student.setGrades(grades);

        double result = student.computeAverage();

        assertEquals("The maximum average is not 10",
                10, result, 0.009);
    }

    @Test
    public void testComputeAverageExistence() {
        Student student = new Student();

        double result = student.computeAverage();

        assertEquals("The average is not 1 for lack of grades",
                1, result, 0.009);
    }

    @Test
    public void testComputeAverageCardinality0() {
        Student student = new Student();
        student.setGrades(new int[0]);

        double result = student.computeAverage();

        assertEquals("The average is not 1 for an empty array",
                1, result, 0.009);
    }

    @Test
    public void testComputeAverageCardinality1() {
        Student student = new Student();
        student.setGrades(new int[] {5});

        double result = student.computeAverage();

        assertEquals("The average is not 5 for a single grade",
                5, result, 0.009);
    }

    @Test
    public void testComputeAverageCardinalityN() {
        Student student = new Student();
        int[] grades = new int[100];
        for (int i = 0; i < 50; i++) {
            grades[i] = 7;
        }
        for (int i = 50; i < 100; i++) {
            grades[i] = 10;
        }
        student.setGrades(grades);

        double result = student.computeAverage();

        assertEquals("The average is not 8.50 for a large array",
                8.50, result, 0.009);
    }

    @Test(timeout = 1)
    public void testComputeAverageTimeout() {
        Student student = new Student();
        int[] grades = new int[1000];
        for (int i = 0; i < 500; i++) {
            grades[i] = 7;
        }
        for (int i = 500; i < 1000; i++) {
            grades[i] = 10;
        }
        student.setGrades(grades);

        student.computeAverage();
    }
}
