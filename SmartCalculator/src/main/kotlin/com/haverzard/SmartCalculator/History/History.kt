package com.haverzard.SmartCalculator.History

import java.util.Queue
import java.util.LinkedList

class History {
    private val Container : Queue<Double> = LinkedList<Double>()

    fun printFirst() {
        println(Container.peek())
    }
    fun historySize(): Int {
        return Container.size;
    }
    fun isHistoryEmpty(): Boolean {
        return Container.isEmpty()
    }
    fun enqueue(x: Double) {
        Container.add(x)
    }
    fun dequeue(): Double {
        return Container.remove();
    }
    fun printAll() {
        Container.forEach { element -> print("$element ") }
    }
    fun clear() {
        while(!isHistoryEmpty()) {
            Container.remove()
        }
    }
}