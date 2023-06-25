package net.konohana.sakuya.cerinthe.constant

/**
 * ## 文字分割インデックス定数クラス
 * @author lafleurblanche
 */
class IndexConst {
    companion object {
        /** 文字列分割開始位置 */
        const val INDEX_START = 0
        /** 文字列分割終了位置 */
        const val INDEX_END = 4
        /** 文字列分割終了位置(FX用) */
        const val INDEX_FX_END = 6
        /** 文字列分割終了位置(系統判定用) */
        const val ROUTE_SELECT_INDEX_END = 2
        /** FX用駅名コード文字列分割開始位置 */
        const val INDEX_START_FX_STA_CODE = 2
        /** FX用駅名コード文字列分割終了位置 */
        const val INDEX_END_FX_STA_CODE = 8
    }
}
