package com.haverzard.smartcalculator.expression

// ABC UnaryExpression
abstract class UnaryExpression(_x: Expression) : Expression() {
    internal var x : Expression = _x
}