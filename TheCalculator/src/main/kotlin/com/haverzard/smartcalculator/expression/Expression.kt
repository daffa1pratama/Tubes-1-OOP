package com.haverzard.smartcalculator.expression

// ABC Expression
abstract class Expression() {
    // Solve for Expression
    abstract fun solve()  : Double

    // Operator Overloading
    operator fun unaryMinus() : Double {
        return - solve()
    }
    operator fun unaryPlus() : Double {
        return + solve()
    }
    operator fun plus(x : Expression) : Double {
        return solve() + x.solve()
    }
    operator fun minus(x : Expression) : Double {
        return solve() - x.solve()
    }
    operator fun times(x : Expression) : Double {
        return solve() * x.solve()
    }
    operator fun div(x : Expression) : Double {
        return solve() / x.solve()
    }
}