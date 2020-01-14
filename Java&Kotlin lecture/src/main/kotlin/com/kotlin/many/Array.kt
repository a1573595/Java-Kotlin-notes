package com.kotlin.many

fun main(args: Array<String>) {
    val numbers = IntArray(5)
    numbers[0] = 1
    numbers[4] = 5

    val scores = intArrayOf(66, 77, 88, 99, 50)
    println(scores)

    for (i in 0 .. scores.size-1) {
        println(scores[i])
    }

    for (i in scores.indices) {
        println(scores[i])
    }

    for (score in scores) {
        println(score)
    }
}