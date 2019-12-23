package src

class Outer1 {
    private val number = 3


    // 宣告內部類別
    // 多了inner關鍵字，就可以使用Outer類別的屬性與函式
    inner class Inner {

        private val number = 9

        fun showNumber() {
            // Inner宣告的number
            println(number)
            // Inner宣告的number
            println(this@Inner.number)
            // Outer宣告的number
            println(this@Outer1.number)
        }
    }
}