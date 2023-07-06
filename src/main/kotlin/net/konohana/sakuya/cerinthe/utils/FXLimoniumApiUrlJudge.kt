package net.konohana.sakuya.cerinthe.utils

import arrow.core.Either
import arrow.core.left
import arrow.core.right
import net.konohana.sakuya.cerinthe.constant.LimoniumUrlPrefixConst
import net.konohana.sakuya.cerinthe.constant.PassengerGroupConst
import net.konohana.sakuya.cerinthe.constant.SectorKbnConst
import net.konohana.sakuya.cerinthe.constant.ServiceBaseUrlConst
import net.konohana.sakuya.cerinthe.plugins.PassengerNotApplicableException
import net.konohana.sakuya.cerinthe.plugins.SectorKbnNotApplicableException
import net.konohana.sakuya.cerinthe.plugins.TicketTypeNotApplicableException
import net.konohana.sakuya.cerinthe.utils.result.ResultError

fun fxLimoniumApiUrlJudge(sectorKbn: String, passengerGrp: String, ticketType: String): String {

    val oneway = "片道乗車券"
    val roundTrip = "往復乗車券"

    val url = when(sectorKbn) {
        SectorKbnConst.SECTOR_KBN_AREAGW -> when(ticketType) {
            oneway -> argwOnewayRegistUrlSelect(passengerGrp)
            roundTrip -> argwRoundTripRegistUrlSelect(passengerGrp)
            else -> ResultError.TicketTypeNotApplicable.left()
        }
        SectorKbnConst.SECTOR_KBN_ENJURW -> when(ticketType) {
            oneway -> enjuFXOnewayRegistUrlSelect(passengerGrp)
            roundTrip -> enjuFXRoundTripRegistUrlSelect(passengerGrp)
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
        append(ServiceBaseUrlConst.LIMONIUM_SERVER_BASE_URL)
        append(url.value)
    }
}

private fun argwOnewayRegistUrlSelect(passengerGrp: String): Either<ResultError, String> {
    val argwRegistUrl = when(passengerGrp) {
        PassengerGroupConst.PASSENGER_GROUP_ADULT -> LimoniumUrlPrefixConst.ARGW_ONEWAY_ADULT.right()
        PassengerGroupConst.PASSENGER_GROUP_HALF -> LimoniumUrlPrefixConst.ARGW_ONEWAY_HALF.right()
        else -> ResultError.PassengerNotApplicable.left()
    }
    return argwRegistUrl
}

private fun argwRoundTripRegistUrlSelect(passengerGrp: String): Either<ResultError, String> {
    val argwRegistUrl = when(passengerGrp) {
        PassengerGroupConst.PASSENGER_GROUP_ADULT -> LimoniumUrlPrefixConst.ARGW_ROUNDTRIP_ADULT.right()
        PassengerGroupConst.PASSENGER_GROUP_HALF -> LimoniumUrlPrefixConst.ARGW_ROUNDTRIP_HALF.right()
        else -> ResultError.PassengerNotApplicable.left()
    }
    return argwRegistUrl
}

private fun enjuFXOnewayRegistUrlSelect(passengerGrp: String): Either<ResultError, String> {
    val enjuRegistUrl = when(passengerGrp) {
        PassengerGroupConst.PASSENGER_GROUP_ADULT -> LimoniumUrlPrefixConst.ENJUFX_ONEWAY_ADULT.right()
        PassengerGroupConst.PASSENGER_GROUP_HALF -> LimoniumUrlPrefixConst.ENJUFX_ONEWAY_HALF.right()
        PassengerGroupConst.PASSENGER_GROUP_CHILD -> LimoniumUrlPrefixConst.ENJUFX_ONEWAY_CHILD.right()
        else -> ResultError.PassengerNotApplicable.left()
    }
    return enjuRegistUrl
}

private fun enjuFXRoundTripRegistUrlSelect(passengerGrp: String): Either<ResultError, String> {
    val enjuRegistUrl = when(passengerGrp) {
        PassengerGroupConst.PASSENGER_GROUP_ADULT -> LimoniumUrlPrefixConst.ENJUFX_ROUNDTRIP_ADULT.right()
        PassengerGroupConst.PASSENGER_GROUP_HALF -> LimoniumUrlPrefixConst.ENJUFX_ROUNDTRIP_HALF.right()
        PassengerGroupConst.PASSENGER_GROUP_CHILD -> LimoniumUrlPrefixConst.ENJUFX_ROUNDTRIP_CHILD.right()
        else -> ResultError.PassengerNotApplicable.left()
    }
    return enjuRegistUrl
}
