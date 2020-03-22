package com.haverzard.smartcalculator.expression

import com.haverzard.smartcalculator.exception.DivisionException

// Kelas DivisionExpression : Turunan BinaryExpression
class DivisionExpression(x : Expression,y : Expression) : BinaryExpression(x,y) {
    // Solve() : menghitung pembagian x/y
    override fun solve() : Double {
        if (y.solve() == 0.0) throw DivisionException(y.solve())
        return x / y
    }
}
