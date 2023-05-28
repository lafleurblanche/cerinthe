package net.konohana.sakuya.cerinthe.constant

/**
 * ## 旅客グループ定数クラス
 * @author lafleurblanche
 */
class PassengerGroupConst {
    companion object {
        /** 旅客グループ(大人) */
        const val PASSENGER_GROUP_ADULT = "A"
        /** 旅客グループ(半額) */
        const val PASSENGER_GROUP_HALF = "H"
        /** 旅客グループ(小児) */
        const val PASSENGER_GROUP_CHILD = "C"
        /** 旅客グループ(大人・半額) */
        const val PASSENGER_GROUP_ADULT_HALF = "AH"
        /** 旅客グループ(大人・小児) */
        const val PASSENGER_GROUP_ADULT_CHILD = "AC"
        /** 旅客グループ(半額・小児) */
        const val PASSENGER_GROUP_HALF_CHILD = "HC"
        /** 旅客グループ(全区分) */
        const val PASSENGER_GROUP_ALL_KIND = "AK"
    }
}
