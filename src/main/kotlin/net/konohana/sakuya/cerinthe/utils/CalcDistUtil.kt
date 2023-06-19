package net.konohana.sakuya.cerinthe.utils

import net.konohana.sakuya.cerinthe.constant.FareDistCalcRuleConst
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.faredistCalcPatternC1
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.faredistCalcPatternD1
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.faredistCalcPatternD2
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.faredistCalcPatternD3
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.faredistCalcPatternD4
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.faredistCalcPatternD5
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.faredistCalcPatternD6
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.faredistCalcPatternD7
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
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_C1 -> faredistCalcPatternC1(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D1 -> faredistCalcPatternD1(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D2 -> faredistCalcPatternD2(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D3 -> faredistCalcPatternD3(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D4 -> faredistCalcPatternD4(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D5 -> faredistCalcPatternD5(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D6 -> faredistCalcPatternD6(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D7 -> faredistCalcPatternD7(fromDist, toDist)
        else -> Pair(0.0, 0)
    }
    return dist
}
