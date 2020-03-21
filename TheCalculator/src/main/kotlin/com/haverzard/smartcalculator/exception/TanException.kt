package com.haverzard.smartcalculator.exception

import java.lang.Exception

class TanException(num: Double) : Exception(num.toString())