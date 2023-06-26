package net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptne

import net.konohana.sakuya.cerinthe.constant.RouteDistanceEnjuRWConst
import kotlin.math.abs
import kotlin.math.ceil

/**
 * ## 距離計算処理
 * * えんじゅ交通
 * * 距離情報計算ルール: パターンE60A
 * * 発駅と着駅を合算した距離情報を返却します.
 * * 中間区間#1(扆谷~瑞堂)を経路として含む場合.
 * * 中間区間#2(瑞堂~卯塚)を経路として含む場合.
 * * 降車駅がRW17(槐谷線)
 * @param fromDist 発駅距離情報
 * @param toDist 着駅距離情報
 * @return 営業キロ, 運賃計算キロ
 */
fun faredistCalcPatternE60A(fromDist: Double, toDist: Double): Pair<Double, Int> {
    val dist =
        fromDist +
        RouteDistanceEnjuRWConst.ROUTE_DISTANCE_ENJU_RW19_PTN_CMN02 +
        RouteDistanceEnjuRWConst.ROUTE_DISTANCE_ENJU_RW17_PTN_CMN06 +
        abs(toDist - RouteDistanceEnjuRWConst.ROUTE_DISTANCE_ENJU_RW17_PTN_CMN01)
    val calcDist = ceil(dist * 10.0 / 10.0).toInt()
    return Pair(dist, calcDist)
}
