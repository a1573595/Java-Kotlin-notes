package basices

fun main(arg: Array<String>) {
    val timesTwo = {x: Int -> x*2}

    println(timesTwo(10))

    val add: (Int, Int) -> Int = {x: Int, y: Int -> x + y}

    println(add(1,2))

    val list = (1..100).toList()

    println(list.filter { element -> element % 2 == 0 })

    println(list.filter {it % 2 == 0 })

    println(list.filter {it.even()})

    println(list.filter(::isEven))
}

fun isEven(i: Int) = i % 2 == 0

fun Int.even() = this % 2 == 0