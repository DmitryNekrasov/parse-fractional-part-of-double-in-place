package org.example

fun main() {
    val testStr = ".1234587546821270455694314400000005"
    println(testStr.toDoubleOrNull())
    println(testStr.parseFractionalPartOfDoubleInPlaceAsLong())
    println(testStr.parseFractionalPartOfDoubleInPlaceAsDouble())
}