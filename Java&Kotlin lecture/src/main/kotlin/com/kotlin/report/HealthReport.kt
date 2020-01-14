package com.kotlin.report

class HealthReport : Report {
    override fun load() {
        println("Health loading data")
    }

    override fun print() {
        println("Health printing")
    }
}