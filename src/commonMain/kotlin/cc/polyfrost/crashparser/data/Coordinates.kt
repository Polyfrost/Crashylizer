package cc.polyfrost.crashparser.data

import kotlin.js.JsExport

@JsExport
sealed class Coordinates

@JsExport
data class Coordinates3d(
    val x: Int,
    val y: Int,
    val z: Int,
) : Coordinates()

@JsExport
data class Coordinates2d(
    val x: Int,
    val z: Int
) : Coordinates()

@JsExport
data class CoordinateRange<F : Coordinates, S : Coordinates>(
    val first: F,
    val second: S
)