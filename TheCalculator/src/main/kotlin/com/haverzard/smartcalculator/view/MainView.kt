package com.haverzard.smartcalculator.view

import com.haverzard.smartcalculator.app.Styles
import com.haverzard.smartcalculator.history.History
import com.haverzard.smartcalculator.iohandler.*
import javafx.geometry.Insets
import javafx.geometry.Pos
import javafx.scene.control.Label
import tornadofx.*

class MainView : View() {
    private var x : Double = 0.0
    private var y : Double = 0.0
    private var ans = "0"
    private var history = History<String>()
    private var oHandler = OutputHandler(InputHandler())
    lateinit var output : Label
    lateinit var input : Label
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
        vbox {
            addClass(Styles.IOBox)
            vbox {
                vboxConstraints {
                    margin = Insets(0.0, 15.0, 0.0, 0.0)
                }
                style {
                    alignment = Pos.BOTTOM_RIGHT
                }
                input = label {
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
                output = label("0") {
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
            button("MC") {
                setOnMouseClicked {
                    history.enqueue(oHandler.text)
                }
            }
            button("MR") {
                setOnMouseClicked {
                    if (!history.isEmpty()) {
                        oHandler.replaceOutput(history.dequeue())
                        update()
                    }
                }
            }
            button("(") {
                setOnMouseClicked {
                    onAction("ob")
                }
            }
            button(")") {
                setOnMouseClicked {
                    onAction("cb")
                }
            }
            button("sin") {
                setOnMouseClicked {
                    onAction("u002")
                }
            }
            button("cos") {
                setOnMouseClicked {
                    onAction("u003")
                }
            }
            button("tan") {
                setOnMouseClicked {
                    onAction("u004")
                }
            }
            children.addClass(Styles.extendBtn)
        }
        setSpacing(5.0)
        hbox {
            style {
                alignment = Pos.CENTER
            }
            setSpacing(5.0)
            button("√") {
                setOnMouseClicked {
                    onAction("u006")
                }
            }
            button("x²") {
                setOnMouseClicked {
                    onAction("u005")
                }
            }
            button("C") {
                setOnMouseClicked {
                    oHandler.clear()
                    output.text = oHandler.text
                    input.text = oHandler.iHandler.text
                }
            }
            button("/") {
                setOnMouseClicked {
                    onAction("b004")
                }
            }
            children.addClass(Styles.stdBtn)
        }
        hbox {
            style {
                alignment = Pos.CENTER
            }
            setSpacing(5.0)
            button("7") {
                setOnMouseClicked {
                    onAction("7")
                }
            }
            button("8") {
                setOnMouseClicked {
                    onAction("8")
                }
            }
            button("9") {
                setOnMouseClicked {
                    onAction("9")
                }
            }
            children.addClass(Styles.stdNumberBtn)
            button("*") {
                setOnMouseClicked {
                    onAction("b003")
                }
            }
            children.addClass(Styles.stdOperatorBtn)
        }
        hbox {
            style {
                alignment = Pos.CENTER
            }
            setSpacing(5.0)
            button("4") {
                setOnMouseClicked {
                    onAction("4")
                }
            }
            button("5") {
                setOnMouseClicked {
                    onAction("5")
                }
            }
            button("6") {
                setOnMouseClicked {
                    onAction("6")
                }
            }
            children.addClass(Styles.stdNumberBtn)
            button("-") {
                setOnMouseClicked {
                    onAction("bu001")
                }
            }
            children.addClass(Styles.stdOperatorBtn)
        }
        hbox {
            style {
                alignment = Pos.CENTER
            }
            setSpacing(5.0)
            button("1") {
                setOnMouseClicked {
                    onAction("1")
                }
            }
            button("2") {
                setOnMouseClicked {
                    onAction("2")
                }
            }
            button("3") {
                setOnMouseClicked {
                    onAction("3")
                }
            }
            children.addClass(Styles.stdNumberBtn)
            button("+") {
                setOnMouseClicked {
                    onAction("b002")
                }
            }
            children.addClass(Styles.stdOperatorBtn)
        }
        hbox {
            style {
                alignment = Pos.CENTER
            }
            setSpacing(5.0)
            button("ans") {
                setOnMouseClicked {
                    oHandler.replaceOutput(ans)
                    update()
                }
            }
            button("0") {
                setOnMouseClicked {
                    onAction("0")
                }
            }
            button(".") {
                setOnMouseClicked {
                    onAction(".")
                }
            }
            children.addClass(Styles.stdNumberBtn)
            button("=") {
                setOnMouseClicked {
                    oHandler.solve()
                    ans = oHandler.text
                    update()
                }
            }
            children.addClass(Styles.stdResultBtn)
        }
    }

    fun onAction(x: String) {
        oHandler.enqueue(x)
        update()
    }

    fun update() {
        output.text = oHandler.text
        input.text = oHandler.iHandler.text
    }

    override val root = calculator
}