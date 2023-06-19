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
        /** 経路情報計算ルール(中間駅(苆谷)) */
        const val FAREDIST_CALCRULE_PATTERN_C1 = "C1"
        /** 経路情報計算ルール(中間経路(苆谷～茄谷)) */
        const val FAREDIST_CALCRULE_PATTERN_D1 = "D1"
        /** 経路情報計算ルール(中間経路(苆谷～笥谷)) */
        const val FAREDIST_CALCRULE_PATTERN_D2 = "D2"
        /** 経路情報計算ルール(中間経路(苆谷～筏谷)) */
        const val FAREDIST_CALCRULE_PATTERN_D3 = "D3"
        /** 経路情報計算ルール(中間経路(苆谷～筮谷)) */
        const val FAREDIST_CALCRULE_PATTERN_D4 = "D4"
        /** 経路情報計算ルール(中間経路(苆谷～槐谷)) */
        const val FAREDIST_CALCRULE_PATTERN_D5 = "D5"
        /** 経路情報計算ルール(中間経路(苆谷～卯塚)) */
        const val FAREDIST_CALCRULE_PATTERN_D6 = "D6"
        /** 経路情報計算ルール(中間経路(苆谷～瑞堂)) */
        const val FAREDIST_CALCRULE_PATTERN_D7 = "D7"
    }
}
