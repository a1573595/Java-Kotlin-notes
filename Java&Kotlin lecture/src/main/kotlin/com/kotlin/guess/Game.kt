package com.kotlin.guess

import java.util.*

fun main(args: Array<String>) {
    val secret = Random().nextInt(10) + 1

    val scanner = Scanner(System.`in`)

    var number = 0

    while (number != secret) {
        println("Please enter a number:")
        number = scanner.nextInt()

        when {
            number > secret -> {
                println("Lower")
            }
            number < secret -> {
                println("Higher")
            }
            else -> {
                println("Bingo, number is $number")
            }
        }
    }
}