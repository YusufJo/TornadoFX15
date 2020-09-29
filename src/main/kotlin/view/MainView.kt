package view

import tornadofx.*

class MainView : View("My View") {
    override val root = borderpane {
        center {
            label("Hello, again!")
        }
    }
}
