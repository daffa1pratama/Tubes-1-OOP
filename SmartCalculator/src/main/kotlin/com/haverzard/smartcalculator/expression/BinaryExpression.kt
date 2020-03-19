package com.haverzard.smartcalculator.expression

// ABC BinaryExpression
abstract class BinaryExpression(_x: Expression, _y: Expression) : Expression() {
    internal var x : Expression = _x
    internal var y : Expression = _y
}