package com.haverzard.smartcalculator.expression

class SumExpression(x : Expression,y : Expression) : BinaryExpression(x,y) {
    override fun solve() : Double {
        return x + y
    }
}