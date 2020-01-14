package com.kotlin.lottery

import java.util.*

abstract class NumberGame {
    var numbers: Set<Int> = HashSet()
    var numberCount = 0

    abstract fun generate()

    open fun validate(): Boolean {
        return numbers.size == numberCount
    }
}