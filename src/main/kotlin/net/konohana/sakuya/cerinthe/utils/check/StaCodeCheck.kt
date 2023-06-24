package net.konohana.sakuya.cerinthe.utils.check

import arrow.core.Either
import arrow.core.left
import arrow.core.right
import net.konohana.sakuya.cerinthe.constant.CheckValueConst
import net.konohana.sakuya.cerinthe.utils.result.ResultError
import net.konohana.sakuya.cerinthe.utils.result.ResultNormal

fun staCodeCheck(fromStaCode: String, toStaCode: String): Either<ResultError, ResultNormal> {
    return if (
        fromStaCode == CheckValueConst.CHECK_VALUE_FROMSTA_CODE_DEFAULT ||
        toStaCode == CheckValueConst.CHECK_VALUE_TOSTA_CODE_DEFAULT) ResultError.StaCodeNotSet.left()
    else if ( fromStaCode == toStaCode) {
        ResultError.StaCodeDuplicate.left()
    }
    else ResultNormal.CheckSuccess.right()
}
