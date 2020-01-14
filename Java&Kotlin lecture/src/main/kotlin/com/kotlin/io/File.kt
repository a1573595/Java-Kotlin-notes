package com.kotlin.io

import java.io.*

fun main(args: Array<String>) {
    File("output.txt").printWriter().use {
        it.println("1st line")
        it.write("2st line\n")
        it.println("3st line")
    }

    File("output2.txt").bufferedWriter().use {
        it.write("1st line\n")
        it.write("2st line\n")
        it.write("3st line\n")
    }

    File("kotlin_wiki.txt").bufferedReader().lines().forEach {
        println(it)
    }
}