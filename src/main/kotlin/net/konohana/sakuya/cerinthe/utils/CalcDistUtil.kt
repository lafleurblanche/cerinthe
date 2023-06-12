package net.konohana.sakuya.cerinthe.utils

import net.konohana.sakuya.cerinthe.constant.FareDistCalcRuleConst
import net.konohana.sakuya.cerinthe.utils.calcdist.faredistCalcPatternA

/**
 * 運賃計算パターンから、営業キロ及び運賃計算キロを算出します。
 * @param calcPattern 運賃計算パターン
 * @param fromDist 乗車駅キロ
 * @param toDist 降車駅キロ
 * @return 営業キロ, 運賃計算キロ
 */
fun calcDist(calcPattern: String, fromDist: Double, toDist: Double): Pair<Double, Int> {
    val dist = when(calcPattern) {
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_A -> faredistCalcPatternA(fromDist, toDist)
        else -> Pair(0.0, 0)
    }
    return dist
}
