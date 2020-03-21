package com.haverzard.smartcalculator.exception

import com.haverzard.smartcalculator.expression.*
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class ExceptionTest {
    @Test
    fun divisionTest() {
        val x : Double
        var y = 0.0
        try {
            x = DivisionExpression(TerminalExpression(13.2), TerminalExpression(0.0)).solve()
        }
        catch (e: DivisionException) {
            y = -1.0
        }
        assertEquals(-1.0, y)
    }

    @Test
    fun imaginaryTest() {
        val x : Double
        var y = 0.0
        try {
            x = RootExpression(TerminalExpression(-13.2)).solve()
        }
        catch (e: ImaginaryException) {
            y = -1.0
        }
        assertEquals(-1.0, y)
    }

    @Test
    fun tanTest() {
        val x : Double
        var y = 0.0
        try {
            x = TanExpression(TerminalExpression(90.0)).solve()
        }
        catch (e: TanException) {
            y = -1.0
        }
        assertEquals(-1.0, y)
    }
}