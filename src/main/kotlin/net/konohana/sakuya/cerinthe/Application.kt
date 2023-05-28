package net.konohana.sakuya.cerinthe

import io.ktor.server.application.Application
import net.konohana.sakuya.cerinthe.plugins.configureHTTP
import net.konohana.sakuya.cerinthe.plugins.configureRouting
import net.konohana.sakuya.cerinthe.plugins.configureSerialization


fun main(args: Array<String>): Unit =
    io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused") // application.conf references the main function. This annotation prevents the IDE from marking it as unused.
fun Application.module() {
    configureSerialization()
    configureHTTP()
    configureRouting()
}
