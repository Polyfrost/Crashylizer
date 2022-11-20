package cc.polyfrost.crashparser.data.sections.level

import kotlin.js.JsExport

@JsExport
sealed class LevelChunkStats {
    data class ServerChunkStats(val loadedChunks: Int) : LevelChunkStats()
    data class ClientChunkStats(val chunkMapLength: Int, val loadedChunks: Int) : LevelChunkStats()
}