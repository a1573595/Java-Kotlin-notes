package oo

class Country(name: String, areaSqKm: Int) {
    val name: String
    val areaSqKm: Int

    constructor(name: String): this(name, 0) {
        println("constructor called")
    }

    init {
        this.name = name
        this.areaSqKm = areaSqKm
    }

    fun print() = "$name, $areaSqKm km^2"
}

class Country2(name: String, areaSqKm: Int) {
    val name: String = name
    val areaSqKm: Int = areaSqKm
}

class Country3(val name: String, val areaSqKm: Int)

fun main(args: Array<String>) {
    val australia = Country("Australia", 7_700_000)
    println(australia.print())

    val spin = Country("Spin")
    println(spin.print())
}