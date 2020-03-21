package com.haverzard.smartcalculator.history

import java.util.Queue
import java.util.LinkedList

class History<T>() {
    private val container : Queue<T> = LinkedList<T>()

    fun historySize(): Int {
        return container.size;
    }
    fun isEmpty(): Boolean {
        return container.isEmpty()
    }
    fun enqueue(x: T) {
        container.add(x)
    }
    fun dequeue(): T? {
        if (!isEmpty()) return container.remove()
        return null
    }
    fun clear() {
        container.clear()
    }
}