package com.haverzard.smartcalculator.expfinder

import org.junit.jupiter.api.Test
import com.haverzard.smartcalculator.expression.*
import org.junit.jupiter.api.Assertions.*

internal class UnaryFinderTest {
    @Test
    fun negativeTest() {
        val x = TerminalExpression(10.5)
        val code = "u001"
        assertEquals(-10.5, UnaryFinder(code, x).call().solve())
    }

    @Test
    fun sinTest() {
        val x = TerminalExpression(90.0)
        val code = "u002"
        assertEquals(1.0, UnaryFinder(code, x).call().solve())
    }

    @Test
    fun cosTest() {
        val x = TerminalExpression(180.0)
        val code = "u003"
        assertEquals(-1.0, UnaryFinder(code, x).call().solve())
    }

    @Test
    fun tanTest() {
        val x = TerminalExpression(360.0)
        val code = "u004"
        assertEquals(0.0, UnaryFinder(code, x).call().solve())
    }

    @Test
    fun squareTest() {
        val x = TerminalExpression(1.5)
        val code = "u005"
        assertEquals(2.25, UnaryFinder(code, x).call().solve())
    }

    @Test
    fun rootTest() {
        val x = TerminalExpression(5.76)
        val code = "u006"
        assertEquals(2.4, UnaryFinder(code, x).call().solve())
    }

    @Test
    fun terminalTest() {
        val x = TerminalExpression(10.5)
        val code = "u000"
        assertEquals(0.0, UnaryFinder(code, x).call().solve())
    }
}