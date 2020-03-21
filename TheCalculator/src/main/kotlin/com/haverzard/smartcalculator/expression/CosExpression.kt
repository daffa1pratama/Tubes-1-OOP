package com.haverzard.smartcalculator.expression

import kotlin.math.*

class CosExpression(x : Expression) : UnaryExpression(x) {
    override fun solve() : Double {
            return cos(Math.toRadians(x.solve()))
    }
}