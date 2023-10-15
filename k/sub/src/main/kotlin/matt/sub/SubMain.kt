package matt.sub

import javafx.application.Application
import javafx.geometry.Pos
import javafx.scene.Scene
import javafx.scene.layout.VBox
import javafx.stage.Stage


fun main() {
    Application.launch(App::class.java)
}

class App : Application() {
    override fun start(primaryStage: Stage?) {
        primaryStage!!.apply {
            title = "stage title"
            scene = Scene(VBox().apply {
                alignment = Pos.TOP_CENTER
                prefWidth = 300.0
                prefHeight = 300.0
            })
        }.show()
    }
}