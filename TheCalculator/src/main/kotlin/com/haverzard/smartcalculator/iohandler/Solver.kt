package com.haverzard.smartcalculator.iohandler

import com.haverzard.smartcalculator.exception.*
import com.haverzard.smartcalculator.expfinder.*
import com.haverzard.smartcalculator.expression.*
import com.haverzard.smartcalculator.parser.CompanionParser
import java.util.*

// Kelas Solver
// Mengevaluasi ekspresi
class Solver {
    companion object : CompanionParser()
    private var temporalResults = Stack<Expression>()
    private var inputQueue : Queue<String>
    
    constructor(x: Queue<String>) {
         inputQueue = x
    }
    
    fun process() {
    // Proses pemanggilan ekspresi dan menghitung
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
    // Evaluasi ekspresi. Jika ada exception, akan ditangkap disini
        return try {
            while (inputQueue.isNotEmpty()) process()
            var temp = temporalResults.pop().solve()
            if (temp - temp.toInt() == 0.0) temp.toInt().toString()
            else temp.toString()
        } catch (e: DivisionException) {
            "Invalid Division by 0"
        } catch (e: ImaginaryException) {
            "Imaginary Number"
        } catch (e: TanException) {
            "Invalid Tan Input"
        }
    }
}
