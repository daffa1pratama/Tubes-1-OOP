package com.haverzard.smartcalculator.expression

class DivisionExpression(x : Expression,y : Expression) : BinaryExpression(x,y) {
    override fun solve() : Double {
        return x / y
    }
}