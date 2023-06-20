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
        /** 経路情報計算ルール(中間駅(茄谷)) */
        const val FAREDIST_CALCRULE_PATTERN_C2 = "C2"
        /** 経路情報計算ルール(中間駅(笥谷)) */
        const val FAREDIST_CALCRULE_PATTERN_C3 = "C3"
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
        /** 経路情報計算ルール(中間経路(茄谷～笥谷)) */
        const val FAREDIST_CALCRULE_PATTERN_D8 = "D8"
        /** 経路情報計算ルール(中間経路(茄谷～筏谷)) */
        const val FAREDIST_CALCRULE_PATTERN_D9 = "D9"
        /** 経路情報計算ルール(中間経路(茄谷～筮谷)) */
        const val FAREDIST_CALCRULE_PATTERN_D10 = "D10"
        /** 経路情報計算ルール(中間経路(茄谷～槐谷)) */
        const val FAREDIST_CALCRULE_PATTERN_D11 = "D11"
        /** 経路情報計算ルール(中間経路(茄谷～卯塚)) */
        const val FAREDIST_CALCRULE_PATTERN_D12 = "D12"
        /** 経路情報計算ルール(中間経路(茄谷～槐谷)) */
        const val FAREDIST_CALCRULE_PATTERN_D13 = "D13"
        /** 経路情報計算ルール(中間経路(笥谷～筏谷)) */
        const val FAREDIST_CALCRULE_PATTERN_D14 = "D14"
        /** 経路情報計算ルール(中間経路(笥谷～筮谷)) */
        const val FAREDIST_CALCRULE_PATTERN_D15 = "D15"
        /** 経路情報計算ルール(中間経路(笥谷～槐谷)) */
        const val FAREDIST_CALCRULE_PATTERN_D16 = "D16"
        /** 経路情報計算ルール(中間経路(笥谷～卯塚)) */
        const val FAREDIST_CALCRULE_PATTERN_D17 = "D17"
        /** 経路情報計算ルール(中間経路(笥谷～瑞堂)) */
        const val FAREDIST_CALCRULE_PATTERN_D18 = "D18"
        /** 経路情報計算ルール(中間経路(苆谷～卯塚, 卯塚～筁谷)) */
        const val FAREDIST_CALCRULE_PATTERN_E1 = "E1"
        /** 経路情報計算ルール(中間経路(苆谷～卯塚, 卯塚～筥谷)) */
        const val FAREDIST_CALCRULE_PATTERN_E2 = "E2"
        /** 経路情報計算ルール(中間経路(苆谷～卯塚, 卯塚～笒谷)) */
        const val FAREDIST_CALCRULE_PATTERN_E3 = "E3"
        /** 経路情報計算ルール(中間経路(苆谷～卯塚, 卯塚～箬谷)) */
        const val FAREDIST_CALCRULE_PATTERN_E4 = "E4"
        /** 経路情報計算ルール(中間経路(苆谷～瑞堂, 瑞堂～苕谷)) */
        const val FAREDIST_CALCRULE_PATTERN_E5 = "E5"
        /** 経路情報計算ルール(中間経路(苆谷～瑞堂, 瑞堂～扆谷)) */
        const val FAREDIST_CALCRULE_PATTERN_E6 = "E6"
        /** 経路情報計算ルール(中間経路(苆谷～瑞堂, 瑞堂～珩谷)) */
        const val FAREDIST_CALCRULE_PATTERN_E7 = "E7"
        /** 経路情報計算ルール(中間経路(苆谷～瑞堂, 瑞堂～玿谷)) */
        const val FAREDIST_CALCRULE_PATTERN_E8 = "E8"
        /** 経路情報計算ルール(中間経路(苆谷～瑞堂, 瑞堂～珮谷)) */
        const val FAREDIST_CALCRULE_PATTERN_E9 = "E9"
        /** 経路情報計算ルール(中間経路(苆谷～瑞堂, 瑞堂～荍谷)) */
        const val FAREDIST_CALCRULE_PATTERN_E10 = "E10"
        /** 経路情報計算ルール(中間経路(茄谷～卯塚, 卯塚～筁谷)) */
        const val FAREDIST_CALCRULE_PATTERN_E11 = "E11"
        /** 経路情報計算ルール(中間経路(茄谷～卯塚, 卯塚～筥谷)) */
        const val FAREDIST_CALCRULE_PATTERN_E12 = "E12"
        /** 経路情報計算ルール(中間経路(茄谷～卯塚, 卯塚～笒谷)) */
        const val FAREDIST_CALCRULE_PATTERN_E13 = "E13"
        /** 経路情報計算ルール(中間経路(茄谷～卯塚, 卯塚～箬谷)) */
        const val FAREDIST_CALCRULE_PATTERN_E14 = "E14"
        /** 経路情報計算ルール(中間経路(茄谷～瑞堂, 瑞堂～苕谷)) */
        const val FAREDIST_CALCRULE_PATTERN_E15 = "E15"
        /** 経路情報計算ルール(中間経路(茄谷～瑞堂, 瑞堂～扆谷)) */
        const val FAREDIST_CALCRULE_PATTERN_E16 = "E16"
        /** 経路情報計算ルール(中間経路(茄谷～瑞堂, 瑞堂～珩谷)) */
        const val FAREDIST_CALCRULE_PATTERN_E17 = "E17"
        /** 経路情報計算ルール(中間経路(茄谷～瑞堂, 瑞堂～玿谷)) */
        const val FAREDIST_CALCRULE_PATTERN_E18 = "E18"
        /** 経路情報計算ルール(中間経路(茄谷～瑞堂, 瑞堂～珮谷)) */
        const val FAREDIST_CALCRULE_PATTERN_E19 = "E19"
        /** 経路情報計算ルール(中間経路(茄谷～瑞堂, 瑞堂～荍谷)) */
        const val FAREDIST_CALCRULE_PATTERN_E20 = "E20"
    }
}
