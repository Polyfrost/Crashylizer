package cc.polyfrost.crashparser.data.sections

import cc.polyfrost.crashparser.data.sections.level.*
import kotlin.js.JsExport

@JsExport
data class AffectedLevel(
    val players: Array<LevelPlayerInformation>,
    val chunkStats: LevelChunkStats,
    val dimension: String,
    val properties: LevelAdditionalProperties
) {
    // I have to use an array for this because List is non-exportable in JS, but Array in JVM also has fucky equality checks
    // The below was all autogenerated by intellij

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as AffectedLevel

        if (!players.contentEquals(other.players)) return false
        if (chunkStats != other.chunkStats) return false
        if (dimension != other.dimension) return false
        if (properties != other.properties) return false

        return true
    }

    override fun hashCode(): Int {
        var result = players.contentHashCode()
        result = 31 * result + chunkStats.hashCode()
        result = 31 * result + dimension.hashCode()
        result = 31 * result + properties.hashCode()
        return result
    }
}