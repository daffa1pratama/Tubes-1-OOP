package com.haverzard.smartcalculator.expression

import kotlin.math.cos

class CosExpression(x : Expression) : UnaryExpression(x) {
    override fun solve() : Double {
        return cos(x.solve())
    }
}