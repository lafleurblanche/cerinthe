package net.konohana.sakuya.cerinthe.utils.calcdist

import kotlin.math.abs
import kotlin.math.ceil

/**
 * ## 距離計算処理
 * * 距離情報計算ルール: パターンA
 * * 着駅から発駅を引いた距離情報を返却します.
 * @param fromDist 発駅距離情報
 * @param toDist 着駅距離情報
 * @return 営業キロ, 運賃計算キロ
 */
fun faredistCalcPatternA(fromDist: Double, toDist: Double): Pair<Double, Int> {
    val dist = abs(toDist - fromDist)
    val calcDist = ceil(dist * 10.0 / 10.0).toInt()
    return Pair(dist, calcDist)
}
