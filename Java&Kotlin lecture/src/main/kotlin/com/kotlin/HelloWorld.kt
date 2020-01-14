package com.kotlin

fun main(args: Array<String>) {
    println("Hello world")

    Human(height = 1.75f, weight = 68f)

    val p = Human("Peter", 1.75f, 68f)
    println(p.getBMI())

    // Data type 基本資料型態
    // Data type 基本資料型態
    val isReal = true // 1bytes

    val r: Byte = 0 // 1bytes
    val x: Short = 1 // 1bytes
    val y: Int = 2 // 4bytes
    val z: Long = 3 // 8bytes


    val a: Float = 1.0f // 4bytes
    val b: Double = 1.0 // 8bytes

    val c: Char = 'A' // 4bytes
    val str: String = "ABC"

    // var variable 可變的
    // val value 不可變的

    val source = 88
    println(source >= 60)

    // Kotlin中的Char無法作為數值比較
    // println(c > 60)

    val s: String? = "ABCDE"
    println(s?.length)
    println(s!![3])
    println(s.substring(3))
}
