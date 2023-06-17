package net.konohana.sakuya.cerinthe.dto.response

import kotlinx.serialization.Serializable

/**
 * 営業キロ情報IFレスポンス
 */
@Serializable
data class PhaceliaFareDistResponse(
    val id: Int,
    val staCode: String,
    val staName: String,
    val strtPtStaCode: String,
    val distance: Double,
)
