package basices

fun main(arg: Array<String>) {
//    val list = listOf("Hi", "there", "Kotlin", "fans")
//    val containst = listOf(false, true, true, false)
//
//    val zipped: List<Pair<String , Boolean>> = list.zip(containst)
//
//    val mapping = list.zip(list.map { it.contains("t") })
//
//    println(zipped)
//    println(mapping)

    // Challenge: Functional Programming for Data Analysis

    // Some faulty data with ages of our users
    val data = mapOf(
        "users1.csv" to listOf(32, 45, 17, -1, 34),
        "users2.csv" to listOf(19, -1, 67, 22),
        "users3.csv" to listOf(),
        "users4.csv" to listOf(56, 32, 18, 44)
    )
    println(data)

    // 1.Find the average age of users (use only valid ages for the calculation!)
    val ages = data.flatMap { it.value.filter { it > 0 } }
    println(ages)
    val average = ages.average().toInt()
    println(average)

    // 2.Extract the names of input files that contain faulty data
    val files = data.filter { it.value.any { it < 0 } }
    println(files.keys)

    // 3.Count the total number of faulty entries across all input files
    val faultyAges = data.flatMap { it.value.filter { it < 0 } }
    println(faultyAges.size)
}