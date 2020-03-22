package com.haverzard.smartcalculator.expression

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class TerminalExpressionTest {
    @Test
    fun solveTest() {
        val x : Expression
        x = TerminalExpression(135.0)
        assertEquals(135.0, x.solve())
    }
}