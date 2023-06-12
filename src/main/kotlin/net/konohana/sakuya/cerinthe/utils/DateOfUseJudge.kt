package net.konohana.sakuya.cerinthe.utils

import net.konohana.sakuya.cerinthe.constant.DateOfUseConst.Companion.DATE_NOT_SET
import net.konohana.sakuya.cerinthe.constant.DateOfUseConst.Companion.DATE_SET_DAY_AFTER_TOMORROW
import net.konohana.sakuya.cerinthe.constant.DateOfUseConst.Companion.DATE_SET_ONE_MONTH
import net.konohana.sakuya.cerinthe.constant.DateOfUseConst.Companion.DATE_SET_TODAY
import net.konohana.sakuya.cerinthe.constant.DateOfUseConst.Companion.DATE_SET_TOMORROW
import net.konohana.sakuya.cerinthe.utils.date.getDayAfterTomorrowDate
import net.konohana.sakuya.cerinthe.utils.date.getOneMonthDate
import net.konohana.sakuya.cerinthe.utils.date.getToDayDate
import net.konohana.sakuya.cerinthe.utils.date.getTomorrowDate

/**
 * ## 利用日判定
 * @author lafleurblanche
 */
fun dateOfUseJudge(dateOfUse: String): String {
    val date = when(dateOfUse) {
        in DATE_NOT_SET -> DATE_NOT_SET
        in DATE_SET_TODAY -> getToDayDate()
        in DATE_SET_TOMORROW -> getTomorrowDate()
        in DATE_SET_DAY_AFTER_TOMORROW -> getDayAfterTomorrowDate()
        in DATE_SET_ONE_MONTH -> getOneMonthDate()
        else -> DATE_NOT_SET
    }
    return date
}
