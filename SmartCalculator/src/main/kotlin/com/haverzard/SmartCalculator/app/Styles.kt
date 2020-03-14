package com.haverzard.SmartCalculator.app

import javafx.geometry.Pos
import javafx.scene.paint.Color
import javafx.scene.text.FontWeight
import javafx.scene.text.TextAlignment
import tornadofx.*

class Styles : Stylesheet() {
    companion object {
        val stdBtn by cssclass()
        val extendBtn by cssclass()
        val IOBox by cssclass()
        val inputText by cssclass()
        val outputText by cssclass()
        val exit by cssclass()
    }

    init {
        text {
            fill = Color.WHITE
        }
        stdBtn {
            fontFamily = "Courier New"
            minWidth = 10.em
            minHeight = 5.em
            fontSize = (1.5).em
            backgroundColor += Color.BLACK
            and(hover) {
                backgroundColor += c("#333")
            }
        }
        extendBtn {
            fontFamily = "Courier New"
            minWidth = 5.em
            minHeight = 3.em
            fontSize = (1.5).em
            backgroundColor += c("#222")
            and(hover) {
                backgroundColor += c("#555")
            }
        }
        IOBox {
            alignment = Pos.BOTTOM_CENTER
            minHeight = 9.em
            minWidth = 24.em
            borderColor += box(c("#AAA"))
        }
        inputText {
            fontFamily = "Courier New"
            fontSize = (1.5).em
        }
        outputText {
            fontFamily = "Courier New"
            fontSize = 4.em
        }
        exit {
            alignment = Pos.CENTER
            minWidth = 5.em
            and(hover) {
                backgroundColor += c("#A00")
            }
        }
    }
}