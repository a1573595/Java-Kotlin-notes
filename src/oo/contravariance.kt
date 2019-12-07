package oo

class Source<out T>(val t: T) {

    fun produceT(): T {
        return t
    }
    // Error
//    fun consume(t: T) {
//
//    }
}

class Sink<in T>(private val t: T) {
    // Error
//    fun produceT(): T {
//        return t
//    }

    fun consume(t: T) {

    }
}

fun main(args: Array<String>) {
    val strSource: Source<String> = Source("Producer")
    val anySource: Source<Any> = strSource
    anySource.produceT()

    val anySink: Sink<Any> = Sink("Sink")
    val strSink: Sink<String> = anySink
    strSink.consume("Consume")
}