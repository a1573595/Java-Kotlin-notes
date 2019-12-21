package other

fun main(args: Array<String>) {
    val email = "user@gmail.com"
    println(email.isEmail())

    val email2 = "user@gmail.c"
    println(email2.isEmail())

    val email3 = "user@gmail"
    println(email3.isEmail())

    val regex1 = Regex("\\d{4}", RegexOption.IGNORE_CASE)
    val str1 = "1234"
    println(regex1.matches(str1))

    val str2 = "12345"
    println(regex1.matches(str2))

    val regex2 = Regex("\\d{4,}", RegexOption.IGNORE_CASE)
    val str3 = "12345"
    println(regex2.matches(str3))
}

fun String.isEmail(): Boolean {
    val regex = Regex("^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$", RegexOption.IGNORE_CASE)    // 忽略大小寫
    return regex.matches(this)
}