package com.haverzard.smartcalculator.expression

import kotlin.math.sin

class SinExpression(x : Expression) : UnaryExpression(x) {
    override fun solve() : Double {
        return sin(x.solve())
    }
}