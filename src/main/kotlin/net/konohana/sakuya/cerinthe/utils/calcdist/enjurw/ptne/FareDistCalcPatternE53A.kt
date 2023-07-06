package net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptne

import net.konohana.sakuya.cerinthe.constant.RouteDistanceEnjuRWConst
import kotlin.math.abs
import kotlin.math.ceil

/**
 * ## 距離計算処理
 * * えんじゅ交通
 * * 距離情報計算ルール: パターンE53A
 * * 発駅と着駅を合算した距離情報を返却します.
 * * 中間区間#1(筥谷~卯塚)を経路として含む場合.
 * * 中間区間#2(卯塚~槐谷)を経路として含む場合.
 * * 発駅がRW16(槐谷線)内.
 * @param fromDist 発駅距離情報
 * @param toDist 着駅距離情報
 * @return 営業キロ, 運賃計算キロ
 */
fun faredistCalcPatternE53A(fromDist: Double, toDist: Double): Pair<Double, Int> {
    val dist =
        abs(fromDist - RouteDistanceEnjuRWConst.ROUTE_DISTANCE_ENJU_RW16_PTN_CMN01) +
        RouteDistanceEnjuRWConst.ROUTE_DISTANCE_ENJU_RW07_PTN_CMN03 +
        RouteDistanceEnjuRWConst.ROUTE_DISTANCE_ENJU_RW17_PTN_CMN01 +
        toDist
    val calcDist = ceil(dist * 10.0 / 10.0).toInt()
    return Pair(dist, calcDist)
}
