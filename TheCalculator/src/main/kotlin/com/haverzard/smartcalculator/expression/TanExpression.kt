package com.haverzard.smartcalculator.expression

import kotlin.math.tan

class TanExpression(x : Expression) : UnaryExpression(x) {
    override fun solve() : Double {
        return tan(Math.toRadians(x.solve()))
    }
}