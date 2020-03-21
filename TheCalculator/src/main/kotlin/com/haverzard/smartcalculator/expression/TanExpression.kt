package com.haverzard.smartcalculator.expression

import com.haverzard.smartcalculator.exception.TanException
import kotlin.math.tan

class TanExpression(x : Expression) : UnaryExpression(x) {
    override fun solve() : Double {
        if ((x.solve()/90.0) % 2 == 1.0) throw TanException(x.solve())
        return tan(Math.toRadians(x.solve()))
    }
}