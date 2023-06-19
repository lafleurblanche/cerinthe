package net.konohana.sakuya.cerinthe.utils

import net.konohana.sakuya.cerinthe.constant.IndexConst
import net.konohana.sakuya.cerinthe.constant.ServiceBaseUrlConst
import net.konohana.sakuya.cerinthe.constant.UrlPrefixConst

/**
 * ## APIURL判定処理
 * * えんじゅ交通
 * @author lafleurblanche
 */
fun apiUrlEnjuJudge(from: String, to: String): Pair<String, String> {
    val fromRoute = from.substring(IndexConst.INDEX_START, IndexConst.INDEX_END)
    val toRoute = to.substring(IndexConst.INDEX_START, IndexConst.INDEX_END)
    val apiUrlPrefixMap = mapOf(
        "RW01" to UrlPrefixConst.FAREDIST_ENJURW_RW01,
        "RW02" to UrlPrefixConst.FAREDIST_ENJURW_RW02,
        "RW03" to UrlPrefixConst.FAREDIST_ENJURW_RW03,
        "RW04" to UrlPrefixConst.FAREDIST_ENJURW_RW04,
        "RW05" to UrlPrefixConst.FAREDIST_ENJURW_RW05,
        "RW06" to UrlPrefixConst.FAREDIST_ENJURW_RW06,
        "RW07" to UrlPrefixConst.FAREDIST_ENJURW_RW07,
        "RW08" to UrlPrefixConst.FAREDIST_ENJURW_RW08,
        "RW09" to UrlPrefixConst.FAREDIST_ENJURW_RW09,
        "RW10" to UrlPrefixConst.FAREDIST_ENJURW_RW10,
        "RW11" to UrlPrefixConst.FAREDIST_ENJURW_RW11,
        "RW12" to UrlPrefixConst.FAREDIST_ENJURW_RW12,
        "RW13" to UrlPrefixConst.FAREDIST_ENJURW_RW13,
        "RW14" to UrlPrefixConst.FAREDIST_ENJURW_RW14,
        "RW15" to UrlPrefixConst.FAREDIST_ENJURW_RW15,
        "RW16" to UrlPrefixConst.FAREDIST_ENJURW_RW16,
        "RW17" to UrlPrefixConst.FAREDIST_ENJURW_RW17,
        "RW18" to UrlPrefixConst.FAREDIST_ENJURW_RW18,
        "RW19" to UrlPrefixConst.FAREDIST_ENJURW_RW19,
    )
    val fromRoutePrefixUrl = apiUrlPrefixMap.getOrDefault(fromRoute, "NotFound")
    val toRoutePrefixUrl = apiUrlPrefixMap.getOrDefault(toRoute, "NotFound")
    val fromRouteUrl = ServiceBaseUrlConst.PHACERIA_SERVER_BASE_URL + fromRoutePrefixUrl + from
    val toRouteUrl = ServiceBaseUrlConst.PHACERIA_SERVER_BASE_URL + toRoutePrefixUrl + to
    return Pair(fromRouteUrl, toRouteUrl)
}
