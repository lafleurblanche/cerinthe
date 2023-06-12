package net.konohana.sakuya.cerinthe.utils.check

import arrow.core.Either
import arrow.core.left
import arrow.core.right
import net.konohana.sakuya.cerinthe.utils.result.ResultError
import net.konohana.sakuya.cerinthe.utils.result.ResultNormal
import net.konohana.sakuya.cerinthe.constant.CheckValueConst

fun dayOfUseNotSetCheck(dayOfUse: String): Either<ResultError, ResultNormal> {
    return if (dayOfUse == CheckValueConst.CHECK_VALUE_DAYOFUSE_DEFAULT) ResultError.DayOfUseNotSet.left()
    else ResultNormal.CheckSuccess.right()
}
