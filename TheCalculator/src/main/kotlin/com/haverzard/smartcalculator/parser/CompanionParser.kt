package com.haverzard.smartcalculator.parser

import com.haverzard.smartcalculator.expression.DivisionExpression
import com.haverzard.smartcalculator.expression.MultiplicationExpression
import com.haverzard.smartcalculator.expression.SubtractExpression
import com.haverzard.smartcalculator.expression.SumExpression

// Kelas CompanionParser
// Untuk menangani "kode" parsing
open class CompanionParser {
    
    fun isUnary(x: String) : Boolean {
    // Mengecek apakah x adalah unary
        return ("u" in x)
    }
    fun isBinary(x: String) : Boolean {
    // Mengecek apakah x adalah binary
        return ("b" in x) && ("o" !in x) && ("c" !in x)
    }
    fun isNumber(x: String) : Boolean {
    // Mengecek apakah x adalah number
        return !isBinary(x) && !isUnary(x) && !openBracket(x) && !closeBracket(x)
    }
    fun openBracket(x: String) : Boolean {
    // Mengecek apakah x adalah kurung buka
        return ("ob" == x)
    }
    fun closeBracket(x: String) : Boolean {
    // Mengecek apakah x adalah kurung tutup
        return ("cb" == x)
    }
    fun lookup(x: String) :  String {
    // Mengembalikan simbol sesuai kode parsing
        return when(x) {
            "u001" -> "neg"
            "u002" -> "sin"
            "u003" -> "cos"
            "u004" -> "tan"
            "u005" -> "square"
            "u006" -> "sqrt"
            "b001" -> "-"
            "b002" -> "+"
            "b003" -> "x"
            "b004" -> "/"
            "ob" -> "("
            "cb" -> ")"
            else -> ""
        }
    }
}
