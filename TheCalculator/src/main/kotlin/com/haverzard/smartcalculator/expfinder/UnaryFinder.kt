package com.haverzard.smartcalculator.expfinder

import com.haverzard.smartcalculator.expression.*

class UnaryFinder: ExpressionFinder {
    private var code : String
    private var x : Expression
    constructor(_code: String, _x: Expression) {
        code = _code
        x = _x
    }

    override fun call() : Expression = when (code) {
        "u001" -> NegativeExpression(x)
        "u002" -> SinExpression(x)
        "u003" -> CosExpression(x)
        "u004" -> TanExpression(x)
        "u005" -> SquareExpression(x)
        "u006" -> RootExpression(x)
        else -> TerminalExpression(0.0)
    }
}