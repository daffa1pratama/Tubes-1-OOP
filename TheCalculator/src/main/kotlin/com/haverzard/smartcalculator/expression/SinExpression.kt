package com.haverzard.smartcalculator.expression

import kotlin.math.sin

class SinExpression(x : Expression) : UnaryExpression(x) {
    override fun solve() : Double {
        if ((x.solve() % 180.0) == 0.0) {
            return 0.0
        } else {
            return sin(Math.toRadians(x.solve()))
        }
    }
}