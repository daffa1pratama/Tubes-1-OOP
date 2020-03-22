package com.haverzard.smartcalculator.expfinder

import com.haverzard.smartcalculator.expression.Expression

// ABC ExpressionFinder
// Parent UnaryFinder & BinaryFinder
abstract class ExpressionFinder {
    abstract fun call() : Expression
}