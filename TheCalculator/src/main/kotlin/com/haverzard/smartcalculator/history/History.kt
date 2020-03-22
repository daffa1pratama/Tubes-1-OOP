package com.haverzard.smartcalculator.history

import java.util.Queue
import java.util.LinkedList

// Kelas History
// Menyimpan history perhitungan
class History<T>() {
    private val container : Queue<T> = LinkedList<T>()

    fun historySize(): Int {
        // Menghitung ukuran container
        return container.size;
    }
    fun isEmpty(): Boolean {
        // Mengecek container kosong atau tidak
        return container.isEmpty()
    }
    fun enqueue(x: T) {
        // Menambahkan x ke queue
        container.add(x)
    }
    fun dequeue(): T? {
        // Mengeluarkan elemen head dari queue
        if (!isEmpty()) return container.remove()
        return null
    }
    fun clear() {
        // Menghapus semua isi queue
        container.clear()
    }
}