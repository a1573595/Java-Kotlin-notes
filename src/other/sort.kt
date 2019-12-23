package src

fun main(args: Array<String>) {
    // 建立測試用的Item物件
    val item01 = Item(101, "Hello", "Kotlin")
    val item02 = Item(102, "Hi", "Android!")
    val item03 = Item(103, "Chao", "Java")

    // 建立元素型態為Item的ArrayList物件
    val items = ArrayList<Item>()
    items.add(item01)
    items.add(item02)
    items.add(item03)
    println("\n===== Sort by Item.compareTo:")

    // 如果元素類別已經實作Comparable介面
    // 呼叫sort函式以後，元素就會依照compareTo函式的實作重新排列
    items.sort()
    items.forEach { println(it.details) }
    println("\n===== Sort by id:")

    // 呼叫sortWith函式以後，元素就會依照參數的compareTo函式實作重新排列
    items.sortWith( ItemSortId() )
    items.forEach { println(it.details) }
}