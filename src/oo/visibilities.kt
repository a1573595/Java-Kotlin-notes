package oo

// private same as in Java
// protected same as in Java
// internal visible inside same module
// public same as in Java

open class Car(val brand: String, private val model: String) {
    protected fun getModel(): String = model
}

private class Car2(val brand: String, private val model: String) {
    fun getModel(): String = model
}

fun main(args: Array<String>) {
    val car = Car("Brand", "Model")
    car.brand
    // car.getModel()
}