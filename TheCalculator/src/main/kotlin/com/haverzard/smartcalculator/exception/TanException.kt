package com.haverzard.smartcalculator.exception

import java.lang.Exception

// Kelas TanException
// Untuk menangani kasus sudut tan 90 + 180n
class TanException(num: Double) : Exception(num.toString())
