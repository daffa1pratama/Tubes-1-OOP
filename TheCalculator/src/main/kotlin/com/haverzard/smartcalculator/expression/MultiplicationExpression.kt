package com.haverzard.smartcalculator.expression

// Kelas MultiplicationExpression : Turunan BinaryExpression
class MultiplicationExpression(x : Expression,y : Expression) : BinaryExpression(x,y) {
    // Solve() : perkalian x * y
    override fun solve() : Double {
        return x * y
    }
}
