package src

class Outer2 {
    private val number = 3

    // 宣告巢狀類別
    class Nested {
        private val number = 7

        fun showNumber() {
            println("Nested.number: $number")
            // 不可以使用Outer類別的屬性與函式
            println("can't access this@Outer2.number")
        }
    }
}