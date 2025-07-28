package org.example

fun main() {
    val testStr = ".1234587546821270405694314400000005"
    println(testStr.toDoubleOrNull())
    println(testStr.parseFractionalPartOfDoubleInPlaceAsLong())
    println(testStr.parseFractionalPartOfDoubleInPlaceAsDouble())
}