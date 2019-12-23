package src

import java.time.LocalDate

interface Greeting{
    // 宣告抽象屬性變數
    val name : String

    // 宣告一般屬性變數
    val upperName : String
        get() = name.toUpperCase()

    // 宣告一般函式
    fun showName() {
        println("Name: $name")
    }

    // 宣告一般函式
    fun sayGreeting() {
        println("Hello, $upperName")
    }

    // 宣告抽象函式
    fun message(): String
}

fun main(args: Array<String>) {
    val John = Person("John", "M", 23)
    John.showName()
    John.sayGreeting()

    // 宣告與實作Greeting介面的物件
    val greeting = object : Greeting {
        override val name: String = "Mary"

        override fun message(): String {
            return "Hello! $name! ${LocalDate.now()}"
        }
    }

    println(greeting.message())
}