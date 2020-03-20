package com.haverzard.smartcalculator.expression

class NegativeExpression(x : Expression) : UnaryExpression(x) {
    override fun solve() : Double {
        return - x
    }
}