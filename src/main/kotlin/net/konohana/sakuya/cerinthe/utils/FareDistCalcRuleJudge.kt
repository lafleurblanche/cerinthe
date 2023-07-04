package net.konohana.sakuya.cerinthe.utils

fun fareDistCalcRuleJudgement(routeCode: String): String {
    val routeCodeInt = routeCode.toIntOrNull()
    val calcPattern = when (routeCodeInt ?: 999) {
        101 -> areaGWFareDistCalcRuleJudge(routeCode)
        in 2001..2266 -> enjuRWFareDistCalcRuleJudge(routeCode)
        999 -> "not found"
        else -> "not found"
    }
    return calcPattern
}
