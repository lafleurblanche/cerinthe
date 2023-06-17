package net.konohana.sakuya.cerinthe.dto.response

import kotlinx.serialization.Serializable

/**
 * 運賃マスタIFレスポンス
 */
@Serializable
data class TiarellaApiResponse(
    /** 運賃計算キロ */
    val distance: String,
    /** 大人運賃 */
    val fareAdult: String,
    /** 半額運賃 */
    val fareHalf: String,
    /** 小児運賃 */
    val fareChild: String,
)
