package basices

inline fun modifyString(str: String, operator:(String) -> String): String {
    return operator(str)
}

inline fun modifyString2(str: String, noinline operator:(String) -> String): String {
    return operator(str)
}

fun main(args: Array<String>) {
    modifyString("Kotlin is amazing", { it.toUpperCase() })
}