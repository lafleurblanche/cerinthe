package net.konohana.sakuya.cerinthe.utils

import net.konohana.sakuya.cerinthe.constant.FareDistCalcRuleConst
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnc.faredistCalcPatternC1
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnc.faredistCalcPatternC2
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnc.faredistCalcPatternC3
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnc.faredistCalcPatternC4
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnc.faredistCalcPatternC5
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnc.faredistCalcPatternC6
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnc.faredistCalcPatternC7
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnd.faredistCalcPatternD1
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnd.faredistCalcPatternD10
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnd.faredistCalcPatternD11
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnd.faredistCalcPatternD12
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnd.faredistCalcPatternD13
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnd.faredistCalcPatternD14
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnd.faredistCalcPatternD15
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnd.faredistCalcPatternD16
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnd.faredistCalcPatternD17
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnd.faredistCalcPatternD18
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnd.faredistCalcPatternD19
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnd.faredistCalcPatternD2
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnd.faredistCalcPatternD20
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnd.faredistCalcPatternD21
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnd.faredistCalcPatternD22
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnd.faredistCalcPatternD23
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
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnd.faredistCalcPatternD4
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnd.faredistCalcPatternD5
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
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptne.faredistCalcPatternE52
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptne.faredistCalcPatternE53
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptne.faredistCalcPatternE54
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptne.faredistCalcPatternE6
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptne.faredistCalcPatternE7
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptne.faredistCalcPatternE8
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptne.faredistCalcPatternE9
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnf.faredistCalcPatternF1
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnf.faredistCalcPatternF2
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnf.faredistCalcPatternF3
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnf.faredistCalcPatternF4
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnf.faredistCalcPatternF5
import net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnf.faredistCalcPatternF6
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
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_C2 -> faredistCalcPatternC2(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_C3 -> faredistCalcPatternC3(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_C4 -> faredistCalcPatternC4(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_C5 -> faredistCalcPatternC5(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_C6 -> faredistCalcPatternC6(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_C7 -> faredistCalcPatternC7(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D1 -> faredistCalcPatternD1(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D2 -> faredistCalcPatternD2(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D3 -> faredistCalcPatternD3(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D4 -> faredistCalcPatternD4(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D5 -> faredistCalcPatternD5(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D6 -> faredistCalcPatternD6(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D7 -> faredistCalcPatternD7(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D8 -> faredistCalcPatternD8(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D9 -> faredistCalcPatternD9(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D10 -> faredistCalcPatternD10(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D11 -> faredistCalcPatternD11(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D12 -> faredistCalcPatternD12(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D13 -> faredistCalcPatternD13(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D14 -> faredistCalcPatternD14(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D15 -> faredistCalcPatternD15(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D16 -> faredistCalcPatternD16(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D17 -> faredistCalcPatternD17(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D18 -> faredistCalcPatternD18(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D19 -> faredistCalcPatternD19(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D20 -> faredistCalcPatternD20(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D21 -> faredistCalcPatternD21(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D22 -> faredistCalcPatternD22(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D23 -> faredistCalcPatternD23(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D24 -> faredistCalcPatternD24(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D25 -> faredistCalcPatternD25(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D26 -> faredistCalcPatternD26(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D27 -> faredistCalcPatternD27(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D28 -> faredistCalcPatternD28(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D29 -> faredistCalcPatternD29(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D30 -> faredistCalcPatternD30(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D31 -> faredistCalcPatternD31(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D32 -> faredistCalcPatternD32(fromDist, toDist)
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
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E52 -> faredistCalcPatternE52(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E53 -> faredistCalcPatternE53(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E54 -> faredistCalcPatternE54(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_F1 -> faredistCalcPatternF1(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_F2 -> faredistCalcPatternF2(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_F3 -> faredistCalcPatternF3(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_F4 -> faredistCalcPatternF4(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_F5 -> faredistCalcPatternF5(fromDist, toDist)
        FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_F6 -> faredistCalcPatternF6(fromDist, toDist)
        else -> Pair(0.0, 0)
    }
    return dist
}
