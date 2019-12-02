package oo

import java.util.*


val list: List<Int> = listOf(1, 2, 3)

class TimeLine<E>() {
    val data2Data: MutableMap<Date, E> = mutableMapOf()

    fun add(element: E) {
        data2Data[Date()] = element
    }

    fun getLate(): E {
        return data2Data.values.last()
    }
}

fun <E> timeLineOf(vararg elements: E): TimeLine<E> {
    val result = TimeLine<E>()
    for(e in elements) {
        result.add(e)
    }

    return result
}

fun main(args: Array<String>) {
    val timeLine: TimeLine<Int> = TimeLine()
    timeLine.add(2)
    timeLine.getLate()

    val timeLine2: TimeLine<String> = timeLineOf("", "", "")
}