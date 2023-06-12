package net.konohana.sakuya.cerinthe.utils.farecalc

import net.konohana.sakuya.cerinthe.constant.TicketTypeCalcConst.Companion.CALC_TICKET_TYPE_ONEWAY
import net.konohana.sakuya.cerinthe.constant.TicketTypeCalcConst.Companion.CALC_TICKET_TYPE_ROUNDTRIP
import net.konohana.sakuya.cerinthe.plugins.TicketTypeNotApplicableException

/**
 * 大人運賃計算
 * @param fareAdult 大人運賃(一人あたり)
 * @param adultMember 大人乗車人員
 * @return 大人運賃合計
 */
fun adultFareCalc(fareAdult: Int, adultMember: Int, ticketType: String): Int {
    val fare = when(ticketType) {
        CALC_TICKET_TYPE_ONEWAY -> adultFareCalcOneway(fareAdult, adultMember)
        CALC_TICKET_TYPE_ROUNDTRIP -> adultFareCalcRoundTrip(fareAdult, adultMember)
        else -> throw TicketTypeNotApplicableException()
    }
    return fare
}

/**
 * 大人片道運賃計算
 * @param fareAdult 大人運賃(一人あたり)
 * @param adultMember 大人乗車人員
 * @return 大人片道運賃合計
 */
private fun adultFareCalcOneway(fareAdult: Int, adultMember: Int): Int {
    return fareAdult * adultMember
}

/**
 * 大人往復運賃計算
 * @param fareAdult 大人運賃(一人あたり)
 * @param adultMember 大人乗車人員
 * @return 大人往復運賃合計
 */
private fun adultFareCalcRoundTrip(fareAdult: Int, adultMember: Int): Int {
    /** 往復運賃計算用変数 */
    val calcRoundTrip = 2
    return fareAdult * calcRoundTrip * adultMember
}
