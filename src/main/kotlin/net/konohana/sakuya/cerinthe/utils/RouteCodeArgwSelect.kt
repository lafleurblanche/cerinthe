package net.konohana.sakuya.cerinthe.utils

import net.konohana.sakuya.cerinthe.constant.IndexConst
import net.konohana.sakuya.cerinthe.constant.RouteCodeAreaGWConst

/**
 * ## 路線コード判定処理
 * * 支線連絡系統
 * @author lafleurblanche
 */
fun routeCodeArgwSelect(from: String, to: String): String {
    val fromRoute = from.substring(IndexConst.INDEX_START, IndexConst.INDEX_END)
    val toRoute = to.substring(IndexConst.INDEX_START, IndexConst.INDEX_END)
    val routeMap = mapOf(
        Pair("RW01", "RW01") to RouteCodeAreaGWConst.ROUTE_CODE_101,
    )
    return routeMap.getOrDefault(Pair(fromRoute, toRoute), "経路情報誤り")
}
