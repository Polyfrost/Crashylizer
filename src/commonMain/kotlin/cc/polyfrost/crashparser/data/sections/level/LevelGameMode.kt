package cc.polyfrost.crashparser.data.sections.level

import kotlin.js.JsExport

@JsExport
data class LevelGameMode(
    val gameMode: String,
    val gameModeId: Int,
    val hardcore: Boolean,
    val cheats: Boolean
)
