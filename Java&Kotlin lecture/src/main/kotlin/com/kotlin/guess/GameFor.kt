package com.kotlin.guess

import java.util.*

fun main(args: Array<String>) {
    val secret = Random().nextInt(10) + 1

    val scanner = Scanner(System.`in`)

    var number = 0

    for (i in 1..5) {
        println("Please enter a number($i/5):")
        number = scanner.nextInt()

        if (number > secret) {
            println("Lower")
        } else if (number < secret) {
            println("Higher")
        } else {
            println("Bingo, number is $number")
            break
        }
    }

    println("The end")
}