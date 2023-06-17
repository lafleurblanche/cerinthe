package net.konohana.sakuya.cerinthe.utils

import net.konohana.sakuya.cerinthe.constant.IndexConst.Companion.INDEX_END
import net.konohana.sakuya.cerinthe.constant.IndexConst.Companion.INDEX_START
import net.konohana.sakuya.cerinthe.constant.ServiceBaseUrlConst.Companion.PHACERIA_SERVER_BASE_URL
import net.konohana.sakuya.cerinthe.constant.UrlPrefixConst

/**
 * ## APIURL判定処理
 * * 支線連絡系統
 * @author lafleurblanche
 */
fun apiUrlArgwJudge(from: String, to: String): Pair<String, String> {
    val fromRoute = from.substring(INDEX_START,INDEX_END)
    val toRoute = to.substring(INDEX_START,INDEX_END)
    val apiUrlPrefixMap = mapOf(
        "GW01" to UrlPrefixConst.FAREDIST_AREAGW_GW01
    )
    val fromRoutePrefixUrl = apiUrlPrefixMap.getOrDefault(fromRoute, "NotFound")
    val toRoutePrefixUrl = apiUrlPrefixMap.getOrDefault(toRoute, "NotFound")
    val fromRouteUrl = PHACERIA_SERVER_BASE_URL + fromRoutePrefixUrl + from
    val toRouteUrl = PHACERIA_SERVER_BASE_URL + toRoutePrefixUrl + to
    return Pair(fromRouteUrl, toRouteUrl)
}
