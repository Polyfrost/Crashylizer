package cc.polyfrost.crashparser

import kotlin.js.JsExport

@JsExport
data class MinecraftLog(
    val text: String
) {
    fun parse(): ParsedLog {
        TODO()
    }
}
