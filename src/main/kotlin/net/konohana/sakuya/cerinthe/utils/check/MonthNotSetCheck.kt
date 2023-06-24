package net.konohana.sakuya.cerinthe.utils.check

import arrow.core.Either
import arrow.core.left
import arrow.core.right
import net.konohana.sakuya.cerinthe.constant.CheckValueConst
import net.konohana.sakuya.cerinthe.utils.result.ResultError
import net.konohana.sakuya.cerinthe.utils.result.ResultNormal

fun monthNotSetCheck(month: String): Either<ResultError, ResultNormal> {
    return if (month == CheckValueConst.CHECK_VALUE_MONTH_DEFAULT) ResultError.MonthNotSet.left()
    else ResultNormal.CheckSuccess.right()
}
