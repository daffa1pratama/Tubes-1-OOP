package com.haverzard.smartcalculator.expression

// Kelas SumExpression : Turunan BinaryExpression
class SumExpression(x : Expression,y : Expression) : BinaryExpression(x,y) {
    
    // Solve() : menghitung x + y
    override fun solve() : Double {
        return x + y
    }
}
