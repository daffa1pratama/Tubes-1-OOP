package com.haverzard.smartcalculator.expfinder

import com.haverzard.smartcalculator.expression.*

class BinaryFinder: ExpressionFinder {
    private var code : String
    private var x : Expression
    private var y : Expression
    constructor(_code: String, _y: Expression, _x: Expression) {
        code = _code
        y = _y
        x = _x
    }

    override fun call() : Expression = when (code) {
        "b001" -> SubtractExpression(x,y)
        "b002" -> SumExpression(x,y)
        "b003" -> MultiplicationExpression(x,y)
        "b004" -> DivisionExpression(x,y)
        else -> TerminalExpression(0.0)
    }
}