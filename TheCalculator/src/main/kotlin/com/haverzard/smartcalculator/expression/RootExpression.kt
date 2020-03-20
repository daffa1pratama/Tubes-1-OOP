package com.haverzard.smartcalculator.expression

import kotlin.math.sqrt

class RootExpression(x : Expression) : UnaryExpression(x) {
    override fun solve() : Double {
        return sqrt(x.solve())
    }
}