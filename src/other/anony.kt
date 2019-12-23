package src

class Outer3 {
    private val number = 3

    // 宣告匿名類別
    val anony = object : Any() {
        val number = 5

        override fun toString() : String {
            // 匿名類別宣告的number
            println(number)
            // 匿名類別可以使用Outer類別的屬性與函式
            println(this@Outer3.number)

            return "Anonymous.number: $number, Outer.number: ${this@Outer3.number}"
        }
    }
}