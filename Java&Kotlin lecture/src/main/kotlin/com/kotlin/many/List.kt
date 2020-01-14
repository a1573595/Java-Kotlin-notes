package com.kotlin.many

fun main(args: Array<String>) {
    val list = listOf(0, 1, 2)
    println(list)

    val scores = listOf(0, 1, 2, 3)
    for(score in scores) {
        println(score)
    }

    val mutableList = mutableListOf(5, 1, 2, 7)
    mutableList.add(6)
    println(mutableList)
}