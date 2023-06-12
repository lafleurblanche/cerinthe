package net.konohana.sakuya.cerinthe.utils.check

import arrow.core.Either
import net.konohana.sakuya.cerinthe.dto.request.CerintheRequestData
import net.konohana.sakuya.cerinthe.plugins.DayOfUseNotSetException
import net.konohana.sakuya.cerinthe.plugins.DuplicateStaNameException
import net.konohana.sakuya.cerinthe.plugins.MemberNotSetException
import net.konohana.sakuya.cerinthe.plugins.StaNameNotSetException
import net.konohana.sakuya.cerinthe.utils.result.ResultError
import net.konohana.sakuya.cerinthe.utils.result.ResultNormal

fun requestDataCheck(req: CerintheRequestData): ResultNormal.CheckSuccess {
    val resultStaName = staNameCheck(req.fromSta, req.toSta)
    val resultMember = memberNotSetCheck(req.adultMember, req.halfMember, req.childMember)
    val resultDayOfUse = dayOfUseNotSetCheck(req.dateOfUse)
    when (resultStaName) {
        is Either.Left -> when (resultStaName.value) {
            is ResultError.StaNameNotSet -> throw StaNameNotSetException()
            is ResultError.StaNameDuplicate -> throw DuplicateStaNameException()
        }
        is Either.Right -> {}
    }
    when (resultMember) {
        is Either.Left -> when (resultMember.value) {
            is ResultError.MemberNotSet -> throw MemberNotSetException()
        }
        is Either.Right -> {}
    }
    when (resultDayOfUse) {
        is Either.Left -> when (resultDayOfUse.value) {
            is ResultError.DayOfUseNotSet -> throw DayOfUseNotSetException()
        }
        is Either.Right -> {}
    }
    return ResultNormal.CheckSuccess
}
