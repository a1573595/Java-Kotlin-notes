package com.kotlin.student

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    println("Please enter student's name:")
    val name = scanner.next()

    println("Please enter student's English score:")
    val english = scanner.nextInt()

    println("Please enter student's Math score:")
    val math = scanner.nextInt()

    val student = Student("01", name, english, math)
    student.showScore()
    student.checkName()
    println("High score: ${student.getHighest()}")
    println("Average score: ${student.getAverage()}")

    val gStudent = GraduatedStudent("100", "Jane", 85, 67, 88);
    gStudent.showScore()
    gStudent.checkName()
    println("High score: ${gStudent.getHighest()}")
    println("Average score: ${gStudent.getAverage()}")
}

open class Student(val id: String, var name: String? , var english: Int, var math: Int) {
    companion object {
        @JvmStatic  // 存取時不用再透過companion才能呼叫PASS
        var PASS = 60
    }

    open fun showScore() {
        val average = getAverage()
        println("$name\tEnglish:$english\tMath:$math")
        println(if(average > PASS) "PASS" else "FAILED")

        val grading: Char = when (average) {
            in 90 .. 100 -> 'A'
            in 80 .. 89 -> 'B'
            in 70 .. 79 -> 'C'
            in 60 .. 69 -> 'D'
            else -> 'E'
        }

        println("\t" + grading)
    }

    fun checkName() {
        println(name?.length)
    }

    open fun getHighest(): Int {
        return if(english > math){
            print("English ")
            english
        }else {
            print("Math ")
            math
        }
    }

    open fun getAverage(): Int = (english + math) / 2
}