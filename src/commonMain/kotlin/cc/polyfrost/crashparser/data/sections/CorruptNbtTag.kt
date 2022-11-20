package cc.polyfrost.crashparser.data.sections

import kotlin.js.JsExport

@JsExport
data class CorruptNbtTag(
    val typeFound: String,
    val typeExpected: String,
    val name: String
)
