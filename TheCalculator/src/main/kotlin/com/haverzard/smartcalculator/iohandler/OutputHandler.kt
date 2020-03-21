package com.haverzard.smartcalculator.iohandler

import java.lang.Double.parseDouble
import java.lang.NumberFormatException

class OutputHandler: IOHandler {
    var solved = false
    var iHandler : InputHandler
    var error = false
    constructor (x : InputHandler) {
        iHandler = x
        text = "0"
    }

    fun dequeue() {
        if (!text.isEmpty()) iHandler.enqueue(text)
    }

    private fun isEmpty() : Boolean {
        return text == "0"
    }

    fun enqueue(x: String) {
        when {
            (x == ".") -> {
                if (isEmpty()) text = ""
                text += if (text.isNotEmpty()) {
                    x
                } else {
                    "0$x"
                }
            }
            (isNumber(x)) -> {
                if (isEmpty()) text = ""
                if (!closeBracket(iHandler.peeking())) {
                    text = if (solved) {
                        x
                    } else {
                        text + x
                    }
                    solved = false
                }
            }
            (openBracket(x)) -> {
                if (isEmpty() && !closeBracket(iHandler.peeking())) {
                    iHandler.enqueue(x)
                }
            }
            (closeBracket(x)) -> {
                if (iHandler.getBracketCounts() > 0) {
                    if (closeBracket(iHandler.peeking())) {
                        iHandler.enqueue(x)
                        text = "0"
                    } else if (text.isNotEmpty()) {
                        dequeue()
                        iHandler.enqueue(x)
                        text = "0"
                    }
                }
            }
            else -> operatorEnqueue(x)
        }
        //println(text)
        iHandler.stringInput()
    }

    private fun operatorEnqueue(x: String) {
        if (!isEmpty()) {
            if (isBinary(x)) {
                dequeue()
                binaryEnqueue(x)
            }
        } else {
            if (openBracket(iHandler.peeking()) && isUnary(x)) {
                unaryEnqueue(x)
            } else if (closeBracket(iHandler.peeking()) && isBinary(x)) {
                binaryEnqueue(x)
            } else if (isUnary(iHandler.peeking()) && isUnary(x)) {
                if (isBinary(x)) iHandler.replace(x.substring(1))
                else iHandler.replace(x)
            } else if (!openBracket(iHandler.peeking()) && !isUnary(iHandler.peeking()) && !closeBracket(iHandler.peeking())) {
                if (isBinary(iHandler.peeking())) {
                    when {
                        (isBinary(x) && !isUnary(x)) -> {
                            iHandler.replace(x)
                        }
                        (isUnary(x)) -> unaryEnqueue(x)
                    }
                } else if (isUnary(x)) {
                    unaryEnqueue(x)
                }
            }
        }
        text = "0"
    }

    private fun unaryEnqueue(x: String) {
        if (isBinary(x)) iHandler.enqueue(x.substring(1))
        else iHandler.enqueue(x)
    }

    private fun binaryEnqueue(x: String) {
        if (isUnary(x)) iHandler.enqueue("b"+x.substring(2))
        else iHandler.enqueue(x)
    }

    fun replaceOutput(x: String) {
        text = x
        error = false
    }

    override fun solve() {
        if (iHandler.getBracketCounts() == 0) {
            if (isEmpty() && closeBracket(iHandler.peeking())) {
                iHandler.solve()
                text = iHandler.text
                iHandler.text = ""
                solved = true
            } else if (text.isNotEmpty()) {
                dequeue()
                iHandler.solve()
                text = iHandler.text
                iHandler.text = ""
                solved = true
            }
        }
        checkError()
    }

    override fun clear() {
        text = "0"
        iHandler.clear()
    }

    fun checkError() {
        try {
            parseDouble(text)
        } catch (e: NumberFormatException) {
            error = true
        }
    }
}