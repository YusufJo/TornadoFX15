import javafx.stage.Stage
import javafx.stage.StageStyle
import tornadofx.App
import view.MainView

class MyApp : App(MainView::class, Styles::class) {
    override fun start(stage: Stage) {
        System.setProperty("prism.lcdtext", "false")

        with(stage) {
            width = 100.0
            height = 50.0
        }
        super.start(stage)
    }
}