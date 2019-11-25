package basices

import java.io.FileReader

fun main(args: Array<String>) {
    // AutoCloseable
    FileReader("example.txt").use {
        val str = it.readText()
        println(str)
    }
}