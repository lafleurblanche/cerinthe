package net.konohana.sakuya.cerinthe.utils.date

/**
 * 利用日フォーマッタ
 */
fun dateOfUseFormatter(datetime: String): String {
    val substrDate = datetime.substring(0, 10)
    return substrDate.replace("-", "/")
}
