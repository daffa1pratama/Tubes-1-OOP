package com.haverzard.smartcalculator.expression

// Kelas Negative Expression : Turunan UnaryExpression
class NegativeExpression(x: Expression) : UnaryExpression(x) {
    
    // Solve() : mengalikan x dengan -1 menjadi -x
    override fun solve() : Double {
        return - x
    }
}
