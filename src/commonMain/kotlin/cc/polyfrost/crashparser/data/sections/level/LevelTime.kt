package cc.polyfrost.crashparser.data.sections.level

import kotlin.js.JsExport

@JsExport
data class LevelTime(
    val gameTime: Int,
    val dayTime: Int
)
