package com.haverzard.smartcalculator.expression

// Kelas SquareExpression : Turunan UnaryExpression
class SquareExpression(x : Expression) : UnaryExpression(x) {
    // Solve() : menghitung x^2
    override fun solve() : Double {
        return x.solve()*x.solve()
    }
}
