package net.konohana.sakuya.cerinthe.utils.date

import kotlinx.datetime.Clock
import kotlinx.datetime.DateTimeUnit
import kotlinx.datetime.LocalDateTime
import kotlinx.datetime.TimeZone
import kotlinx.datetime.plus
import kotlinx.datetime.toInstant
import kotlinx.datetime.toLocalDateTime

// タイムゾーン設定
val timeZone = TimeZone.of("Asia/Tokyo")

/**
 * 本日日付を取得
 */
fun getToDayDate(): String {
    val now = Clock.System.now()
    return dateOfUseFormatter(now.toString())
}

/**
 * 翌日日付を取得
 */
fun getTomorrowDate(): String {
    val localDateTime = LocalDateTime.parse(getNowTimeString())
    val instant = localDateTime.toInstant(timeZone)
    val instantOneDayLater = instant.plus(1, DateTimeUnit.DAY, timeZone)
    val localDateTimeOneDayLater = instantOneDayLater.toLocalDateTime(timeZone)
    return dateOfUseFormatter(localDateTimeOneDayLater.toString())
}

/**
 * 翌々日日付を取得
 */
fun getDayAfterTomorrowDate(): String {
    val localDateTime = LocalDateTime.parse(getNowTimeString())
    val instant = localDateTime.toInstant(timeZone)
    val instantTwoDaysLater = instant.plus(2, DateTimeUnit.DAY, timeZone)
    val localDateTimeTwoDaysLater = instantTwoDaysLater.toLocalDateTime(timeZone)
    return dateOfUseFormatter(localDateTimeTwoDaysLater.toString())
}

/**
 * 本日から1ケ月後の日付を取得
 */
fun getOneMonthDate(): String {
    val localDateTime = LocalDateTime.parse(getNowTimeString())
    val instant = localDateTime.toInstant(timeZone)
    val instantOneMonthLater = instant.plus(1, DateTimeUnit.MONTH, timeZone)
    val localDateTimeOneMonthLater = instantOneMonthLater.toLocalDateTime(timeZone)
    return dateOfUseFormatter(localDateTimeOneMonthLater.toString())
}
