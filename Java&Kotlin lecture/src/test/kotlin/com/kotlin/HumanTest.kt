package com.kotlin

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class HumanTest {
    @Test
    fun bmiTest() {
        val human = Human(height = 1.75f, weight = 68f)
        Assertions.assertEquals(68 / 1.75f / 1.75f,  human.getBMI())
    }
}