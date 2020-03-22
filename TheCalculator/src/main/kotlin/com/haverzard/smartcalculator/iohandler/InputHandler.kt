package com.haverzard.smartcalculator.iohandler

import java.util.*

// Kelas InputHandler : Turunan IOHandler
class InputHandler : IOHandler()  {
    private var inputDeque : Deque<String> = LinkedList<String>()
    private var bracketCounter = 0

    fun enqueue(x : String) {
        // Memasukkan x ke inputDeque
        inputDeque.addLast(x)
        val temp = lookup(x)
        if (openBracket(x)) bracketCounter++
        if (closeBracket(x)) bracketCounter--
    }
    fun dequeue(x: String) : String {
        // Mengeluarkan x dari inputDeque
        return inputDeque.removeFirst()
    }
    fun replace(x : String) {
        // Mengganti elemen terakhir dengan x
        inputDeque.removeLast()
        enqueue(x)
    }
    fun peeking() : String {
        // Melihat elemen terakhir
        if (inputDeque.isNotEmpty()) return inputDeque.peekLast()
        return ""
    }
    fun getBracketCounts() : Int {
        // Menghitung bracket (tanda kurung)
        return bracketCounter
    }
    fun stringInput() {
        text = ""
        inputDeque.iterator().forEach {
            val t = lookup(it)
            text += if (t.isNotEmpty()) {
                "$t "
            } else {
                "$it "
            }
        }
    }
    operator fun contains(x : String) : Boolean {
        // Mengecek apakah inputDeque mengandung x
        return inputDeque.contains(x)
    }

    override fun solve() {
        // Mengevaluasi elemen inputDeque
        text = Solver(inputDeque).evaluate()
    }
    override fun clear() {
        // Menghapus semua elemen inputDeque
        text = ""
        inputDeque.clear()
        bracketCounter = 0
    }
}