package net.konohana.sakuya.cerinthe.controller

import io.ktor.server.application.call
import io.ktor.server.request.receive
import io.ktor.server.routing.Route
import io.ktor.server.routing.post
import io.ktor.server.routing.route
import net.konohana.sakuya.cerinthe.dto.request.CerintheFXRequestData

fun Route.cerintheFXApiController() {
    route("/cerinthe/fx/api/regist-ticket") {
        post {
            val req = call.receive<CerintheFXRequestData>()
            println(req)
        }
    }
}
