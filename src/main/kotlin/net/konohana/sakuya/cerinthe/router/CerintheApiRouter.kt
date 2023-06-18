package net.konohana.sakuya.cerinthe.router

import io.ktor.server.routing.Route
import net.konohana.sakuya.cerinthe.controller.cerintheApiController

fun Route.cerintheApiRouter() {
    cerintheApiController()
}
