package cc.polyfrost.crashparser.data.sections.level

import cc.polyfrost.crashparser.data.*
import kotlin.js.JsExport

@JsExport
sealed class LevelAdditionalProperties {
    data class LevelProperties(
        val spawnLocation: Position,
        val levelTime: LevelTime,
        val levelName: String,
        val levelGameMode: LevelGameMode,
        val levelWeather: LevelWeather,
        val knownServerBrands: List<String>,
        val levelWasModded: Boolean,
        val levelStorageVersion: String
    ) : LevelAdditionalProperties()

    data class ClientLevelProperties(
        val spawnLocation: Position,
        val levelTime: LevelTime,
        val serverBrand: String,
        val serverType: ServerType
    ) : LevelAdditionalProperties()
}

