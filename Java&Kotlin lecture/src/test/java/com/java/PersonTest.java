package com.java;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonTest {

    @Test
    public void bmiTest() {
        Person person = new Person("Jack", 1.75f, 68);
        Assertions.assertEquals(68 / 1.75f / 1.75f,  person.getBMI());
    }
}
