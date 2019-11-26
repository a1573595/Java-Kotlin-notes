package function

fun main(args: Array<String>) {
    val props = System.getProperties()

    props.list(System.out)
    println(props.propertyNames().toList())
    println(props.getProperty("user.home"))

    with(props) {
        list(System.out)
        println(propertyNames().toList())
        println(getProperty("user.home"))
    }
}