package net.konohana.sakuya.cerinthe.utils.date

import kotlinx.datetime.Clock
import kotlinx.datetime.LocalDate
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toLocalDateTime
import net.konohana.sakuya.cerinthe.plugins.InvalidDateException

fun fxDateUtil(month: String, day: String): String {
    val now = Clock.System.now().toLocalDateTime(TimeZone.currentSystemDefault()).date
    val year = now.year
    val dateOfUse = runCatching { LocalDate(year, month.toInt(), day.toInt()) }
        .getOrElse { throw InvalidDateException() }
    return dateOfUse.toString()
}
