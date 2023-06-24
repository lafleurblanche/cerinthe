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

fun Route.cerintheFXApiController() {
    route("/cerinthe/fx/api/regist-ticket") {
        post {
            val req = call.receive<CerintheFXRequestData>()
            println(req)
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
