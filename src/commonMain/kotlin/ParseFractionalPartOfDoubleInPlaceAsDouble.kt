package org.example

fun String.parseFractionalPartOfDoubleInPlaceAsDouble(start: Int = 1, end: Int = length): Double? {
    if (start >= end) return null

    var index = start
    var result = 0.0
    var fractionMultiplier = 0.1

    while (index < end) {
        val ch = this[index]
        when (ch) {
            in '0'..'9' -> {
                val digit = ch - '0'
                result += digit * fractionMultiplier
                fractionMultiplier *= 0.1
            }
            else -> return null
        }
        index++
    }

    return result
}