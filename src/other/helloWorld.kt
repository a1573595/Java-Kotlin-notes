package src

import java.util.*

// 使用abstract讓這個類別變成抽象類別，同時也可以被繼承
// constructor建構子，直接宣告在類別旁邊作為唯一的建構子
abstract class Animal constructor(val type: String) {
    val id: String = UUID.randomUUID().toString()
    // 初始化
    init {
        println("Create animal: $type, id: $id")
    }
    // 抽象函式
    abstract fun showInfo()
}

// 使用open讓這個類別可以被繼承
open class Person constructor(override var name: String, val gender: String, var age: Short, var married: Boolean = false): Animal(Person::class.java.simpleName), Greeting{
    // 覆寫繼承自父類別的函式
    override fun showInfo() = println("Person ID: $id, name: $name, gender: $gender, age: $age, ${if(married) "is married" else "not married"}.")

    override fun message(): String {
        return "Hello! $name!"
    }
}

class Cat: Animal{
    var name: String
        set(name) { //宣告屬性的setter函式
            // 使用field關鍵字取代屬性名稱
            field = if (name.isEmpty()) type else name
        }
    val gender: String
    var age: Short
        set(age) { //宣告屬性的setter函式
            field = if(age<0) -1 else age
        }
    // constructor宣告在內部則可以有多個建構子
    constructor(name: String, gender: String, age: Short = -1) : super(Cat::class.java.simpleName) {
        this.name = name
        this.gender = gender
        this.age = age
    }

    constructor(gender: String, age: Short = -1) : super(Cat::class.java.simpleName) {
        this.name = type
        this.gender = gender
        this.age = age
    }
    // 覆寫繼承自父類別的函式
    override fun showInfo() = println("Cat ID: $id, name: $name, gender: $gender, age: $age.")
}

fun main(args: Array<String>) {
//    val John = Person("John", "M", 23)
//    John.showInfo()
//    println(John.type)
//
//    val Coco = Cat("Coco", "F", -2)
//    Coco.showInfo()
//    println(Coco.type)
//
//    println()


    println(String.format("%%"))
}
