package com.haverzard.SmartCalculator.Expression

import kotlin.math.*

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

class TerminalExpression(x: Double) : Expression() {
    private var value : Double = x

    override fun solve() : Double {
        return value
    }
}

// ABC UnaryExpression
abstract class UnaryExpression(_x: Expression) : Expression() {
    internal var x : Expression = _x
}

// ABC BinaryExpression
abstract class BinaryExpression(_x: Expression, _y: Expression) : Expression() {
    internal var x : Expression = _x
    internal var y : Expression = _y
}

class NegativeExpression(x : Expression) : UnaryExpression(x) {
    override fun solve() : Double {
        return - x
    }
}

class SinExpression(x : Expression) : UnaryExpression(x) {
    override fun solve() : Double {
        return sin(x.solve())
    }
}

class CosExpression(x : Expression) : UnaryExpression(x) {
    override fun solve() : Double {
        return cos(x.solve())
    }
}

class TanExpression(x : Expression) : UnaryExpression(x) {
    override fun solve() : Double {
        return tan(x.solve())
    }
}

class RootExpression(x : Expression) : UnaryExpression(x) {
    override fun solve() : Double {
        return sqrt(x.solve())
    }
}

class SquareExpression(x : Expression) : UnaryExpression(x) {
    override fun solve() : Double {
        return x.solve()*x.solve()
    }
}

class SumExpression(x : Expression,y : Expression) : BinaryExpression(x,y) {
    override fun solve() : Double {
        return x + y
    }
}

class SubstractExpression(x : Expression,y : Expression) : BinaryExpression(x,y) {
    override fun solve() : Double {
        return x - y
    }
}

class MultiplicationExpression(x : Expression,y : Expression) : BinaryExpression(x,y) {
    override fun solve() : Double {
        return x * y
    }
}

class DivisionExpression(x : Expression,y : Expression) : BinaryExpression(x,y) {
    override fun solve() : Double {
        return x / y
    }
}
