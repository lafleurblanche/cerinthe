package net.konohana.sakuya.cerinthe.utils

import net.konohana.sakuya.cerinthe.constant.MemberConst.Companion.MEMBER_MIN
import net.konohana.sakuya.cerinthe.constant.MemberConst.Companion.MEMBER_NONE
import net.konohana.sakuya.cerinthe.constant.PassengerGroupConst.Companion.PASSENGER_GROUP_ADULT
import net.konohana.sakuya.cerinthe.constant.PassengerGroupConst.Companion.PASSENGER_GROUP_ADULT_CHILD
import net.konohana.sakuya.cerinthe.constant.PassengerGroupConst.Companion.PASSENGER_GROUP_ADULT_HALF
import net.konohana.sakuya.cerinthe.constant.PassengerGroupConst.Companion.PASSENGER_GROUP_ALL_KIND
import net.konohana.sakuya.cerinthe.constant.PassengerGroupConst.Companion.PASSENGER_GROUP_CHILD
import net.konohana.sakuya.cerinthe.constant.PassengerGroupConst.Companion.PASSENGER_GROUP_HALF
import net.konohana.sakuya.cerinthe.constant.PassengerGroupConst.Companion.PASSENGER_GROUP_HALF_CHILD

/**
 * ## 旅客グループ判定
 * 乗車人員数から旅客グループを判定します.
 * @param adultMember 大人乗車人員
 * @param halfMember 半額乗車人員
 * @param childMember 小児乗車人員
 * @return 旅客グループ
 */
fun passengerGroupJudge(
    adultMember: String,
    halfMember: String,
    childMember: String
): String {
    val adultMemberToInt: Int = adultMember.toInt()
    val halfMemberToInt: Int = halfMember.toInt()
    val childMemberToInt: Int = childMember.toInt()
    val passengerGroup = when {
        adultMemberToInt != MEMBER_NONE -> adultOnlyCheck(halfMemberToInt, childMemberToInt)
        halfMemberToInt != MEMBER_NONE -> halfOnlyCheck(adultMemberToInt, childMemberToInt)
        childMemberToInt != MEMBER_NONE -> childOnlyCheck(adultMemberToInt, halfMemberToInt)
        else -> throw RuntimeException()
    }
    println("旅客区分:${passengerGroup}")
    return passengerGroup
}

// 大人単独チェック
private fun adultOnlyCheck(childMember: Int ,halfMember: Int): String {
    return if (halfMember >= MEMBER_MIN && childMember >= MEMBER_MIN) {
        PASSENGER_GROUP_ALL_KIND
    } else if (halfMember >= MEMBER_MIN && childMember == MEMBER_NONE) {
        PASSENGER_GROUP_ADULT_HALF
    } else if (halfMember == MEMBER_NONE && childMember >= MEMBER_MIN) {
        PASSENGER_GROUP_ADULT_CHILD
    } else {
        PASSENGER_GROUP_ADULT
    }
}

// 半額単独チェック
private fun halfOnlyCheck(adultMember: Int, childMember: Int): String {
    return if (adultMember >= MEMBER_MIN && childMember >= MEMBER_MIN) {
        PASSENGER_GROUP_ALL_KIND
    } else if (adultMember >= MEMBER_MIN && childMember == MEMBER_NONE) {
        PASSENGER_GROUP_ADULT_HALF
    } else if (adultMember == MEMBER_NONE && childMember >= MEMBER_MIN) {
        PASSENGER_GROUP_HALF_CHILD
    } else {
        PASSENGER_GROUP_HALF
    }
}

// 小児単独チェック
private fun childOnlyCheck(adultMember: Int, halfMember: Int): String {
    return if (adultMember >= MEMBER_MIN && halfMember >= MEMBER_MIN) {
        PASSENGER_GROUP_ALL_KIND
    } else if (adultMember >= MEMBER_MIN && halfMember == MEMBER_NONE) {
        PASSENGER_GROUP_ADULT_CHILD
    } else if (adultMember == MEMBER_NONE && halfMember >= MEMBER_MIN) {
        PASSENGER_GROUP_HALF_CHILD
    } else {
        PASSENGER_GROUP_CHILD
    }
}
