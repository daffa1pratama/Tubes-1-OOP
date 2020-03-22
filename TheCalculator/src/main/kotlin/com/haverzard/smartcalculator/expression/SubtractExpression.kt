package com.haverzard.smartcalculator.expression

// Kelas SubstractExpression : Turunan BinaryExpression
class SubtractExpression(x : Expression,y : Expression) : BinaryExpression(x,y) {
    
    // Solve() : menghitung x - y
    override fun solve() : Double {
        return x - y
    }
}
