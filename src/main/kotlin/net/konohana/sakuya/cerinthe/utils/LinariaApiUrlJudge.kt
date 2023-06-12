package net.konohana.sakuya.cerinthe.utils

import net.konohana.sakuya.cerinthe.constant.PassengerGroupConst.Companion.PASSENGER_GROUP_ADULT
import net.konohana.sakuya.cerinthe.constant.PassengerGroupConst.Companion.PASSENGER_GROUP_CHILD
import net.konohana.sakuya.cerinthe.constant.PassengerGroupConst.Companion.PASSENGER_GROUP_HALF
import net.konohana.sakuya.cerinthe.constant.PassengerKbnConst
import net.konohana.sakuya.cerinthe.constant.ServiceBaseUrlConst
import net.konohana.sakuya.cerinthe.constant.TicketTypeConst

/**
 * APIURL判定処理
 * @author lafleurblanche
 */
fun linariaApiUrlJudge(ticketType: String, passengerGrp: String, sectorKbn: String): String {
    val ticketTypeMap = mapOf(
        "片道乗車券" to TicketTypeConst.TICKET_TYPE_ONEWAY,
        "往復乗車券" to TicketTypeConst.TICKET_TYPE_ROUNDTRIP,
        "分割乗車券" to TicketTypeConst.TICKET_TYPE_FRAGMENT,
    )
    val passengerKbnMap = mapOf(
        PASSENGER_GROUP_ADULT to PassengerKbnConst.PASSENGER_KBN_ADULT,
        PASSENGER_GROUP_HALF to PassengerKbnConst.PASSENGER_KBN_HALF,
        PASSENGER_GROUP_CHILD to PassengerKbnConst.PASSENGER_KBN_CHILD,
    )
    val linariaUrlMap = mapOf(
        "ARGW" to ServiceBaseUrlConst.LINARIA_SERVER_BASE_ARGW_URL,
        "ENJU" to ServiceBaseUrlConst.LINARIA_SERVER_BASE_ENJU_URL,
    )
    val ticketTypePrefixUrl = ticketTypeMap.getOrDefault(ticketType, "NotFound")
    val passengerKbnPrefixUrl = passengerKbnMap.getOrDefault(passengerGrp, "NotFound")
    val linariaBaseUrl = linariaUrlMap.getOrDefault(sectorKbn, "NotFound")
    return buildString {
        append(linariaBaseUrl)
        append(passengerKbnPrefixUrl)
        append(ticketTypePrefixUrl)
    }
}
