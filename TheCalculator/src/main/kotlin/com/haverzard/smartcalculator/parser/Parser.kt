package com.haverzard.smartcalculator.parser

import java.util.*

class Parser: Stack<String>() {
    companion object : CompanionParser()
    fun evaluate() : Double {
        val x = pop()
        if (isUnary(x)) {

        }
        return 0.0
    }
}