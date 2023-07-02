package net.konohana.sakuya.cerinthe.utils

import arrow.core.Either
import arrow.core.left
import arrow.core.right
import net.konohana.sakuya.cerinthe.constant.LimoniumUrlPrefixConst
import net.konohana.sakuya.cerinthe.constant.PassengerGroupConst.Companion.PASSENGER_GROUP_ADULT
import net.konohana.sakuya.cerinthe.constant.PassengerGroupConst.Companion.PASSENGER_GROUP_CHILD
import net.konohana.sakuya.cerinthe.constant.PassengerGroupConst.Companion.PASSENGER_GROUP_HALF
import net.konohana.sakuya.cerinthe.constant.SectorKbnConst.Companion.SECTOR_KBN_AREAGW
import net.konohana.sakuya.cerinthe.constant.SectorKbnConst.Companion.SECTOR_KBN_ENJURW
import net.konohana.sakuya.cerinthe.constant.ServiceBaseUrlConst.Companion.LIMONIUM_SERVER_BASE_URL
import net.konohana.sakuya.cerinthe.plugins.PassengerNotApplicableException
import net.konohana.sakuya.cerinthe.plugins.SectorKbnNotApplicableException
import net.konohana.sakuya.cerinthe.plugins.TicketTypeNotApplicableException
import net.konohana.sakuya.cerinthe.utils.result.ResultError

fun limoniumApiUrlJudge(sectorKbn: String, passengerGrp: String, ticketType: String): String {

    val oneway = "片道乗車券"
    val roundTrip = "往復乗車券"

    val url = when(sectorKbn) {
        SECTOR_KBN_AREAGW -> when(ticketType) {
            oneway -> argwOnewayRegistUrlSelect(passengerGrp)
            roundTrip -> argwRoundTripRegistUrlSelect(passengerGrp)
            else -> ResultError.TicketTypeNotApplicable.left()
        }
        SECTOR_KBN_ENJURW -> when(ticketType) {
            oneway -> enjuOnewayRegistUrlSelect(passengerGrp)
            roundTrip -> enjuRoundTripRegistUrlSelect(passengerGrp)
            else -> ResultError.TicketTypeNotApplicable.left()
        }
        else -> ResultError.SectorNotApplicable.left()
    }

    when (url) {
        is Either.Left -> when (url.value) {
            is ResultError.TicketTypeNotApplicable -> throw TicketTypeNotApplicableException()
            is ResultError.PassengerNotApplicable -> throw PassengerNotApplicableException()
            is ResultError.SectorNotApplicable -> throw SectorKbnNotApplicableException()
        }
        is Either.Right -> url.value
    }

    return buildString {
        append(LIMONIUM_SERVER_BASE_URL)
        append(url.value)
    }
}

private fun argwOnewayRegistUrlSelect(passengerGrp: String): Either<ResultError, String> {
    val argwRegistUrl = when(passengerGrp) {
        PASSENGER_GROUP_ADULT -> LimoniumUrlPrefixConst.ARGW_ONEWAY_ADULT.right()
        PASSENGER_GROUP_HALF -> LimoniumUrlPrefixConst.ARGW_ONEWAY_HALF.right()
        else -> ResultError.PassengerNotApplicable.left()
    }
    return argwRegistUrl
}

private fun argwRoundTripRegistUrlSelect(passengerGrp: String): Either<ResultError, String> {
    val argwRegistUrl = when(passengerGrp) {
        PASSENGER_GROUP_ADULT -> LimoniumUrlPrefixConst.ARGW_ROUNDTRIP_ADULT.right()
        PASSENGER_GROUP_HALF -> LimoniumUrlPrefixConst.ARGW_ROUNDTRIP_HALF.right()
        else -> ResultError.PassengerNotApplicable.left()
    }
    return argwRegistUrl
}

private fun enjuOnewayRegistUrlSelect(passengerGrp: String): Either<ResultError, String> {
    val enjuRegistUrl = when(passengerGrp) {
        PASSENGER_GROUP_ADULT -> LimoniumUrlPrefixConst.ENJU_ONEWAY_ADULT.right()
        PASSENGER_GROUP_HALF -> LimoniumUrlPrefixConst.ENJU_ONEWAY_HALF.right()
        PASSENGER_GROUP_CHILD -> LimoniumUrlPrefixConst.ENJU_ONEWAY_CHILD.right()
        else -> ResultError.PassengerNotApplicable.left()
    }
    return enjuRegistUrl
}

private fun enjuRoundTripRegistUrlSelect(passengerGrp: String): Either<ResultError, String> {
    val enjuRegistUrl = when(passengerGrp) {
        PASSENGER_GROUP_ADULT -> LimoniumUrlPrefixConst.ENJU_ROUNDTRIP_ADULT.right()
        PASSENGER_GROUP_HALF -> LimoniumUrlPrefixConst.ENJU_ROUNDTRIP_HALF.right()
        PASSENGER_GROUP_CHILD -> LimoniumUrlPrefixConst.ENJU_ROUNDTRIP_CHILD.right()
        else -> ResultError.PassengerNotApplicable.left()
    }
    return enjuRegistUrl
}
