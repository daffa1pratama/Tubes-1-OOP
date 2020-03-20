package com.haverzard.smartcalculator.parser

open class CompanionParser {
    fun isUnary(x: String) : Boolean {
        return ("u" in x)
    }
    fun isBinary(x: String) : Boolean {
        return ("b" in x)
    }
}