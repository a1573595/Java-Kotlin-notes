package com.kotlin

import java.util.*

data class Ticket(val origin: Int, val destination: Int, var price: Int)

fun main(args: Array<String>) {
    val ticket = Ticket(15, 23, 360)

    val s = "ABC"
    println(s.isValidate())

    val s2 = "ABCDEFGH"
    println(s2.isValidate())

    println((1 .. 10).random())
}

fun String.isValidate(): Boolean {
    return this.length > 6
}

fun IntRange.random(): Int {
    val r = Random()
    return r.nextInt(endInclusive)+ 1
}