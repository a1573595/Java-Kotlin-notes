package basices

import kotlin.system.measureTimeMillis

fun main(arg: Array<String>) {
    val veryLongList = (1..999999L).toList()

    val sum = veryLongList
        .asSequence()
        .filter { it > 50 }
        .map { it * 2 }
        .take(1000)
        .sum()

    val seq = generateSequence(1, {it + 1})

    println(sum)
    println(seq.take(10).toList())

    val nonLazyTimeMillis = measureTimeMillis {
        veryLongList
            .filter { it > 50 }
            .map { it * 2 }
            .take(1000)
            .sum()
    }

    val lazyTimeMillis = measureTimeMillis {
        veryLongList
            .asSequence()
            .filter { it > 50 }
            .map { it * 2 }
            .take(1000)
            .sum()
    }

    println("Non lazy: ${nonLazyTimeMillis}ms")
    println("Lazy: ${lazyTimeMillis}ms")
}