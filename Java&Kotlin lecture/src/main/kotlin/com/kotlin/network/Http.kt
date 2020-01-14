package com.kotlin.network

import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL

fun main(args: Array<String>) {
    val url = URL("http://data.tycg.gov.tw/opendata/datalist/datasetMeta/download?id=f4cc0b12-86ac-40f9-8745-885bddc18f79&rid=0daad6e6-0632-44f5-bd25-5e1de1e9146f")
//    val connection = url.openConnection() as HttpURLConnection
//
//    val stream = connection.inputStream
//    val reader = BufferedReader(InputStreamReader(stream))
//    val buffer = StringBuffer()
//
//    var line = reader.readLine()
//    while (line != null) {
//        buffer.append(line)
//        line = reader.readLine()
//    }
//
//    println(buffer.toString())

//    with(url.openConnection() as HttpURLConnection) {
//        val reader = inputStream.bufferedReader()
//        val buffer = StringBuffer()
//        var line = reader.readLine()
//
//        while (line != null) {
//            buffer.append(line)
//            line = reader.readLine()
//        }
//
//        println(buffer.toString())
//    }

//    with(url.openConnection() as HttpURLConnection) {
//        inputStream.bufferedReader().lines().forEach {
//            println(it)
//        }
//    }

    println(url.readText())
}