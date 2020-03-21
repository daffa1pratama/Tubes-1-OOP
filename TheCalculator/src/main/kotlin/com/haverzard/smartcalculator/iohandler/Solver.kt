package com.haverzard.smartcalculator.iohandler

import com.haverzard.smartcalculator.exception.ImaginaryException
import com.haverzard.smartcalculator.expfinder.*
import com.haverzard.smartcalculator.expression.*
import com.haverzard.smartcalculator.parser.CompanionParser
import java.util.*

class Solver {
    companion object : CompanionParser()
    private var temporalResults = Stack<Expression>()
    private var inputQueue : Queue<String>
    constructor(x: Queue<String>) {
         inputQueue = x
    }
    fun process() {
        val x = inputQueue.remove()
        when {
            isNumber(x) -> {
                temporalResults.push(TerminalExpression(x.toDouble()))
            }
            isUnary(x) -> {
                process()
                temporalResults.push(UnaryFinder(x,temporalResults.pop()).call())
            }
            isBinary(x) -> {
                process()
                temporalResults.push(BinaryFinder(x,temporalResults.pop(),temporalResults.pop()).call())
            }
            openBracket(x) -> {
                while ("cb" !in inputQueue.peek()) process()
            }
        }
    }

    fun evaluate() : String {
        return try {
            while (inputQueue.isNotEmpty()) process()
            var temp = temporalResults.pop().solve()
            if (temp - temp.toInt() == 0.0) temp.toInt().toString()
            else temp.toString()
        } catch (e: ArithmeticException) {
            "Invalid Division by Zero"
        } catch (e: ImaginaryException) {
            "Imaginary Not Supported"
        }
    }
}