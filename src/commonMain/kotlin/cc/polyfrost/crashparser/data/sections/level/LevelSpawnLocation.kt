package cc.polyfrost.crashparser.data.sections.level

import kotlin.js.JsExport

@JsExport
data class LevelSpawnLocation(
    val x: Int,
    val y: Int,
    val z: Int,
    val chunkX: Int,
)
