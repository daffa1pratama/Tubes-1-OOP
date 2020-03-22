package com.haverzard.smartcalculator.exception

import java.lang.Exception

// Kelas ImaginaryException
// Untuk menangani kasus yang didalam akar bernilai negatif
class ImaginaryException(num: Double) : Exception(num.toString())