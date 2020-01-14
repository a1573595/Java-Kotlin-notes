package com.java;

import com.java.student.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudentTest {
    @Test
    public void getHighestTest() {
        Student student = new Student("", "Peter", 89, 72);
        Assertions.assertEquals(89, student.getHighest());
    }

    @Test
    public void getAverageTest() {
        Student student = new Student("", "Peter", 89, 72);
        Assertions.assertEquals((89 + 72) / 2, student.getAverage());
    }
}
