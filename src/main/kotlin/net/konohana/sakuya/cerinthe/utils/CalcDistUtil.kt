package net.konohana.sakuya.cerinthe.utils

import net.konohana.sakuya.cerinthe.constant.FareDistCalcRuleConst
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnb.faredistCalcPatternB1
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnc.faredistCalcPatternC1
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnc.faredistCalcPatternC10
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnc.faredistCalcPatternC11
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnc.faredistCalcPatternC12
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnc.faredistCalcPatternC13
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnc.faredistCalcPatternC14
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnc.faredistCalcPatternC15
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnc.faredistCalcPatternC2
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnc.faredistCalcPatternC3
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnc.faredistCalcPatternC4
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnc.faredistCalcPatternC5
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnc.faredistCalcPatternC6
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnc.faredistCalcPatternC7
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnc.faredistCalcPatternC8
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnc.faredistCalcPatternC9
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnd.faredistCalcPatternD1
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnd.faredistCalcPatternD10
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnd.faredistCalcPatternD11
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnd.faredistCalcPatternD11A
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnd.faredistCalcPatternD12
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnd.faredistCalcPatternD13
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnd.faredistCalcPatternD14
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnd.faredistCalcPatternD15
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnd.faredistCalcPatternD16
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnd.faredistCalcPatternD16A
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnd.faredistCalcPatternD17
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnd.faredistCalcPatternD18
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnd.faredistCalcPatternD19
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnd.faredistCalcPatternD2
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnd.faredistCalcPatternD20
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnd.faredistCalcPatternD20A
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnd.faredistCalcPatternD21
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnd.faredistCalcPatternD22
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnd.faredistCalcPatternD23
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnd.faredistCalcPatternD23A
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnd.faredistCalcPatternD24
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnd.faredistCalcPatternD25
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnd.faredistCalcPatternD26
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnd.faredistCalcPatternD27
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnd.faredistCalcPatternD28
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnd.faredistCalcPatternD29
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnd.faredistCalcPatternD3
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnd.faredistCalcPatternD30
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnd.faredistCalcPatternD31
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnd.faredistCalcPatternD32
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnd.faredistCalcPatternD33
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnd.faredistCalcPatternD34
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnd.faredistCalcPatternD35
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnd.faredistCalcPatternD36
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnd.faredistCalcPatternD37
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnd.faredistCalcPatternD38
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnd.faredistCalcPatternD39
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnd.faredistCalcPatternD4
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnd.faredistCalcPatternD40
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnd.faredistCalcPatternD41
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnd.faredistCalcPatternD42
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnd.faredistCalcPatternD43
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnd.faredistCalcPatternD44
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnd.faredistCalcPatternD45
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnd.faredistCalcPatternD46
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnd.faredistCalcPatternD47
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnd.faredistCalcPatternD48
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnd.faredistCalcPatternD49
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnd.faredistCalcPatternD5
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnd.faredistCalcPatternD50
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnd.faredistCalcPatternD51
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnd.faredistCalcPatternD52
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnd.faredistCalcPatternD5A
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnd.faredistCalcPatternD6
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnd.faredistCalcPatternD7
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnd.faredistCalcPatternD8
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnd.faredistCalcPatternD9
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptne.faredistCalcPatternE1
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptne.faredistCalcPatternE10
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptne.faredistCalcPatternE11
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptne.faredistCalcPatternE12
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptne.faredistCalcPatternE13
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptne.faredistCalcPatternE14
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptne.faredistCalcPatternE15
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptne.faredistCalcPatternE16
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptne.faredistCalcPatternE17
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptne.faredistCalcPatternE18
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptne.faredistCalcPatternE19
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptne.faredistCalcPatternE2
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptne.faredistCalcPatternE20
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptne.faredistCalcPatternE21
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptne.faredistCalcPatternE22
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptne.faredistCalcPatternE23
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptne.faredistCalcPatternE24
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptne.faredistCalcPatternE25
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptne.faredistCalcPatternE26
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptne.faredistCalcPatternE27
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptne.faredistCalcPatternE28
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptne.faredistCalcPatternE29
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptne.faredistCalcPatternE3
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptne.faredistCalcPatternE30
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptne.faredistCalcPatternE31
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptne.faredistCalcPatternE32
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptne.faredistCalcPatternE33
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptne.faredistCalcPatternE34
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptne.faredistCalcPatternE35
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptne.faredistCalcPatternE36
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptne.faredistCalcPatternE37
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptne.faredistCalcPatternE38
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptne.faredistCalcPatternE39
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptne.faredistCalcPatternE4
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptne.faredistCalcPatternE40
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptne.faredistCalcPatternE41
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptne.faredistCalcPatternE42
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptne.faredistCalcPatternE43
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptne.faredistCalcPatternE44
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptne.faredistCalcPatternE45
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptne.faredistCalcPatternE46
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptne.faredistCalcPatternE47
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptne.faredistCalcPatternE48
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptne.faredistCalcPatternE49
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptne.faredistCalcPatternE5
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptne.faredistCalcPatternE50
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptne.faredistCalcPatternE51
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptne.faredistCalcPatternE51A
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptne.faredistCalcPatternE52
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptne.faredistCalcPatternE53
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptne.faredistCalcPatternE53A
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptne.faredistCalcPatternE54
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptne.faredistCalcPatternE55
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptne.faredistCalcPatternE55A
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptne.faredistCalcPatternE56
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptne.faredistCalcPatternE57
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptne.faredistCalcPatternE57A
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptne.faredistCalcPatternE58
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptne.faredistCalcPatternE59
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptne.faredistCalcPatternE59A
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptne.faredistCalcPatternE6
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptne.faredistCalcPatternE60
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptne.faredistCalcPatternE60A
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptne.faredistCalcPatternE61
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptne.faredistCalcPatternE62
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptne.faredistCalcPatternE62A
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptne.faredistCalcPatternE63
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptne.faredistCalcPatternE63A
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptne.faredistCalcPatternE64
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptne.faredistCalcPatternE64A
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptne.faredistCalcPatternE7
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptne.faredistCalcPatternE8
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptne.faredistCalcPatternE9
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnf.faredistCalcPatternF1
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnf.faredistCalcPatternF10
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnf.faredistCalcPatternF11
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnf.faredistCalcPatternF12
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnf.faredistCalcPatternF13
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnf.faredistCalcPatternF14
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnf.faredistCalcPatternF15
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnf.faredistCalcPatternF16
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnf.faredistCalcPatternF17
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnf.faredistCalcPatternF18
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnf.faredistCalcPatternF19
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnf.faredistCalcPatternF2
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnf.faredistCalcPatternF20
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnf.faredistCalcPatternF21
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnf.faredistCalcPatternF22
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnf.faredistCalcPatternF23
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnf.faredistCalcPatternF24
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnf.faredistCalcPatternF25
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnf.faredistCalcPatternF25A
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnf.faredistCalcPatternF26
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnf.faredistCalcPatternF26A
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnf.faredistCalcPatternF27
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnf.faredistCalcPatternF27A
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnf.faredistCalcPatternF28
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnf.faredistCalcPatternF28A
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnf.faredistCalcPatternF29
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnf.faredistCalcPatternF29A
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnf.faredistCalcPatternF3
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnf.faredistCalcPatternF30
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnf.faredistCalcPatternF30A
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnf.faredistCalcPatternF4
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnf.faredistCalcPatternF5
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnf.faredistCalcPatternF6
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnf.faredistCalcPatternF7
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnf.faredistCalcPatternF8
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnf.faredistCalcPatternF9
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
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_B1 -> faredistCalcPatternB1(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_C1 -> faredistCalcPatternC1(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_C2 -> faredistCalcPatternC2(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_C3 -> faredistCalcPatternC3(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_C4 -> faredistCalcPatternC4(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_C5 -> faredistCalcPatternC5(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_C6 -> faredistCalcPatternC6(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_C7 -> faredistCalcPatternC7(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_C8 -> faredistCalcPatternC8(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_C9 -> faredistCalcPatternC9(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_C10 -> faredistCalcPatternC10(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_C11 -> faredistCalcPatternC11(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_C12 -> faredistCalcPatternC12(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_C13 -> faredistCalcPatternC13(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_C14 -> faredistCalcPatternC14(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_C15 -> faredistCalcPatternC15(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D1 -> faredistCalcPatternD1(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D2 -> faredistCalcPatternD2(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D3 -> faredistCalcPatternD3(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D4 -> faredistCalcPatternD4(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D5 -> faredistCalcPatternD5(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D5A -> faredistCalcPatternD5A(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D6 -> faredistCalcPatternD6(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D7 -> faredistCalcPatternD7(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D8 -> faredistCalcPatternD8(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D9 -> faredistCalcPatternD9(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D10 -> faredistCalcPatternD10(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D11 -> faredistCalcPatternD11(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D11A -> faredistCalcPatternD11A(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D12 -> faredistCalcPatternD12(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D13 -> faredistCalcPatternD13(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D14 -> faredistCalcPatternD14(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D15 -> faredistCalcPatternD15(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D16 -> faredistCalcPatternD16(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D16A -> faredistCalcPatternD16A(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D17 -> faredistCalcPatternD17(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D18 -> faredistCalcPatternD18(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D19 -> faredistCalcPatternD19(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D20 -> faredistCalcPatternD20(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D20A -> faredistCalcPatternD20A(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D21 -> faredistCalcPatternD21(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D22 -> faredistCalcPatternD22(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D23 -> faredistCalcPatternD23(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D23A -> faredistCalcPatternD23A(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D24 -> faredistCalcPatternD24(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D25 -> faredistCalcPatternD25(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D26 -> faredistCalcPatternD26(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D27 -> faredistCalcPatternD27(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D28 -> faredistCalcPatternD28(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D29 -> faredistCalcPatternD29(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D30 -> faredistCalcPatternD30(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D31 -> faredistCalcPatternD31(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D32 -> faredistCalcPatternD32(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D33 -> faredistCalcPatternD33(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D34 -> faredistCalcPatternD34(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D35 -> faredistCalcPatternD35(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D36 -> faredistCalcPatternD36(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D37 -> faredistCalcPatternD37(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D38 -> faredistCalcPatternD38(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D39 -> faredistCalcPatternD39(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D40 -> faredistCalcPatternD40(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D41 -> faredistCalcPatternD41(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D42 -> faredistCalcPatternD42(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D43 -> faredistCalcPatternD43(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D44 -> faredistCalcPatternD44(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D45 -> faredistCalcPatternD45(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D46 -> faredistCalcPatternD46(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D47 -> faredistCalcPatternD47(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D48 -> faredistCalcPatternD48(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D49 -> faredistCalcPatternD49(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D50 -> faredistCalcPatternD50(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D51 -> faredistCalcPatternD51(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D52 -> faredistCalcPatternD52(fromDist, toDist)
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
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E11 -> faredistCalcPatternE11(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E12 -> faredistCalcPatternE12(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E13 -> faredistCalcPatternE13(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E14 -> faredistCalcPatternE14(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E15 -> faredistCalcPatternE15(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E16 -> faredistCalcPatternE16(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E17 -> faredistCalcPatternE17(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E18 -> faredistCalcPatternE18(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E19 -> faredistCalcPatternE19(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E20 -> faredistCalcPatternE20(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E21 -> faredistCalcPatternE21(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E22 -> faredistCalcPatternE22(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E23 -> faredistCalcPatternE23(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E24 -> faredistCalcPatternE24(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E25 -> faredistCalcPatternE25(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E26 -> faredistCalcPatternE26(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E27 -> faredistCalcPatternE27(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E28 -> faredistCalcPatternE28(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E29 -> faredistCalcPatternE29(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E30 -> faredistCalcPatternE30(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E31 -> faredistCalcPatternE31(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E32 -> faredistCalcPatternE32(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E33 -> faredistCalcPatternE33(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E34 -> faredistCalcPatternE34(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E35 -> faredistCalcPatternE35(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E36 -> faredistCalcPatternE36(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E37 -> faredistCalcPatternE37(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E38 -> faredistCalcPatternE38(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E39 -> faredistCalcPatternE39(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E40 -> faredistCalcPatternE40(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E41 -> faredistCalcPatternE41(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E42 -> faredistCalcPatternE42(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E43 -> faredistCalcPatternE43(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E44 -> faredistCalcPatternE44(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E45 -> faredistCalcPatternE45(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E46 -> faredistCalcPatternE46(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E47 -> faredistCalcPatternE47(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E48 -> faredistCalcPatternE48(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E49 -> faredistCalcPatternE49(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E50 -> faredistCalcPatternE50(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E51 -> faredistCalcPatternE51(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E51A -> faredistCalcPatternE51A(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E52 -> faredistCalcPatternE52(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E53 -> faredistCalcPatternE53(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E53A -> faredistCalcPatternE53A(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E54 -> faredistCalcPatternE54(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E55 -> faredistCalcPatternE55(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E55A -> faredistCalcPatternE55A(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E56 -> faredistCalcPatternE56(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E57 -> faredistCalcPatternE57(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E57A -> faredistCalcPatternE57A(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E58 -> faredistCalcPatternE58(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E59 -> faredistCalcPatternE59(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E59A -> faredistCalcPatternE59A(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E60 -> faredistCalcPatternE60(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E60A -> faredistCalcPatternE60A(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E61 -> faredistCalcPatternE61(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E62 -> faredistCalcPatternE62(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E62A -> faredistCalcPatternE62A(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E63 -> faredistCalcPatternE63(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E63A -> faredistCalcPatternE63A(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E64 -> faredistCalcPatternE64(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E64A -> faredistCalcPatternE64A(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_F1 -> faredistCalcPatternF1(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_F2 -> faredistCalcPatternF2(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_F3 -> faredistCalcPatternF3(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_F4 -> faredistCalcPatternF4(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_F5 -> faredistCalcPatternF5(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_F6 -> faredistCalcPatternF6(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_F7 -> faredistCalcPatternF7(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_F8 -> faredistCalcPatternF8(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_F9 -> faredistCalcPatternF9(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_F10 -> faredistCalcPatternF10(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_F11 -> faredistCalcPatternF11(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_F12 -> faredistCalcPatternF12(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_F13 -> faredistCalcPatternF13(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_F14 -> faredistCalcPatternF14(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_F15 -> faredistCalcPatternF15(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_F16 -> faredistCalcPatternF16(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_F17 -> faredistCalcPatternF17(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_F18 -> faredistCalcPatternF18(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_F19 -> faredistCalcPatternF19(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_F20 -> faredistCalcPatternF20(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_F21 -> faredistCalcPatternF21(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_F22 -> faredistCalcPatternF22(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_F23 -> faredistCalcPatternF23(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_F24 -> faredistCalcPatternF24(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_F25 -> faredistCalcPatternF25(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_F25A -> faredistCalcPatternF25A(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_F26 -> faredistCalcPatternF26(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_F26A -> faredistCalcPatternF26A(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_F27 -> faredistCalcPatternF27(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_F27A -> faredistCalcPatternF27A(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_F28 -> faredistCalcPatternF28(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_F28A -> faredistCalcPatternF28A(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_F29 -> faredistCalcPatternF29(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_F29A -> faredistCalcPatternF29A(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_F30 -> faredistCalcPatternF30(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_F30A -> faredistCalcPatternF30A(fromDist, toDist)
        else -> Pair(0.0, 0)
    }
    return dist
}
