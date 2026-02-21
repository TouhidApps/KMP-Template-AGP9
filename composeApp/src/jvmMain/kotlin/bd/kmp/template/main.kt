package bd.kmp.template

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "KMP-Template9",
    ) {
        App()
    }
}