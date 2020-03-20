package com.haverzard.smartcalculator.history

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

internal class HistoryTest {
    @Test
    fun primitiveTest() {
        val x = History<Double>()
        assertEquals(true,x.isEmpty())
        x.enqueue(5.0)
        assertEquals(false,x.isEmpty())
        assertEquals(1,x.historySize())
    }

    @ParameterizedTest
    @CsvSource("3.23","9.9","100.53","44.3")
    fun pushPopTest(num : Double) {
        val x = History<Double>()
        x.enqueue(num)
        assertEquals(num,x.dequeue())
    }

    @Test
    fun clearTest() {
        val x = History<Double>()
        for (i in 1..10) x.enqueue(5.0)
        assertEquals(false,x.isEmpty())
        assertEquals(10,x.historySize())
        x.clear()
        assertEquals(true,x.isEmpty())
    }
}