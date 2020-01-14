package com.kotlin.many

import java.util.*

fun main(args: Array<String>) {
    val hashMap: HashMap<Int, String> = HashMap()
    hashMap[0] = "A"
    hashMap[2] = "B"
    hashMap[3] = "C"
    hashMap[5] = "D"
    hashMap[2] = "E"

    println(hashMap)

    for (key in hashMap.keys) {
        println(hashMap[key])
    }

    for(value in hashMap.values) {
        println(value)
    }
}