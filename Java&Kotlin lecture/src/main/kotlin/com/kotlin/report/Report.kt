package com.kotlin.report

interface Report {
    fun load()

    fun print()
}

fun main(args: Array<String>) {
    val mutableList = mutableListOf<Report>()
    mutableList.add(FinanceReport())
    mutableList.add(HealthReport())

    for(report in mutableList) {
        report.load()
        report.print()
    }
}