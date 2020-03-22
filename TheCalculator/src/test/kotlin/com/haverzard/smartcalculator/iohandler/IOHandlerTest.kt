package com.haverzard.smartcalculator.iohandler

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*
import com.haverzard.smartcalculator.iohandler.IOHandler
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import com.haverzard.smartcalculator.exception.*
import com.haverzard.smartcalculator.expfinder.*
import com.haverzard.smartcalculator.expression.*
import com.haverzard.smartcalculator.history.History
import com.haverzard.smartcalculator.parser.CompanionParser
import java.util.*
import java.lang.Double.parseDouble
import java.lang.NumberFormatException

internal class IOHandlerTest {
    @Test
    fun inputHandlerTest() {
        var inputDeque = InputHandler()
        var x = "27.0"
        var y = "0.53"
        var bracket1 = "ob"
        var bracket2 = "cb"
        assertEquals("", inputDeque.peeking())
        assertEquals(0, inputDeque.getBracketCounts())
        assertEquals(false, inputDeque.contains("27.0"))
        inputDeque.enqueue(x)
        assertEquals(x, inputDeque.peeking())
        assertEquals(true, inputDeque.contains("27.0"))
        inputDeque.replace(y)
        assertEquals(y,inputDeque.dequeue(y))
        assertEquals(false, inputDeque.contains("0.53"))
        inputDeque.enqueue(bracket1)
        assertEquals(1, inputDeque.getBracketCounts())
        inputDeque.enqueue(x)
        inputDeque.enqueue(bracket2)
        assertEquals(0, inputDeque.getBracketCounts())
        inputDeque.stringInput()
        assertEquals("( 27.0 ) ", inputDeque.text)
        inputDeque.clear()
        assertEquals("", inputDeque.text)
        assertEquals(0, inputDeque.getBracketCounts())
    }

    @Test
    fun outputHandlerTest() {
        var inputDeque = InputHandler()
        var outputDeque = OutputHandler(inputDeque)
        var x = "27.0"
        var y = "0..3"
        var z = "0.3"
        outputDeque.replaceOutput(x)
        assertEquals("27.0", outputDeque.text)
        assertEquals("", outputDeque.iHandler.peeking())
        outputDeque.dequeue()
        assertEquals("27.0", outputDeque.iHandler.peeking())
        outputDeque.clear()
        assertEquals("0", outputDeque.text)
        assertEquals("", outputDeque.iHandler.text)
        outputDeque.replaceOutput(y)
        assertEquals(false, outputDeque.error)
        outputDeque.checkError()
        assertEquals(true, outputDeque.error)
        outputDeque.enqueue("ob")
        assertEquals(1, outputDeque.iHandler.getBracketCounts())
        outputDeque.enqueue("ob")
        assertEquals(2, outputDeque.iHandler.getBracketCounts())
        outputDeque.enqueue(z)
        outputDeque.enqueue("cb")
        assertEquals(1, outputDeque.iHandler.getBracketCounts())
        assertEquals("( ( 0.3 ) ", outputDeque.iHandler.text)
        assertEquals(false, outputDeque.solved)
        outputDeque.solve()
        assertEquals("( ( 0.3 ) ", outputDeque.iHandler.text)
        outputDeque.enqueue("cb")
        outputDeque.solve()
        assertEquals("", outputDeque.iHandler.text)
    }

    @Test
    fun solverTest() {

    }
}
