package net.konohana.sakuya.cerinthe.constant

/**
 * 距離情報計算ルール定数クラス
 * @author lafleurblanche
 */
class FareDistCalcRuleConst {
    companion object {
        /** 経路情報計算ルール(着駅-発駅) */
        const val FAREDIST_CALCRULE_PATTERN_A = "A"
        /** 経路情報計算ルール(発駅＋着駅) */
        const val FAREDIST_CALCRULE_PATTERN_B = "B"
    }
}
