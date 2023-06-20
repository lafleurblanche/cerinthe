package net.konohana.sakuya.cerinthe.utils.calcdist.enjurw

import net.konohana.sakuya.cerinthe.constant.RouteDistanceEnjuRWConst
import kotlin.math.ceil

/**
 * ## 距離計算処理
 * * えんじゅ交通
 * * 距離情報計算ルール: パターンD17
 * * 発駅と着駅を合算した距離情報を返却します.
 * * 中間区間(笥谷～卯塚)を経路として含む場合.
 * @param fromDist 発駅距離情報
 * @param toDist 着駅距離情報
 * @return 営業キロ, 運賃計算キロ
 */
fun faredistCalcPatternD17(fromDist: Double, toDist: Double): Pair<Double, Int> {
    val dist = fromDist + RouteDistanceEnjuRWConst.ROUTE_DISTANCE_ENJU_RW03_PTN_CMN04 + toDist
    val calcDist = ceil(dist * 10.0 / 10.0).toInt()
    return Pair(dist, calcDist)
}
