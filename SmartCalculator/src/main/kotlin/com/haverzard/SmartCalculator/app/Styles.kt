package com.haverzard.SmartCalculator.app

import javafx.geometry.Pos
import javafx.scene.paint.Color
import javafx.scene.text.FontWeight
import javafx.scene.text.TextAlignment
import tornadofx.*

class Styles : Stylesheet() {
    companion object {
        val stdBtn by cssclass()
        val stdOperatorBtn by cssclass()
        val stdNumberBtn by cssclass()
        val stdResultBtn by cssclass()
        val extendBtn by cssclass()
        val history by cssclass()
        val IOBox by cssclass()
        val inputText by cssclass()
        val outputText by cssclass()
        val historyBox by cssclass()
        val exit by cssclass()
    }

    init {
        text {
            fill = Color.WHITE
        }
        stdBtn {
            minWidth = 10.em
            minHeight = 5.em
            fontSize = (1.3).em
            backgroundColor += c("#121212")
            and(hover) {
                backgroundColor += c("#555")
            }
        }
        stdOperatorBtn {
            minWidth = 10.em
            minHeight = 5.em
            fontSize = (2.1).em
            backgroundColor += c("#121212")
            and(hover) {
                backgroundColor += c("#555")
            }
        }
        stdResultBtn {
            minWidth = 10.em
            minHeight = 5.em
            fontSize = (2.1).em
            backgroundColor += c("#202a45")
            and(hover) {
                backgroundColor += c("#46598f")
            }
        }
        stdNumberBtn {
            minWidth = 10.em
            minHeight = 5.em
            fontSize = (1.5).em
            fontWeight = FontWeight.BOLD
            backgroundColor += Color.BLACK
            and(hover) {
                backgroundColor += c("#555")
            }
        }
        extendBtn {
            minWidth = 5.em
            minHeight = 3.em
            fontSize = (1.1).em
            backgroundColor += c("#222")
            and(hover) {
                backgroundColor += c("#555")
            }
        }
        history {
            alignment = Pos.CENTER
            minWidth = (3.5).em
            minHeight = (3.5).em
            and(hover) {
                backgroundColor += c("#555")
            }
        }
        IOBox {
            alignment = Pos.BOTTOM_CENTER
            minHeight = 9.em
            minWidth = 24.em
        }
        inputText {
            fontSize = (1.5).em
        }
        outputText {
            fontSize = 4.em
            //fontWeight = FontWeight.BOLD
        }
        exit {
            alignment = Pos.CENTER
            fontSize = 2.em
            minHeight = (2.7).em
            minWidth = 4.em
            and(hover) {
                backgroundColor += c("#A00")
            }
        }
        historyBox {
            alignment = Pos.BOTTOM_CENTER
            minHeight = 25.em
            minWidth = 24.em
        }
    }
}