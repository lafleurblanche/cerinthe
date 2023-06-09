package net.konohana.sakuya.cerinthe.utils.result

open class ResultError {
    object NotFound : ResultError()
    object StaCodeDuplicate : ResultError()
    object StaCodeNotSet : ResultError()
    object StaNameDuplicate : ResultError()
    object StaNameNotSet : ResultError()
    object DayOfUseNotSet : ResultError()
    object MonthNotSet : ResultError()
    object MemberNotSet : ResultError()

    object SectorNotApplicable : ResultError()
    object PassengerNotApplicable : ResultError()

    object TicketTypeNotApplicable : ResultError()
}

open class ResultNormal {
    object NotDuplicate : ResultNormal()
    object CheckSuccess : ResultNormal()
}
