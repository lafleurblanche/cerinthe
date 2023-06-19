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
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.faredistCalcPatternE1
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.faredistCalcPatternE10
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.faredistCalcPatternE2
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.faredistCalcPatternE3
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.faredistCalcPatternE4
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.faredistCalcPatternE5
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.faredistCalcPatternE6
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.faredistCalcPatternE7
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.faredistCalcPatternE8
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.faredistCalcPatternE9
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
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E1 -> faredistCalcPatternE1(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E2 -> faredistCalcPatternE2(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E3 -> faredistCalcPatternE3(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E4 -> faredistCalcPatternE4(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E5 -> faredistCalcPatternE5(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E6 -> faredistCalcPatternE6(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E7 -> faredistCalcPatternE7(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E8 -> faredistCalcPatternE8(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E9 -> faredistCalcPatternE9(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E10 -> faredistCalcPatternE10(fromDist, toDist)
        else -> Pair(0.0, 0)
    }
    return dist
}
