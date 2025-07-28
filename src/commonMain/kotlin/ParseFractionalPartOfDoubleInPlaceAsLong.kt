package org.example

import kotlin.math.pow

const val MAX_SAFE_FOR_MULTIPLY_BY_10 = Long.MAX_VALUE / 10

fun String.parseFractionalPartOfDoubleInPlaceAsLong(start: Int = 1, end: Int = length): Double? {
    if (start >= end) return null

    var index = start
    var result = 0L
    var order = end - start

    while (index < end) {
        val ch = this[index]
        if (result <= MAX_SAFE_FOR_MULTIPLY_BY_10) {
            when (ch) {
                in '0'..'9' -> {
                    val digit = ch - '0'
                    result *= 10
                    result += digit
                }
                else -> return null
            }
        } else {
            order--
        }
        index++
    }

    return result / 10.0.pow(order)
}