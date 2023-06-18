package net.konohana.sakuya.cerinthe.dto.response

import kotlinx.serialization.Serializable

@Serializable
data class CerintheAPIResponse(
    val status: String,
    val result: String,
    val reqNo: String,
)
