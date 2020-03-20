package com.haverzard.smartcalculator.parser

import tornadofx.*
import java.util.Queue
import java.util.LinkedList

class OutputHandler: IOHandler() {
    companion object : CompanionParser()
    var output = ""

    public fun enqueue(x: String) {
        // dr InputHandler, cek last elementnya kurung tutup atau bukan - baru bisa tambah angka
        if (!isUnary(x) && !isBinary(x)) {
            output += x
        } else {
            // Cek last elementnya buka kurung - kalo ya, do nothing
            // Cek last elementnya operator unary - kalo ya, do nothing
            // Cek last elementnya operator binary - kalo ya dan x binary, replace
            // Cek last elementnya operator binary - kalo ya dan x unary, next
            // Push output + operator baru
        }
    }
}