package ro.ase.acs.classes;

import ro.ase.acs.exceptions.NullGradesException;

import java.util.Arrays;

public class Student {
    public static final int MIN_AVERAGE = 1;
    public static final int MAX_AVERAGE = 10;
    private String name;
    private int age;
    private int[] grades;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int[] getGrades() {
        if (grades != null) {
            return grades.clone();
        }
        return null;
    }

    public void setGrades(int[] grades) {
        if (grades != null) {
            this.grades = Arrays.copyOf(grades, grades.length);
        } else {
            this.grades = null;
        }
    }

    public double computeAverage() throws NullGradesException {
        if (grades == null) {
            throw new NullGradesException();
        }
        if (grades.length == 0) {
            return MIN_AVERAGE;
        }

        double sum = 0;
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }
        double average = sum / grades.length;
        if (average < MIN_AVERAGE) {
            return MIN_AVERAGE;
        }
        if (average > MAX_AVERAGE) {
            return MAX_AVERAGE;
        }
        return average;
    }
}