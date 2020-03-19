package com.haverzard.SmartCalculator.History

import java.util.Queue
import java.util.LinkedList

class History {
    private val container : Queue<Double> = LinkedList<Double>()

    fun printFirst() {
        println(container.peek())
    }
    fun historySize(): Int {
        return container.size;
    }
    fun isEmpty(): Boolean {
        return container.isEmpty()
    }
    fun enqueue(x: Double) {
        container.add(x)
    }
    fun dequeue(): Double {
        return container.remove();
    }
    fun printAll() {
        container.forEach { element -> print("$element ") }
    }
    fun clear() {
        while(!isEmpty()) {
            container.remove()
        }
    }
}