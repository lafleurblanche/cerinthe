package net.konohana.sakuya.cerinthe.utils.check

import arrow.core.Either
import arrow.core.left
import arrow.core.right
import net.konohana.sakuya.cerinthe.constant.CheckValueConst
import net.konohana.sakuya.cerinthe.utils.result.ResultError
import net.konohana.sakuya.cerinthe.utils.result.ResultNormal

fun memberNotSetCheck(
    adultMember: String,
    halfMember: String,
    childMember: String,
): Either<ResultError, ResultNormal> {
    return if (
        adultMember == CheckValueConst.CHECK_VALUE_MEMBER_DEFAULT &&
        halfMember == CheckValueConst.CHECK_VALUE_MEMBER_DEFAULT &&
        childMember == CheckValueConst.CHECK_VALUE_MEMBER_DEFAULT) ResultError.MemberNotSet.left()
    else ResultNormal.CheckSuccess.right()
}
