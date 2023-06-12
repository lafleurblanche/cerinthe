package net.konohana.sakuya.cerinthe.utils.farecalc

import net.konohana.sakuya.cerinthe.constant.TicketTypeCalcConst.Companion.CALC_TICKET_TYPE_ONEWAY
import net.konohana.sakuya.cerinthe.constant.TicketTypeCalcConst.Companion.CALC_TICKET_TYPE_ROUNDTRIP
import net.konohana.sakuya.cerinthe.plugins.TicketTypeNotApplicableException

/**
 * 小児運賃計算
 * @param fareChild 小児運賃(一人あたり)
 * @param childMember 小児乗車人員
 * @return 小児運賃合計
 */
fun childFareCalc(fareChild: Int, childMember: Int, ticketType: String): Int {
    val fare = when(ticketType) {
        CALC_TICKET_TYPE_ONEWAY -> childFareCalcOneway(fareChild, childMember)
        CALC_TICKET_TYPE_ROUNDTRIP -> childFareCalcRoundTrip(fareChild, childMember)
        else -> throw TicketTypeNotApplicableException()
    }
    return fare
}

/**
 * 小児片道運賃計算
 * @param fareChild 小児運賃(一人あたり)
 * @param childMember 小児乗車人員
 * @return 小児片道運賃合計
 */
private fun childFareCalcOneway(fareChild: Int, childMember: Int): Int {
    return fareChild * childMember
}

/**
 * 小児往復運賃計算
 * @param fareChild 小児運賃(一人あたり)
 * @param childMember 小児乗車人員
 * @return 小児往復運賃合計
 */
private fun childFareCalcRoundTrip(fareChild: Int, childMember: Int): Int {
    /** 往復運賃計算用変数 */
    val calcRoundTrip = 2
    return fareChild * calcRoundTrip * childMember
}
