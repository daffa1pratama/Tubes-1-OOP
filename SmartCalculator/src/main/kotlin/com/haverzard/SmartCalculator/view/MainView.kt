package com.haverzard.SmartCalculator.view

import com.haverzard.SmartCalculator.app.Styles
import com.sun.xml.internal.ws.streaming.XMLStreamReaderUtil.close
import javafx.beans.property.ReadOnlyDoubleProperty
import javafx.beans.property.ReadOnlyProperty
import javafx.geometry.Insets
import javafx.geometry.Pos
import javafx.scene.Scene
import javafx.scene.layout.HBox
import javafx.scene.paint.Color
import javafx.scene.text.TextAlignment
import javafx.stage.Stage
import tornadofx.*
import java.awt.event.MouseEvent
import javax.swing.GroupLayout
import javax.swing.text.html.ImageView

class MainView : View() {
    private var x : Double = 0.0
    private var y : Double = 0.0
    private val inputText = "12 *"
    private val outputText = "12345"

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
                imageview("exit.png") {
                    style {
                        maxHeight = 1.em
                    }
                }
                setOnMouseClicked {
                    currentStage?.close()
                }
            }
        }

        vbox {
            vboxConstraints {
                margin = Insets(10.0, 0.0, 10.0, 0.0)
            }
            addClass(Styles.IOBox)
            vbox {
                style {
                    alignment = Pos.BOTTOM_RIGHT
                }
                label(inputText) {
                    addClass(Styles.inputText)
                }
            }
            vbox {
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
        hbox {
            setSpacing(4.0)
            button("C")
            button("x²")
            button("√")
            button("/")
            children.addClass(Styles.stdBtn)
        }
        hbox {
            setSpacing(4.0)
            button("7")
            button("8")
            button("9")
            button("*")
            children.addClass(Styles.stdBtn)
        }
        hbox {
            setSpacing(4.0)
            button("4")
            button("5")
            button("6")
            button("+")
            children.addClass(Styles.stdBtn)
        }
        hbox {
            setSpacing(4.0)
            button("1")
            button("2")
            button("3")
            button("-")
            children.addClass(Styles.stdBtn)
        }
        hbox {
            setSpacing(4.0)
            button("%")
            button("0")
            button(".")
            button("=")
            children.addClass(Styles.stdBtn)
        }
    }

    override val root = calculator
}