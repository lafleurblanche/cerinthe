package net.konohana.sakuya.cerinthe.dto.response

import kotlinx.serialization.Serializable

/**
 * 発信番号採番IFレスポンス
 */
@Serializable
data class LinariaApiResponse(
    /** 発信番号 */
    val ticketNum: String,
)
