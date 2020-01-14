package com.kotlin

class Human constructor(var name: String = "Person", var height: Float, var weight: Float) {
    init {
        println("Hello $name")
    }

    fun sayHello() {
        println("Hello $name")
    }

    fun getBMI(): Float {
        return weight / height / height
    }
}