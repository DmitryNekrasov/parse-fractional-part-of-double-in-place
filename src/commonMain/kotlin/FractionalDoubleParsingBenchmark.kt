@file:Suppress("unused")

package org.example

import kotlinx.benchmark.Benchmark
import kotlinx.benchmark.Param
import kotlinx.benchmark.Scope
import kotlinx.benchmark.State

@State(Scope.Benchmark)
open class FractionalDoubleParsingBenchmark {

    @Param(
        ".1",
        ".12345",
        ".123456789",
        ".1234567890123456",
        ".000000000000000001",
        ".12345678901234567890",
        ".999999999999999999999999",
        ".12345678901234567890123456789",
        ".1234587546821270455694314400000005"
    )
    lateinit var fractionalString: String

    @Benchmark
    fun benchmarkToDoubleOrNull(): Double? {
        return fractionalString.toDoubleOrNull()
    }

    @Benchmark
    fun benchmarkParseFractionalAsLong(): Double? {
        return fractionalString.parseFractionalPartOfDoubleInPlaceAsLong()
    }

    @Benchmark
    fun benchmarkParseFractionalAsDouble(): Double? {
        return fractionalString.parseFractionalPartOfDoubleInPlaceAsDouble()
    }
}
