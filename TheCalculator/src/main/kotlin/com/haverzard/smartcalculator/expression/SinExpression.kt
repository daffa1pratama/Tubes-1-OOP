package com.haverzard.smartcalculator.expression

import kotlin.math.sin

// Kelas SinExpression : Turunan UnaryExpression
class SinExpression(x : Expression) : UnaryExpression(x) {

    // Solve() : menghitung nilai sin(x)
    override fun solve() : Double {
        if ((x.solve() % 180.0) == 0.0) {
            return 0.0
        } else {
            if (((x.solve() % 30.0) == 0.0) && ((x.solve() % 60.0) != 0.0)) {
                val rounded2 : Double
                val rounded1 : Double
                rounded2 = String.format("%.2f", sin(Math.toRadians(x.solve()))).toDouble()
                rounded1 = String.format("%.1f", rounded2).toDouble()
                return rounded1
            } else {
                return sin(Math.toRadians(x.solve()))
            }
        }
    }
}