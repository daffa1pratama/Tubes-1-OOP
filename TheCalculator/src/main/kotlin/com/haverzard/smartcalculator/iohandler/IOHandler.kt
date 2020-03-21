package com.haverzard.smartcalculator.iohandler

import com.haverzard.smartcalculator.parser.CompanionParser

abstract class IOHandler {
    companion object : CompanionParser()
    var text = ""
    abstract fun solve()
    abstract fun clear()
}