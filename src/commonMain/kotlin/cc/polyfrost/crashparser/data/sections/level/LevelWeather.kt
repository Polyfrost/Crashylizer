package cc.polyfrost.crashparser.data.sections.level

import kotlin.js.JsExport

@JsExport
data class LevelWeather(
    val rainTime: Int,
    val raining: Boolean,
    val thunderTime: Int,
    val thundering: Boolean
)
