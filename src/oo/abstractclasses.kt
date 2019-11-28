package oo

import kotlin.math.pow

abstract class Shape2(val name: String = "Shape") {
    abstract fun area(): Double
    open fun a() = 1
}

class Circle2(name: String, val radius: Double): Shape2(name) {
    override fun area() = Math.PI * radius.pow( 2.0)
}

fun main(args: Array<String>) {
    val largeCircle = Circle2("Small Circle", 2.0)

    println(largeCircle.area())
}