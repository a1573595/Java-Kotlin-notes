package com.kotlin

import com.kotlin.student.Student
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class StudentTest {
    @Test
    fun getHighestTest() {
        val student = Student("", "Peter", 89, 72)
        Assertions.assertEquals(89, student.getHighest())
    }

    @Test
    fun getAverageTest() {
        val student = Student("", "Peter", 89, 72)
        Assertions.assertEquals((89 + 72) / 2, student.getAverage())
    }
}