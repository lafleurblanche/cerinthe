package net.konohana.sakuya.cerinthe.dto.request

import kotlinx.serialization.Serializable

/**
 * ## 発信番号登録IFリクエストデータ
 * @author lafleurblanche
 */
@Serializable
data class LimoniumRequestData(
    /** 発信番号 */
    val requestNumber: String,
    /** 乗車駅 */
    val fromSta: String,
    /** 降車駅 */
    val toSta: String,
    /** 経由路線 */
    val viaRoute: String,
    /** 大人乗車人員 */
    val adultMember: String,
    /** 半額乗車人員 */
    val halfMember: String,
    /** 小児乗車人員 */
    val childMember: String,
    /** 利用日 */
    val dateOfUse: String,
    /** 運賃合計 */
    val totalFare: String,
    /** 大人運賃基準額 */
    val baseFareAdult: String,
    /** 半額運賃基準額 */
    val baseFareHalf: String,
    /** 小児運賃基準額 */
    val baseFareChild: String,
)
