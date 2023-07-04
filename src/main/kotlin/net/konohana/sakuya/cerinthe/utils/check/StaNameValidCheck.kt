package net.konohana.sakuya.cerinthe.utils.check

import net.konohana.sakuya.cerinthe.plugins.InvalidStaNameException

/**
 * 乗降駅有効性判定
 * @param reqFromStaName リクエスト乗車駅
 * @param reqToStaName リクエスト降車駅
 * @param phaceliaFromStaName Phaceliaから取得した乗車駅
 * @param phaceliaToStaName Phaceliaから取得した降車駅
 * @throws RuntimeException 乗車駅または降車駅が一致しない場合
 */
fun staNameValidCheck(
    reqFromStaName: String,
    reqToStaName: String,
    phaceliaFromStaName: String,
    phaceliaToStaName: String) {
    if (reqFromStaName != phaceliaFromStaName) {
        throw InvalidStaNameException()
    } else if(reqToStaName != phaceliaToStaName) {
        throw InvalidStaNameException()
    }
}
