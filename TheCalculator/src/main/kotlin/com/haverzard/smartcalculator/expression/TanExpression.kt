package com.haverzard.smartcalculator.expression

import com.haverzard.smartcalculator.exception.TanException
import kotlin.math.tan

// Kelas TanExpression : Turunan UnaryExpression
class TanExpression(x : Expression) : UnaryExpression(x) {
    // Solve() : menghitung nilai tan(x)
    override fun solve() : Double {
        if ((x.solve()/90.0) % 2 == 1.0) throw TanException(x.solve())
        if ((x.solve() % 180.0) == 0.0) {
            return 0.0
        } else {
            if (((x.solve() % 45.0) == 0.0) && ((x.solve() % 90.0) != 0.0)) {
                val rounded2 : Double
                val rounded1 : Double
                rounded2 = String.format("%.2f", tan(Math.toRadians(x.solve()))).toDouble()
                rounded1 = String.format("%.1f", rounded2).toDouble()
                return rounded1
            } else {
                return tan(Math.toRadians(x.solve()))
            }
        }
    }
}
