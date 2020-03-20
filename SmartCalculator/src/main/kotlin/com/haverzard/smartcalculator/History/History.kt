package com.haverzard.smartcalculator.History

import java.util.Queue
import java.util.LinkedList

class History <T> {
    private val container : Queue<T> = LinkedList<T>()

    fun printFirst() {
        println(container.peek())
    }
    fun historySize(): Int {
        return container.size;
    }
    fun isEmpty(): Boolean {
        return container.isEmpty()
    }
    fun enqueue(x: T) {
        container.add(x)
    }
    fun dequeue(): T {
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