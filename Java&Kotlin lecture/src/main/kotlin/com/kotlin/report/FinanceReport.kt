package com.kotlin.report

class FinanceReport : Report {
    override fun load() {
        println("Finance loading data")
    }

    override fun print() {
        println("Finance printing")
    }

}