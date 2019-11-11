package basices

fun main(arg: Array<String>) {
    val together = concat(listOf("Kotlin", "Java", "Scala", " : "))
    println(together)

    val together2 = concat(separator = " : ", texts = listOf("Kotlin", "Java", "Scala"))
    println(together2)
}

fun concat(texts: List<String>, separator: String = ", ") = texts.joinToString(separator)