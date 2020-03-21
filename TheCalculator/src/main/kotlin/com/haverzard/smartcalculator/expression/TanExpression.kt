package com.haverzard.smartcalculator.expression

import com.haverzard.smartcalculator.exception.TanException
import kotlin.math.sin
import kotlin.math.tan

class TanExpression(x : Expression) : UnaryExpression(x) {
    override fun solve() : Double {
        if ((x.solve()/90.0) % 2 == 1.0) throw TanException(x.solve())
        if ((x.solve() % 180.0) == 0.0) {
            return 0.0
        } else {
            if (((x.solve() % 45.0) == 0.0) && ((x.solve() % 90.0) != 0.0)) {
                return 1.0
            } else {
                return tan(Math.toRadians(x.solve()))
            }
        }
    }
}