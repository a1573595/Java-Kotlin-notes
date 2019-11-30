package oo

import java.awt.event.MouseAdapter
import java.awt.event.MouseEvent

object CountryFactory {
    val a = 4
    fun createCountry() = Country("Australia")
}

object DefaultClickListener: MouseAdapter() {
    override fun mouseClicked(e: MouseEvent?) {
        super.mouseClicked(e)
        println("Mouse was clicked")
    }
}

fun main(args: Array<String>) {
    val obj = CountryFactory.createCountry()
    CountryFactory.a
}