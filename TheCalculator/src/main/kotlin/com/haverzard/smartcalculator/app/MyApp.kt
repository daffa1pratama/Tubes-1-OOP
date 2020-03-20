package com.haverzard.smartcalculator.app

import com.haverzard.smartcalculator.view.MainView
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