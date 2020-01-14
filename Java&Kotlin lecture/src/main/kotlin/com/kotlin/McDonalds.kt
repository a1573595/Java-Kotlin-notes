package com.kotlin

import java.io.BufferedReader
import java.io.File
import java.io.FileReader
import java.io.IOException
import java.util.*

fun main(args: Array<String>) {
    val mcDonalds = McDonalds()
    mcDonalds.print()
}

class McDonalds {
    var menu = HashMap<String, Item>()

    init {
        val file = File("mcdonalds.txt")
        try {
            val reader = BufferedReader(FileReader(file))
            var line = reader.readLine()
            while (line != null) {
                val tokens = line.split(",").toTypedArray()
                val item =
                    Item(tokens[0], tokens[1], tokens[2].toInt(), tokens[3].toInt())
                menu[item.id] = item
                line = reader.readLine()
            }
        } catch (e: IOException) {
            e.printStackTrace()
            println("讀取失敗！！！")
        }
    }

    fun print() {
        for (value in menu.values) {
            println(value.toString())
        }
    }
}

class Item constructor(val id: String, val name: String, var calorie: Int, var price: Int) {
    override fun toString(): String {
        return "$id\t$name\t$calorie\t$price"
    }
}