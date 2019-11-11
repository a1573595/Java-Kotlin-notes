package basices

import java.io.IOException

fun main(arg: Array<String>) {
    val input = try {
        getExternalInput()
    }catch (e: IOException) {
        e.printStackTrace()
        e.toString()
    }finally {
        println("Finished trying to read external input")
    }

    print(input)
}

fun getExternalInput(): String = throw IOException("Could not read external input")