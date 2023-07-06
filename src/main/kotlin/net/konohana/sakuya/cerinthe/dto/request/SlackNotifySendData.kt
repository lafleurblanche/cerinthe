package net.konohana.sakuya.cerinthe.dto.request

import kotlinx.serialization.Serializable

@Serializable
data class SlackNotifySendData(
    /** 発信番号 */
    val requestNo: String,
    /** 乗車駅 */
    val fromSta: String,
    /** 降車駅 */
    val toSta: String,
    /** 経路設定 */
    val viaRoute: String,
    /** 券面種別 */
    val ticketType: String,
    /** 利用日 */
    val dateOfUse: String,
    /** 営業キロ */
    val operationKilo: String,
    /** 運賃計算キロ */
    val fareCalcKilo: String,
    /** 運賃合計 */
    val totalFare: String,
)
