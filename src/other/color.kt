package src

// 列舉建構式無法直接呼叫使用
enum class Colors constructor(val value: Int) {
    // 列出所有成員的名稱，有六種顏色的名稱，每一個名稱之間使用逗號隔開
    LIGHTGREY(0XD3D3D3), BLUE(0X33B5E5), PURPLE(0XAA66CC),
    GREEN(0X99CC00), ORANGE(0XFFBB33), RED(0XFF4444);
    // 回傳十六進制的顏色代碼字串
    fun colorCode() = "0X${value.toString(16).toUpperCase()}"
}

fun main(args: Array<String>) {
    // 宣告紅、藍、綠三個顏色變數
    val c01: Colors = Colors.RED
    val c02: Colors = Colors.BLUE
    val c03: Colors = Colors.GREEN
    // 顯示： RED, BLUE, GREEN
    println("$c01, $c02, $c03")

    // 把紅、藍、綠顏色名稱字串轉換為列舉型態變數
    val c04: Colors = Colors.valueOf("RED")
    val c05: Colors = Colors.valueOf("BLUE")
    val c06: Colors = Colors.valueOf("GREEN")
    // 顯示： RED, BLUE, GREEN
    println("$c04, $c05, $c06")

    // 取得包含列舉型態所有成員的陣列
    val cs: Array<Colors> = Colors.values()
    // 顯示：0: LIGHTGREY、1: BLUE、 2: PURPLE、3: GREEN、4: ORANGE、5: RED
    cs.forEach { println("${it.ordinal} ${it.name}: ${it.colorCode()}") }
}