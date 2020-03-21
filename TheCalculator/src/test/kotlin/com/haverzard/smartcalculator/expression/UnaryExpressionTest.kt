package com.haverzard.smartcalculator.expression

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class UnaryExpressionTest {
    @Test
    fun negativeTest() {
        val x = NegativeExpression(TerminalExpression(5.0))
        assertEquals(-5.0, x.solve())
    }

    @Test
    fun sinTest() {
        val x = SinExpression(TerminalExpression(0.0))
        assertEquals(0.0, x.solve())
    }

    @Test
    fun cos() {
        val x = CosExpression(TerminalExpression(90.0))
        assertEquals(0.0, x.solve())
    }

    @Test
    fun tanTest() {
        val x = TanExpression(TerminalExpression(45.0))
        assertEquals(1.0, x.solve())
    }

    @Test
    fun squareTest() {
        val x = SquareExpression(TerminalExpression(4.0))
        assertEquals(16.0, x.solve())
    }

    @Test
    fun rootTest() {
        val x = RootExpression(TerminalExpression(4.0))
        assertEquals(2.0, x.solve())
    }
}