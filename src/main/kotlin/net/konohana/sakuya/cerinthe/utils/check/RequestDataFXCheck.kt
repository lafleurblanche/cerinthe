package net.konohana.sakuya.cerinthe.utils.check

import arrow.core.Either
import net.konohana.sakuya.cerinthe.dto.request.CerintheFXRequestData
import net.konohana.sakuya.cerinthe.plugins.DuplicateStaCodeException
import net.konohana.sakuya.cerinthe.plugins.FXDayOfUseNotSetException
import net.konohana.sakuya.cerinthe.plugins.FXDuplicateStaNameException
import net.konohana.sakuya.cerinthe.plugins.FXMemberNotSetException
import net.konohana.sakuya.cerinthe.plugins.FXStaNameNotSetException
import net.konohana.sakuya.cerinthe.plugins.MonthNotSetException
import net.konohana.sakuya.cerinthe.plugins.StaCodeNotSetException
import net.konohana.sakuya.cerinthe.utils.result.ResultError
import net.konohana.sakuya.cerinthe.utils.result.ResultNormal

fun requestDataFXCheck(req: CerintheFXRequestData): ResultNormal.CheckSuccess {
    val resultStaName = staNameCheck(req.fromSta, req.toSta)
    val resultStaCode = staCodeCheck(req.fromStaCode, req.toStaCode)
    val resultMember = memberNotSetCheck(req.adultMember, req.halfMember, req.childMember)
    val resultMonth = monthNotSetCheck(req.monthOfUse)
    val resultDayOfUse = dayOfUseNotSetCheck(req.dayOfUse)
    when (resultStaName) {
        is Either.Left -> when (resultStaName.value) {
            is ResultError.StaNameNotSet -> throw FXStaNameNotSetException()
            is ResultError.StaNameDuplicate -> throw FXDuplicateStaNameException()
        }
        is Either.Right -> {}
    }
    when (resultStaCode) {
        is Either.Left -> when (resultStaCode.value) {
            is ResultError.StaCodeNotSet -> throw StaCodeNotSetException()
            is ResultError.StaCodeDuplicate -> throw DuplicateStaCodeException()
        }
        is Either.Right -> {}
    }
    when (resultMember) {
        is Either.Left -> when (resultMember.value) {
            is ResultError.MemberNotSet -> throw FXMemberNotSetException()
        }
        is Either.Right -> {}
    }
    when (resultDayOfUse) {
        is Either.Left -> when (resultDayOfUse.value) {
            is ResultError.DayOfUseNotSet -> throw FXDayOfUseNotSetException()
        }
        is Either.Right -> {}
    }
    when (resultMonth) {
        is Either.Left -> when (resultMonth.value) {
            is ResultError.MonthNotSet -> throw MonthNotSetException()
        }
        is Either.Right -> {}
    }
    return ResultNormal.CheckSuccess
}
