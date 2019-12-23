package src

import java.util.*

fun main(args: Array<String>) {
    // 建立key與value的型態都為String的HashMap物件
    val nameMap = HashMap<String, String>()
    // 呼叫put函式加入元素，第一個參數為key，第二個參數為value
    nameMap.put("S", "Simon")
    nameMap.put("M", "Mary")
    // 建議使用類似陣列的語法加入元素
    nameMap["J"] = "John"
    nameMap["S"] = "Sam"

    println("names01.size: ${nameMap.size}")

    // 呼叫get函式取得與key對應的value
    println("names01.get(\"M\"): ${nameMap.get("M")}")
    // 建議使用類似陣列的方式取得與key對應的value
    println("names01[\"M\"]: ${nameMap["M"]}")

    // 如果指定的key不存在就傳回null值
    println("names01.get(\"X\"): ${nameMap.get("X")}")
    println("names01[\"X\"]: ${nameMap["X"]}")

    // 使用搭配Map物件特殊的for迴圈，讀取所有元素的key與value
    for ((key, value) in nameMap.entries) {
        println("$key = $value")
    }


    // 使用hashMapOf函式建立HashMap物件，可以執行元素的異動
    val nameMap2 : HashMap<String, String> = hashMapOf(
        "S" to "Simon",
        "M" to "Mary",
        "J" to "John")

    // 使用搭配Map物件特殊的for迴圈，讀取所有元素的key與value
    for ((key, value) in nameMap2.entries) {
        println("$key = $value")
    }
    println("\n")

    // 使用mapOf函式建立Map物件，不可以執行元素的異動
    val nameMap3: Map<String, String> = mapOf(
        "S" to "Simon",
        "M" to "Mary",
        "J" to "John")

    // 使用mapOf建立的Map物件不可以執行元素的異動
    // 所以沒有put這類異動的函式
    // nameMap3.put("C", "Chris")
    // 也不可以使用這樣的語法
    // nameMap3["R"] = "Rose"

    for ((key, value) in nameMap3.entries) {
        println("$key = $value")
    }
    println()

    // 使用mutableMapOf函式建立MutableMap物件，可以執行元素的異動
    val namesMap4: MutableMap<String, String> = mutableMapOf(
        "S" to "Simon",
        "M" to "Mary",
        "J" to "John")

    namesMap4.put("C", "Chris")
    namesMap4["R"] = "Rose"

    for ((key, value) in namesMap4.entries) {
        println("$key = $value")
    }
}