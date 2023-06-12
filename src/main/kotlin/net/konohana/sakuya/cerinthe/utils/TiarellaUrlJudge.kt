package net.konohana.sakuya.cerinthe.utils

import net.konohana.sakuya.cerinthe.constant.SectorKbnConst
import net.konohana.sakuya.cerinthe.constant.ServiceBaseUrlConst

fun tiarellaUrlJudge(sectorKbn: String): String {
    return if (sectorKbn == SectorKbnConst.SECTOR_KBN_AREAGW) {
        ServiceBaseUrlConst.TIARELLA_SERVER_BASE_ARGW_URL
    } else {
        ServiceBaseUrlConst.TIARELLA_SERVER_BASE_ENJU_URL
    }
}
