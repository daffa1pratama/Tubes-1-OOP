package com.haverzard.smartcalculator.parser

import tornadofx.*
import java.util.Queue
import java.util.LinkedList

open class CompanionParser {
    fun isUnary(x: String) : Boolean {
        return ("u" in x)
    }
    fun isBinary(x: String) : Boolean {
        return ("b" in x)
    }
    fun isNumber(x: String) : Boolean {
        return (x.length == 1)
    }
    fun openBracket(x: String) : Boolean {
        return ("ob" == x)
    }
    fun closeBracket(x: String) : Boolean {
        return ("cb" == x)
    }
}