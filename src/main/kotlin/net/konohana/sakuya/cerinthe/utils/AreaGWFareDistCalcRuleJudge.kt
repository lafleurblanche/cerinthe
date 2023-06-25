package net.konohana.sakuya.cerinthe.utils

import net.konohana.sakuya.cerinthe.constant.FareDistCalcRuleConst
import net.konohana.sakuya.cerinthe.constant.RouteCodeAreaGWConst

/**
 * 経路計算ルールを判定します。
 * * 支線連絡系統
 * @param routeCode 路線コード
 * @return 経路計算ルール
 */
fun areaGWFareDistCalcRuleJudge(routeCode: String): String {
    val calcRuleMap = mapOf(
        RouteCodeAreaGWConst.ROUTE_CODE_101 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_A,
    )
    return calcRuleMap.getOrDefault(routeCode, "NotFound")
}
