package com.haverzard.smartcalculator.expression

import kotlin.math.*

class CosExpression(x : Expression) : UnaryExpression(x) {
    override fun solve() : Double {
        if (((x.solve() % 90.0) == 0.0) && ((x.solve() % 180.0) != 0.0)) {
            return 0.0
        } else {
            return cos(Math.toRadians(x.solve()))
        }
    }
}