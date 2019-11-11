package basices

import kotlin.random.Random

val PI = 3.14159

fun main(arg: Array<String>) {
//    val list = listOf("Kotlin", "Android")
//    println(list)
//    println(PI)

    // Challenge: Reading the User's Name from the Console
//    print("Please enter your name: ")
//    val name = readLine()
//
//    if(name.isNullOrEmpty() || name.isBlank())
//        println("Who are you?")
//    else
//        println("Hello $name, nice to meet you.")

    // Challenge: Using Collections and Loops
    val intArr = IntArray(10)
    val randomIntArr = intArr.map { i ->  Random.nextInt(100) + 1 }
    println(randomIntArr.joinToString())
}