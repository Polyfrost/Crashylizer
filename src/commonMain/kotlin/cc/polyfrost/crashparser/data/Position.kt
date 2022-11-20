package cc.polyfrost.crashparser.data

import kotlin.js.JsExport

@JsExport
data class Position(
    val position: Coordinates3d,
    val chunkRelativeLocation: Coordinates3d,
    val chunkCoordinates: Coordinates3d,
    val chunkBlockRange: Coordinates3d,
    val region: Coordinates2d,
    val regionChunkRange: CoordinateRange<Coordinates2d, Coordinates2d>,
    val regionBlockRange: CoordinateRange<Coordinates3d, Coordinates3d>
)