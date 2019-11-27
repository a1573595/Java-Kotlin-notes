package oo

enum class Directions(degree: Double) {
    North(0.0), East(90.0), South(180.0), West(270.0)
}

enum class Suits {
    Heart, Spades, Diamonds, Clubs
}

fun main(args: Array<String>) {
    val suit = Suits.Spades

    val color = when(suit) {
        Suits.Heart, Suits.Diamonds -> "red"
        Suits.Spades, Suits.Clubs -> "black"
    }

    println(color)
}