package com.haverzard.smartcalculator.view

import com.haverzard.smartcalculator.app.Styles
import javafx.geometry.Insets
import javafx.geometry.Pos
import tornadofx.*

class MainView : View() {
    private var x : Double = 0.0
    private var y : Double = 0.0
    private var inputText = "12 *"
    private var outputText = "12345"
    private val calculator = vbox {
        style {
            backgroundColor += c("#222")
            alignment = Pos.CENTER
        }
        borderpane {
            setOnMousePressed {
                x = it.sceneX
                y = it.sceneY
            }
            setOnMouseDragged {
                currentStage?.x = it.screenX - x
                currentStage?.y = it.screenY - y
            }
            style {
                minHeight = (2.5).em
            }
            left = vbox {
                style {
                    alignment = Pos.CENTER
                }
                label("SmartCalculator") {
                    style{
                        padding = box(0.em,0.em,0.em,1.em)
                    }
                }
            }
            right = vbox {
                addClass(Styles.exit)
                imageview("Exit.png")
                setOnMouseClicked {
                    currentStage?.close()
                }
            }
        }
        borderpane {
            right = vbox {
                addClass(Styles.history)
                imageview("History.png")
            }
        }
        vbox {
            addClass(Styles.IOBox)
            vbox {
                vboxConstraints {
                    margin = Insets(0.0, 15.0, 0.0, 0.0)
                }
                style {
                    alignment = Pos.BOTTOM_RIGHT
                }
                label(inputText) {
                    addClass(Styles.inputText)
                }
            }
            vbox {
                vboxConstraints {
                    margin = Insets(0.0, 10.0, 0.0, 10.0)
                }
                style {
                    alignment = Pos.BOTTOM_RIGHT
                }
                label(outputText) {
                    addClass(Styles.outputText)
                }
            }
        }
        setSpacing(5.0)
        hbox {
            style {
                alignment = Pos.CENTER
            }
            setSpacing(12.0)
            button("MC")
            button("MR")
            button("M")
            button("sin")
            button("cos")
            button("tan")
            button("Ans")
            children.addClass(Styles.extendBtn)
        }
        setSpacing(5.0)
        hbox {
            style {
                alignment = Pos.CENTER
            }
            setSpacing(5.0)
            button("√")
            button("x²")
            button("C")
            button("/")
            children.addClass(Styles.stdBtn)
        }
        hbox {
            style {
                alignment = Pos.CENTER
            }
            setSpacing(5.0)
            button("7")
            button("8")
            button("9")
            children.addClass(Styles.stdNumberBtn)
            button("*")
            children.addClass(Styles.stdOperatorBtn)
        }
        hbox {
            style {
                alignment = Pos.CENTER
            }
            setSpacing(5.0)
            button("4")
            button("5")
            button("6")
            children.addClass(Styles.stdNumberBtn)
            button("-")
            children.addClass(Styles.stdOperatorBtn)
        }
        hbox {
            style {
                alignment = Pos.CENTER
            }
            setSpacing(5.0)
            button("1")
            button("2")
            button("3")
            children.addClass(Styles.stdNumberBtn)
            button("+")
            children.addClass(Styles.stdOperatorBtn)
        }
        hbox {
            style {
                alignment = Pos.CENTER
            }
            setSpacing(5.0)
            button("%")
            button("0")
            button(".")
            children.addClass(Styles.stdNumberBtn)
            button("=")
            children.addClass(Styles.stdResultBtn)
        }
    }

    override val root = calculator
}