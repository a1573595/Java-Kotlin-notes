package basices

import java.io.File

fun main(args: Array<String>) {
    // Scoping
    File("example.txt").bufferedReader().let {reader ->
        if(reader.ready()){
            reader.readLine()
        }
    }

//    File("example.txt").bufferedReader().let {
//        if(it.ready()){
//            it.readLine()
//        }
//    }

    val str: String? = "Kotlin for Android"

//    if(str!!.isNotEmpty()){
//        str.toLowerCase()
//    }

    str?.let {
        if(it.isNotEmpty())
            it.toLowerCase()
    }
}