package net.konohana.sakuya.cerinthe.controller

import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.engine.cio.CIO
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.request.get
import io.ktor.http.HttpStatusCode
import io.ktor.serialization.kotlinx.json.json
import io.ktor.server.application.call
import io.ktor.server.request.receive
import io.ktor.server.response.respond
import io.ktor.server.routing.Route
import io.ktor.server.routing.post
import io.ktor.server.routing.route
import kotlinx.serialization.json.Json
import net.konohana.sakuya.cerinthe.dto.request.CerintheFXRequestData
import net.konohana.sakuya.cerinthe.dto.response.CerintheAPIResponse
import net.konohana.sakuya.cerinthe.dto.response.PhaceliaFareDistResponse
import net.konohana.sakuya.cerinthe.dto.response.TiarellaApiResponse
import net.konohana.sakuya.cerinthe.utils.calcDist
import net.konohana.sakuya.cerinthe.utils.check.requestDataFXCheck
import net.konohana.sakuya.cerinthe.utils.fareDistCalcRuleJudgement
import net.konohana.sakuya.cerinthe.utils.farecalc.fareCalcUtil
import net.konohana.sakuya.cerinthe.utils.fxApiUrlEnjuJudge
import net.konohana.sakuya.cerinthe.utils.fxRouteCodeEnjuRWSelect
import net.konohana.sakuya.cerinthe.utils.fxRouteInfoEnjuRWSelect
import net.konohana.sakuya.cerinthe.utils.passengerGroupJudge
import net.konohana.sakuya.cerinthe.utils.tiarellaUrlJudge

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
            // APIURL判定処理
            val url = fxApiUrlEnjuJudge(from, to)
            // 距離計算ルール判定
            val calcPattern = fareDistCalcRuleJudgement(routeCode)
            println(calcPattern)
            //運賃マスタ取得URL判定
            val tiarellaUrl = tiarellaUrlJudge(req.sectorKbn)
            println("URL${tiarellaUrl}")
            // API呼び出し
            val client = HttpClient(CIO) {
                install(ContentNegotiation) {
                    json(Json {
                        prettyPrint = true
                        isLenient = true
                    })
                }
            }
            // 距離情報取得APIから距離情報を取得
            val fromResponse: PhaceliaFareDistResponse = client.get(url.first).body()
            val toResponse: PhaceliaFareDistResponse = client.get(url.second).body()
            val fromDist = fromResponse.distance
            val toDist = toResponse.distance
            // 営業キロ, 運賃計算キロを算出
            val dist = calcDist(calcPattern, fromDist, toDist)
            println("営業距離${dist.first}")
            println("運賃計算距離${dist.second}")
            val fareResponse: TiarellaApiResponse =
                client.get(tiarellaUrl + dist.second).body()
            println("運賃:${fareResponse.fareAdult}")
            println("運賃H:${fareResponse.fareHalf}")
            println("運賃C:${fareResponse.fareChild}")
            // 運賃計算処理
            val totalFare = fareCalcUtil(
                adultMember = req.adultMember,
                halfMember = req.halfMember,
                childMember = req.childMember,
                fareAdultBase = fareResponse.fareAdult,
                fareHalfBase = fareResponse.fareHalf,
                fareChildBase = fareResponse.fareChild,
                ticketType = req.ticketType,
            )
            // 合計運賃額を表示
            println("合計運賃額:${totalFare}")
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
