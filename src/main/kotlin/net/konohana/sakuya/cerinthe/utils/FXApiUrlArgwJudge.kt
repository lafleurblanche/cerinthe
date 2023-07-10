package net.konohana.sakuya.cerinthe.utils

import net.konohana.sakuya.cerinthe.constant.IndexConst
import net.konohana.sakuya.cerinthe.constant.ServiceBaseUrlConst
import net.konohana.sakuya.cerinthe.constant.UrlPrefixConst

/**
 * ## APIURL判定処理
 * * 支線連絡系統
 * * FX用
 * @author lafleurblanche
 */
fun fxApiUrlArgwJudge(from: String, to: String): Pair<String, String> {
    val fromRoute = from.substring(IndexConst.INDEX_START, IndexConst.INDEX_FX_END)
    val toRoute = to.substring(IndexConst.INDEX_START, IndexConst.INDEX_FX_END)
    val fromStaCode = from.substring(IndexConst.INDEX_START_FX_STA_CODE, IndexConst.INDEX_END_FX_STA_CODE)
    val toStaCode = to.substring(IndexConst.INDEX_START_FX_STA_CODE, IndexConst.INDEX_END_FX_STA_CODE)
    val apiUrlPrefixMap = mapOf(
        "FRGW01" to UrlPrefixConst.FAREDIST_AREAGW_GW01,
        "TOGW01" to UrlPrefixConst.FAREDIST_AREAGW_GW01
    )
    val fromRoutePrefixUrl = apiUrlPrefixMap.getOrDefault(fromRoute, "NotFound")
    val toRoutePrefixUrl = apiUrlPrefixMap.getOrDefault(toRoute, "NotFound")
    val fromRouteUrl = ServiceBaseUrlConst.PHACERIA_SERVER_BASE_URL + fromRoutePrefixUrl + fromStaCode
    val toRouteUrl = ServiceBaseUrlConst.PHACERIA_SERVER_BASE_URL + toRoutePrefixUrl + toStaCode
    return Pair(fromRouteUrl, toRouteUrl)
}
