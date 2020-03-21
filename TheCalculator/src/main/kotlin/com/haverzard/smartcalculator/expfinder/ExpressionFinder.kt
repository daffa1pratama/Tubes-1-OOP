package com.haverzard.smartcalculator.expfinder

import com.haverzard.smartcalculator.expression.Expression

abstract class ExpressionFinder {
    abstract fun call() : Expression
}