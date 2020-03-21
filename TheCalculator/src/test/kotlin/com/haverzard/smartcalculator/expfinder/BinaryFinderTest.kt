package com.haverzard.smartcalculator.expfinder

import org.junit.jupiter.api.Test
import com.haverzard.smartcalculator.expression.*
import org.junit.jupiter.api.Assertions.*

internal class BinaryFinderTest {
    @Test
    fun substractTest() {
        val y = TerminalExpression(5.0)
        val x = TerminalExpression(10.5)
        val code = "b001"
        assertEquals(5.5, BinaryFinder(code, y, x).call().solve())
    }

    @Test
    fun sumTest() {
        val y = TerminalExpression(5.0)
        val x = TerminalExpression(10.5)
        val code = "b002"
        assertEquals(15.5, BinaryFinder(code, y, x).call().solve())
    }

    @Test
    fun multiplicationTest() {
        val y = TerminalExpression(5.0)
        val x = TerminalExpression(10.5)
        val code = "b003"
        assertEquals(52.5, BinaryFinder(code, y, x).call().solve())
    }

    @Test
    fun divisionTest() {
        val y = TerminalExpression(5.0)
        val x = TerminalExpression(10.5)
        val code = "b004"
        assertEquals(2.1, BinaryFinder(code, y, x).call().solve())
    }

    @Test
    fun terminalTest() {
        val y = TerminalExpression(5.0)
        val x = TerminalExpression(10.5)
        val code = "b000"
        assertEquals(0.0, BinaryFinder(code, y, x).call().solve())
    }
}