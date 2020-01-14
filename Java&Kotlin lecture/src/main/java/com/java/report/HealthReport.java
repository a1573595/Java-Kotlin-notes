package com.java.report;

public class HealthReport implements Report{
    @Override
    public void load() {
        System.out.println("Health loading data");
    }

    @Override
    public void print() {
        System.out.println("Health printing");
    }
}
