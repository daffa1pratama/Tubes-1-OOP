package com.haverzard.smartcalculator.iohandler

import java.util.*

class InputHandler : IOHandler()  {
    private var inputDeque : Deque<String> = LinkedList<String>()
    private var bracketCounter = 0
    fun enqueue(x : String) {
        inputDeque.addLast(x)
        val temp = lookup(x)
        if (openBracket(x)) bracketCounter++
        if (closeBracket(x)) bracketCounter--
    }
    fun dequeue(x: String) : String {
        return inputDeque.removeFirst()
    }
    fun replace(x : String) {
        inputDeque.removeLast()
        enqueue(x)
    }
    fun peeking() : String {
        if (inputDeque.isNotEmpty()) return inputDeque.peekLast()
        return ""
    }
    fun getBracketCounts() : Int {
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
        return inputDeque.contains(x)
    }

    override fun solve() {
        text = Solver(inputDeque).evaluate()
    }
    override fun clear() {
        text = ""
        inputDeque.clear()
    }
}