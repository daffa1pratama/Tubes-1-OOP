package com.haverzard.smartcalculator.exception

import java.lang.Exception

// Kelas DivisionException
// Untuk menangani kasus pembagi = 0
class DivisionException(num: Double) : Exception(num.toString())