package src

import java.util.*

// 實作Comparable介面
data class Item (val id: Long, var title: String, var content: String) : Comparable<Item> {
    val details : String
        get() {
            return "Item(id=$id, title=$title, content=$content)"
        }

    // 覆寫Comparable介面的抽象函式
    // 使用title的字元個數決定大小
    // 回傳值：
    //     正數：自己比參數大
    //     負數：自己比參數小
    //     0：一樣大小
    override fun compareTo(other: Item) =
        title.length - other.title.length
}

// 實作Comparable介面
class ItemSortId : Comparator<Item> {
    // 覆寫Comparable介面的抽象函式
    // 使用id的數字決定大小
    // 回傳值：
    //     正數：自己比參數大
    //     負數：自己比參數小
    //     0：一樣大小
    override fun compare(o1: Item, o2: Item): Int {
        return when {
            (o1.id > o2.id) -> 1
            (o1.id < o2.id) -> -1
            else -> 0
        }
    }
}

fun main(args: Array<String>) {
    // 建立測試用的Item物件
    val item1 = Item(101, "Hello", "Kotlin")
    val item2 = Item(102, "Hi", "Android")
    val item3 = Item(103, "Chao", "Java")

    // 建立元素型態為Item的TreeSet物件
    // 如果元素類別已經實作Comparable介面
    // 加入的元素就會依照compareTo函式的實作排列
    val items = TreeSet<Item>()
    items.add(item1)
    items.add(item2)
    items.add(item3)

    items.forEach { println(it.details) }
    println()

    // 使用sortedSetOf函式建立字串元素的TreeSet物件
    // 如果元素類別已經實作Comparable介面
    // 加入的元素就會依照compareTo函式的實作排列
    val items2 = sortedSetOf(item1, item2, item3)
    items2.forEach { println(it.details) }
    println()

    // 建立元素型態為Item的TreeSet物件
    // 指定元素的排序方式為ItemSortId
    val items3 = TreeSet<Item>( ItemSortId())
    items3.add(item1)
    items3.add(item2)
    items3.add(item3)
    items3.forEach { println(it.details) }
}