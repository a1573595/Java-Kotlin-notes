package oo

// Generates hashCode()、equals(), toString()、 copy()、 destructuring operator
data class Address(val street: String, val number: Int, val postCode: Int, val city: String)

fun main(args: Array<String>) {
    val residence = Address("Main street", 42, 123, "New York")
    val residence2 = Address("Main street", 42, 123, "New York")
    // toString()
    println(residence)
    // Referential equality
    println(residence === residence2)
    // Structural equality
    println(residence == residence2)

    val neighbor = residence.copy(number = 43)
    // Referential equality
    println(residence === neighbor)
    // Structural equality
    println(residence == neighbor)

    // Destructuring operator
    residence.component1()
    val (street, number, _, city) = residence
    println("$street, $number, $city")
}