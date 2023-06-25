package net.konohana.sakuya.cerinthe.utils.check

import arrow.core.Either
import arrow.core.left
import arrow.core.right
import net.konohana.sakuya.cerinthe.constant.CheckValueConst
import net.konohana.sakuya.cerinthe.utils.result.ResultError
import net.konohana.sakuya.cerinthe.utils.result.ResultNormal

fun staNameCheck(from: String, to: String): Either<ResultError, ResultNormal> {
    return if (
        from == CheckValueConst.CHECK_VALUE_FROMSTA_DEFAULT ||
        to == CheckValueConst.CHECK_VALUE_TOSTA_DEFAULT) ResultError.StaNameNotSet.left()
    else if (
        from == CheckValueConst.CHECK_VALUE_STATION_UNDEFINED ||
        to == CheckValueConst.CHECK_VALUE_STATION_UNDEFINED) ResultError.StaNameNotSet.left()
    else if ( from == to) {
        ResultError.StaNameDuplicate.left()
    }
    else ResultNormal.CheckSuccess.right()
}
