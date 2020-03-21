package com.haverzard.smartcalculator.expression

import com.haverzard.smartcalculator.exception.DivisionException
import com.haverzard.smartcalculator.exception.ImaginaryException
import kotlin.math.sqrt

class DivisionExpression(x : Expression,y : Expression) : BinaryExpression(x,y) {
    override fun solve() : Double {
        if (y.solve() == 0.0) throw DivisionException(y.solve())
        return x / y
    }
}