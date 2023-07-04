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
        /** 経路情報計算ルール(中間駅(筏谷)) */
        const val FAREDIST_CALCRULE_PATTERN_C4 = "C4"
        /** 経路情報計算ルール(中間駅(筮谷)) */
        const val FAREDIST_CALCRULE_PATTERN_C5 = "C5"
        /** 経路情報計算ルール(中間駅(筁谷)) */
        const val FAREDIST_CALCRULE_PATTERN_C6 = "C6"
        /** 経路情報計算ルール(中間駅(筥谷)) */
        const val FAREDIST_CALCRULE_PATTERN_C7 = "C7"
        /** 経路情報計算ルール(中間駅(笒谷)) */
        const val FAREDIST_CALCRULE_PATTERN_C8 = "C8"
        /** 経路情報計算ルール(中間駅(箬谷)) */
        const val FAREDIST_CALCRULE_PATTERN_C9 = "C9"
        /** 経路情報計算ルール(中間駅(苕谷)) */
        const val FAREDIST_CALCRULE_PATTERN_C10 = "C10"
        /** 経路情報計算ルール(中間駅(扆谷)) */
        const val FAREDIST_CALCRULE_PATTERN_C11 = "C11"
        /** 経路情報計算ルール(中間駅(珩谷)) */
        const val FAREDIST_CALCRULE_PATTERN_C12 = "C12"
        /** 経路情報計算ルール(中間駅(玿谷)) */
        const val FAREDIST_CALCRULE_PATTERN_C13 = "C13"
        /** 経路情報計算ルール(中間駅(珮谷)) */
        const val FAREDIST_CALCRULE_PATTERN_C14 = "C14"
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
        /** 経路情報計算ルール(中間経路(筏谷～筮谷)) */
        const val FAREDIST_CALCRULE_PATTERN_D19 = "D19"
        /** 経路情報計算ルール(中間経路(筏谷～槐谷)) */
        const val FAREDIST_CALCRULE_PATTERN_D20 = "D20"
        /** 経路情報計算ルール(中間経路(筏谷～卯塚)) */
        const val FAREDIST_CALCRULE_PATTERN_D21 = "D21"
        /** 経路情報計算ルール(中間経路(筏谷～瑞堂)) */
        const val FAREDIST_CALCRULE_PATTERN_D22 = "D22"
        /** 経路情報計算ルール(中間経路(筮谷～槐谷)) */
        const val FAREDIST_CALCRULE_PATTERN_D23 = "D23"
        /** 経路情報計算ルール(中間経路(筮谷～卯塚)) */
        const val FAREDIST_CALCRULE_PATTERN_D24 = "D24"
        /** 経路情報計算ルール(中間経路(筮谷～瑞堂)) */
        const val FAREDIST_CALCRULE_PATTERN_D25 = "D25"
        /** 経路情報計算ルール(中間経路(筁谷～筥谷)) */
        const val FAREDIST_CALCRULE_PATTERN_D26 = "D26"
        /** 経路情報計算ルール(中間経路(筁谷～笒谷)) */
        const val FAREDIST_CALCRULE_PATTERN_D27 = "D27"
        /** 経路情報計算ルール(中間経路(筁谷～箬谷)) */
        const val FAREDIST_CALCRULE_PATTERN_D28 = "D28"
        /** 経路情報計算ルール(中間経路(筁谷～卯塚)) */
        const val FAREDIST_CALCRULE_PATTERN_D29 = "D29"
        /** 経路情報計算ルール(中間経路(筥谷～笒谷)) */
        const val FAREDIST_CALCRULE_PATTERN_D30 = "D30"
        /** 経路情報計算ルール(中間経路(筥谷～箬谷)) */
        const val FAREDIST_CALCRULE_PATTERN_D31 = "D31"
        /** 経路情報計算ルール(中間経路(筥谷～卯塚)) */
        const val FAREDIST_CALCRULE_PATTERN_D32 = "D32"
        /** 経路情報計算ルール(中間経路(笒谷～箬谷)) */
        const val FAREDIST_CALCRULE_PATTERN_D33 = "D33"
        /** 経路情報計算ルール(中間経路(笒谷～卯塚)) */
        const val FAREDIST_CALCRULE_PATTERN_D34 = "D34"
        /** 経路情報計算ルール(中間経路(箬谷～卯塚)) */
        const val FAREDIST_CALCRULE_PATTERN_D35 = "D35"
        /** 経路情報計算ルール(中間経路(苕谷～扆谷)) */
        const val FAREDIST_CALCRULE_PATTERN_D36 = "D36"
        /** 経路情報計算ルール(中間経路(苕谷～珩谷)) */
        const val FAREDIST_CALCRULE_PATTERN_D37 = "D37"
        /** 経路情報計算ルール(中間経路(苕谷～玿谷)) */
        const val FAREDIST_CALCRULE_PATTERN_D38 = "D38"
        /** 経路情報計算ルール(中間経路(苕谷～珮谷)) */
        const val FAREDIST_CALCRULE_PATTERN_D39 = "D39"
        /** 経路情報計算ルール(中間経路(苕谷～荍谷)) */
        const val FAREDIST_CALCRULE_PATTERN_D40 = "D40"
        /** 経路情報計算ルール(中間経路(扆谷～珩谷)) */
        const val FAREDIST_CALCRULE_PATTERN_D41 = "D41"
        /** 経路情報計算ルール(中間経路(扆谷～玿谷)) */
        const val FAREDIST_CALCRULE_PATTERN_D42 = "D42"
        /** 経路情報計算ルール(中間経路(扆谷～珮谷)) */
        const val FAREDIST_CALCRULE_PATTERN_D43 = "D43"
        /** 経路情報計算ルール(中間経路(扆谷～荍谷)) */
        const val FAREDIST_CALCRULE_PATTERN_D44 = "D44"
        /** 経路情報計算ルール(中間経路(珩谷～玿谷)) */
        const val FAREDIST_CALCRULE_PATTERN_D45 = "D45"
        /** 経路情報計算ルール(中間経路(珩谷～珮谷)) */
        const val FAREDIST_CALCRULE_PATTERN_D46 = "D46"
        /** 経路情報計算ルール(中間経路(珩谷～荍谷)) */
        const val FAREDIST_CALCRULE_PATTERN_D47 = "D47"
        /** 経路情報計算ルール(中間経路(玿谷～珮谷)) */
        const val FAREDIST_CALCRULE_PATTERN_D48 = "D48"
        /** 経路情報計算ルール(中間経路(玿谷～荍谷)) */
        const val FAREDIST_CALCRULE_PATTERN_D49 = "D49"
        /** 経路情報計算ルール(中間経路(珮谷～荍谷)) */
        const val FAREDIST_CALCRULE_PATTERN_D50 = "D50"
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
        /** 経路情報計算ルール(中間経路(笥谷～卯塚, 卯塚～筁谷)) */
        const val FAREDIST_CALCRULE_PATTERN_E21 = "E21"
        /** 経路情報計算ルール(中間経路(笥谷～卯塚, 卯塚～筥谷)) */
        const val FAREDIST_CALCRULE_PATTERN_E22 = "E22"
        /** 経路情報計算ルール(中間経路(笥谷～卯塚, 卯塚～笒谷)) */
        const val FAREDIST_CALCRULE_PATTERN_E23 = "E23"
        /** 経路情報計算ルール(中間経路(笥谷～卯塚, 卯塚～箬谷)) */
        const val FAREDIST_CALCRULE_PATTERN_E24 = "E24"
        /** 経路情報計算ルール(中間経路(笥谷～瑞堂, 瑞堂～苕谷)) */
        const val FAREDIST_CALCRULE_PATTERN_E25 = "E25"
        /** 経路情報計算ルール(中間経路(笥谷～瑞堂, 瑞堂～扆谷)) */
        const val FAREDIST_CALCRULE_PATTERN_E26 = "E26"
        /** 経路情報計算ルール(中間経路(笥谷～瑞堂, 瑞堂～珩谷)) */
        const val FAREDIST_CALCRULE_PATTERN_E27 = "E27"
        /** 経路情報計算ルール(中間経路(笥谷～瑞堂, 瑞堂～玿谷)) */
        const val FAREDIST_CALCRULE_PATTERN_E28 = "E28"
        /** 経路情報計算ルール(中間経路(笥谷～瑞堂, 瑞堂～珮谷)) */
        const val FAREDIST_CALCRULE_PATTERN_E29 = "E29"
        /** 経路情報計算ルール(中間経路(笥谷～瑞堂, 瑞堂～荍谷)) */
        const val FAREDIST_CALCRULE_PATTERN_E30 = "E30"
        /** 経路情報計算ルール(中間経路(筏谷～卯塚, 卯塚～筁谷)) */
        const val FAREDIST_CALCRULE_PATTERN_E31 = "E31"
        /** 経路情報計算ルール(中間経路(筏谷～卯塚, 卯塚～筥谷)) */
        const val FAREDIST_CALCRULE_PATTERN_E32 = "E32"
        /** 経路情報計算ルール(中間経路(筏谷～卯塚, 卯塚～笒谷)) */
        const val FAREDIST_CALCRULE_PATTERN_E33 = "E33"
        /** 経路情報計算ルール(中間経路(筏谷～卯塚, 卯塚～箬谷)) */
        const val FAREDIST_CALCRULE_PATTERN_E34 = "E34"
        /** 経路情報計算ルール(中間経路(筏谷～瑞堂, 瑞堂～苕谷)) */
        const val FAREDIST_CALCRULE_PATTERN_E35 = "E35"
        /** 経路情報計算ルール(中間経路(筏谷～瑞堂, 瑞堂～扆谷)) */
        const val FAREDIST_CALCRULE_PATTERN_E36 = "E36"
        /** 経路情報計算ルール(中間経路(筏谷～瑞堂, 瑞堂～珩谷)) */
        const val FAREDIST_CALCRULE_PATTERN_E37 = "E37"
        /** 経路情報計算ルール(中間経路(筏谷～瑞堂, 瑞堂～玿谷)) */
        const val FAREDIST_CALCRULE_PATTERN_E38 = "E38"
        /** 経路情報計算ルール(中間経路(筏谷～瑞堂, 瑞堂～珮谷)) */
        const val FAREDIST_CALCRULE_PATTERN_E39 = "E39"
        /** 経路情報計算ルール(中間経路(筏谷～瑞堂, 瑞堂～荍谷)) */
        const val FAREDIST_CALCRULE_PATTERN_E40 = "E40"
        /** 経路情報計算ルール(中間経路(筮谷～卯塚, 卯塚～筁谷)) */
        const val FAREDIST_CALCRULE_PATTERN_E41 = "E41"
        /** 経路情報計算ルール(中間経路(筮谷～卯塚, 卯塚～筥谷)) */
        const val FAREDIST_CALCRULE_PATTERN_E42 = "E42"
        /** 経路情報計算ルール(中間経路(筮谷～卯塚, 卯塚～笒谷)) */
        const val FAREDIST_CALCRULE_PATTERN_E43 = "E43"
        /** 経路情報計算ルール(中間経路(筮谷～卯塚, 卯塚～箬谷)) */
        const val FAREDIST_CALCRULE_PATTERN_E44 = "E44"
        /** 経路情報計算ルール(中間経路(筮谷～瑞堂, 瑞堂～苕谷)) */
        const val FAREDIST_CALCRULE_PATTERN_E45 = "E45"
        /** 経路情報計算ルール(中間経路(筮谷～瑞堂, 瑞堂～扆谷)) */
        const val FAREDIST_CALCRULE_PATTERN_E46 = "E46"
        /** 経路情報計算ルール(中間経路(筮谷～瑞堂, 瑞堂～珩谷)) */
        const val FAREDIST_CALCRULE_PATTERN_E47 = "E47"
        /** 経路情報計算ルール(中間経路(筮谷～瑞堂, 瑞堂～玿谷)) */
        const val FAREDIST_CALCRULE_PATTERN_E48 = "E48"
        /** 経路情報計算ルール(中間経路(筮谷～瑞堂, 瑞堂～珮谷)) */
        const val FAREDIST_CALCRULE_PATTERN_E49 = "E49"
        /** 経路情報計算ルール(中間経路(筮谷～瑞堂, 瑞堂～荍谷)) */
        const val FAREDIST_CALCRULE_PATTERN_E50 = "E50"
        /** 経路情報計算ルール(中間経路(筁谷～卯塚, 卯塚～槐谷)) */
        const val FAREDIST_CALCRULE_PATTERN_E51 = "E51"
        /** 経路情報計算ルール(中間経路(筁谷～卯塚, 卯塚～瑞堂)) */
        const val FAREDIST_CALCRULE_PATTERN_E52 = "E52"
        /** 経路情報計算ルール(中間経路(筥谷～卯塚, 卯塚～槐谷)) */
        const val FAREDIST_CALCRULE_PATTERN_E53 = "E53"
        /** 経路情報計算ルール(中間経路(筥谷～卯塚, 卯塚～瑞堂)) */
        const val FAREDIST_CALCRULE_PATTERN_E54 = "E54"
        /** 経路情報計算ルール(中間経路(笒谷～卯塚, 卯塚～槐谷)) */
        const val FAREDIST_CALCRULE_PATTERN_E55 = "E55"
        /** 経路情報計算ルール(中間経路(笒谷～卯塚, 卯塚～瑞堂)) */
        const val FAREDIST_CALCRULE_PATTERN_E56 = "E56"
        /** 経路情報計算ルール(中間経路(箬谷～卯塚, 卯塚～槐谷)) */
        const val FAREDIST_CALCRULE_PATTERN_E57 = "E57"
        /** 経路情報計算ルール(中間経路(箬谷～卯塚, 卯塚～瑞堂)) */
        const val FAREDIST_CALCRULE_PATTERN_E58 = "E58"
        /** 経路情報計算ルール(中間経路(苕谷～瑞堂, 瑞堂～卯塚)) */
        const val FAREDIST_CALCRULE_PATTERN_E59 = "E59"
        /** 経路情報計算ルール(中間経路(苕谷～瑞堂～卯塚～槐谷線内着)) */
        const val FAREDIST_CALCRULE_PATTERN_E59A = "E59A"
        /** 経路情報計算ルール(中間経路(扆谷～瑞堂, 瑞堂～卯塚)) */
        const val FAREDIST_CALCRULE_PATTERN_E60 = "E60"
        /** 経路情報計算ルール(中間経路(扆谷～瑞堂～卯塚~槐谷線内着)) */
        const val FAREDIST_CALCRULE_PATTERN_E60A = "E60A"
        /** 経路情報計算ルール(中間経路(珩谷～瑞堂, 瑞堂～卯塚)) */
        const val FAREDIST_CALCRULE_PATTERN_E61 = "E61"
        /** 経路情報計算ルール(中間経路(玿谷～瑞堂, 瑞堂～卯塚)) */
        const val FAREDIST_CALCRULE_PATTERN_E62 = "E62"
        /** 経路情報計算ルール(中間経路(玿谷～瑞堂～卯塚~槐谷線内着)) */
        const val FAREDIST_CALCRULE_PATTERN_E62A = "E62A"
        /** 経路情報計算ルール(中間経路(珮谷～瑞堂, 瑞堂～卯塚)) */
        const val FAREDIST_CALCRULE_PATTERN_E63 = "E63"
        /** 経路情報計算ルール(中間経路(珮谷～瑞堂～卯塚~槐谷線内着)) */
        const val FAREDIST_CALCRULE_PATTERN_E63A = "E63A"
        /** 経路情報計算ルール(中間経路(筁谷～卯塚～瑞堂～苕谷)) */
        const val FAREDIST_CALCRULE_PATTERN_F1 = "F1"
        /** 経路情報計算ルール(中間経路(筁谷～卯塚～瑞堂～扆谷)) */
        const val FAREDIST_CALCRULE_PATTERN_F2 = "F2"
        /** 経路情報計算ルール(中間経路(筁谷～卯塚～瑞堂～珩谷)) */
        const val FAREDIST_CALCRULE_PATTERN_F3 = "F3"
        /** 経路情報計算ルール(中間経路(筁谷～卯塚～瑞堂～玿谷)) */
        const val FAREDIST_CALCRULE_PATTERN_F4 = "F4"
        /** 経路情報計算ルール(中間経路(筁谷～卯塚～瑞堂～珮谷)) */
        const val FAREDIST_CALCRULE_PATTERN_F5 = "F5"
        /** 経路情報計算ルール(中間経路(筁谷～卯塚～瑞堂～荍谷)) */
        const val FAREDIST_CALCRULE_PATTERN_F6 = "F6"
        /** 経路情報計算ルール(中間経路(筥谷～卯塚～瑞堂～苕谷)) */
        const val FAREDIST_CALCRULE_PATTERN_F7 = "F7"
        /** 経路情報計算ルール(中間経路(筥谷～卯塚～瑞堂～扆谷)) */
        const val FAREDIST_CALCRULE_PATTERN_F8 = "F8"
        /** 経路情報計算ルール(中間経路(筥谷～卯塚～瑞堂～珩谷)) */
        const val FAREDIST_CALCRULE_PATTERN_F9 = "F9"
        /** 経路情報計算ルール(中間経路(筥谷～卯塚～瑞堂～玿谷)) */
        const val FAREDIST_CALCRULE_PATTERN_F10 = "F10"
        /** 経路情報計算ルール(中間経路(筥谷～卯塚～瑞堂～珮谷)) */
        const val FAREDIST_CALCRULE_PATTERN_F11 = "F11"
        /** 経路情報計算ルール(中間経路(筥谷～卯塚～瑞堂～荍谷)) */
        const val FAREDIST_CALCRULE_PATTERN_F12 = "F12"
        /** 経路情報計算ルール(中間経路(笒谷～卯塚～瑞堂～苕谷)) */
        const val FAREDIST_CALCRULE_PATTERN_F13 = "F13"
        /** 経路情報計算ルール(中間経路(笒谷～卯塚～瑞堂～扆谷)) */
        const val FAREDIST_CALCRULE_PATTERN_F14 = "F14"
        /** 経路情報計算ルール(中間経路(笒谷～卯塚～瑞堂～珩谷)) */
        const val FAREDIST_CALCRULE_PATTERN_F15 = "F15"
        /** 経路情報計算ルール(中間経路(笒谷～卯塚～瑞堂～玿谷)) */
        const val FAREDIST_CALCRULE_PATTERN_F16 = "F16"
        /** 経路情報計算ルール(中間経路(笒谷～卯塚～瑞堂～珮谷)) */
        const val FAREDIST_CALCRULE_PATTERN_F17 = "F17"
        /** 経路情報計算ルール(中間経路(笒谷～卯塚～瑞堂～荍谷)) */
        const val FAREDIST_CALCRULE_PATTERN_F18 = "F18"
        /** 経路情報計算ルール(中間経路(箬谷～卯塚～瑞堂～苕谷)) */
        const val FAREDIST_CALCRULE_PATTERN_F19 = "F19"
        /** 経路情報計算ルール(中間経路(箬谷～卯塚～瑞堂～扆谷)) */
        const val FAREDIST_CALCRULE_PATTERN_F20 = "F20"
        /** 経路情報計算ルール(中間経路(箬谷～卯塚～瑞堂～珩谷)) */
        const val FAREDIST_CALCRULE_PATTERN_F21 = "F21"
        /** 経路情報計算ルール(中間経路(箬谷～卯塚～瑞堂～玿谷)) */
        const val FAREDIST_CALCRULE_PATTERN_F22 = "F22"
        /** 経路情報計算ルール(中間経路(箬谷～卯塚～瑞堂～珮谷)) */
        const val FAREDIST_CALCRULE_PATTERN_F23 = "F23"
        /** 経路情報計算ルール(中間経路(箬谷～卯塚～瑞堂～荍谷)) */
        const val FAREDIST_CALCRULE_PATTERN_F24 = "F24"
        /** 経路情報計算ルール(中間経路(苕谷～瑞堂～卯塚～槐谷)) */
        const val FAREDIST_CALCRULE_PATTERN_F25 = "F25"
        /** 経路情報計算ルール(中間経路(扆谷～瑞堂～卯塚～槐谷)) */
        const val FAREDIST_CALCRULE_PATTERN_F26 = "F26"
        /** 経路情報計算ルール(中間経路(珩谷～瑞堂～卯塚～槐谷)) */
        const val FAREDIST_CALCRULE_PATTERN_F27 = "F27"
        /** 経路情報計算ルール(中間経路(玿谷～瑞堂～卯塚～槐谷)) */
        const val FAREDIST_CALCRULE_PATTERN_F28 = "F28"
        /** 経路情報計算ルール(中間経路(珮谷～瑞堂～卯塚～槐谷)) */
        const val FAREDIST_CALCRULE_PATTERN_F29 = "F29"
    }
}
