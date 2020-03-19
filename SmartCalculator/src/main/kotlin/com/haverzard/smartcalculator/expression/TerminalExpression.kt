package com.haverzard.smartcalculator.expression

class TerminalExpression(x: Double) : Expression() {
    private var value : Double = x

    override fun solve() : Double {
        return value
    }
}