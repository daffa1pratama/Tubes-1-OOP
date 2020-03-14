package com.haverzard.SmartCalculator.app

import com.haverzard.SmartCalculator.view.MainView
import javafx.scene.Scene
import javafx.scene.layout.BorderPane
import javafx.scene.paint.Color
import javafx.stage.Stage
import javafx.stage.StageStyle
import tornadofx.App

class MyApp: App(MainView::class, Styles::class) {
    override fun start(stage: Stage) {
        stage.initStyle(StageStyle.UNDECORATED)
        stage.isResizable = false
        stage.opacity = 0.9
        super.start(stage)
    }
}