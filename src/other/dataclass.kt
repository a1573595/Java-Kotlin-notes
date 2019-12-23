package src

import java.util.*

data class Human(var name: String, val gender: String, var age: Short) {
    val id: String = UUID.randomUUID().toString()

    init {
        println(this)
    }

    // 覆寫toString函式
    override fun toString(): String =
        "$id\t$name"
}

fun main(args: Array<String>) {
    val John = Human("John", "M", 24)
    val Mary = Human("Mary", "F", 22)

    println(John)
    println(Mary.toString())
    // 判斷John與Mary是否相同
    println(John.equals(Mary))
    println(John == Mary)

    println(Mary.hashCode())
    println(Mary.hashCode())

    // data class自動加入的componentN函式回傳宣告順序的屬性值
    val name = John.component1()
    val gender = John.component2()
    val age = John.component3()
    println("$name, $gender, $age")

    // 使用解構（Destructuring）讀取屬性值
    // 宣告三個變數，依照順序指定componentN函式的回傳值
    val (name_, gender_, age_) = John
    println("$name_, $gender_, $age_")

    // 複製一個新的物件
    val Joe = John.copy()
    // 指定部份的屬性複製一個新的物件
    val Jake = John.copy(name = "Jake", age = 28)

    val s : HashSet<String?> = HashSet()
}