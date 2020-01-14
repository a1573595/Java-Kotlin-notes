package com.kotlin.many

import java.util.*

fun main(args: Array<String>) {
    val hashSet = HashSet<Int>()
    hashSet.add(1)
    hashSet.add(5)
    hashSet.add(6)
    hashSet.add(8)
    hashSet.add(3)

    println(hashSet)

    for (number in hashSet) {
        println(number)
    }
}