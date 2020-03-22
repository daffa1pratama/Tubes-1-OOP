package com.haverzard.smartcalculator.expression

import com.haverzard.smartcalculator.exception.ImaginaryException
import kotlin.math.sqrt

// Kelas RootExpression : Turunan UnaryExpression
class RootExpression(x : Expression) : UnaryExpression(x) {

    // Solve() : operasi akar(x)
    override fun solve() : Double {
        val temp = sqrt(x.solve())
        if (x.solve() < 0) throw ImaginaryException(x.solve())
        return temp
    }
}