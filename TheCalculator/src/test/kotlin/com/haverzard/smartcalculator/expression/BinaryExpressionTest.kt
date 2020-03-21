package com.haverzard.smartcalculator.expression

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class BinaryExpressionTest {
    @Test
    fun subtractTest() {
        val x = SubtractExpression(TerminalExpression(24.0), TerminalExpression(5.0))
        assertEquals(19.0, x.solve())
    }

    @Test
    fun sumTest() {
        val x = SumExpression(TerminalExpression(24.0), TerminalExpression(5.0))
        assertEquals(29.0, x.solve())
    }

    @Test
    fun multiplicationTest() {
        val x = MultiplicationExpression(TerminalExpression(24.0), TerminalExpression(5.0))
        assertEquals(120.0, x.solve())
    }

    @Test
    fun divisionTest() {
        val x = DivisionExpression(TerminalExpression(24.0), TerminalExpression(5.0))
        assertEquals(4.8, x.solve())
    }
}