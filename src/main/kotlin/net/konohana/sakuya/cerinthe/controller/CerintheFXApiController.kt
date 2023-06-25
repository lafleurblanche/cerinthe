package net.konohana.sakuya.cerinthe.controller

import io.ktor.http.HttpStatusCode
import io.ktor.server.application.call
import io.ktor.server.request.receive
import io.ktor.server.response.respond
import io.ktor.server.routing.Route
import io.ktor.server.routing.post
import io.ktor.server.routing.route
import net.konohana.sakuya.cerinthe.dto.request.CerintheFXRequestData
import net.konohana.sakuya.cerinthe.dto.response.CerintheAPIResponse
import net.konohana.sakuya.cerinthe.utils.check.requestDataFXCheck
import net.konohana.sakuya.cerinthe.utils.fareDistCalcRuleJudgement
import net.konohana.sakuya.cerinthe.utils.fxRouteCodeEnjuRWSelect
import net.konohana.sakuya.cerinthe.utils.fxRouteInfoEnjuRWSelect
import net.konohana.sakuya.cerinthe.utils.passengerGroupJudge

fun Route.cerintheFXApiController() {
    route("/cerinthe/fx/api/regist-ticket") {
        post {
            val req = call.receive<CerintheFXRequestData>()
            println(req)
            val from = req.fromStaCode
            val to = req.toStaCode
            requestDataFXCheck(req)
            // 旅客グループ判定
            val passengerGrp = passengerGroupJudge(
                req.adultMember,
                req.halfMember,
                req.childMember
            )
            println(passengerGrp)
            // 経路情報判定
            val routeInfo: String = fxRouteInfoEnjuRWSelect(from, to)
            println("経路情報${routeInfo}")
            // 経路情報コード判定
            val routeCode: String = fxRouteCodeEnjuRWSelect(from, to)
            // 距離計算ルール判定
            val calcPattern = fareDistCalcRuleJudgement(routeCode)
            println(calcPattern)
            call.respond(
                HttpStatusCode.OK,
                CerintheAPIResponse(
                    "OK",
                    "CerintheFX",
                    "通信成功"
                )
            )
        }
    }
}
