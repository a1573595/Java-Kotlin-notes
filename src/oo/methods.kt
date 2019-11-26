package oo

class Robot(val name: String) {
    fun sayGreeting() = println("Hello human, my name is $name")

    fun isKnowItsName(): Boolean = name.isNotBlank()
}

fun main(args: Array<String>) {
    val robot = Robot("Android")

    if(robot.isKnowItsName())
        robot.sayGreeting()
}