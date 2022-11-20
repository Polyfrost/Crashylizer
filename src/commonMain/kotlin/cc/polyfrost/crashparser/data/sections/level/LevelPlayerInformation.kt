package cc.polyfrost.crashparser.data.sections.level

import kotlin.js.JsExport

@JsExport
data class LevelPlayerInformation(
    val name: String,
    val id: Int,
    val level: String?,
    val x: Int,
    val y: Int,
    val z: Int,
    val removalReason: String?
)