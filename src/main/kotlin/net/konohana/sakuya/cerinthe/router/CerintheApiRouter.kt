package net.konohana.sakuya.cerinthe.router

import io.ktor.server.routing.Route
import net.konohana.sakuya.cerinthe.controller.cerintheApiController
import net.konohana.sakuya.cerinthe.controller.cerintheFXApiController

fun Route.cerintheApiRouter() {
    cerintheApiController()
    cerintheFXApiController()
}
