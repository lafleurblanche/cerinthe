package net.konohana.sakuya.cerinthe.utils.calcdist.enjurw.ptnb

import net.konohana.sakuya.cerinthe.constant.RouteDistanceEnjuRWConst
import kotlin.math.abs
import kotlin.math.ceil

/**
 * ## 距離計算処理
 * * 距離情報計算ルール: パターンB1
 * * 発駅と着駅を合算した距離情報を返却します.
 * @param fromDist 発駅距離情報
 * @param toDist 着駅距離情報
 * @return 合算距離情報
 */
fun faredistCalcPatternB1(fromDist: Double, toDist: Double): Pair<Double, Int> {
    val dist = abs(fromDist - RouteDistanceEnjuRWConst.ROUTE_DISTANCE_ENJU_RW16_PTN_CMN01) + toDist
    val calcDist = ceil(dist * 10.0 / 10.0).toInt()
    return Pair(dist, calcDist)
}
