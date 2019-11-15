package basices

fun main(arg: Array<String>){
    val list = (1..100).toList()

    val double = list.map { element -> element * 2 }
    val double2 = list.map { it * 2 }

    val average = list.average()
    val shifed = list.map { it - average }

    println(double)
    println(shifed)

    val nestedlist = listOf(
        (1..10).toList(),
        (11..20).toList(),
        (21..30).toList()
    )

    val notFlatted = nestedlist.map { it.sortedDescending() }   // .flatten()
    val flatted = nestedlist.flatMap { it.sortedDescending() }

    println(nestedlist)
    println(notFlatted)
    println(flatted)
}