package net.konohana.sakuya.cerinthe.utils.farecalc

import net.konohana.sakuya.cerinthe.constant.TicketTypeCalcConst.Companion.CALC_TICKET_TYPE_ONEWAY
import net.konohana.sakuya.cerinthe.constant.TicketTypeCalcConst.Companion.CALC_TICKET_TYPE_ROUNDTRIP
import net.konohana.sakuya.cerinthe.plugins.TicketTypeNotApplicableException

/**
 * 半額運賃計算
 * @param fareHalf 半額運賃(一人あたり)
 * @param halfMember 半額乗車人員
 * @return 半額運賃合計
 */
fun halfFareCalc(fareHalf: Int, halfMember: Int, ticketType: String): Int {
    val fare = when(ticketType) {
        CALC_TICKET_TYPE_ONEWAY -> halfFareCalcOneway(fareHalf, halfMember)
        CALC_TICKET_TYPE_ROUNDTRIP -> halfFareCalcRoundTrip(fareHalf, halfMember)
        else -> throw TicketTypeNotApplicableException()
    }
    return fare
}

/**
 * 半額片道運賃計算
 * @param fareHalf 半額運賃(一人あたり)
 * @param halfMember 半額乗車人員
 * @return 半額片道運賃合計
 */
private fun halfFareCalcOneway(fareHalf: Int, halfMember: Int): Int {
    return fareHalf * halfMember
}

/**
 * 半額往復運賃計算
 * @param fareHalf 半額運賃(一人あたり)
 * @param halfMember 半額乗車人員
 * @return 半額往復運賃合計
 */
private fun halfFareCalcRoundTrip(fareHalf: Int, halfMember: Int): Int {
    /** 往復運賃計算用変数 */
    val calcRoundTrip = 2
    return fareHalf * calcRoundTrip * halfMember
}
