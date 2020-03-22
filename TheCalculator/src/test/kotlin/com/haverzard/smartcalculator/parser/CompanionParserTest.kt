package com.haverzard.smartcalculator.parser

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

internal class CompanionParserTest {
    companion object : CompanionParser()
    @Test
    fun isUnaryTest() {
        val x = "u001"
        val y = "b002"
        assertEquals(true, isUnary(x))
        assertEquals(false, isUnary(y))
    }

    @Test
    fun isBinaryTest() {
        val x = "b001"
        val y = "ob"
        assertEquals(true, isBinary(x))
        assertEquals(false, isBinary(y))
    }

    @Test
    fun isNumberTest() {
        val x = "25"
        val y = "u001"
        assertEquals(true, isNumber(x))
        assertEquals(false, isNumber(y))
    }

    @Test
    fun isBracketTest() {
        val x = "ob"
        val y = "cb"
        val z = "b003"
        assertEquals(true, openBracket(x))
        assertEquals(true, closeBracket(y))
        assertEquals(false, openBracket(z))
        assertEquals(false, closeBracket(z))
    }

    @Test
    fun lookupTest() {
        val unary = "u006"
        val binary = "b003"
        val number = "27"
        val bracket = "ob"
        assertEquals("sqrt", lookup(unary))
        assertEquals("x", lookup(binary))
        assertEquals("", lookup(number))
        assertEquals("(", lookup(bracket))
    }
}