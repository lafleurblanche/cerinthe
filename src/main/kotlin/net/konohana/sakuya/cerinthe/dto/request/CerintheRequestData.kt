package net.konohana.sakuya.cerinthe.dto.request

import kotlinx.serialization.Serializable

@Serializable
data class CerintheRequestData(
    /** 乗車駅 */
    val fromSta: String,
    /** 降車駅 */
    val toSta: String,
    /** 経路設定 */
    val viaRouteConfig: String,
    /** 大人乗車人員 */
    val adultMember: String,
    /** 半額乗車人員 */
    val halfMember: String,
    /** 小児乗車人員 */
    val childMember: String,
    /** 乗車日 */
    val dateOfUse: String,
    /** 券面種別 */
    val ticketType: String,
    /** 乗車駅コード */
    val fromStaCode: String,
    /** 降車駅コード */
    val toStaCode: String,
    /** 経由路線コード */
    val viaRouteCode: String,
    /** 割引種別 */
    val discountCode: String,
    /** 後払種別 */
    val postPayCode: String,
    /** 特記事項 */
    val specialNote: String,
    /** 系統会社区分 */
    val sectorKbn: String,
)
