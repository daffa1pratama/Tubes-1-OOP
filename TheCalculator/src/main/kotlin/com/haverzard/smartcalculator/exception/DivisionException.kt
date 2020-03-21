package com.haverzard.smartcalculator.exception

import java.lang.Exception

class DivisionException(num: Double) : Exception(num.toString())