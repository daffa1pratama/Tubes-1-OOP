package com.haverzard.smartcalculator.expression

// Kelas TerminalExpression : Turunan Expression
class TerminalExpression(x: Double) : Expression() {
    private var value : Double = x
    // Solve() : mengembalikan nilai x
    override fun solve() : Double {
        return value
    }
}
