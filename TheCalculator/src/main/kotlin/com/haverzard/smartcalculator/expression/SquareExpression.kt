package com.haverzard.smartcalculator.expression

class SquareExpression(x : Expression) : UnaryExpression(x) {
    override fun solve() : Double {
        return x.solve()*x.solve()
    }
}