package com.example.kmpwithweb.data

import kotlinx.serialization.Serializable
import kotlin.js.JsExport

@JsExport
@Serializable
data class Pokemon(val name: String)