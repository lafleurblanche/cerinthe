package net.konohana.sakuya.cerinthe.plugins

import io.ktor.http.HttpStatusCode
import io.ktor.server.application.Application
import io.ktor.server.application.install
import io.ktor.server.plugins.statuspages.StatusPages
import io.ktor.server.response.respond
import net.konohana.sakuya.cerinthe.dto.response.CerintheAPIResponse

fun Application.configureRouting() {
    install(StatusPages) {
        exception<Throwable> { call, _ ->
            call.respond(
                HttpStatusCode.InternalServerError,
                CerintheAPIResponse(
                    "Internal Server Error",
                    "内部エラー",
                    "ERROR0001"
                )
            )
        }
        exception<SectorKbnMismatchException> { call, _ ->
            call.respond(
                HttpStatusCode.BadRequest,
                CerintheAPIResponse(
                    "BadRequest",
                    "系統区分誤り",
                    "ERROR0002"
                )
            )
        }
        exception<DuplicateStaNameException> { call, _ ->
            call.respond(
                HttpStatusCode.BadRequest,
                CerintheAPIResponse(
                    "BadRequest",
                    "乗車駅と降車駅が同一です。",
                    "ERROR0003"
                )
            )
        }
        exception<StaNameNotSetException> { call, _ ->
            call.respond(
                HttpStatusCode.BadRequest,
                CerintheAPIResponse(
                    "BadRequest",
                    "乗車駅または降車駅が未設定です。",
                    "ERROR0004"
                )
            )
        }
        exception<DayOfUseNotSetException> { call, _ ->
            call.respond(
                HttpStatusCode.BadRequest,
                CerintheAPIResponse(
                    "BadRequest",
                    "利用日が未設定です。",
                    "ERROR0005"
                )
            )
        }
        exception<MemberNotSetException> { call, _ ->
            call.respond(
                HttpStatusCode.BadRequest,
                CerintheAPIResponse(
                    "BadRequest",
                    "乗車人員が未設定です。",
                    "ERROR0006"
                )
            )
        }
        exception<SectorKbnNotApplicableException> { call, _ ->
            call.respond(
                HttpStatusCode.InternalServerError,
                CerintheAPIResponse(
                    "Internal Server Error",
                    "系統区分該当なし",
                    "ERROR0007"
                )
            )
        }
        exception<PassengerNotApplicableException> { call, _ ->
            call.respond(
                HttpStatusCode.InternalServerError,
                CerintheAPIResponse(
                    "Internal Server Error",
                    "旅客区分該当なし",
                    "ERROR0008"
                )
            )
        }
        exception<TicketTypeNotApplicableException> { call, _ ->
            call.respond(
                HttpStatusCode.InternalServerError,
                CerintheAPIResponse(
                    "Internal Server Error",
                    "券面種別該当なし",
                    "ERROR0009"
                )
            )
        }
        exception<DuplicateStaCodeException> { call, _ ->
            call.respond(
                HttpStatusCode.OK,
                CerintheAPIResponse(
                    "BadRequest",
                    "乗車駅コードと降車駅コードが同一です。",
                    "ERROR0010"
                )
            )
        }
        exception<StaCodeNotSetException> { call, _ ->
            call.respond(
                HttpStatusCode.OK,
                CerintheAPIResponse(
                    "BadRequest",
                    "乗車駅コードまたは降車駅コードが未設定です。",
                    "ERROR0010"
                )
            )
        }
        exception<MonthNotSetException> { call, _ ->
            call.respond(
                HttpStatusCode.OK,
                CerintheAPIResponse(
                    "BadRequest",
                    "利用月が未設定です。",
                    "ERROR0011"
                )
            )
        }
        exception<FXDuplicateStaNameException> { call, _ ->
            call.respond(
                HttpStatusCode.OK,
                CerintheAPIResponse(
                    "BadRequest",
                    "乗車駅と降車駅が同一です。",
                    "ERROR00012"
                )
            )
        }
        exception<FXStaNameNotSetException> { call, _ ->
            call.respond(
                HttpStatusCode.OK,
                CerintheAPIResponse(
                    "BadRequest",
                    "乗車駅または降車駅が未設定です。",
                    "ERROR0013"
                )
            )
        }
        exception<FXDayOfUseNotSetException> { call, _ ->
            call.respond(
                HttpStatusCode.OK,
                CerintheAPIResponse(
                    "BadRequest",
                    "利用日が未設定です。",
                    "ERROR0014"
                )
            )
        }
        exception<FXMemberNotSetException> { call, _ ->
            call.respond(
                HttpStatusCode.OK,
                CerintheAPIResponse(
                    "BadRequest",
                    "乗車人員が未設定です。",
                    "ERROR0015"
                )
            )
        }
        exception<InvalidDateException> { call, _ ->
            call.respond(
                HttpStatusCode.OK,
                CerintheAPIResponse(
                    "BadRequest",
                    "乗車月及び乗車日が不正です。",
                    "ERROR0016"
                )
            )
        }
        exception<InvalidMemberException> { call, _ ->
            call.respond(
                HttpStatusCode.OK,
                CerintheAPIResponse(
                    "BadRequest",
                    "乗車人員が不正です。",
                    "ERROR0017"
                )
            )
        }
        exception<InvalidStaNameException> { call, _ ->
            call.respond(
                HttpStatusCode.OK,
                CerintheAPIResponse(
                    "BadRequest",
                    "乗車駅または降車駅が不正です。",
                    "ERROR0018"
                )
            )
        }
        exception<FXSectorKbnMismatchException> { call, _ ->
            call.respond(
                HttpStatusCode.OK,
                CerintheAPIResponse(
                    "BadRequest",
                    "系統区分誤り",
                    "ERROR0019"
                )
            )
        }
    }
}

class SectorKbnMismatchException : RuntimeException()
class DuplicateStaNameException : RuntimeException()
class StaNameNotSetException : RuntimeException()
class DuplicateStaCodeException : RuntimeException()
class StaCodeNotSetException : RuntimeException()
class MonthNotSetException : RuntimeException()
class DayOfUseNotSetException : RuntimeException()
class MemberNotSetException : RuntimeException()
class SectorKbnNotApplicableException : RuntimeException()
class PassengerNotApplicableException : RuntimeException()
class TicketTypeNotApplicableException : RuntimeException()

class FXSectorKbnMismatchException : RuntimeException()
class FXDuplicateStaNameException : RuntimeException()
class FXStaNameNotSetException : RuntimeException()
class FXDayOfUseNotSetException : RuntimeException()
class FXMemberNotSetException : RuntimeException()
class InvalidDateException : RuntimeException()
class InvalidMemberException : RuntimeException()
class InvalidStaNameException : RuntimeException()
