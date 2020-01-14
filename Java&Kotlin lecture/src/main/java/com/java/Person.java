package com.java;

public class Person {
    // Field、Property 屬性
    String name = "Person";
    float height;
    float weight;

    public Person(float height, float weight) {
        this.height = height;
        this.weight = weight;
    }

    public Person(String name, float height, float weight) {
        this(height, weight);
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello " + name);
    }

    public float getBMI() {
        float bmi = weight / height / height;
        return bmi;
    }
}
