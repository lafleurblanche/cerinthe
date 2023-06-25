package net.konohana.sakuya.cerinthe.utils

import net.konohana.sakuya.cerinthe.constant.IndexConst
import net.konohana.sakuya.cerinthe.constant.ServiceBaseUrlConst
import net.konohana.sakuya.cerinthe.constant.UrlPrefixConst

/**
 * ## APIURL判定処理
 * * えんじゅ交通
 * * FX用
 * @author lafleurblanche
 */
fun fxApiUrlEnjuJudge(from: String, to: String): Pair<String, String> {
    val fromRoute = from.substring(IndexConst.INDEX_START, IndexConst.INDEX_FX_END)
    val toRoute = to.substring(IndexConst.INDEX_START, IndexConst.INDEX_FX_END)
    val fromStaCode = from.substring(IndexConst.INDEX_START_FX_STA_CODE, IndexConst.INDEX_END_FX_STA_CODE)
    val toStaCode = to.substring(IndexConst.INDEX_START_FX_STA_CODE, IndexConst.INDEX_END_FX_STA_CODE)
    val apiUrlPrefixMap = mapOf(
        "FRRW01" to UrlPrefixConst.FAREDIST_ENJURW_RW01,
        "FRRW02" to UrlPrefixConst.FAREDIST_ENJURW_RW02,
        "FRRW03" to UrlPrefixConst.FAREDIST_ENJURW_RW03,
        "FRRW04" to UrlPrefixConst.FAREDIST_ENJURW_RW04,
        "FRRW05" to UrlPrefixConst.FAREDIST_ENJURW_RW05,
        "FRRW06" to UrlPrefixConst.FAREDIST_ENJURW_RW06,
        "FRRW07" to UrlPrefixConst.FAREDIST_ENJURW_RW07,
        "FRRW08" to UrlPrefixConst.FAREDIST_ENJURW_RW08,
        "FRRW09" to UrlPrefixConst.FAREDIST_ENJURW_RW09,
        "FRRW10" to UrlPrefixConst.FAREDIST_ENJURW_RW10,
        "FRRW11" to UrlPrefixConst.FAREDIST_ENJURW_RW11,
        "FRRW12" to UrlPrefixConst.FAREDIST_ENJURW_RW12,
        "FRRW13" to UrlPrefixConst.FAREDIST_ENJURW_RW13,
        "FRRW14" to UrlPrefixConst.FAREDIST_ENJURW_RW14,
        "FRRW15" to UrlPrefixConst.FAREDIST_ENJURW_RW15,
        "FRRW16" to UrlPrefixConst.FAREDIST_ENJURW_RW16,
        "FRRW17" to UrlPrefixConst.FAREDIST_ENJURW_RW17,
        "FRRW18" to UrlPrefixConst.FAREDIST_ENJURW_RW18,
        "FRRW19" to UrlPrefixConst.FAREDIST_ENJURW_RW19,
        "TORW01" to UrlPrefixConst.FAREDIST_ENJURW_RW01,
        "TORW02" to UrlPrefixConst.FAREDIST_ENJURW_RW02,
        "TORW03" to UrlPrefixConst.FAREDIST_ENJURW_RW03,
        "TORW04" to UrlPrefixConst.FAREDIST_ENJURW_RW04,
        "TORW05" to UrlPrefixConst.FAREDIST_ENJURW_RW05,
        "TORW06" to UrlPrefixConst.FAREDIST_ENJURW_RW06,
        "TORW07" to UrlPrefixConst.FAREDIST_ENJURW_RW07,
        "TORW08" to UrlPrefixConst.FAREDIST_ENJURW_RW08,
        "TORW09" to UrlPrefixConst.FAREDIST_ENJURW_RW09,
        "TORW10" to UrlPrefixConst.FAREDIST_ENJURW_RW10,
        "TORW11" to UrlPrefixConst.FAREDIST_ENJURW_RW11,
        "TORW12" to UrlPrefixConst.FAREDIST_ENJURW_RW12,
        "TORW13" to UrlPrefixConst.FAREDIST_ENJURW_RW13,
        "TORW14" to UrlPrefixConst.FAREDIST_ENJURW_RW14,
        "TORW15" to UrlPrefixConst.FAREDIST_ENJURW_RW15,
        "TORW16" to UrlPrefixConst.FAREDIST_ENJURW_RW16,
        "TORW17" to UrlPrefixConst.FAREDIST_ENJURW_RW17,
        "TORW18" to UrlPrefixConst.FAREDIST_ENJURW_RW18,
        "TORW19" to UrlPrefixConst.FAREDIST_ENJURW_RW19,
    )
    val fromRoutePrefixUrl = apiUrlPrefixMap.getOrDefault(fromRoute, "NotFound")
    val toRoutePrefixUrl = apiUrlPrefixMap.getOrDefault(toRoute, "NotFound")
    val fromRouteUrl = ServiceBaseUrlConst.PHACERIA_SERVER_BASE_URL + fromRoutePrefixUrl + fromStaCode
    val toRouteUrl = ServiceBaseUrlConst.PHACERIA_SERVER_BASE_URL + toRoutePrefixUrl + toStaCode
    return Pair(fromRouteUrl, toRouteUrl)
}
